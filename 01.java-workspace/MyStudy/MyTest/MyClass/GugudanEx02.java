package MyClass;

import java.util.Scanner;

//단수 : 라고 되어있는곳에 숫자를 입력하면 그 숫자에 대한 구구단이 출력되고, 다시 단수 : 라는 글을 출력한다. 그러다가 q를 입력하면 종료되는 구구단을 만들어라.

public class GugudanEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("단 : ");
		String b;
		int i = 0;
		label: while (true) {
			b = scanner.nextLine();
			if (b.equals("q")) {
				scanner.close();
				break label;
			}
			i = Integer.parseInt(b); // 입력받은것을 a에 넣어 int형으로 바꿈
			// 구구단시작
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " X " + j + " = " + (i * j) + "   ");
			}
			System.out.println();
			System.out.print("단 : ");
		}
	}
}
