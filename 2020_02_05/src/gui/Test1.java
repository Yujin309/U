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
	super("나의 프레임 ^^");
	okBtn=new JButton("OK");
	canButton= new JButton("Cancel");
	
	//FlowLayout manager= new FlowLayout()	;
    //BorderLayout manager=new BorderLayout()	;
	GridBagLayout manager= new GridBagLayout();
	setLayout(manager);
	//getRootPane().
	
	//	add(okBtn);
	add(canButton);
	//한 영역에는 하나의 것이 들어감. 그래서 ok버튼이 들어갔는데 나중에 들어간 can버튼이 나옴
	//패널을 넣었기 때문에 두개나옴. 
	
	init();
	
}
	public void init() {
	
	setBounds(100, 100, 500, 100);
	
	
}
}
