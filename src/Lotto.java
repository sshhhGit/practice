package lotto2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Lotto {
    public static void getLottoGame(int game){
        Set<Integer> lottoSet = new HashSet<>();

        int amount = game/1000;   // 로또 구매 개수 구하기

        for(int i=1; i<=amount; i++){
            while(lottoSet.size()<6){
                lottoSet.add((int)(Math.random() * 45 + 1));
            }
            ArrayList<Integer> lottoList = new ArrayList<>(lottoSet);
//            Collections.sort(lottoList);
//            System.out.println("게임" + i + " : " + lottoList);
            if (i%5==0){
                System.out.println();
            }
            lottoSet.clear();
        }
    }
}

