package thisisjava;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println("1.계죄생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.print("선택>");

            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                createAccount();
            }else if (selectNo == 2) {
                accountList();
            }else if (selectNo == 3) {
                deposit();
            }else if (selectNo == 4) {
                widtdraw();
            }else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    //계좌생성하기
    private static void createAccount() {
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("계좌생성");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡ");
        System.out.print("계좌번호 : ");
        String accountNum = scanner.next();
        System.out.print("계좌주 : ");
        String accountOwner = scanner.next();
        System.out.print("초기입금액 : ");
        int accountBalance = scanner.nextInt();

        Account account = new Account(accountNum, accountOwner, accountBalance);
        for (int i=0;i<accountArray.length;i++){
            if(accountArray[i] == null){
                accountArray[i] = account;
            }
        }
    }

    private static void accountList() {

    }

    private static void deposit() {

    }

    private static void widtdraw() {

    }

    //Account 배열에서 ano와 동일한 Account 객체 찾기
//    private static Account findAccount(String ano){
//    }
}

