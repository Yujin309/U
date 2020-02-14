package 스레드;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Multi extends JPanel implements ActionListener {

	private JProgressBar bar1, bar2;
	private JButton startBtn;
	private int max = 1000;

	public Multi() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(2, 2));

		startBtn = new JButton("Star");
		startBtn.addActionListener(this);

		bar1 = new JProgressBar(0, max);
		bar2 = new JProgressBar(0, max);
		bar1.setValue(100);
		bar1.setStringPainted(true);
		bar2.setValue(0);
		bar2.setStringPainted(true);

		add(startBtn);
		add(bar1);
		add(new Label(""));
		add(bar2);
		setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		startBtn.setEnabled(false);

		Thread thread1 = new BarThread(bar1);
		Thread thread2 = new BarThread(bar2);
		thread1.start();
		thread2.start();

	}

	public class BarThread extends Thread {
		private JProgressBar bar;

		public BarThread(JProgressBar bar) {
			// TODO Auto-generated constructor stub
			this.bar = bar;
		}

		@Override
		public void run() {// 프로그래스바의 벨류가 봐뀌는 것을 처리하고 싶다.
			int current = 0;
			while (current <= max) {
				current += Math.random() * 100;
				bar.setValue(current);
				try {
					sleep(100);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			startBtn.setEnabled(true);
		}

	}
//무엇을 멀티 스레드로 할것인가 . 전체인지 부분인지 

}
