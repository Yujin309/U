
package oop;

import javax.swing.JFrame;

public class 惑加己Use1  extends   JFrame            {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		惑加己Use1   frame=new 惑加己Use1();
		 System.out.println(   frame.getBackground()   );
		frame.setBounds(400, 400, 200, 300);
		double  x= frame.getBounds().getX();
		System.out.println( x);
		frame.setVisible(true);
	}

}
