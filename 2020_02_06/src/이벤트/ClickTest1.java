package ¿Ã∫•∆Æ;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClickTest1 extends JFrame{
 private JTextField resTestField;
 private JTextField num1Text;
 private JTextField num2TextField;
 private JLabel lblNewLabel;
 public ClickTest1() {
  getContentPane().setFont(new Font("Consolas", Font.PLAIN, 14));
  setBackground(new Color(255, 192, 203));
  getContentPane().setBackground(new Color(255, 192, 203));
  GridBagLayout gridBagLayout = new GridBagLayout();
  gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
  gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
  gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
  gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
  getContentPane().setLayout(gridBagLayout);
  
  lblNewLabel = new JLabel("New label");
  GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
  gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
  gbc_lblNewLabel.gridx = 1;
  gbc_lblNewLabel.gridy = 0;
  getContentPane().add(lblNewLabel, gbc_lblNewLabel);
  
  resTestField = new JTextField();
  GridBagConstraints gbc_resTestField = new GridBagConstraints();
  gbc_resTestField.gridwidth = 4;
  gbc_resTestField.insets = new Insets(0, 0, 5, 5);
  gbc_resTestField.fill = GridBagConstraints.BOTH;
  gbc_resTestField.gridx = 1;
  gbc_resTestField.gridy = 1;
  getContentPane().add(resTestField, gbc_resTestField);
  resTestField.setColumns(10);
  
  num1Text = new JTextField();
  GridBagConstraints gbc_num1Text = new GridBagConstraints();
  gbc_num1Text.insets = new Insets(0, 0, 0, 5);
  gbc_num1Text.fill = GridBagConstraints.BOTH;
  gbc_num1Text.gridx = 1;
  gbc_num1Text.gridy = 3;
  getContentPane().add(num1Text, gbc_num1Text);
  num1Text.setColumns(10);
  
  JComboBox opControl = new JComboBox();
  opControl.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/"}));
  GridBagConstraints gbc_opControl = new GridBagConstraints();
  gbc_opControl.insets = new Insets(0, 0, 0, 5);
  gbc_opControl.fill = GridBagConstraints.HORIZONTAL;
  gbc_opControl.gridx = 2;
  gbc_opControl.gridy = 3;
  getContentPane().add(opControl, gbc_opControl);
  
  num2TextField = new JTextField();
  GridBagConstraints gbc_num2TextField = new GridBagConstraints();
  gbc_num2TextField.insets = new Insets(0, 0, 0, 5);
  gbc_num2TextField.fill = GridBagConstraints.BOTH;
  gbc_num2TextField.gridx = 3;
  gbc_num2TextField.gridy = 3;
  getContentPane().add(num2TextField, gbc_num2TextField);
  num2TextField.setColumns(10);
  
  JButton equal = new JButton("=");
  equal.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    int num1 = Integer.parseInt(num1Text.getText());
    int num2 = Integer.parseInt(num2TextField.getText());
    String oopStr = (String) opControl.getSelectedItem();
    int res = 0;
    switch (oopStr) {
    case "+":res=num1+num2; break;
    case "-":res=num1-num2; break;
    case "*":res=num1*num2; break;
    case "/":res=num1/num2; break;
    default:
     break;
    }
    resTestField.setText(num1+oopStr+num2+"="+res);
    
   }
  });
  GridBagConstraints gbc_equal = new GridBagConstraints();
  gbc_equal.insets = new Insets(0, 0, 0, 5);
  gbc_equal.gridx = 4;
  gbc_equal.gridy = 3;
  getContentPane().add(equal, gbc_equal);
 }
 
 public static void main(String[] args) {
	 ClickTest1 test1 = new ClickTest1();
  test1.pack();
  test1.setVisible(true);
 }

}