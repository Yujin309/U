package 이벤트핸들;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//버튼 3개 만들기 텍스트 필드 1개 만들기 
//버튼 2개(7,8)를 누르면 해당 수를 텍스트 필드에 기입.  버튼 중 c버튼은 텍스트 필드를 클리어시킨다. 
import javax.swing.JTextField;

public class MyFrameThis extends JFrame implements ActionListener {
//j프레임으로부터 확장시켜서 클래스를 만들겠다는 것. 
	private JButton Btn7 = new JButton("7");// 7bte: 변수명에는 숫자 기입 불가
	private JButton Btn8 = new JButton("8");
	private JButton BtnClear = new JButton("C");
	private JTextField tRes = new JTextField("");

	public MyFrameThis() {
		// //배치관리자가 누구인가? = 디폴트(기본)은 BorderLayout(하나의 영역에는 하나의 컨포먼트만)
		JPanel btnPane = new JPanel();
		btnPane.add(Btn7);
		btnPane.add(Btn8);
		btnPane.add(BtnClear);

		this.add(btnPane);
		this.add("South", tRes);
		// 이벤트 감시자 등록>> 처리자는 익명 Inner class의 인스턴스를 참조변수가 기억 후 이 변수를 재사용 .
		Btn7.addActionListener(this);
		Btn8.addActionListener(this);
		BtnClear.addActionListener(this);
		tRes.addActionListener(this);

		this.setLocation(200, 300);
		this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 액션클래스를 누가 가지고 있는가 ? = actionPerformed 가 인스턴스에 의해 호출되어지는 데 this로
		// myframethis 클래스 안에 있다.
		// this.Btn7
		System.out.println(e.getActionCommand());
		System.out.println(e.getModifiers());
		System.out.println(e.getSource());
		System.out.println(e.paramString());

	}
}
