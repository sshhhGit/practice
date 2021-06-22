package cal;

import java.util.Scanner;

public class CalMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int x = sc.nextInt(); //첫번째 정수 입력
			String oper = sc.next(); //연산자 입력(end 입력하면 계산종료)
			int z = sc.nextInt(); //두번쨰 정수 입력

			Cal add = new Add();
			int a = add.calc(x, z); //더하기
			Cal sub = new Sub();
			int s = sub.calc(x, z); //뺴기
			Cal mul = new Mul();
			int m = mul.calc(x, z); //곱하기
			Cal div = new Div();
			int d = div.calc(x, z); //나누기
//			int result;
			switch (oper) {
				case "+":
					System.out.println(x + oper + z + "=" + a);
					break;
				case "-":
					System.out.println(x + oper + z + "=" + s);
					break;
				case "*":
					System.out.println(x + oper + z + "=" + m);
					break;
				case "/":
					System.out.println(x + oper + z + "=" + d);
					break;
				}
			if (oper.equals("end")) {
				break;
			}
		}
	}
}
