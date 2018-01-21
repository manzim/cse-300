package userInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class RoomNumberButtons extends JButton{ 
	
	public String roomNumber;	
	public RoomNumberButtons(final String roomNumber)
	{
		this.roomNumber = roomNumber;
		setText(String.valueOf(roomNumber));
		setBackground(Color.WHITE);
		setFont(new Font("Tahoma", Font.BOLD , 20));
		addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				RoomWindow r = new RoomWindow(roomNumber);
			}
		};
		setBounds(161, 30, 89, 159);
	}	
}
