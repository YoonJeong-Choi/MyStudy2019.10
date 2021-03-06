package MyJungol;

import java.util.Scanner;

public class Jungol08Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 반복제어문3 - 자가진단1.
		// 자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서
		// 합이 n 이상이면 그 때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.

		System.out.print("반복제어문3-자가진단1.\n자연수를 하나 입력하세요. ");

		int i1_1 = sc.nextInt();
		int i1_2 = 0;
		int i1_4 = 0;

		for (int i1_3 = 1; i1_3 < i1_1; i1_3++) {
			if (i1_3 % 2 != 0) {
				i1_2 += i1_3;
				i1_4++;
			}
		}

		if (i1_2 >= i1_1) {
			System.out.println(i1_4 + "번 더해졌음, 값 : " + i1_2);
		} else {
			System.out.println("end");
		}

		// 반복제어문3 - 자가진단2.
		// 자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.

		System.out.print("반복제어문3-자가진단2.\n자연수를 하나 입력하세요. ");
		int i2_1 = sc.nextInt();

		for (int i2_2 = 1; i2_2 <= i2_1; i2_2++) {
			for (int i2_3 = 1; i2_3 <= i2_2; i2_3++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 반복제어문3 - 자가진단3
		// 자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.

		System.out.print("반복제어문3-자가진단3.\r자연수를 하나 입력하세요.");
		int i3_1 = sc.nextInt();

		for (int i3_2 = i3_1; i3_2 > 0; i3_2--) {
			for (int i3_3 = i3_2; i3_3 > 0; i3_3--) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i3_2 = 1; i3_2 <= i3_1; i3_2++) {
			for (int i3_3 = 1; i3_3 <= i3_2; i3_3++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 반복제어문3 - 자가진단4
		// 자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.

		System.out.print("반복제어문3-자가진단4\r자연수를 하나 입력하세요.");

		int i4_1 = sc.nextInt();

		String i4_2 = "";
		String i4_3 = "";

		for (int i = i4_1; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				i4_2 = "*" + i4_2;
			}
			i4_3 = ("%" + i4_1 + "s%n");
			System.out.printf(i4_3, i4_2);
			i4_2 = "";
		}

		// 반복제어문3 - 자가진단5

		System.out.print("반복제어문3-자가진단5.\r자연수를 하나 입력하세요. ");
		// 외부에서 자연수 n을 입력받음
		int i5_1 = sc.nextInt();
		// 한 행씩 *을 받아줄 변수 
		String i5_2 = "";
		// 출력을 위한 형식
		String i5_3 = "";
		// 한행의 길이
		int i5_4 = ((i5_1 * 2) - 1);
		// n행
		for (int i = i5_1; i > 0; i--) {
			// 열 -> 첫행은 n*2-1만큼의 행을 가지고 있고, 아래로 갈수록 2개씩 줄어든다.
			for (int j = (i * 2 - 1); j > 0; j--) {
				// 한행의 값을  저장한다
				i5_2 = "*" + i5_2;
			}
			// 출력을 위한 형식
			i5_3 = ("%" + i5_4 + "s%n");
			// 한 행을 출력한다.
			System.out.printf(i5_3, i5_2);
			// 출력했으니 다음행을 받을 수 있게 비워준다.
			i5_2 = "";
			// 다음행으로 갈수록 행의 길이가 줄어든다.
			i5_4--;
		}
		
		// 반복제어문3 - 자가진단6 65 = A

		System.out.print("반복제어문3-자가진단6\r3이상, 10이하의 자연수를 하나 입력하시오. ");

		int i6_1 = sc.nextInt();
		int i6_2 = 65;
		for (int i = i6_1; i >= 1; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print((char) i6_2);
				i6_2++;
			}
			System.out.println();
		}

		// 반복제어문3 - 자가진단7

		System.out.print("반복제어문3-자가진단7\r자연수를 하나 입력하세요. ");

		int i7_1 = sc.nextInt();
		int i7_2 = 65;
		int i7_3 = 1;

		for (int i = i7_1; i > 0; i--) {
			for (int j = i; j >= 0; j--) {
				for (; j > 0; j--) {
					System.out.print(i7_3);
					i7_3++;
				}
				for (int k = 0; k <= (i7_1 - i); k++) {
					System.out.print((char) i7_2);
					i7_2++;
				}
				System.out.println();
			}
		}

		// 반복제어문3 - 형성평가1

		System.out.print("반복제어문3-형성평가1\r정수 20개를 입력하시오. 만약 0이 입력된다면 종료된다. ");

		int i8_2 = 0;
		int i8_3 = 0;
		for (int i = 0; i < 20; i++) {
			int i8_1 = sc.nextInt();
			if (i8_1 == 0) {
				break;
			}
			i8_2 += i8_1;
			i8_3++;
		}

		System.out.println("합 : " + i8_2 + " / 평균" + (i8_2 / i8_3));
		
		// 반복제어문3 - 형성평가2

		System.out.print("반복제어문3-형성평가2\r1부터 100까지의 정수를 하나 입력하시오. ");
		
		int i9_1 = sc.nextInt();
		
		for (int i = 1; i < 100; i++) {
			if (i % i9_1 == 0) {
				System.out.print(i + " ");
				if (i % 10 == 0) {
					break;
				}
			}

		}

		System.out.println();
		
		// 반복제어문3 - 형성평가3

		System.out.print("반복제어문3-형성평가3\r자연수를 하나 입력하시오. ");
		int i10_1 = sc.nextInt();
		for (int i = 1; i <= ((i10_1 * 2) - 1); i++) {

			if (i <= i10_1) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
			}

			if (i > i10_1) {
				for (int k = 0; k <= (i10_1 * 2 - 1) - i; k++) {
					System.out.print("*");
				}
			}

			System.out.println();
		}

//		// 반복제어문3 - 형성평가4
//
//		System.out.print("반복제어문3-형성평가4\r자연수를 하나 입력하시오. ");
//		int i11_1 = sc.nextInt();
//		String i11_2 = "";
//		int i11_4 = ((i11_1 * 2) - 1);
//
//		// 행
//		for (int i = i11_1; i > 0; i--) {
//			String i11_3 = "";
//			for (int k = (i * 2 - 1); k > 0; k--) {
//				i11_3 += "*";
//			}
//			i11_2 = "%" + i11_4 + "s%n";
//			System.out.printf(i11_2, i11_3);
//			i11_4--;
//		}
//		for (int i = i11_1+1; i < i10_1*2-1; i++) {
//			for (int k = 1; k < i11_1)
//		}

		// 반복제어문3 - 형성평가5

		System.out.print("반복제어문3-형성평가5\r자연수를 하나 입력하시오. ");

		int i12_1 = sc.nextInt();

		String i12_3 = "%" + (i12_1 * 2 - 1) + "s%n";

		for (int i = 1; i <= i12_1; i++) {
			String i12_2 = "";
			for (int j = 0; j < i * 2 - 1; j++) {
				i12_2 += "*";
			}
			System.out.printf(i12_3, i12_2);
		}

		// 반복제어문3 - 형성평가6

		System.out.print("반복제어문3-형성평가6\r자연수를 하나 입력하시오. ");

		int i13_1 = sc.nextInt();
		String i13_2 = "%" + (i13_1*2) + "s%n";
		
		
		for (int i = 1; i <= i13_1; i++) {
			String i13_3 = "";
			for (int j = 1; j <= i; j++) {
				i13_3 += (" " + j);
			}
			System.out.printf(i13_2, i13_3);
		}

	}
}
