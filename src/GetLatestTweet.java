import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
public class GetLatestTweet implements ActionListener {
	public static void main(String[] args) {
		GetLatestTweet t = new GetLatestTweet();
		t.setup();
	}
JFrame frame = new JFrame();
JButton button = new JButton();
JTextField field = new JTextField(10);
JPanel panel = new JPanel();
JLabel label = new JLabel();

void setup() {
	button.setText("Search TwitterVerse");
	button.addActionListener(this);
	field.setSize(50,1);
	panel.add(label);
	panel.add(field);
	panel.add(button);
	frame.add(panel);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String hi = field.getText();
	
	label.setText(getLatestTweet(hi));
	frame.pack();
}
private String getLatestTweet(String searchingFor) {

    Twitter twitter = new TwitterFactory().getInstance();

    AccessToken accessToken = new AccessToken(
          "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
          "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
          "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

    twitter.setOAuthAccessToken(accessToken);

    Query query = new Query(searchingFor);
    try {
          QueryResult result = twitter.search(query);
          return result.getTweets().get(0).getText();
    } catch (Exception e) {
          System.err.print(e.getMessage());
          return "What the heck is that?";
    }
}
}
