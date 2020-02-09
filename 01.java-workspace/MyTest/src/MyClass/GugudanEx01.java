package MyClass;

import java.util.Scanner;

public class GugudanEx01 {

	public static void main(String[] args) {
		// 단수 : 라고 되어있는곳에 숫자를 입력하면 그 단의 구구단을 출력하고 종료되는구구단.
		// 순서 : 외부에서 입력받은 값을 출력해준다 -> 단수 : 를만든다 -> 구구단을 만든다 -> 종료시킨다.
		// 구구단순서 : 입력받은 값을 구구단으로 만든다..

		// 외부에서 입력받은것을 출력하기.
		Scanner scanner = new Scanner(System.in);
		// System.out.println(scanner.next()); //입력받았음

		System.out.print("단 : ");

		int i = Integer.parseInt(scanner.next()); // 입력받은것을 i에 넣어 숫자로 바꿈

		// 구구단만들기
		for (int j = 1; j < 10; j++) {
			System.out.print(i + " X " + j + " = " + (i * j) + "   ");
		}

		scanner.close();
	}

}
