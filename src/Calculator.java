import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Calculator implements ActionListener {
public static void main(String[] args) {
	Calculator c = new Calculator();
	c.setup();
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
JButton button = new JButton();
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
static JTextField field1 = new JTextField(8);
static JTextField field2 = new JTextField(8);
static String one;
static String two;
void setup() {
	button.setText("add");
	button1.setText("subtract");
	button2.setText("multiply");
	button3.setText("divide");
	panel.add(button);
	field1.setSize(50, 1);
	field2.setSize(50,1);
	
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(field1);
	panel.add(field2);
	panel.add(label);
	panel.setVisible(true);
	frame.add(panel);
	button.addActionListener(this);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String one = field1.getText();
	String two = field2.getText();
	double hi = Integer.parseInt(one);
	double hi1 = Integer.parseInt(two);
	if(e.getSource()==button) {
		double onetwo = hi+hi1;
		label.setText(onetwo+"");
		frame.pack();
	}
	if(e.getSource()==button1) {
		double onetwo1 = hi-hi1;
		label.setText(onetwo1+"");
		frame.pack();
	}
	if(e.getSource()==button2) {
		double onetwo2 = hi*hi1;
		label.setText(onetwo2+"");
		frame.pack();
	}
	if(e.getSource()==button3) {
		double onetwo3 = hi/hi1;
		label.setText(onetwo3+"");
		frame.pack();
	}
 }

}
