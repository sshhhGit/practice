package lotto;

import java.util.ArrayList;

public class Lotto {
    private ArrayList<Integer> lotto;

    public Lotto(ArrayList<Integer> lotto) {
        this.lotto = lotto;
    }

    public ArrayList<Integer> getLotto() {
        return lotto;
    }

    public void setLotto(ArrayList<Integer> lotto){
        this.lotto = lotto;
    }

    @Override
    public String toString() {
        String info = "";

        for (Integer a : lotto) {
            info += " " + a;
        }
        return info;
    }
}
