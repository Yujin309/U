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

public class MyFrame1 extends JFrame {

	private JButton Btn7 = new JButton("7");// 7bte: �������� ���� ���� �Ұ�
	private JButton Btn8 = new JButton("8");
	private JButton BtnClear = new JButton("C");

	private JTextField tRes = new JTextField("");

	public MyFrame1() { // ������Ʈ�� ���� �ν��Ͻ��� ������� �����Ƿ� ��������, ������ �߿����� �ʴ�.
		// ������Ʈ�� ��� ���� ������, �̺�Ʈ�� ���� ���� �����ֱ�
		// �����ӿ� ��ư�� �ؽ�Ʈ �ʵ带 ��ġ�Ѵ�.
		// //��ġ�����ڰ� �����ΰ�? = ����Ʈ(�⺻)�� BorderLayout(�ϳ��� �������� �ϳ��� ������Ʈ��)
		JPanel btnPane = new JPanel();
		btnPane.add(Btn7);
		btnPane.add(Btn8);
		btnPane.add(BtnClear);
		// this.add ("Center",btnPane);
		// this.add (btnPane,BorderLayout.Center);
		this.add(btnPane);
		this.add("South", tRes);
		//�̺�Ʈ ������ ���>> ó���ڴ�  �͸� Inner class�� �ν��Ͻ��� ���������� ��� �� �� ������ ���� .
		
		
		
		BtnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//e ���� ���� ������ ��� ��ü�� ������ �ִ�. 
				System.out.println(e.getActionCommand());
				System.out.println(e.getModifiers());
				System.out.println(e.getSource());
				System.out.println(e.paramString());
				
			}
		} );//btn ������ ��� �׼� �̺�Ʈ�� �߻��Ǹ�,()���� 
		// �̺�Ʈ ������ ��� / ��ġ ũ�� ����.
		
		Btn7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {//e ���� ���� ������ ��� ��ü�� ������ �ִ�. 
				System.out.println(e.getActionCommand());
				System.out.println(e.getModifiers());
				System.out.println(e.getSource());
				System.out.println(e.paramString());
				
			}
		}
		);
		Btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//e ���� ���� ������ ��� ��ü�� ������ �ִ�. 
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
//���� ���� ���̴�. ���� �ϴ����� �ٸ��� ����ϴ°� �������� 4���� ������Ʈ���� ���� ���� ó���ϴ� ������� �ߺ��Ǵ�
//���� ����!! 