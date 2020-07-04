package assgm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.Button;
public class fourwin extends JFrame {
	

	private JPanel contentPane;
	private JTextField txt_1;
	private JTextField txt_2;
	private JTextField txt_3;
	private JTextField txt_4;
	ArrayList<String> list12=new ArrayList<String>();
	ArrayList<String> list11=new ArrayList<String>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fourwin frame = new fourwin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public static void printArrayListToFile(ArrayList<String> arrayList, String filename) throws IOException {
	    PrintWriter writer = new PrintWriter(filename);
	    for (String line : arrayList) {
	        writer.println(line);
	    }
	    writer.close();
	}
	public fourwin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JList list = new JList();
		list.setFont(new Font("Agency FB", Font.BOLD, 22));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"                         List of Hotel names"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(545, 54, 413, 203);
		contentPane.add(list);
		final DefaultListModel DLM = new DefaultListModel();
		JButton btnAddHotel = new JButton("      ADD  Hotel");
		btnAddHotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DLM.addElement(txt_1.getText());
				list.setModel(DLM);
				 txt_1.setText("");
				 list11.add(txt_1.getText());
				 list.getModel();
				 
			}
		});
		btnAddHotel.setFont(new Font("Agency FB", Font.BOLD, 20));
		btnAddHotel.setBounds(273, 63, 231, 38);
		contentPane.add(btnAddHotel);
		
		JButton btnRemoveHotel = new JButton("  Remove Hotel");
		btnRemoveHotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DLM.removeElement(txt_2.getText());
				list.setModel(DLM);
				 txt_2.setText("");
				 list11.remove(txt_1.getText());
			}
		});
		btnRemoveHotel.setFont(new Font("Agency FB", Font.BOLD, 20));
		btnRemoveHotel.setBounds(273, 138, 231, 38);
		contentPane.add(btnRemoveHotel);
		
		txt_1 = new JTextField();
		txt_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt_1.setText("");
			}
		});
		txt_1.setText("   Type hotel name here");
		txt_1.setFont(new Font("Agency FB", Font.BOLD, 20));
		txt_1.setColumns(10);
		txt_1.setBounds(10, 66, 231, 32);
		contentPane.add(txt_1);
		
		txt_2 = new JTextField();
		txt_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt_2.setText("");
			}
		});
		txt_2.setText("   Type hotel name here");
		txt_2.setFont(new Font("Agency FB", Font.BOLD, 20));
		txt_2.setColumns(10);
		txt_2.setBounds(10, 138, 231, 32);
		contentPane.add(txt_2);
		
		final JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"                          List of places to go"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setFont(new Font("Agency FB", Font.BOLD, 22));
		list_1.setBounds(545, 315, 413, 203);
		contentPane.add(list_1);
		final DefaultListModel DLM1 = new DefaultListModel();
		JButton btnAddPlaceTo = new JButton("      ADD  Place to visit");
		btnAddPlaceTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DLM1.addElement(txt_3.getText());
				list_1.setModel(DLM1);
				 txt_3.setText("");
			}
		});
		btnAddPlaceTo.setFont(new Font("Agency FB", Font.BOLD, 20));
		btnAddPlaceTo.setBounds(273, 338, 231, 38);
		contentPane.add(btnAddPlaceTo);
		
		JButton btnRemovePlaceTo = new JButton("  Remove place to visit");
		btnRemovePlaceTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DLM.removeElement(txt_4.getText());
				list_1.setModel(DLM1);
				 txt_4.setText("");
				 list12.remove(txt_3.getText());
			}
		});
		btnRemovePlaceTo.setFont(new Font("Agency FB", Font.BOLD, 20));
		btnRemovePlaceTo.setBounds(273, 413, 231, 38);
		contentPane.add(btnRemovePlaceTo);
		
		txt_3 = new JTextField();
		txt_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt_3.setText("");
			}
		});
		txt_3.setText("Visiting place");
		txt_3.setFont(new Font("Agency FB", Font.BOLD, 20));
		txt_3.setColumns(10);
		txt_3.setBounds(23, 338, 231, 32);
		contentPane.add(txt_3);
		
		txt_4 = new JTextField();
		txt_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt_4.setText("");
			}
		});
		txt_4.setText("Non visiting place");
		txt_4.setFont(new Font("Agency FB", Font.BOLD, 20));
		txt_4.setColumns(10);
		txt_4.setBounds(23, 413, 231, 32);
		contentPane.add(txt_4);
		
		
		JButton btnNewButton = new JButton("Save info");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 23));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter fw = new FileWriter("Data2.txt",true);
			    	  BufferedWriter bw = new BufferedWriter(fw);
			    	  PrintWriter pw = new PrintWriter(bw);
					pw.println("The list of hotels You are going to visit");
					int i,a = list.getModel().getSize();
					for(i=0;i<a;i++) {
						pw.println((String)list.getModel().getElementAt(i));
					    }
				    pw.println("The list of places You want to visit");
				    a = list_1.getModel().getSize();
				    for(i=0;i<a;i++) {
				    pw.println(list_1.getModel().getElementAt(i));
				    }
					pw.close();
					dispose();
				}catch(IOException e1){
					System.out.println("Get out");
				}
				dispose();
				JOptionPane.showMessageDialog(null, "Thankyou Your data is saved in Data2.txt");
			}
		});
		btnNewButton.setBounds(413, 558, 156, 38);
		contentPane.add(btnNewButton);
		
	}
}
