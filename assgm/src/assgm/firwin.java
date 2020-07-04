package assgm;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
public class firwin {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPanel panel_1;
	private JPanel panel_2;
	public File f = new File("Data.txt");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firwin window = new firwin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection=null; 
	private JPasswordField passwordField;
	public firwin() {
		initialize();
		connection=sqliteConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(105, 105, 105));
		frame.getContentPane().setForeground(new Color(139, 0, 0));
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 986, 10);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Hello Traveller");
		lblNewLabel.setBackground(new Color(255, 255, 0));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 56));
		lblNewLabel.setBounds(244, 63, 711, 70);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("I aM New here");
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(83, 145, 226, 93);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Create a new account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    panel_1.setVisible(true);
			    panel_2.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(35, 213, 343, 75);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblIHave = new JLabel("I Have been here");
		lblIHave.setForeground(new Color(255, 215, 0));
		lblIHave.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblIHave.setBounds(571, 154, 262, 75);
		frame.getContentPane().add(lblIHave);
		
		JButton btnBeenHere = new JButton("Login");
		btnBeenHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			panel_2.setVisible(true);	
			panel_1.setVisible(false);
			}
		});
		btnBeenHere.setForeground(Color.BLACK);
		btnBeenHere.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnBeenHere.setBackground(new Color(255, 255, 255));
		btnBeenHere.setBounds(581, 213, 226, 75);
		frame.getContentPane().add(btnBeenHere);
		
		panel_2 = new JPanel();
		panel_2.setVisible(false);
		panel_2.setBackground(new Color(105, 105, 105));
		panel_2.setBounds(512, 298, 377, 187);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setForeground(new Color(255, 215, 0));
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		lblNewLabel_3.setBounds(48, 37, 79, 27);
		panel_2.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("enter in email format");
		textField_4.setBounds(140, 37, 154, 27);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 215, 0));
		lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		lblPassword.setBounds(48, 74, 93, 27);
		panel_2.add(lblPassword);
		
		JButton btnNewButton_2 = new JButton("Lets go ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "select * from userintro where Email=? and password=?";
					PreparedStatement pst = connection.prepareStatement(query);
					System.out.println(pst); 
					pst.setString(1, textField_4.getText());
					 pst.setString(2, passwordField.getText());
					 	
					
					ResultSet rs=pst.executeQuery();
					int count = 0;
					while(rs.next()){
						System.out.println("2"+rs);
						count++;
					}
					if(count==1) {
						JOptionPane.showMessageDialog(null, "Username and password is correct");
						frame.dispose();
						secwin secwi = new secwin();
						secwi.setVisible(true);
					
					}
					else if(count>1) {
						JOptionPane.showMessageDialog(null, "Username and password is duplicate");
					}
					else {
						JOptionPane.showMessageDialog(null, "Username and password is not correct Try again...");
					}
				rs.close();
				pst.close();
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
				}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(114, 115, 121, 42);
		panel_2.add(btnNewButton_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(140, 74, 154, 27);
		panel_2.add(passwordField);
		
		panel_1 = new JPanel();
		panel_1.setVisible(false);
		panel_1.setBackground(new Color(105, 105, 105));
		panel_1.setForeground(new Color(250, 250, 210));
		panel_1.setBounds(10, 309, 431, 244);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Firstname");
		lblNewLabel_2.setForeground(new Color(255, 215, 0));
		lblNewLabel_2.setBackground(new Color(255, 215, 0));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_2.setBounds(32, 34, 92, 21);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(153, 36, 158, 22);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(255, 215, 0));
		lblEmail.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblEmail.setBounds(32, 84, 92, 21);
		panel_1.add(lblEmail);
		
		JLabel lblCreatePassword = new JLabel("Create password");
		lblCreatePassword.setForeground(new Color(255, 215, 0));
		lblCreatePassword.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblCreatePassword.setBounds(10, 131, 142, 21);
		panel_1.add(lblCreatePassword);
		
		JLabel label_2 = new JLabel("Firstname");
		label_2.setForeground(new Color(255, 215, 0));
		label_2.setFont(new Font("Arial Black", Font.BOLD, 15));
		label_2.setBounds(32, 178, 92, 21);
		panel_1.add(label_2);
		textField_1 = new JTextField();
		textField_1.setToolTipText("Enter email here ");
		textField_1.setColumns(10);
		textField_1.setBounds(153, 86, 158, 22);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(153, 133, 158, 22);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(153, 180, 158, 22);
		panel_1.add(textField_3);
		
		JButton btnNewButton_1 = new JButton("Let me IN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "insert into userintro (Username,Email,Password,Mobile) values (?,?,?,?)";
					PreparedStatement ps1 = connection.prepareStatement(query);
					 ps1.setString(1, textField.getText());
					 ps1.setString(2, textField_1.getText());
					 ps1.setString(3, textField_2.getText());
					 ps1.setString(4, textField_3.getText());
						
					
					ps1.execute();
					JOptionPane.showMessageDialog(null, "Your account has been created please login to continue");
					ps1.close();
				}
				
				catch(Exception e1) {
					e1.printStackTrace();
				}
			}
			});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(321, 86, 100, 66);
		panel_1.add(btnNewButton_1);
	}
}
