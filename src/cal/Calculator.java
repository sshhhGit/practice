package cal;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Oper = {"+","-","*","/"};  //연산자 배열 생성

        String input = null;
        int oper = 0;
        int num1 = 0, num2 = 0;
        double sum = 0.0;

            input = sc.nextLine();                    //연산식 입력

            String[] save = new String[input.length()];//계산식을 저장할 배열 생성

            for(int q = 0; q<input.length() ; q++) {
                save[q] = input.substring(q, q + 1);    //입력된 계산식에서 문자열 한개씩 뽑아내기
            }
            for(int q = 0; q<Oper.length ; q++) {               //먼저 생성한 연산자 배열
                for(int w = 0; w<input.length() ; w++) {        //입력한 계산식 배열
                    if(Oper[q].equals(save[w])){                //연산자 배열에서 연산자를 한개씩 계산식 배열이랑 비교
                        oper=q;                                 //계산식에서 연산자 위치 찾기
                        /*if(accum==0)*/num1 = Integer.parseInt(input.substring(0, w)); //0~w(계산식에서 연산자 위치)까지의 문자열을
                                                                                        //int형으로 변환하여 num1에 할당
                        num2 = Integer.parseInt(input.substring(w+1, input.length()));  //w+1~input.length()까지의 문자열을
                                                                                        //int형으로 변환하여 num2에 할당
                    }
                }
            }
            switch(Oper[oper]){                 //사칙연산
                case "+":
                    sum = num1 + num2;
                    break;
                case "-":
                    sum = num1 - num2;
                    break;
                case "*":
                    sum = num1 * num2;
                    break;
                case "/":
                    sum = (double) num1 / num2;
                    break;
            }
        System.out.println(sum);                //출력
    }
}