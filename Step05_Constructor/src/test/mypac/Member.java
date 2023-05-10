package test.mypac;

public class Member {
	//필드
	public int num;
	public String name;
	public String addr;
	
	//default 생성자 정의하기
	public Member() {}
	
	//생성자 정의하기
	public Member(int num, String name, String addr) {
		this.num=num; //this.num은 필드의num =뒤에 num은 지역변수 num
		this.name=name;
		this.addr=addr;
	}
	
	//메소드
	public void printInfo() {
		System.out.println("번호:"+num+" 이름:"+name+" 주소:"+addr);
	}
}
