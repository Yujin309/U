package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test1 extends JFrame {
	private JButton okBtn;
	private JButton canButton;
	
public Test1() {
	super("���� ������ ^^");
	okBtn=new JButton("OK");
	canButton= new JButton("Cancel");
	
	//FlowLayout manager= new FlowLayout()	;
    //BorderLayout manager=new BorderLayout()	;
	GridBagLayout manager= new GridBagLayout();
	setLayout(manager);
	//getRootPane().
	
	//	add(okBtn);
	add(canButton);
	//�� �������� �ϳ��� ���� ��. �׷��� ok��ư�� ���µ� ���߿� �� can��ư�� ����
	//�г��� �־��� ������ �ΰ�����. 
	
	init();
	
}
	public void init() {
	
	setBounds(100, 100, 500, 100);
	
	
}
}
