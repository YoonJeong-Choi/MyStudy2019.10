package PrinterEx;

public class DotPrinter implements Printer {

	@Override
	public void print(String fileName) {
		// TODO Auto-generated method stub
		System.out.printf("Dot Printer로 출력 중 : %s%n", fileName);
	}

}
