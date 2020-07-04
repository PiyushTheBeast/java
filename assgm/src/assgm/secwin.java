package assgm;
import java.awt.Image;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class secwin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secwin frame = new secwin();
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
	public secwin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(105, 105, 105));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to TOUR Manager");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 34));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(226, 39, 702, 75);
		panel.add(lblNewLabel);
		
		JTextArea txtrAtTourManager = new JTextArea();
		txtrAtTourManager.setFont(new Font("Colonna MT", Font.PLAIN, 25));
		txtrAtTourManager.setText("At Tour Manager we help you organise your trip \r\nby keeping a safe data record of it , So that you \r\ncan enjoy your trip without being hasselled about\r\n where to go NEXT...");
		txtrAtTourManager.setBackground(new Color(105, 105, 105));
		txtrAtTourManager.setForeground(new Color(255, 250, 240));
		txtrAtTourManager.setBounds(423, 105, 543, 132);
		panel.add(txtrAtTourManager);
		
		JButton btnNewButton = new JButton("Add a new Trip");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thirwin fiwi = new thirwin();
				fiwi.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(245, 245, 245));
		btnNewButton.setBackground(new Color(255, 165, 0));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 19));
		btnNewButton.setBounds(150, 259, 340, 42);
		panel.add(btnNewButton);
		
		JButton btnViewYourPrevious = new JButton("View Your Previous Plans");
		btnViewYourPrevious.setForeground(new Color(245, 245, 245));
		btnViewYourPrevious.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 19));
		btnViewYourPrevious.setBackground(new Color(255, 165, 0));
		btnViewYourPrevious.setBounds(150, 352, 340, 42);
		panel.add(btnViewYourPrevious);
		Image img = new ImageIcon(this.getClass().getResource("/tr1.png")).getImage();
		Image img1 = new ImageIcon(this.getClass().getResource("/BACK.png")).getImage();
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("L:\\ja\\traa.png"));
		lblNewLabel_1.setBounds(597, 232, 331, 297);
		panel.add(lblNewLabel_1);
	}
}
