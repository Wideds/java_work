package test.main;

import text.auto.Bus;
import text.auto.Engine;

public class MainClass08 {
	public static void main(String[] args) {
		Bus b1 = new Bus(new Engine());
		b1.drive();
		b1.powerDrive();
		
		//생성자의 인자로 필요한 값을 전달하지 않고 null을 전달해도 문법은 성립한다.
		Bus b2 = new Bus(null);
		b2.drive();
		b2.powerDrive();
	}
}
