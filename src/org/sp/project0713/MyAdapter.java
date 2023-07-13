package org.sp.project0713.member;
import java.awt.event.*;

/*
java GUI 분야에서의 Adapter란?
개발자가 인터페이스 구현시, 해당 인터페이스가 보유한 메서드가 너무나 많은 경우,
사용하지도 않는 메서드를 오버라이드 해야 한다는 원칙을 고수하면 개발의 효율성이 떨어진다.
이 문제를 해결하기 위해, 개발자 대신 Sun사에서 Adaper라는 클래스를 지원해주는데 
어댑터는 우리가 구현해야 할 인터페이스를 대신 구현해 놓았으므로, 개발자는 어댑터의 메서드 중 필요한 것만 골라서 오버라이드 하면 된다.
*/

public class MyAdapter extends WindowAdapter{
	

	public void windowClosing(WindowEvent e){
		//1) 열려있는 Connection 닫기
		con.close();

		//2) 프로세스 종료
	}
}
