package MyQueue_Stack_Array;

import java.util.Random;

public class ArrayEx02 {
	public static boolean equals(int[] array1, int[] array2) {
		// 만약 길이가 다르다면 false
		if (array1.length != array2.length) {
			return false;
		}
		// i번째 방이 서로 다를경우 false
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		// 위의 경우에 해당하지 않고, 마지막 방까지 전부 값이 같을경우 true
		return true;
	}

	public static void main(String[] args) {
		// 두 배열의 비교
		int[] array1 = new int[10];
		int[] array2 = new int[10];

		for (int i = 0; i < 10; i++) {
			array1[i] = new Random().nextInt(10);
			array2[i] = new Random().nextInt(10);
		}
		for (int i : array1) {
			System.out.print(i + "	");
		}
		System.out.println();
		for (int i : array2) {
			System.out.print(i + "	");
		}
		System.out.println();
		System.out.println(equals(array1, array2));
	}
}
