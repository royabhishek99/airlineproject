package Travelling_Ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.sound.midi.MidiDevice.Info;
import javax.swing.ImageIcon;

public class akshay {
	static String s2="";

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_8_1;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		final String g="";
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					akshay window = new akshay();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
FileWriter fw;//for name	
FileReader fr;// for name
FileWriter fw1;// for number
FileReader fr1;//for number
FileWriter fw2;// for email
FileReader fr2;//for email
FileReader fr3;//for cost
FileWriter fw3;//for cost
FileReader fr4;//for ticket number
FileWriter fw4;//for ticket number
FileReader fr5;//for origin
FileWriter fw5;//for origin
FileReader fr6;//for destination
FileWriter fw6;//for destination
FileReader fr7;//for time of departure
FileWriter fw7;//for time of departure
FileReader fr8;//for class
FileWriter fw8;//for class
FileReader fr9;//for date
FileWriter fw9;//for date
FileReader fr10;//for actual date
FileWriter fw10;//for actual date
	/**
	 * Create the application.
	 */
	public akshay() {
		
		//System.out.println(s2);
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
		//System.out.println(s2);
		
		JButton btnDabo = new JButton("Ticket Cancelation");
		btnDabo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancel pinky = new cancel();
				pinky.NewScreen1();
			}
		});
		btnDabo.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDabo.setBounds(1065, 927, 326, 37);
		frame.getContentPane().add(btnDabo);
		
		JLabel lblTicketConfirmationn = new JLabel("Ticket Confirmation");
		lblTicketConfirmationn.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblTicketConfirmationn.setBounds(29, 31, 399, 76);
		frame.getContentPane().add(lblTicketConfirmationn);
		
		JLabel lblNewLabel = new JLabel("Flight Information :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(29, 159, 260, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(29, 120, 399, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket Number :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(29, 223, 165, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		try {
			fr4= new FileReader("C:\\Users\\Abhishek\\Desktop\\Javap\\tno.txt");
			BufferedReader br4 =new BufferedReader(fr4);
			try {
				textField.setText(br4.readLine());
			}catch(IOException e4) {
				e4.printStackTrace();
			}
		
		}catch(FileNotFoundException e4) {
			e4.printStackTrace();
			
		}
		textField.setFont(new Font("Swis721 Lt BT", Font.BOLD, 15));
		
		textField.setBounds(29, 261, 136, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblOrigin = new JLabel("   Origin :");
		lblOrigin.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblOrigin.setBounds(216, 223, 101, 25);
		frame.getContentPane().add(lblOrigin);
		
		JLabel lblDestination = new JLabel("  Destination :");
		lblDestination.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblDestination.setBounds(425, 223, 165, 20);
		frame.getContentPane().add(lblDestination);
		
		JLabel lblDepDateTime = new JLabel("Dep. Date");
		lblDepDateTime.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblDepDateTime.setBounds(688, 221, 101, 25);
		frame.getContentPane().add(lblDepDateTime);
		
		JLabel lblClass = new JLabel("    Class :");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblClass.setBounds(901, 223, 165, 20);
		frame.getContentPane().add(lblClass);
		
		textField_1 = new JTextField();
		try {
			fr5= new FileReader("C:\\Users\\Abhishek\\Desktop\\Javap\\from.txt");
			BufferedReader br5 =new BufferedReader(fr5);
			try {
				textField_1.setText(br5.readLine());
			}catch(IOException e5) {
				e5.printStackTrace();
			}
		
		}catch(FileNotFoundException e5) {
			e5.printStackTrace();
			
		}
		
		textField_1.setFont(new Font("Swis721 Lt BT", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(216, 261, 136, 32);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		try {
			fr6= new FileReader("C:\\Users\\Abhishek\\Desktop\\Javap\\to.txt");
			BufferedReader br6 =new BufferedReader(fr6);
			try {
				textField_2.setText(br6.readLine());
			}catch(IOException e6) {
				e6.printStackTrace();
			}
		
		}catch(FileNotFoundException e6) {
			e6.printStackTrace();
			
		}
		textField_2.setFont(new Font("Swis721 Lt BT", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(425, 261, 136, 32);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		try {
			fr10= new FileReader("C:\\Users\\Abhishek\\Desktop\\Javap\\dt1.txt");
			BufferedReader br10 =new BufferedReader(fr10);
			try {
				textField_3.setText(br10.readLine());
			}catch(IOException e10) {
				e10.printStackTrace();
			}
		
		}catch(FileNotFoundException e10) {
			e10.printStackTrace();
			
		}

		textField_3.setFont(new Font("Segoe UI Semilight", Font.BOLD, 15));
		
		textField_3.setFont(new Font("Swis721 Lt BT", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(667, 261, 136, 32);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		try {
			fr8= new FileReader("C:\\Users\\Abhishek\\Desktop\\Javap\\class.txt");
			BufferedReader br8 =new BufferedReader(fr8);
			try {
				textField_4.setText(br8.readLine());
			}catch(IOException e8) {
				e8.printStackTrace();
			}
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		textField_4.setFont(new Font("Swis721 Lt BT", Font.BOLD, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(901, 261, 136, 32);
		frame.getContentPane().add(textField_4);
		
		JLabel lblPassengersInformation = new JLabel("Passenger's Information :");
		lblPassengersInformation.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblPassengersInformation.setBounds(29, 325, 343, 32);
		frame.getContentPane().add(lblPassengersInformation);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblName.setBounds(29, 370, 79, 20);
		frame.getContentPane().add(lblName);
		
		String s3=s2;
		//s3=s3+s2;
		//System.out.println(s3);
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Segoe UI Semilight", Font.BOLD, 15));
		try {
			fr= new FileReader("C:\\Users\\Abhishek\\Desktop\\Javap\\fname.txt");
			BufferedReader br =new BufferedReader(fr);
			try {
				textField_5.setText(br.readLine());
			}catch(IOException e) {
				e.printStackTrace();
			}
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
		
		
		textField_5.setColumns(10);
		textField_5.setBounds(124, 367, 193, 32);
		//textField_5.setText(s3);
		frame.getContentPane().add(textField_5);
		//textField_5.setText(s2);
		
		JLabel lblContactNumber = new JLabel("Contact Number  :");
		lblContactNumber.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblContactNumber.setBounds(29, 411, 193, 20);
		frame.getContentPane().add(lblContactNumber);
		
		textField_6 = new JTextField();//contact number
		textField_6.setFont(new Font("Swis721 Lt BT", Font.BOLD, 15));
		try {
			fr1 = new FileReader("C:\\Users\\Abhishek\\Desktop\\Javap\\cno.txt");
			BufferedReader br1 = new BufferedReader(fr1);
			try {
				textField_6.setText(br1.readLine());
			}catch(IOException e1) {
				e1.printStackTrace();
			}
		}catch(FileNotFoundException e1) {
			e1.printStackTrace();
			
		}
		
		textField_6.setColumns(10);
		textField_6.setBounds(234, 408, 193, 32);
		frame.getContentPane().add(textField_6);
		
		JLabel lblEmailAddress = new JLabel("Email Address :");
		lblEmailAddress.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblEmailAddress.setBounds(29, 456, 193, 20);
		frame.getContentPane().add(lblEmailAddress);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Swis721 Lt BT", Font.BOLD, 15));
		try {
			fr1= new FileReader("C:\\Users\\Abhishek\\Desktop\\Javap\\email.txt");
			BufferedReader br2 =new BufferedReader(fr1);
			try {
				textField_7.setText(br2.readLine());
			}catch(IOException e2) {
				e2.printStackTrace();
			}
		
		}catch(FileNotFoundException e2) {
			e2.printStackTrace();
			
		}
		textField_7.setColumns(10);
		textField_7.setBounds(216, 453, 294, 32);
		frame.getContentPane().add(textField_7);
		
		JLabel lblBaggageInformation = new JLabel("Important Information :");
		lblBaggageInformation.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblBaggageInformation.setBounds(29, 539, 343, 32);
		frame.getContentPane().add(lblBaggageInformation);
		
		JLabel lblNewLabel_2 = new JLabel(" Check-in desks will close 1 hour before departure.");
		lblNewLabel_2.setFont(new Font("Sitka Heading", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(165, 590, 409, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u2022 Check-in Time:");
		lblNewLabel_3.setFont(new Font("Sitka Heading", Font.BOLD, 19));
		lblNewLabel_3.setBounds(26, 584, 150, 28);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblValidId = new JLabel("\u2022 Valid ID proof needed:");
		lblValidId.setFont(new Font("Sitka Heading", Font.BOLD, 19));
		lblValidId.setBounds(23, 607, 213, 28);
		frame.getContentPane().add(lblValidId);
		
		JLabel lblCarryAValid = new JLabel("Carry a valid photo identification proof(any Government recognised photo identification)");
		lblCarryAValid.setFont(new Font("Sitka Heading", Font.PLAIN, 19));
		lblCarryAValid.setBounds(234, 613, 705, 16);
		frame.getContentPane().add(lblCarryAValid);
		
		JLabel lblBewareOf = new JLabel("\u2022 Beware of FRAUDSTERS :");
		lblBewareOf.setFont(new Font("Sitka Heading", Font.BOLD, 19));
		lblBewareOf.setBounds(23, 628, 260, 28);
		frame.getContentPane().add(lblBewareOf);
		
		JLabel lblPleaseDoNot = new JLabel("Please do not share your personal banking and security details with any third person \r\nor party claiming to represent 4A's Airlines.");
		lblPleaseDoNot.setFont(new Font("Sitka Heading", Font.PLAIN, 19));
		lblPleaseDoNot.setBounds(258, 626, 1074, 32);
		frame.getContentPane().add(lblPleaseDoNot);
		
		JLabel lblWebCheckin = new JLabel("\u2022 Web Check-in service is currently out of service.");
		lblWebCheckin.setFont(new Font("Sitka Heading", Font.BOLD, 19));
		lblWebCheckin.setBounds(23, 648, 421, 28);
		frame.getContentPane().add(lblWebCheckin);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(26, 689, 757, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblBaggageInformation_1 = new JLabel("Baggage Information :");
		lblBaggageInformation_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblBaggageInformation_1.setBounds(29, 704, 343, 32);
		frame.getContentPane().add(lblBaggageInformation_1);
		
		JLabel lblTypeCabin = new JLabel("Type :                Class :                          Cabin :                            Check-in :");
		lblTypeCabin.setFont(new Font("Sitka Heading", Font.BOLD, 19));
		lblTypeCabin.setBounds(29, 738, 609, 28);
		frame.getContentPane().add(lblTypeCabin);
		
		JLabel lblAdultEconomy = new JLabel("Adult                  Economy                        7 Kgs                               15 Kgs");
		lblAdultEconomy.setFont(new Font("Sitka Heading", Font.PLAIN, 19));
		lblAdultEconomy.setBounds(29, 779, 609, 28);
		frame.getContentPane().add(lblAdultEconomy);
		
		JLabel lblAdultBuisness = new JLabel("Adult                  Buisness                        7 Kgs                               30 Kgs");
		lblAdultBuisness.setFont(new Font("Sitka Heading", Font.PLAIN, 19));
		lblAdultBuisness.setBounds(29, 808, 609, 28);
		frame.getContentPane().add(lblAdultBuisness);
		
		JLabel lblAdultBuisness_1 = new JLabel("Child                   Economy/Buisness        7 Kgs                               15 Kgs");
		lblAdultBuisness_1.setFont(new Font("Sitka Heading", Font.PLAIN, 19));
		lblAdultBuisness_1.setBounds(26, 835, 609, 28);
		frame.getContentPane().add(lblAdultBuisness_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(29, 876, 757, 2);
		frame.getContentPane().add(separator_2);
		
		JLabel lblAmountPaid = new JLabel("Amount Paid :");
		lblAmountPaid.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblAmountPaid.setBounds(29, 498, 193, 20);
		frame.getContentPane().add(lblAmountPaid);
		
		textField_8 = new JTextField();
		textField_8_1 = new JTextField();
		textField_8_1.setFont(new Font("Swis721 Lt BT", Font.BOLD, 15));
		try {
			fr3= new FileReader("C:\\Users\\Abhishek\\Desktop\\Javap\\amt.txt");
			BufferedReader br3 =new BufferedReader(fr3);
			try {
				textField_8_1.setText(br3.readLine());
			}catch(IOException e3) {
				e3.printStackTrace();
			}
		
		}catch(FileNotFoundException e3) {
			e3.printStackTrace();
			
		}
		textField_8_1.setColumns(10);
		textField_8_1.setBounds(198, 494, 193, 32);
		frame.getContentPane().add(textField_8_1);
		
		JLabel lblYourTicketIs = new JLabel("Your ticket has been sent on the entered E-mail address. Please check your mail.");
		lblYourTicketIs.setFont(new Font("Sitka Heading", Font.PLAIN, 19));
		lblYourTicketIs.setBounds(29, 891, 645, 16);
		frame.getContentPane().add(lblYourTicketIs);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(26, 962, 757, 2);
		frame.getContentPane().add(separator_3);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnOk.setBounds(29, 912, 87, 37);
		frame.getContentPane().add(btnOk);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(akshay.class.getResource("/image/sreg.jpg")));
		lblNewLabel_4.setBounds(0, 0, 1902, 1008);
		frame.getContentPane().add(lblNewLabel_4);
		
		/*JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(akshay.class.getResource("/image/sreg.jpg")));
		lblNewLabel_4.setBounds(0, 0, 1902, 1055);
		frame.getContentPane().add(lblNewLabel_4);
		*/
		
		
		
		}
	}

