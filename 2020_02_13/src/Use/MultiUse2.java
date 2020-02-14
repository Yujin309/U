package Use;

import javax.swing.JFrame;

import 스레드.Multi;
import 스레드.MultiProgressBarEx;

public class MultiUse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("MultiThreadTest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(new Multi());
		frame.pack();
		frame.setVisible(true);
	}

}
