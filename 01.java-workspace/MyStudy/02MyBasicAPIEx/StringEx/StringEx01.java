package StringEx;

public class StringEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String = 문자열
		//Constant Pool에 저장
		String str1 = "Hello String";
		String str2 = "Hello String";
		//Heap 내에 3,4가따로저장
		String str3 = new String("Hello String");
		String str4 = new String("Hello String");
		
		System.out.println(str1);
		System.out.println(str3);
		
		char[] charArray = {'H','e','l','l','o'};
		String str5 = new String(charArray);
		System.out.println(str5);
	}

}
