package WrapperEx;

public class WrapperEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 각 자료형의 최대 최소값
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		//2. 형변환 또는 정수 : 진법변환
		//Integer i0 = new Integer(10);
		//Deprecated = 사용되지 않는다. -> 지금은 가능하지만 나중에는 사라질수있는 기능
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf("10"); //문자열에 있는 숫자만 변경 가능
		Integer i3 = 123;
		//Integer i4 = Integer.valueOf("A"); //-> 실행시 에러
		byte b = i1.byteValue();	//byte 형으로 변환
		float f = i1.floatValue();	//float 형으로 변환
		String s = i1.toString();	//int형을 문자열로 변환
		int i = Integer.parseInt(s);//문자열을 int형으로 변환	
		
		System.out.println(b);
		System.out.println(f);
		System.out.println(s);
		System.out.println(i);
		
		String bstr = Integer.toBinaryString(123); //2진수
		String bstr1 = Integer.toHexString(123); //16진수
		System.out.println(bstr);
		System.out.println(bstr1);
				
	}

}
