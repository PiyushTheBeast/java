package assgm;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import assgm.firwin;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import com.toedter.calendar.JDateChooser;

public class thirwin extends JFrame {

	private JPanel contentPane;
	private JTextField txtStartDate;
	private JTextField txtDestination;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_2;
	private JList list;
	private JButton btnRemoveDestination;
	private JTextField txtTypeDestinationTo;
	private JButton button;
	ArrayList<String> list12=new ArrayList<String>();
	
	
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
		lblNewLabel.setBounds(299, 37, 187, 38);
		contentPane.add(lblNewLabel);
		
		txtStartDate = new JTextField();
		txtStartDate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtStartDate.setText("");
			}
		});
		txtStartDate.setFont(new Font("Agency FB", Font.BOLD, 20));
		txtStartDate.setText("        YOUR CURRENT LOCATION");
		txtStartDate.setBounds(490, 40, 231, 32);
		contentPane.add(txtStartDate);
		txtStartDate.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Till");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setBounds(502, 98, 56, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblTravellingTo = new JLabel("Travelling To");
		lblTravellingTo.setForeground(new Color(255, 215, 0));
		lblTravellingTo.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblTravellingTo.setBounds(295, 159, 187, 38);
		contentPane.add(lblTravellingTo);
		
		txtDestination = new JTextField();
		txtDestination.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtDestination.setText("");
			}
		});
		
		txtDestination.setText("   Type New DESTINATION here");
		txtDestination.setFont(new Font("Agency FB", Font.BOLD, 20));
		txtDestination.setColumns(10);
		txtDestination.setBounds(299, 336, 231, 32);
		contentPane.add(txtDestination);
		
		JButton btnNewButton_1 = new JButton("GO BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secwin fiwi = new secwin();
				fiwi.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("L:\\ja\\BACK.png"));
		Image img1 = new ImageIcon(this.getClass().getResource("/BACK.png")).getImage();
		btnNewButton_1.setBounds(37, 39, 112, 42);
		contentPane.add(btnNewButton_1);
		
		final DefaultListModel DLM = new DefaultListModel();
		JButton btnNewButton = new JButton("      ADD  DESTINATION");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DLM.addElement(txtDestination.getText());
				list.setModel(DLM);
				 txtDestination.setText("");
				list12.add(txtDestination.getText());
			}
		});
		btnNewButton.setFont(new Font("Agency FB", Font.BOLD, 20));
		btnNewButton.setBounds(601, 336, 231, 38);
		contentPane.add(btnNewButton);
		
		JLabel lblBudget = new JLabel("Budget");
		lblBudget.setForeground(new Color(255, 215, 0));
		lblBudget.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblBudget.setBounds(295, 450, 187, 38);
		contentPane.add(lblBudget);
		
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField.setFont(new Font("Agency FB", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(401, 453, 231, 32);
		contentPane.add(textField);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("L:\\ja\\sthng.png"));
		lblNewLabel_2.setBounds(784, 97, 256, 309);
		contentPane.add(lblNewLabel_2);
		
		btnNewButton_2 = new JButton("ADD Hotels and Places to Visit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourwin fw = new fourwin();
				fw.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Agency FB", Font.BOLD, 20));
		btnNewButton_2.setBounds(360, 498, 251, 38);
		contentPane.add(btnNewButton_2);
		
		list = new JList();
		list.setBounds(474, 159, 295, 167);
		contentPane.add(list);
		
		btnRemoveDestination = new JButton("      Remove  DESTINATION");
		btnRemoveDestination.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DLM.removeElement(txtTypeDestinationTo.getText());
				list.setModel(DLM);
				txtTypeDestinationTo.setText("");
				//list12.remove(txtTypeDestinationTo.getText());
			}
		});
		btnRemoveDestination.setFont(new Font("Agency FB", Font.BOLD, 20));
		btnRemoveDestination.setBounds(601, 387, 231, 38);
		contentPane.add(btnRemoveDestination);
		
		txtTypeDestinationTo = new JTextField();
		txtTypeDestinationTo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTypeDestinationTo.setText("");
			}
		});
		txtTypeDestinationTo.setText("   Type DESTINATION to be removed here");
		txtTypeDestinationTo.setFont(new Font("Agency FB", Font.BOLD, 20));
		txtTypeDestinationTo.setColumns(10);
		txtTypeDestinationTo.setBounds(299, 390, 278, 32);
		contentPane.add(txtTypeDestinationTo);
		
		final JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(309, 94, 125, 31);
		contentPane.add(dateChooser);
		
		final JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(596, 94, 125, 31);
		contentPane.add(dateChooser_1);
		
		button = new JButton("Save info");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter fw = new FileWriter("Data2.txt");
			    	  PrintWriter pw = new PrintWriter(fw);
					pw.println("You are travelling From " + txtStartDate.getText());
					pw.println("On the dates " + dateChooser.getDate() + "To" + dateChooser_1.getDate() );
				    pw.println("You are going to visit the following destinations");
				    int i,a = list.getModel().getSize();
					for(i=0;i<a;i++) {
						pw.println((String)list.getModel().getElementAt(i));
					    }
				    pw.println("Your budget is " + textField.getText());
				    pw.close();
				}catch(IOException e1){
					System.out.println("Cant do the required operation");
				}
				fourwin fwin = new fourwin();
				fwin.setVisible(true);
				dispose();
			}
		});
		
		button.setFont(new Font("Arial Black", Font.BOLD, 18));
		button.setBounds(838, 463, 165, 73);
		contentPane.add(button);
		
		
		JLabel lblFrom = new JLabel("FRom");
		lblFrom.setForeground(new Color(255, 215, 0));
		lblFrom.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblFrom.setBounds(169, 98, 83, 27);
		contentPane.add(lblFrom);
		
		
	}
}
