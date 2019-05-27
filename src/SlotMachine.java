import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
public class SlotMachine implements ActionListener {
public static void main(String[] args) {
	SlotMachine slor = new SlotMachine();
	slor.setup();
}
JFrame frame = new JFrame();
JButton button = new JButton();
JPanel panel = new JPanel();
void setup(){
	button.addActionListener(this);
	frame.add(panel);
	panel.add(button);
	button.setText("SPIN");
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.pack();
}
private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}
void refreshPanels() {
	
	panel = new JPanel();
}



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
		frame.remove(panel);
		refreshPanels();
		setup();
			Random r = new Random();
			int a = r.nextInt(3);
			int b = r.nextInt(3);
			int c = r.nextInt(3);
			if(a==0) {
				try {
					JLabel label1 = createLabelImage("images-2.jpg");
					panel.add(label1);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			else if(a==1) {
				try {
					JLabel label2 = createLabelImage("images-1.jpg");
					panel.add(label2);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if(a==2) {
				try {
					JLabel label3 = createLabelImage("images.jpg");
					panel.add(label3);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(b==0) {
				try {
					JLabel label1 = createLabelImage("images-2.jpg");
					panel.add(label1);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			else if(b==1) {
				try {
					JLabel label2 = createLabelImage("images-1.jpg");
					panel.add(label2);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if(b==2) {
				try {
					JLabel label3 = createLabelImage("images.jpg");
					panel.add(label3);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(c==0) {
				try {
					JLabel label1 = createLabelImage("images-2.jpg");
					panel.add(label1);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			else if(c==1) {
				try {
					JLabel label2 = createLabelImage("images-1.jpg");
					panel.add(label2);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if(c==2) {
				try {
					JLabel label3 = createLabelImage("images.jpg");
					panel.add(label3);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			frame.pack();
			if(a==b && b==c) {
				JOptionPane.showMessageDialog(null, "You won! You have downloaded a virus to your computer.");
			}
			
		
	}
}

}
