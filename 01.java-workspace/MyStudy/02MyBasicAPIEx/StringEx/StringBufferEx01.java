package StringEx;

public class StringBufferEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//buffer = 내부 저장공간
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(100);
		StringBuffer sb3 = new StringBuffer("Hello World");
		//capacity 저장공간의 크기를 알려줌
		System.out.println(sb1.capacity() + " " + sb1.hashCode());
		System.out.println(sb2.capacity() + " " + sb2.hashCode());
		System.out.println(sb3.capacity() + " " + sb3.hashCode());
		
		System.out.println(sb3.length());
		
		//버퍼조작 : append 맨 뒤에 추가, inser 사이에 추가, delete 삭제
		System.out.println(sb3 + " " + sb3.hashCode());
		sb3.append("안녕");
		System.out.println(sb3 + " " + sb3.hashCode());
		sb3.insert(3, " 추가 ");
		System.out.println(sb3 + " " + sb3.hashCode());
		sb3.delete(0, 4);
		System.out.println(sb3 + " " + sb3.hashCode());	
	}
}
