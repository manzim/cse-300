package userInterface;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class BlockWindow extends JFrame {

	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlockWindow frame = new BlockWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}/*XAMP*/
		});
	}

	public BlockWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 710, 535);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel blockNameLabel = new JLabel("A BLOCK");
		blockNameLabel.setForeground(Color.WHITE);
		blockNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		blockNameLabel.setFont(new Font("Tahoma", Font.BOLD , 89));
		blockNameLabel.setBounds(101, 51, 480, 128);
		contentPane.add(blockNameLabel);

		RoomNumberButtons button1 = new RoomNumberButtons("1");
		button1.setBounds(17, 293, 65, 128);
		contentPane.add(button1);

		RoomNumberButtons button2 = new RoomNumberButtons("2");
		button2.setBounds(83, 293, 65, 128);
		contentPane.add(button2);

		RoomNumberButtons button3 = new RoomNumberButtons("3");
		button3.setBounds(149, 293, 65, 128);
		contentPane.add(button3);

		RoomNumberButtons button4 = new RoomNumberButtons("4");
		button4.setBounds(215, 293, 65, 128);
		contentPane.add(button4);

		RoomNumberButtons button5 = new RoomNumberButtons("5");
		button5.setBounds(281, 293, 65, 128);
		contentPane.add(button5);

		RoomNumberButtons button6 = new RoomNumberButtons("6");
		button6.setBounds(347, 293, 65, 128);
		contentPane.add(button6);

		RoomNumberButtons button7 = new RoomNumberButtons("7");
		button7.setBounds(413, 293, 65, 128);
		contentPane.add(button7);

		RoomNumberButtons button8 = new RoomNumberButtons("8");
		button8.setBounds(479, 293, 65, 128);
		contentPane.add(button8);

		RoomNumberButtons button9 = new RoomNumberButtons("9");
		button9.setBounds(545, 293, 65, 128);
		contentPane.add(button9);

		RoomNumberButtons button10 = new RoomNumberButtons("10");
		button10.setBounds(612, 293, 65, 128);
		contentPane.add(button10);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 40, 21);
		contentPane.add(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmCloseAltf = new JMenuItem("Close  Alt+f4");
		mntmCloseAltf.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmCloseAltf);
	}
}
