package MyQueue_Stack_Array;

import java.util.Arrays;
import java.util.Random;

class SearchKey02 {
	public int searchKey(int[] array, int key) {
		// 중앙의 값
		int start = 0;
		int end = array.length - 1;

		do {
			int center = (start + end) / 2;
			if (array[center] == key) {
				return center;
			} else if (array[center] < key) {
				start = center + 1;
			} else {
				end = center - 1;
			}
		} while (start <= end);
		return -1;
	}
}

public class SearchEx02 {

	public static void main(String[] args) {
		// 이진검색. 찾는값과 중앙값을 비교한 후 범위를 다시 정해 그 범위내에서 중앙값을 다시비교한다.
		// 값을 찾거나, 더이상 배열안에 데이터가 없으면 중지된다.
		// 값이 일정 규칙으로 정렬되어 있을 경우에만 사용이 가능하다.
		// 참고로 java.util의 Arrays에는 binarySearch라 하여 이진검색을 해주는 메소드가 있다.
		
		int[] array = new int[15];

		// 배열에 값을 무작위로 넣고
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(40);
		}
		// 정렬시킨다.
		Arrays.sort(array);

		// 찾을 값을 아무 값이나 하나 넣는다.
		int key = new Random().nextInt(40);

		for (int i : array) {
			System.out.print(i + "  ");
		}
		System.out.println("\n" + key);

		// 값을 검색해본다.
		SearchKey02 searchKey02 = new SearchKey02();
		int result = searchKey02.searchKey(array, key);

		if (result >= 0) {
			System.out.println("찾는값 " + key + "는 " + result + "번에 있습니다.");
		} else {
			System.out.println("찾는값 " + key + "는 없습니다.");
		}
	}
}
