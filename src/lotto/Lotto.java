package lotto;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //키보드 입력 클래스
        Random random = new Random(); //난수 랜덤 클래스
        System.out.println("금액을 입력하세요.");
        int ranArry[] = new int[int x/1000 = sc.nextInt()];
        int x = sc.nextInt(); //금액 입력(1게임 1000원)
        for (int n = 1; n <= x/1000;n++ ) { // 금액/1000 한만큼 게임 수 결정
            System.out.print(n + "게임 : ");
                for (int i = 1; i <= 5; i++) {
                    System.out.print(random.nextInt(45) + " ");
            }System.out.println();
        }
    }
}
