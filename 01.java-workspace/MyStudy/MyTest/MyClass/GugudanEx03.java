package MyClass;

import java.util.Scanner;

public class GugudanEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 외부에서 값을 입력받아 구구단을 출력해보자. 대신 알파벳 q가 들어오면 종료된다.
		try {
			System.out.println("구구단을 진행하려면 숫자를, 끝내려면 q를 입력하세요.");
			// 외부에서 값을 입력받는다.
			Scanner scanner = new Scanner(System.in);
			// System.out.println(scanner.nextLine());

			label: while (true) {
				System.out.print("단 : ");
				String q = scanner.nextLine();
				// 받은값이 q이면 중지
				if (q.equals("q")) {
					scanner.close();
					System.out.println("끝");
					break label;
				}
				// 숫자면 구구단 진행
				for (int j = 1; j < 10; j++) {
					int gu = Integer.parseInt(q);
					System.out.print(gu + " X " + j + " = " + (gu * j) + "  ");
				}
				System.out.println();
			}
		} catch (NumberFormatException e) {
			System.out.println("숫자 또는 q를 입력해주세요!");
		} catch (Exception e) {
			System.out.println("error");
		}
	}

}
