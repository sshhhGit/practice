package lotto;

import java.util.*;

public class LottoProgram {
    public static final int LOTTO_NUMBER_MAX = 5;           //
    public static final int BONUS_NUMBER_INDEX = 6;

    //1등 부터 5등까지
    public static final int FIRST = 6;
    public static final int SECOND = 5;
    public static final int THIRD = 4;
    public static final int FOURTH = 3;

    private Iterator itr;

    private ArrayList<Lotto> lotto;
    private ArrayList<Integer> winningLotto;
    private Integer bonusNumber;

    public LottoProgram() {
        lotto = new ArrayList<Lotto>();
    }

    public ArrayList<Lotto> getLotto() {
        return lotto;
    }

    public void setLotto(ArrayList<Lotto> lotto) {
        this.lotto = lotto;
    }

    public ArrayList<Integer> getWinningLotto() {
        return winningLotto;
    }

    public void setWinningLotto(ArrayList<Integer> winningLotto) {
        this.winningLotto = winningLotto;
    }

    public Integer getBonusNumber() {
        return bonusNumber;
    }

    public void setBonusNumber(Integer bonusNumber) {
        this.bonusNumber = bonusNumber;
    }

        //로또 번호 생성
    private ArrayList<Integer> lottoNumberCreate() {
        // 중복없이 생성하고 정렬이 되어 있어야 함
        HashSet<Integer> temp = new HashSet<Integer>();
        while(temp.size() <= LOTTO_NUMBER_MAX) {
            //auto boxing
            temp.add((int) (Math.random() * 45 ) + 1);
        }

        //리스트로 만들어서 정렬시킴
        ArrayList<Integer> list = new ArrayList<Integer>(temp);
        Collections.sort(list);
        return list;
        }

        //당첨번호 생성
        private void lottoResultNumberCreate() {
        System.out.println("당첨번호를 추첨 합니다");
        winningLotto = lottoNumberCreate();
        do {
            bonusNumber = (int) (Math.random() * 45 ) + 1;
            //번호가 존재 하지 않으면 추가
            if(!winningLotto.contains(bonusNumber)) {
                winningLotto.add(bonusNumber);
            }
        }

        while(winningLotto.size() == BONUS_NUMBER_INDEX);
        System.out.println("당첨 번호 : " + winningLotto);
        System.out.println("마지막 번호가 보너스 번호입니다.");
        }

        //로또 사는거
        public void lottoBuy() {
        Scanner kb = new Scanner(System.in);
        System.out.printf("몇 개를 살까요 ? : ");
        int num = kb.nextInt();
        for(int i = 0; i < num; i++) {
        lotto.add( new Lotto(lottoNumberCreate()) );
    }
}

//모든 로또 출력
public void printAll() {
    int i = 1;
    itr = lotto.iterator();
    while(itr.hasNext()) {
        System.out.println(i+"번 게임 : "+itr.next()); i++;
    }
}

//당첨 결과
public void result() {
    winningLotto.remove(BONUS_NUMBER_INDEX);
    itr = lotto.iterator(); int i = 1;
    while(itr.hasNext()) {
        Lotto temp = (Lotto) itr.next();
        ArrayList<Integer> lottoTemp = temp.getLotto();
        lottoTemp.retainAll(winningLotto);
        String result = rank(lottoTemp);
        System.out.print(i+"번 게임 결과 : " + result + "\t");
        System.out.println("일치 번호 -> " +lottoTemp); i++;
    }
}

//등수
private String rank(ArrayList<Integer> temp) {
    /* 1등 6개 일치 2등 5개 + 보너스번호 일치 3등 5개 일치 4등 4개 일치 5등 3개 일치 */
        int count = temp.size();
        if(count == FIRST) {
            return "1등";
        } else if(count == SECOND && temp.contains(bonusNumber)) {
            return "2등";
        } else if(count == SECOND) {
            return "3등";
        } else if( count == THIRD) {
            return "4등";
        } else if( count == FOURTH) {
            return "5등";
        } else {
            return "꽝";
    }
}

        //Process
        public void process() {
        //1. 복권 몇 개를 구매할 건가(구매한 복권 다 출력함)
        lottoBuy(); printAll();
        //2. 당첨번호 추첨
        lottoResultNumberCreate();
        //3. 게임결과 확인 \
        result();
        }
    }


