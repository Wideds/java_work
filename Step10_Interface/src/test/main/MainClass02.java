package test.main;

import test.mypac.MyRemocon;
import test.mypac.MyRemocon2;
import test.mypac.Remocon;

public class MainClass02 {
		public static void main(String[] args) {
		//다형성 확인 
		MyRemocon r1 = new MyRemocon();
		Remocon r2=r1;
		Object r3=r1;
		
		//직접 클래스를 test.mypac 패키지에 파일로 만들어서 useRemocon() 메소드를 호출해 보세요.
		MyRemocon2 r4 = new MyRemocon2();
		useRemocon(r4);
		//나만의 기능도 호출해 보기
		r4.reserve();
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
		//만일 여기서 reserve() 메소드를 활용하고 싶으면 방법이 없을까?
		MyRemocon2 r2=(MyRemocon2)r; //casting을 하면 가능
		r2.reserve();
	}
}
