package 이벤트;

import java.awt.ActiveEvent;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//이벤트에 집중한 예제, 레이아웃은 중요하지 않음. 

public class 가벼움 extends JFrame {
	private JTextField resTF;
	private JTextField numTF1;
	private JTextField numTF2;

	private JButton resBtn;

	public 가벼움() { // 컨포먼트 component 중에서도 컨테이너.의 인스턴스 생성.
		resTF = new JTextField("결과가 나올자리");
		numTF1 = new JTextField("정수입력");
		numTF2 = new JTextField("정수입력");
		resBtn = new JButton("=");
//JFrame이라는 container에 생성된 component 들을 붙여준다 = 이벤트가 발생하는지 감시자를 등록 

		setLayout(new FlowLayout());
		add(resTF);
		add(numTF1);
		add(new JLabel("+"));
		add(numTF2);
		add(resBtn);
//이벤트 발생하는지 감시자 등록

		resBtn.addActionListener(new XXX());// 이자리가 A가 올자리.
setBounds(100, 100, 200, 200);
	}

	protected class XXX implements ActionListener {
		public void actionPerformed(ActiveEvent e) {
			// 처리할 문장을 가지고있는 인스턴스 자리
			int num1 = Integer.parseInt(numTF1.getText());
			int num2 = Integer.parseInt(numTF2.getText());
			resTF.setText(num1 + "+" + num2 + "=" + (num1 + num2));
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}
	}

	public static void main(String[] args) {
		
		가벼움 ref = new 가벼움();
ref.setVisible(true);
	}

}
