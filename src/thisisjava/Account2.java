package thisisjava;

public class Account2 {
    private int balance = 0;
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance >= MIN_BALANCE && MAX_BALANCE >= balance){
            this.balance = balance;
        }
    }
}
