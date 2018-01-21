package userInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginView {
	
//	private static JTextField userText = new JTextField(20);
//	private static JLabel passwordLabel = new JLabel("Password");
//	private static JPasswordField passwordText = new JPasswordField(20);

	public static void main(String[] args) {
		JFrame frame = new JFrame("Login window");
		frame.setLocation(500, 300);
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {

		final JTextField userText = new JTextField(20);
		JLabel passwordLabel = new JLabel("Password");
		final JPasswordField passwordText = new JPasswordField(20);
		panel.setLayout(null);

		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);
		
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);

		JButton loginButton = new JButton("login");
		loginButton.setBounds(10, 80, 80, 25);
		panel.add(loginButton);
		
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(passwordText.getText().equals("1964") && userText.getText().equals("ruet") || userText.getText().equals("RUET"))
				{
				
				BlockWindow frame = new BlockWindow();
				frame.setVisible(true);
				}				
			}
		});

}
}
