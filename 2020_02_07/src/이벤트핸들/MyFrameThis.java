package �̺�Ʈ�ڵ�;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//��ư 3�� ����� �ؽ�Ʈ �ʵ� 1�� ����� 
//��ư 2��(7,8)�� ������ �ش� ���� �ؽ�Ʈ �ʵ忡 ����.  ��ư �� c��ư�� �ؽ�Ʈ �ʵ带 Ŭ�����Ų��. 
import javax.swing.JTextField;

public class MyFrameThis extends JFrame implements ActionListener {
//j���������κ��� Ȯ����Ѽ� Ŭ������ ����ڴٴ� ��. 
	private JButton Btn7 = new JButton("7");// 7bte: �������� ���� ���� �Ұ�
	private JButton Btn8 = new JButton("8");
	private JButton BtnClear = new JButton("C");
	private JTextField tRes = new JTextField("");

	public MyFrameThis() {
		// //��ġ�����ڰ� �����ΰ�? = ����Ʈ(�⺻)�� BorderLayout(�ϳ��� �������� �ϳ��� ������Ʈ��)
		JPanel btnPane = new JPanel();
		btnPane.add(Btn7);
		btnPane.add(Btn8);
		btnPane.add(BtnClear);

		this.add(btnPane);
		this.add("South", tRes);
		// �̺�Ʈ ������ ���>> ó���ڴ� �͸� Inner class�� �ν��Ͻ��� ���������� ��� �� �� ������ ���� .
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
		// �׼�Ŭ������ ���� ������ �ִ°� ? = actionPerformed �� �ν��Ͻ��� ���� ȣ��Ǿ����� �� this��
		// myframethis Ŭ���� �ȿ� �ִ�.
		// this.Btn7
		System.out.println(e.getActionCommand());
		System.out.println(e.getModifiers());
		System.out.println(e.getSource());
		System.out.println(e.paramString());

	}
}
