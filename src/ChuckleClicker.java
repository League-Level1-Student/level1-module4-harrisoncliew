import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ChuckleClicker implements ActionListener {
public static void main(String[] args) {
	ChuckleClicker cc = new ChuckleClicker();
	cc.setup();
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button1 = new JButton();
JButton button2 = new JButton();
void setup() {
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	button1.setText("Joke");
	button2.setText("Punchline");
	button1.addActionListener(this);
	button2.addActionListener(this);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button1) {
		JOptionPane.showMessageDialog(null, "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.");
	}
	if(e.getSource()==button2) {
		JOptionPane.showMessageDialog(null, "A man enters a pun contest in his local newspaper. He sends in ten puns, hoping at least one of them would win, but unfortunately, no pun in ten did.");
	}
}
}
