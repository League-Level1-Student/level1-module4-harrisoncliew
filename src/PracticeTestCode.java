import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.*;
public class PracticeTestCode implements ActionListener {
public static void main(String[] args) {
	PracticeTestCode c = new PracticeTestCode();
	c.setup();
}

JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
JButton hint = new JButton();
JButton check = new JButton();
JTextField text = new JTextField(10);

void setup() {
	frame.add(panel);
	panel.add(label);
	panel.add(text);
	panel.add(check);
	panel.add(hint);
	label.setText("The answer to this is one word, which is plural. Craig died in Florida. Shortly after, Tracy died at sea. Nobody mourned, In fact, everyone was absolutey delighted.\n" + 
			"\n" + 
			"What are Craig and Tracy?");
	check.addActionListener(this);
	hint.setText("HINT!");
	check.setText("Check");
	hint.addActionListener(this);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==hint) {
		JOptionPane.showMessageDialog(null, "Craig and Tracy are not people, but something that people don't like. They also get named by alphabetical order.");
	}
	if(e.getSource()==check) {
		String lol = text.getText();
		if(lol.equalsIgnoreCase("Hurricanes")) {
			JOptionPane.showMessageDialog(null, "Right!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		
	}
}
}