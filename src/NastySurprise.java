import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;
public class NastySurprise implements ActionListener {
	public static void main(String[] args) {
		NastySurprise ns = new NastySurprise();
		ns.setup();
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	
	 void setup(){
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.setText("Trick");
		button2.setText("Treat");
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button2) {
			showPictureFromTheInternet("https://partycity6.scene7.com/is/image/PartyCity/_pdp_sq_?$_1000x1000_$&$product=PartyCity/43687");
		}
		if(e.getSource()==button1) {
			showPictureFromTheInternet("http://cdn.akc.org/content/article-body-image/siberian_husky_cute_puppies.jpg");
		}
	}
	


}
