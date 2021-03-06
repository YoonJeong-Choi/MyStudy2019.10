package MyQueue_Stack_Array;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 소수를 확인하는법.
		// 소수의 특징 중 소수는 본인보다 작은 소수들로 나누었을 때 나누어지지 않는다는 특징이 있다.
		int[] prime = new int[170];
		int primenum = 0;

		// 2와 3은 반드시 소수이다.
		prime[primenum++] = 2;
		prime[primenum++] = 3;

		// 이후에 소수는 홀수만 있으므로 숫자를 2씩 증가시켜 확인해본다.
		for (int n = 5; n <= 1000; n += 2) {
			int i;
			// 숫자를 소수들이 들어있는 배열로 나누어 나누어떨어지는지, 아닌지 확인해본다.
			for (i = 1; i < primenum; i++) {
				if (n % prime[i] == 0) {
					break;
				}
			}
			// 만약 위에서 걸리지 않고, 이곳까지 왔다면, 배열의 마지막에 넣어준다.
			if (primenum == i) {
				prime[primenum++] = n;
			}
		}
		
		for (int i : prime) {
			System.out.println(i);
		}
	}

}
