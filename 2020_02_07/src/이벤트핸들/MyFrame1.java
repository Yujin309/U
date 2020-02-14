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

public class MyFrame1 extends JFrame {

	private JButton Btn7 = new JButton("7");// 7bte: 변수명에는 숫자 기입 불가
	private JButton Btn8 = new JButton("8");
	private JButton BtnClear = new JButton("C");

	private JTextField tRes = new JTextField("");

	public MyFrame1() { // 컨포넌트에 대한 인스턴스가 만들어져 있으므로 이제부턴, 순서가 중요하지 않다.
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
		//이벤트 감시자 등록>> 처리자는  익명 Inner class의 인스턴스를 참조변수가 기억 후 이 변수를 재사용 .
		
		
		
		BtnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//e 누가 나를 눌렀니 라는 주체를 가지고 있다. 
				System.out.println(e.getActionCommand());
				System.out.println(e.getModifiers());
				System.out.println(e.getSource());
				System.out.println(e.paramString());
				
			}
		} );//btn 감시자 등록 액션 이벤트가 발생되면,()실행 
		// 이벤트 감시자 등록 / 위치 크기 지정.
		
		Btn7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {//e 누가 나를 눌렀니 라는 주체를 가지고 있다. 
				System.out.println(e.getActionCommand());
				System.out.println(e.getModifiers());
				System.out.println(e.getSource());
				System.out.println(e.paramString());
				
			}
		}
		);
		Btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//e 누가 나를 눌렀니 라는 주체를 가지고 있다. 
				System.out.println(e.getActionCommand());
				System.out.println(e.getModifiers());
				System.out.println(e.getSource());
				System.out.println(e.paramString());
				
			}
		}
		);
		
		
		
		this.setLocation(200, 300);
		this.pack();

	}
}
//좋지 않은 예이다. 각각 하는일이 다르면 사용하는건 괜찮지만 4가지 컨포먼트에서 같은 일을 처리하는 전제라면 중복되니
//좋지 않음!! 