package Thread.pack2;

public class ThreadEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Go go = new Go();
		Come come = new Come();
				
		//thread에서의 실행
		//순서대로 실행되지 않는다!
		go.start();
		come.start();
		
	}
}
