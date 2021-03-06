package MyQueue_Stack_Array;

import java.util.Random;

public class ArrayEx01 {
	public static void main(String[] args) {
		int[] array1 = new int[10];

		for (int i = 0; i < 10; i++) {
			array1[i] = new Random().nextInt(10);
		}
		for (int i : array1) {
			System.out.print(i + "	");
		}
		System.out.println();
		// 배열에서 최댓값 구하기
		// 첫번째 방의 숫자를 변수max에 담은 후
		int max = array1[0];
		// 각 방의 숫자가 변수의 숫자보다 크다면 변수 max에 넣는다.
		for (int i = 1; i < 10; i++) {
			if (array1[i] > max) {
				max = array1[i];
			}
		}
		System.out.println(max);

		// 반대로 최솟값도 가능하다
		int min = array1[0];
		for (int i = 1; i < 10; i++) {
			if (array1[i] < min) {
				min = array1[i];
			}
		}
		System.out.println(min);

		// 버블정렬
		int tray;
		for (int j = 0; j < array1.length - 1; j++) {
			for (int i = 0; i < array1.length - 1 - j; i++) {
				if (array1[i] > array1[i + 1]) {
					tray = array1[i];
					array1[i] = array1[i + 1];
					array1[i + 1] = tray;
				}
			}
		}
		for (int i : array1) {
			System.out.print(i + "	");
		}
	}
}

