import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;
import javax.swing.*;
public class TypingTutor implements KeyListener {
	static char currentLetter;
	static int n = 0;
public static void main(String[] args) {
	
	currentLetter = randomletter();
	TypingTutor tt = new TypingTutor();
	tt.setup();
	
}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	void setup() {
		frame.add(panel);
		panel.add(label);
		label.setText(currentLetter+"");
		label.setFont(label.getFont().deriveFont(40.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		frame.setTitle("Type or Die");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}
	static char randomletter() {
		Random r = new Random();
		return (char) (r.nextInt(26)+'a');
	}
	Date timeAtStart = new Date();

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	      Date timeAtEnd = new Date();
	      long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	      long gameInSeconds = (gameDuration / 1000) % 60;
	      double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	      int charactersPerMinute = (int) (charactersPerSecond * 60);
	      JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You typed: "+ e.getKeyChar());
		if(e.getKeyChar()==currentLetter) {
			System.out.println("Correct");
			panel.setBackground(Color.GREEN);
			
			
		}
		else {
			panel.setBackground(Color.RED);
		}
		n++;
		if(n==50) {
			showTypingSpeed(n);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = randomletter();
		label.setText(" ");
		label.setText(currentLetter+"");
		
	}
}
