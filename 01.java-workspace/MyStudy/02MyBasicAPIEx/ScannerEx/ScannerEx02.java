package ScannerEx;
import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "One-true-false-100-korea";
		//system.in을 넣지 않고, str을 넣은 후
		Scanner sc = new Scanner(str);
		//useDelimiter를 이용하여 -를 기준으로 끊어읽었다. Delimiter:구분자
		sc.useDelimiter("-");
		//while을 이용하여 scr 안의 끊긴 문자열을 하나씩 빼서 출력한다. 
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
		
	}
}
