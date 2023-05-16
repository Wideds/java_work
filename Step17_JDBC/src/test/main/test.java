package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class test extends JFrame implements ActionListener{
	JTextField tf1,tf2,tf3;
	
	public test(String title) {
		super(title);
	    setBounds(100, 100, 900, 500);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setLayout(new FlowLayout());
	    
	    JLabel la1=new JLabel("번호 :");
	    tf1=new JTextField(10);
	    JLabel la2=new JLabel(" 이름 :");
	    tf2=new JTextField(10);
	    JLabel la3=new JLabel(" 주소 :");
	    tf3=new JTextField(10);
	    
	    JButton saveBtn=new JButton("저장");
	    
	    add(la1);
	    add(tf1);
	    add(la2);
	    add(tf2);
	    add(la3);
	    add(tf3);
	    add(saveBtn);
	    
	    saveBtn.addActionListener(this);
	    
	    saveBtn.setActionCommand("save");
	    
	    setVisible(true);
	}
	
	public static void main(String[] args) {
		new test("회원정보 수정");
		
	}
	@Override
	public void actionPerformed(ActionEvent e2) {
		//DB 연결객체를 담을 지역 변수 만들기
	      Connection conn=null;
	      
	      try {
	         //오라클 드라이버 로딩
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         //접속할 DB 의 정보 @아이피주소:port번호:db이름
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	         //계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         //예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
	         System.out.println("Oracle DB 접속 성공");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		
		String strNum1=tf1.getText();
		String strNum2=tf2.getText();
		String strNum3=tf3.getText();
		
		PreparedStatement pstmt=null;
		
		try {
			int num1=Integer.parseInt(strNum1);
			String sql="INSERT INTO member"
	    			  +" (num, name, addr)"
	    			  +" VALUES(?, ?, ?)";
	    	//미완성의 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
	    	pstmt=conn.prepareStatement(sql);
	    	//PreparedStatement 객체의 메소드를 이용해서 미완성인 sql 문을 완성시키기(?에 값 바인딩하기)
	        pstmt.setInt(1, num1);
	        pstmt.setString(2, strNum2);
	        pstmt.setString(3, strNum3);
	    	//sql 실행하기
	    	pstmt.executeUpdate();
	    	System.out.println("회원 정보를 저장했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}









