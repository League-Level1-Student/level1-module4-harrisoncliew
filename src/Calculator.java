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
JTextField field1 = new JTextField(8);
JTextField field2 = new JTextField(8);

void setup() {
	button.setText("add");
	button1.setText("subtract");
	button2.setText("multiply");
	button3.setText("divide");
	panel.add(button);
	field1.setSize(50, 1);
	field2.setSize(50,1);
	String hilol = field1.getText();
	String hilol2 = field2.getText();
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(field1);
	panel.add(field2);
	panel.add(label);
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
	int hi = Integer.parseInt();
	if(e.getSource()==button) {
		label.setText();
	}
 }

}
