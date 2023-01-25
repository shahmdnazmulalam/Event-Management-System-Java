package User;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Admin.Home;
/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
public class UserLogin extends JFrame {
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private String user[]={"Soumyadip","Soumya"};
	private String pass[]={"abcd","abcde"};
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JLabel label_1;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin frame = new UserLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Event Details");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 71));
		lblNewLabel.setBounds(354, 42, 448, 93);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("Register");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 57));
		btnNewButton.setBounds(674, 172, 309, 298);
	
		
	
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("All Event Details");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Home obj=new Home();
				obj.setTitle("Admin-Login");
				obj.setVisible(true);
	}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 61));
		btnNewButton_1.setBounds(36, 172, 600, 298);
		contentPane.add(btnNewButton_1);
		
		label_1 = new JLabel("");
	//	label_1.setIcon(new ImageIcon("C:\\Users\\Soumyadeep\\Desktop\\a11.jpg"));
		label_1.setBounds(0, 0, 1008, 562);
		contentPane.add(label_1);
	}

}
/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */