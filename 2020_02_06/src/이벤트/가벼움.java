package �̺�Ʈ;

import java.awt.ActiveEvent;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//�̺�Ʈ�� ������ ����, ���̾ƿ��� �߿����� ����. 

public class ������ extends JFrame {
	private JTextField resTF;
	private JTextField numTF1;
	private JTextField numTF2;

	private JButton resBtn;

	public ������() { // ������Ʈ component �߿����� �����̳�.�� �ν��Ͻ� ����.
		resTF = new JTextField("����� �����ڸ�");
		numTF1 = new JTextField("�����Է�");
		numTF2 = new JTextField("�����Է�");
		resBtn = new JButton("=");
//JFrame�̶�� container�� ������ component ���� �ٿ��ش� = �̺�Ʈ�� �߻��ϴ��� �����ڸ� ��� 

		setLayout(new FlowLayout());
		add(resTF);
		add(numTF1);
		add(new JLabel("+"));
		add(numTF2);
		add(resBtn);
//�̺�Ʈ �߻��ϴ��� ������ ���

		resBtn.addActionListener(new XXX());// ���ڸ��� A�� ���ڸ�.
setBounds(100, 100, 200, 200);
	}

	protected class XXX implements ActionListener {
		public void actionPerformed(ActiveEvent e) {
			// ó���� ������ �������ִ� �ν��Ͻ� �ڸ�
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
		
		������ ref = new ������();
ref.setVisible(true);
	}

}
