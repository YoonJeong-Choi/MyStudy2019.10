package RandomEx;
import java.util.Random;

public class RandomEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random();
		//seed 초기화
		Random r2 = new Random(System.currentTimeMillis());
		//랜덤으로 숫자 뽑기
		System.out.println(r2.nextInt());
		System.out.println(r2.nextInt());
		System.out.println(r2.nextInt(10));
		System.out.println(r2.nextInt(10));
		System.out.println(r2.nextInt(45)+1);
	}

}
