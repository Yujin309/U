package Use;

import javax.swing.JFrame;

import ½º·¹µå.MultiProgressBarEx;

public class BarUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("MultiThreadTest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(new MultiProgressBarEx());
		frame.pack();
		frame.setVisible(true);
	}

}
