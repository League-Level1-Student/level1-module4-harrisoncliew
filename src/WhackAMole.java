import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;
import javax.swing.*;
public class WhackAMole implements ActionListener {
public static void main(String[] args) {
	
	WhackAMole w = new WhackAMole();
	Random r = new Random();
	int moleLocation = r.nextInt(24);
	w.setup(moleLocation);
	
}
JFrame frame;
JPanel panel;
JButton mole;
Date timeAtStart;
int a = 0;
int b = 0;
int c = 0;
Random r = new Random();
int molelocation = r.nextInt(24);


void setup(int a){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton mole = new JButton();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300, 400);
	frame.add(panel);

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
		timeAtStart = new Date();
	}
	frame.setVisible(true);
	
}
void drawButtons(int a) {
	
	
}
private void endGame(Date timeAtStart, int molesWhacked) {
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
         + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
         + " moles per second.");
}
void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
    }
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource()!=mole) {
		speak("You should regret your real existence.");
		a++;
		c++;
		if(a==5) {
			endGame(timeAtStart, b);
		}
	}
		if(e.getSource()==mole) {
			frame.dispose();
				
			b++;
			c++;
			if(b==10) {
				endGame(timeAtStart, b);
					
				}
			System.out.println("lol");
			}
		Random r = new Random();
		int moleLocation = r.nextInt(24);
		setup(moleLocation);
		}
}


