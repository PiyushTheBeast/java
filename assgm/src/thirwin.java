import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;

public class thirwin extends JFrame {

	private JPanel contentPane;
	private JTextField txtStartDate;
	private JTextField txtStartDate_1;
	private JTextField txtEndDate;
	private JTextField txtDestination;
	private JTextField txtAddMoreDestination;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thirwin frame = new thirwin();
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
	public thirwin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Travelling from");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(295, 55, 187, 38);
		contentPane.add(lblNewLabel);
		
		txtStartDate = new JTextField();
		txtStartDate.setFont(new Font("Agency FB", Font.BOLD, 20));
		txtStartDate.setText("        YOUR CURRENT LOCATION");
		txtStartDate.setBounds(492, 58, 231, 32);
		contentPane.add(txtStartDate);
		txtStartDate.setColumns(10);
		
		txtStartDate_1 = new JTextField();
		txtStartDate_1.setFont(new Font("Agency FB", Font.BOLD, 21));
		txtStartDate_1.setText("     START DATE");
		txtStartDate_1.setBounds(299, 138, 141, 32);
		contentPane.add(txtStartDate_1);
		txtStartDate_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("TO");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setBounds(504, 139, 56, 27);
		contentPane.add(lblNewLabel_1);
		
		txtEndDate = new JTextField();
		txtEndDate.setText("         END DATE");
		txtEndDate.setFont(new Font("Agency FB", Font.BOLD, 21));
		txtEndDate.setColumns(10);
		txtEndDate.setBounds(603, 138, 141, 32);
		contentPane.add(txtEndDate);
		
		JLabel lblTravellingTo = new JLabel("Travelling To");
		lblTravellingTo.setForeground(new Color(255, 215, 0));
		lblTravellingTo.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblTravellingTo.setBounds(295, 218, 187, 38);
		contentPane.add(lblTravellingTo);
		
		txtDestination = new JTextField();
		txtDestination.setText("               DESTINATION");
		txtDestination.setFont(new Font("Agency FB", Font.BOLD, 20));
		txtDestination.setColumns(10);
		txtDestination.setBounds(492, 221, 231, 32);
		contentPane.add(txtDestination);
		
		txtAddMoreDestination = new JTextField();
		txtAddMoreDestination.setText("        ADD MORE DESTINATIONS");
		txtAddMoreDestination.setFont(new Font("Agency FB", Font.BOLD, 20));
		txtAddMoreDestination.setColumns(10);
		txtAddMoreDestination.setBounds(394, 282, 231, 32);
		contentPane.add(txtAddMoreDestination);
	}
}
