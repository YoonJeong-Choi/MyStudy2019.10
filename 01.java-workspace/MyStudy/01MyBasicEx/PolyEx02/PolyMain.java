package PolyEx02;

public class PolyMain {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.viewParent1();
		p.viewParent2();
		
		Child1 c1 = new Child1();
		c1.viewChild1();
		c1.viewParent1();
		c1.viewParent2();
		
		//형변환 / 오버라이딩의 특성
		Parent p1 = c1; //부모를 통해 자식을 부름
		//p1이 Parent일까 Child1일까?
		//p1.viewChild1(); ->  자식 고유의 내용을 사용불가능 -> p1은 Parent구나!(아직 child1원에서 오버라이딩안함 )
		p1.viewParent1();
		p1.viewParent2();
		//p1은 Parent인데 Child1에서 viewParent2를 오버라이딩했더니 자식의 내용이 실행됐다.
		
		//child2의 내용이 나왔다.
		Parent p2 = new Child2();
		p2.viewParent1();
		p2.viewParent2();
		
		//다형성 - 같은걸 호출했지만, 바로 위의 코드가 어떤것을 붙였는가에 따라 출력값은 달라진다.
		Parent pp = new Child1();
		pp.viewParent2();
		pp = new Child2();
		pp.viewParent2();
		
		//형변환
		Parent pp1 = new Child1();
		//강제형변환
		Child1 cp1 = (Child1)pp1;
		cp1.viewChild1();
		cp1.viewParent2();
		//이건 불가능!
		//Child1 cp2 = (Child1)new Parent();
		//cp2.viewChild1();
	}
}
