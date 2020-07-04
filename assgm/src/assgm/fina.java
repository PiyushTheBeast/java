package assgm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fina extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fina frame = new fina();
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
	public fina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 10, 253);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Thankyou Traveller Your Travel plans have been created ");
		lblNewLabel.setForeground(new Color(255, 20, 147));
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 23));
		lblNewLabel.setBounds(46, 26, 618, 73);
		contentPane.add(lblNewLabel);
		
		final JTextArea txtrFilename = new JTextArea();
		txtrFilename.setToolTipText("with .txt extension");
		txtrFilename.setText("Filename");
		txtrFilename.setBounds(219, 180, 237, 45);
		contentPane.add(txtrFilename);
		
		JLabel label = new JLabel("Thankyou Traveller Your Travel plans have been created ");
		label.setForeground(new Color(255, 20, 147));
		label.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 23));
		label.setBounds(46, 78, 618, 63);
		contentPane.add(label);
		
		final JList list = new JList();
		list.setBounds(80, 212, 1, 1);
		contentPane.add(list);
		final DefaultListModel DLM = new DefaultListModel();
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DLM.addElement(txtrFilename.getText());
				list.setModel(DLM);
				txtrFilename.setText("");
				System.out.println(list.getModel().getElementAt(0));
			}
		});
		System.out.println(list.getModel().getElementAt(0));
		btnNewButton.setBounds(284, 250, 151, 30);
		contentPane.add(btnNewButton);
	}
}
