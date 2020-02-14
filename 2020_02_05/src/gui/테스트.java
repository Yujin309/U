package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.Box;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.Panel;

public class 테스트 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					테스트 frame = new 테스트();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public 테스트() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u261C");
		btnNewButton.setBounds(343, 21, 58, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(12, 10, 401, 93);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("BACK");
		button.setBounds(313, 118, 88, 48);
		contentPane.add(button);
		
		JButton button_1 = new JButton("C");
		button_1.setBounds(210, 118, 88, 48);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("CE");
		button_2.setBounds(110, 118, 88, 48);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("%");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(12, 118, 88, 48);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("\u00B9/x");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setBounds(12, 176, 88, 48);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("\u2227");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_5.setBounds(110, 176, 88, 48);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("\u221A");
		button_6.setBounds(210, 176, 88, 48);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("\u00F7");
		button_7.setBounds(313, 176, 88, 48);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("7");
		button_8.setBounds(12, 234, 88, 48);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("4");
		button_9.setBounds(12, 292, 88, 48);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("1");
		button_10.setBounds(12, 350, 88, 48);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("+/-");
		button_11.setBounds(12, 408, 88, 48);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("8");
		button_12.setBounds(110, 234, 88, 48);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("5");
		button_13.setBounds(110, 292, 88, 48);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("2");
		button_14.setBounds(110, 350, 88, 48);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("0");
		button_15.setBounds(110, 408, 88, 48);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("9");
		button_16.setBounds(210, 234, 88, 48);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("6");
		button_17.setBounds(210, 292, 88, 48);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("3");
		button_18.setBounds(210, 350, 88, 48);
		contentPane.add(button_18);
		
		JButton button_19 = new JButton(".");
		button_19.setBounds(210, 408, 88, 48);
		contentPane.add(button_19);
		
		JButton button_20 = new JButton("\u00D7");
		button_20.setBounds(313, 234, 88, 48);
		contentPane.add(button_20);
		
		JButton button_21 = new JButton("-");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_21.setBounds(313, 292, 88, 48);
		contentPane.add(button_21);
		
		JButton button_22 = new JButton("+");
		button_22.setBounds(313, 350, 88, 48);
		contentPane.add(button_22);
		
		JButton button_23 = new JButton("=");
		button_23.setBounds(313, 408, 88, 48);
		contentPane.add(button_23);
	}
}
