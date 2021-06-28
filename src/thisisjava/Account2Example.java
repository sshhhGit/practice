package thisisjava;
//6-19
public class Account2Example {
    public static void main(String[] args) {
        Account2 account2 = new Account2();

        account2.setBalance(10000);
        System.out.println("현재 잔고 : " + account2.getBalance());

        account2.setBalance(-100);
        System.out.println("현재 잔고 : " + account2.getBalance());

        account2.setBalance(2000000);
        System.out.println("현재 잔고 : " + account2.getBalance());

        account2.setBalance(300000);
        System.out.println("현재 잔고 : " + account2.getBalance());
    }
}
