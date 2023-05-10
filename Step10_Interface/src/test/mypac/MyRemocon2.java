package test.mypac;

public class MyRemocon2 implements Remocon{

	@Override
	public void up() {
		System.out.println("볼륨을 올려요");
	}
	@Override
	public void down() {
		System.out.println("볼륨을 내려요");
	}
	
	//그런데... 나는 내가 사용할 편리한 메소드를 하나 더 만들고 싶다...
	public void reserve() {
		System.out.println("전원 off 를 예약 합니다");
	}
	
}
