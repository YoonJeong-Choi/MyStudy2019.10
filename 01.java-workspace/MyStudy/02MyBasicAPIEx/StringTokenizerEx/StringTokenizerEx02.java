package StringTokenizerEx;
import java.util.StringTokenizer;

public class StringTokenizerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "사과&배&&&복숭아";
		
		//공백이나 지정한 문자를 기준으로 문자열을 분리시킨다.
		//분리한 후 
		StringTokenizer st = new StringTokenizer(data, "&");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		//지정한 문자를 기준으로 문자열을 분리시킨다.
		//지정한 문자를 없앤 후 생긴 공백도 전부 챙긴다.
		String[] datas = data.split("&");
		System.out.println(datas.length);
		for(String d : datas) {
			System.out.println(d);
		}
	}
}
