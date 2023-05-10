package test.main;

import test.mypac.Square;

/*
 *  test.mypac 패키지에 클래스를 하나 만들어 보세요.
 *  
 *  - 사각형의 폭(width), 높이(height) 를 필드에 저장할 수 있어야 합니다.
 *  - 필드에 저장된 폭과 높이를 이용해서 사각형의 넓이를 콘솔창에 출력하는 메소드를 가지고 있어야 합니다.
 *  - 필드에 메소드는 모두 non static 으로 만드세요
 *  - 클래스명, 필드명, 메소드명은 여러분이 마음대로 정해 보세요.
 */
public class MainClass10 {
	public static void main(String[] args) {
		//클래스를 만들었다면 여기에 코드를 추가해서 테스트 해 보세요.
		Square squ1 = new Square();
		squ1.height = 10;
		squ1.width = 10;
		squ1.printArea();
		
		Square squ2 = new Square();
		squ2.height = 20;
		squ2.width = 10;
		squ2.printArea();
	}
}
