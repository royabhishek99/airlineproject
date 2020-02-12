package Travelling_Ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class firstpage {

	JFrame frame;
	private JTextField textFirstName;
	private JTextField textLastName;
	private JTextField textEmail;
	private JTextField textPN;
	private JTextField textAge;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstpage window = new firstpage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
FileReader fr;//for name
FileWriter fw;//for name
FileReader fr1;//for number
FileWriter fw1;//for number
FileReader fr2;//for email
FileWriter fw2;//for email
private JTextField textField;
	/**
	 * Create the application.
	 */
	public firstpage() {
			
		initialize();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1920, 1200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeading = new JLabel("                                   Welcome to 4A's Airlines");
		lblHeading.setFont(new Font("Tahoma", Font.BOLD, 46));
		lblHeading.setBounds(261, 67, 1219, 49);
		frame.getContentPane().add(lblHeading);
		
		JLabel label = new JLabel("");
		label.setBounds(58, 186, 45, 13);
		frame.getContentPane().add(label);
		
		JLabel lblTravellersName = new JLabel("Traveller's Details:");
		lblTravellersName.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblTravellersName.setBounds(34, 129, 331, 69);
		frame.getContentPane().add(lblTravellersName);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(34, 208, 385, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblFirstName.setBounds(34, 235, 175, 35);
		frame.getContentPane().add(lblFirstName);
		
		textFirstName = new JTextField();
		textFirstName.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String fname = new String("");
				fname=textFirstName.getText();
				try {
					fw=new FileWriter("C:\\Users\\Abhishek\\Desktop\\Javap\\fname.txt");
					fw.write(fname);
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		textFirstName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFirstName.setBounds(199, 234, 246, 35);
		frame.getContentPane().add(textFirstName);
		textFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblLastName.setBounds(34, 301, 175, 35);
		frame.getContentPane().add(lblLastName);
		
		textLastName = new JTextField();
		textLastName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textLastName.setColumns(10);
		textLastName.setBounds(199, 301, 246, 35);
		frame.getContentPane().add(textLastName);
		
		JLabel lblEmailAddress = new JLabel("Email Address :");
		lblEmailAddress.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblEmailAddress.setBounds(34, 357, 220, 35);
		frame.getContentPane().add(lblEmailAddress);
		
		textEmail = new JTextField();
		textEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = new String("");
				email=textEmail.getText();
				try {
					fw2=new FileWriter("C:\\Users\\Abhishek\\Desktop\\Javap\\email.txt");
					fw2.write(email);
					fw2.close();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				
			}
		});
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textEmail.setColumns(10);
		textEmail.setBounds(239, 357, 403, 35);
		frame.getContentPane().add(textEmail);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number :");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPhoneNumber.setBounds(34, 418, 209, 35);
		frame.getContentPane().add(lblPhoneNumber);
		
		textPN = new JTextField();
		textPN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pno = new String("");
				pno=textPN.getText();
				try {
					fw1=new FileWriter("C:\\Users\\Abhishek\\Desktop\\Javap\\cno.txt");
					fw1.write(pno);
					fw1.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		textPN.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textPN.setColumns(10);
		textPN.setBounds(255, 418, 246, 35);
		frame.getContentPane().add(textPN);
		
		JLabel lblAge = new JLabel("Age :");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblAge.setBounds(34, 476, 70, 35);
		frame.getContentPane().add(lblAge);
		
		textAge = new JTextField();
		textAge.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textAge.setColumns(10);
		textAge.setBounds(106, 476, 89, 35);
		frame.getContentPane().add(textAge);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"     Gender :", "Male", "Female", "Others"}));
		comboBoxGender.setBounds(31, 537, 151, 35);
		frame.getContentPane().add(comboBoxGender);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int flag=0;
				
				String s6=textFirstName.getText();
				for(int i=0;i<s6.length();i++)
				{
					char ch=s6.charAt(i);
					if(Character.isDigit(ch))
					{
						flag=1;
						break;
					}
				}
				if(flag==1)
				{
					JOptionPane.showMessageDialog(null, "Please enter valid first name");
					return;
				}
              flag=0;
				
				s6=textLastName.getText();
				for(int i=0;i<s6.length();i++)
				{
					char ch=s6.charAt(i);
					if(Character.isDigit(ch))
					{
						flag=1;
						break;
					}
				}
				if(flag==1)
				{
					JOptionPane.showMessageDialog(null, "Please enter valid last name");
					return;
				}
                flag=0;
				
				s6=textPN.getText();
				for(int i=0;i<s6.length();i++)
				{
					char ch=s6.charAt(i);
					if(Character.isLetter(ch))
					{
						flag=1;
						break;
					}
				}
				if(flag==1||s6.length()>10||s6.length()<10)
				{
					JOptionPane.showMessageDialog(null, "Please enter a valid phone number");
					return;
				}
                flag=0;
				
				s6=textAge.getText();
				for(int i=0;i<s6.length();i++)
				{
					char ch=s6.charAt(i);
					if(Character.isLetter(ch))
					{
						flag=1;
						break;
					}
				}
				if(flag==1)
				{
					JOptionPane.showMessageDialog(null, "Please enter valid age");
					return;
				}
				
				
				if(textFirstName.getText().isEmpty() || textLastName.getText().isEmpty() ||  textEmail.getText().isEmpty() ||
						 textPN.getText().isEmpty() || textAge.getText().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Please fill up to proceed");
				}
				else {
					String str=textFirstName.getText();
					Travelling tT = new Travelling();
					tT.NewScreen();
				}
				
			}
				
			});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSubmit.setBounds(34, 603, 127, 21);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFirstName.setText(null);
				textLastName.setText(null);
				textEmail.setText(null);
				textPN.setText(null);
				textAge.setText(null);
				comboBoxGender.setSelectedItem("     Gender :");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset.setBounds(179, 603, 127, 21);
		frame.getContentPane().add(btnReset);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.WHITE);
		canvas.setBounds(611, 122, 766, 2);
		frame.getContentPane().add(canvas);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","User Details",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBounds(336, 603, 127, 21);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(firstpage.class.getResource("/image/rh.jpg")));
		lblNewLabel.setBounds(0, 0, 1926, 1068);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(303, 503, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(486, 604, 97, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
