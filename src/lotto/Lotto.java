package lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //키보드 입력 클래스
        Random random = new Random();         //난수 클래스
        System.out.println("금액을 입력하세요.");
        int[] ranArry = new int[6];           //로또 번호 6개 배열 생성
        int x = sc.nextInt();                 //금액 입력(1게임:1000원)
        int y = x/1000;
        int temp;                             //내림차순에 사용할 변수 생성
        for (int n = 1; n <= y;n++ ) {        //금액/1000 한만큼 게임 수 결정
            if (n%5==1)                         //5게임마다 문단 나누기
                System.out.println();
            System.out.print(n + "게임 : ");
                for (int i = 0; i < 6; i++) { //1~45 중 6개 출력
                    ranArry [i] = random.nextInt(45)+1; // 0~44이므로 +1
                    for (int j=0;j<i;j++){    //중복된 값이 나올경우 i값을 하나 줄이고 반복
                        if (ranArry [i] == ranArry [j]) {
                            i--;
                            break;
                        }
                        if(ranArry[i] < ranArry[j]) { //내림차순 정렬
                            temp = ranArry[i];
                            ranArry[i] = ranArry[j];
                            ranArry[j] = temp;
                        }
                    }
                }System.out.print(Arrays.toString(ranArry) +" "); //ranArry 배열 내용 출력
                System.out.println();
        }
    }
}


