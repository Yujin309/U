//이벤트 감시자 등록 처리자는 package 이벤트핸들;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//버튼 3개 만들기 텍스트 필드 1개 만들기 
//버튼 2개(7,8)를 누르면 해당 수를 텍스트 필드에 기입.  버튼 중 c버튼은 텍스트 필드를 클리어시킨다. 
import javax.swing.JTextField;

public class MyFrame4 extends JFrame {

	private JButton Btn7 = new JButton("7");// 7bte: 변수명에는 숫자 기입 불가
	private JButton Btn8 = new JButton("8");
	private JButton BtnClear = new JButton("C");

	private JTextField tRes = new JTextField("");

	public MyFrame4() { // 컨포넌트에 대한 인스턴스가 만들어져 있으므로 이제부턴, 순서가 중요하지 않다.
		// 컨포넌트를 어떻게 할지 붙일지, 이벤트를 먼저 할지 정해주기
		// 프레임에 버튼과 텍스트 필드를 배치한다.
		// //배치관리자가 누구인가? = 디폴트(기본)은 BorderLayout(하나의 영역에는 하나의 컨포먼트만)
		JPanel btnPane = new JPanel();
		btnPane.add(Btn7);
		btnPane.add(Btn8);
		btnPane.add(BtnClear);
		// this.add ("Center",btnPane);
		// this.add (btnPane,BorderLayout.Center);
		this.add(btnPane);
		this.add("South", tRes);
		// 이벤트감시자 등록 => 처리자는 이너 틀래스의 인스턴스를 참조변수 없이 사용한다. 이것은 좋지않은 예이다.
		BtnClear.addActionListener(new MyActionHandler());// btn 감시자 등록 액션 이벤트가 발생되면,()실행
		Btn7.addActionListener(new MyActionHandler());
		Btn8.addActionListener(new MyActionHandler());
		tRes.addActionListener(new MyActionHandler());
		// 이벤트 감시자 등록 / 위치 크기 지정.
		this.setLocation(200, 300);
		this.pack();
	}

	protected class MyActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(e.getActionCommand());
			System.out.println(e.getModifiers());
			System.out.println(e.getSource());
			System.out.println(e.paramString());

		}

//오버라이딩 @override

	}

}
