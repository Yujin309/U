package �̺�Ʈ�ڵ�;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//��ư 3�� ����� �ؽ�Ʈ �ʵ� 1�� ����� 
//��ư 2��(7,8)�� ������ �ش� ���� �ؽ�Ʈ �ʵ忡 ����.  ��ư �� c��ư�� �ؽ�Ʈ �ʵ带 Ŭ�����Ų��. 
import javax.swing.JTextField;

import com.sun.beans.decoder.ValueObject;

public class MyFrameThis2 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
//j���������κ��� Ȯ����Ѽ� Ŭ������ ����ڴٴ� ��. 
	private JButton Btn7 = new JButton("7");// 7bte: �������� ���� ���� �Ұ�
	private JButton Btn8 = new JButton("8");
	private JButton BtnClear = new JButton("C");
	private JTextField tRes = new JTextField("");

	public MyFrameThis2() {
		// //��ġ�����ڰ� �����ΰ�? = ����Ʈ(�⺻)�� BorderLayout(�ϳ��� �������� �ϳ��� ������Ʈ��)
		JPanel btnPane = new JPanel();
		btnPane.add(Btn7);
		btnPane.add(Btn8);
		btnPane.add(BtnClear);

		this.add(btnPane);
		this.add("South", tRes);
		// �̺�Ʈ ������ ���>> ó���ڴ� �͸� Inner class�� �ν��Ͻ��� ���������� ��� �� �� ������ ���� .
		this.setLocation(200, 300);
		this.pack();
	
		BtnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				tRes.setText(" ");

			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// �׼�Ŭ������ ���� ������ �ִ°� ? = actionPerformed �� �ν��Ͻ��� ���� ȣ��Ǿ����� �� this��
		// myframethis Ŭ���� �ȿ� �ִ�.
		// this.Btn7

	}

};
