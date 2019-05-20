import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.*;
public class RealWhackAMole implements ActionListener {
public static void main(String[] args) {
	RealWhackAMole mole2 = new RealWhackAMole();
	mole2.setup();
}
	JFrame frame;
	JPanel panel;
	JButton mole;
	Date timeatstart = new Date();
	int moleswhacked = 0;
	int notmolewhacked = 0;
	int buttonwhacked =0;
	Random r = new Random();
	int molelocation;
	 void setup() {
		frame = new JFrame();
		panel = new JPanel();
		mole = new JButton();
		frame.add(panel);
		drawButtons();
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	 
	void drawButtons() {
		molelocation = r.nextInt(24);
		for (int i = 0; i < 24; i++) {
			if(i==molelocation) {
				
				panel.add(mole);
				mole.setText("mole!");
				mole.addActionListener(this);
			}
			else {
				JButton temp = new JButton();
				temp.addActionListener(this);
				panel.add(temp);
			}
	}
}
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()!=mole) {
			buttonwhacked++;
			notmolewhacked++;
			frame.dispose();
			setup();
			
			if(notmolewhacked==1) {
				speak("You failed.");
				
			}
			if(notmolewhacked==2) {
				speak("You are horrible at this game");
				
			}
			if(notmolewhacked==3) {
				speak("You are a complete failure.");
				
			}
			if(notmolewhacked==4) {
				speak("You missed.");
			}
			if(notmolewhacked==5) {
				speak("You lost. Don't Come Again");
				endGame(timeatstart, moleswhacked);
				notmolewhacked=0;
			}
		}
			
			
			if(e.getSource()==mole) {
				buttonwhacked++;
				moleswhacked++;
				frame.dispose();
				setup();
				if(moleswhacked==10) {
					endGame(timeatstart, moleswhacked);
					moleswhacked=0;
				}
			}
			
			
		
		
	}
}
