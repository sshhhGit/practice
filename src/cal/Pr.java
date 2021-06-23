package cal;

import java.util.Scanner;

public class Pr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] Oper = {"+","-","*","/"};

        String input = null;
        int oper = 4;
//      int accum = 0;
        long num1 = 0l, num2 = 0l;
        double sum = 0;

//        Loop : while(true){
//
//            switch(accum) {
//                case 0:
//                    System.out.println("계산할 두 숫자를 연산자와 함께 입력하세요. (ex : 14+2)");
//                    break;
//                case 1:
//                    System.out.println("누적 계산할 숫자를 단항식으로 입력하세요. (ex : *3)");
//                    break;
//            }
            input = sc.nextLine();

            String[] save = new String[input.length()];//계산식을 저장할 배열 생성


            for(int q = 0; q<input.length() ; q++){

                save[q]=input.substring(q, q+1);

//                if(input.substring(q, q+1).equals(".")){
//                    System.out.println("[오류] 계산식에 실수가 포함됩니다.");
//                    continue Loop;
//                }
//                else if(input.substring(q, q+1).equals(" ")){
//                    System.out.println("[오류] 계산식에 공백이 포함됩니다.");
//                    continue Loop;
//                }
            }//for 문 종료 / 숫자 , 연산자를 하나씩 배열에 저장 및 오류검출

            for(int q = 0; q<Oper.length ; q++) {
                for(int w = 0; w<input.length() ; w++) {
                    if(Oper[q].equals(save[w])){
                        oper=q;
                        /*if(accum==0)*/num1 = Integer.parseInt(input.substring(0, w));
                        num2 = Integer.parseInt(input.substring(w+1, input.length()));
                    }
                }
            }

            switch(Oper[oper]){
                case "+":
                    sum = num1 + num2
                    ;break;
                case "-":
                    sum = num1 - num2
                    ;break;
                case "*":
                    sum = num1 * num2
                    ;break;
                case "/":
                    sum = (float)num1 / (float)num2
                    ;break;
            } // 연산

            switch(oper){
                case 3:
                    System.out.printf("%,d %s %,d = %,.1f\n",num1,Oper[oper],num2,sum);
                    break;
                default :
                    System.out.printf("%,d %s %,d = %,.0f\n",num1,Oper[oper],num2,sum);
                    break;
            }//결과 출력

            oper = 5;

            select : while(true) {
                System.out.println("누적 계산(1) 새로운 계산(0) 끝내기(x)\n<누적 계산시에는 소수점 이하 자리는 생략 됩니다.>");
                input = sc.nextLine();

                switch(input) {
                    case "1":
                        accum=1;
                        num1 = (int)sum;
                        break select;
                    case "0":
                        accum=0;
                        break select;
                    case "x":
                        System.out.printf("계산결과 : %.1f <계산기 종료>",sum);
                        break Loop;
                    default :
                        System.out.println("입력 오류!");
                        break;
                }
            }

        }//while
        sc.close();

    }//main

}