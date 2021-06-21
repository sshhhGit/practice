package cal;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int x = sc.nextInt(); //첫번째 정수 입력
			String y = sc.next(); //연산자 입력
			int z = sc.nextInt(); //두번쨰 정수 입력
			if (y.equals("+")) {
				Cal sum = new Add();
				int s = sum.calc(x, z);
				System.out.println(s);
//				return;
			} else if (y.equals("-")) {
				Cal sub = new Sub();
				int u = sub.calc(x, z);
				System.out.println(u);
//				return;
			} else if (y.equals("*")) {
				Cal mul = new Mul();
				int m = mul.calc(x, z);
				System.out.println(m);
//				return;
			} else if (y.equals("/")) {
				Cal div = new Div();
				int d = div.calc(x, z);
				System.out.println(d);
//				return;
			} else if (y.equals("end"))
				break;
		}
	}
}
