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

public class MultiProgressBarEx extends JPanel implements ActionListener {

	private JProgressBar bar1, bar2;
	private JButton startBtn;
	private int max = 1000;

	public MultiProgressBarEx() {
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

		int current = 0 ,current2=0;
		while (current<= max) { // 천보다 작은 동안 반복해서 프로그래스 바를 이동
			current += Math.random() * 10;
			current2 += Math.random() * 10;
			bar1.setValue(current);
			bar1.setValue(current2);
			
		}

		startBtn.setEnabled(true);

	}

}
