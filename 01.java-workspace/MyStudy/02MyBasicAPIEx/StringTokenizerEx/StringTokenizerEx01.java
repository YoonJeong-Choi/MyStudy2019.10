package StringTokenizerEx;
import java.util.StringTokenizer;

public class StringTokenizerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "사과 배 복숭아";
		
		StringTokenizer st1 = new StringTokenizer(data);
		System.out.println(st1.countTokens());
		
		//.nextToken, .nextElement 둘다 하나씩 불러오는것
		//System.out.println(st1.nextToken());
		//System.out.println(st1.nextToken());
		//System.out.println(st1.nextElement());
		//반복문에 넣어 하나씩 불러오기
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		data = "사과&배&복숭아";
		StringTokenizer st2 = new StringTokenizer(data, "&");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
}
