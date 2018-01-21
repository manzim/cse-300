package userInterface;

import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class RoomWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public RoomWindow(String s) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(470, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setVisible(true);
		
		JLabel lblRoomNumber = new JLabel("Room number "+s+":");
		try {
			MySQLAccess database= new MySQLAccess();
			String databaseEntries = database.readDataBase(s);
			lblRoomNumber.setText(databaseEntries);
		} catch (Exception e) {
			lblRoomNumber.setText(e.getMessage());
		}
		lblRoomNumber.setForeground(Color.WHITE);
		lblRoomNumber.setBounds(5, 7, 300, 150);
		contentPane.add(lblRoomNumber);
	}
}
