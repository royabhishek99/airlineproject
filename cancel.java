package Travelling_Ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GraphicsEnvironment;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.ImageIcon;
public class cancel {

	private JFrame frame;
	private JTextField textFrom1;
	private JTextField textTo1;
	private JTextField txtTotalAmount;

	/**
	 * Launch the application.
	 */
	
	public static void NewScreen1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cancel window = new cancel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	
	
	
	class tabledata extends AbstractTableModel{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return 1;
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 3;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			return "Apeksha";
		}
		
	}
	
	Connection connection=null;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	
	FileReader fr5;//for origin
	FileWriter fw5;//for origin
	FileReader fr6;//for destination
	FileWriter fw6;//for destination
	FileReader fr;//for name
	FileWriter fw;//for name
	FileReader fr9;//for time of departure
	FileWriter fw9;//for time of departure
	FileReader fr10;//for actual date
	FileWriter fw10;//for actual date
	/**
	 * Create the application.
	 */
	public cancel() {
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
		
		final JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Cancel Air Reservation");
		label.setBounds(10, 21, 1066, 64);
		panel.add(label);
		label.setFont (new java.awt.Font("Arial", java.awt.Font.BOLD, 48));
		
		JLabel lblThingsYouShould = new JLabel("Things you should know before you cancel:");
		lblThingsYouShould.setBounds(10, 116, 605, 28);
		panel.add(lblThingsYouShould);
		lblThingsYouShould.setFont (new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 24));
		
		JLabel lblbyCancellingThis = new JLabel("~By cancelling this reservation you will be giving up your space and fare on this flight");
		lblbyCancellingThis.setBounds(10, 154, 1053, 28);
		panel.add(lblbyCancellingThis);
		lblbyCancellingThis.setFont (new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblrebookingIsSubject = new JLabel("~Rebooking is subject to current flight availability and may result in higher fare.");
		lblrebookingIsSubject.setBounds(10, 172, 1115, 36);
		panel.add(lblrebookingIsSubject);
		lblrebookingIsSubject.setFont (new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lbldueToSystem = new JLabel("~Due to system processing time, funds from this reservation may not be available for immediate use toward the purchase of a new flight reservation.");
		lbldueToSystem.setBounds(10, 195, 1158, 28);
		panel.add(lbldueToSystem);
		lbldueToSystem.setFont (new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblAir = new JLabel("Flight Details :");
		lblAir.setBounds(30, 249, 159, 28);
		panel.add(lblAir);
		lblAir.setFont (new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 24));
		
		textFrom1 = new JTextField();
		textFrom1.setFont(new Font("Swis721 BT", Font.BOLD, 15));
		try {
			fr5= new FileReader("C:\\Users\\Abhishek\\Desktop\\Javap\\from.txt");
			BufferedReader br5 =new BufferedReader(fr5);
			try {
				textFrom1.setText(br5.readLine());
			}catch(IOException e5) {
				e5.printStackTrace();
			}
		
		}catch(FileNotFoundException e5) {
			e5.printStackTrace();
			
		}
		textFrom1.setBounds(114, 286, 134, 30);
		panel.add(textFrom1);
		textFrom1.setColumns(10);
		
		textTo1 = new JTextField();
		textTo1.setFont(new Font("Swis721 BT", Font.BOLD, 15));
		try {
			fr6= new FileReader("C:\\Users\\Abhishek\\Desktop\\Javap\\to.txt");
			BufferedReader br6 =new BufferedReader(fr6);
			try {
				textTo1.setText(br6.readLine());
			}catch(IOException e6) {
				e6.printStackTrace();
			}
		
		}catch(FileNotFoundException e6) {
			e6.printStackTrace();
			
		}
		textTo1.setBounds(100, 337, 148, 30);
		panel.add(textTo1);
		textTo1.setColumns(10);
		
		txtTotalAmount = new JTextField();
		txtTotalAmount.setFont(new Font("Swis721 BT", Font.BOLD, 16));
		txtTotalAmount.setText("Total Amount - 1000");
		txtTotalAmount.setBounds(264, 513, 164, 28);
		panel.add(txtTotalAmount);
		txtTotalAmount.setColumns(10);
		
		JLabel lblCancelThisReservation = new JLabel("Cancel this reservation?");
		lblCancelThisReservation.setBounds(30, 862, 314, 27);
		panel.add(lblCancelThisReservation);
		lblCancelThisReservation.setFont (new Font("Times New Roman", Font.BOLD, 29));
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frame, "Your ticket has been successfully cancelled");
			System.exit(0);
			}
		});
		btnYes.setBounds(30, 915, 123, 36);
		panel.add(btnYes);
		btnYes.setFont (new Font("Times New Roman", Font.BOLD, 24));
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				akshay window = new akshay();
				window.frame.setVisible(true);
			}
		});
		btnNo.setBounds(210, 915, 134, 36);
		panel.add(btnNo);
		btnNo.setFont (new Font("Times New Roman", Font.BOLD, 24));
		tabledata td=new tabledata();
		
		JLabel lblFrom = new JLabel("From ");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblFrom.setBounds(40, 290, 79, 16);
		panel.add(lblFrom);
		
		JLabel lblTo = new JLabel("To\r\n");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTo.setBounds(40, 335, 33, 28);
		panel.add(lblTo);
		
		textField = new JTextField();
		textField.setFont(new Font("Swis721 BT", Font.BOLD, 15));
		try {
			fr= new FileReader("C:\\Users\\Abhishek\\Desktop\\Javap\\fname.txt");
			BufferedReader br =new BufferedReader(fr);
			try {
				textField.setText(br.readLine());
			}catch(IOException e) {
				e.printStackTrace();
			}
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		textField.setColumns(10);
		textField.setBounds(110, 382, 134, 30);
		panel.add(textField);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(30, 384, 89, 20);
		panel.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Swis721 BT", Font.BOLD, 15));
		try {
			fr= new FileReader("C:\\Users\\Abhishek\\Desktop\\Javap\\class.txt");
			BufferedReader br8 =new BufferedReader(fr);
			try {
				textField_1.setText(br8.readLine());
			}catch(IOException e8) {
				e8.printStackTrace();
			}
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		textField_1.setColumns(10);
		textField_1.setBounds(110, 426, 134, 30);
		panel.add(textField_1);
		
		JLabel lblClass = new JLabel("Class :");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblClass.setBounds(30, 425, 69, 26);
		panel.add(lblClass);
		
		JLabel lblCancellationCharges = new JLabel("Cancellation Charges :");
		lblCancellationCharges.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCancellationCharges.setBounds(32, 512, 235, 24);
		panel.add(lblCancellationCharges);
		
		JLabel lblDate = new JLabel("Date :");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDate.setBounds(30, 473, 69, 16);
		panel.add(lblDate);
		
		textField_2 = new JTextField();
		try {
			fr10= new FileReader("C:\\Users\\Abhishek\\Desktop\\Javap\\dt1.txt");
			BufferedReader br10 =new BufferedReader(fr10);
			try {
				textField_2.setText(br10.readLine());
			}catch(IOException e10) {
				e10.printStackTrace();
			}
		
		}catch(FileNotFoundException e10) {
			e10.printStackTrace();
			
		}
		textField_2.setFont(new Font("Swis721 BT", Font.BOLD, 17));
		textField_2.setColumns(10);
		textField_2.setBounds(100, 469, 134, 30);
		panel.add(textField_2);
		
		JLabel lblGovernmentRules = new JLabel("\u2022 Government Rules :");
		lblGovernmentRules.setFont(new Font("Sitka Heading", Font.BOLD, 21));
		lblGovernmentRules.setBounds(30, 574, 204, 36);
		panel.add(lblGovernmentRules);
		
		JLabel lblCancellationCharge = new JLabel("- Cancellation charge can't be more than the basic fare plus fuel surcharge.");
		lblCancellationCharge.setFont(new Font("Sitka Heading", Font.PLAIN, 20));
		lblCancellationCharge.setBounds(82, 607, 615, 28);
		panel.add(lblCancellationCharge);
		
		JLabel lblAllStatuory = new JLabel("- All statuory taxes have to be refunded.");
		lblAllStatuory.setFont(new Font("Sitka Heading", Font.PLAIN, 20));
		lblAllStatuory.setBounds(82, 648, 338, 28);
		panel.add(lblAllStatuory);
		
		JLabel lblFlightCancellation = new JLabel("- Flight cancellation 24 hours prior the departure will lead to no refund.");
		lblFlightCancellation.setFont(new Font("Sitka Heading", Font.PLAIN, 20));
		lblFlightCancellation.setBounds(82, 689, 615, 28);
		panel.add(lblFlightCancellation);
		
		JLabel lblTheRefunded = new JLabel("- The refunded amount may take 2-3 working days to return.");
		lblTheRefunded.setFont(new Font("Sitka Heading", Font.PLAIN, 20));
		lblTheRefunded.setBounds(82, 730, 640, 28);
		panel.add(lblTheRefunded);
		
		JLabel lblForFurtherDetails = new JLabel("For further details on this field, write to our Customer Care at fouratravels@hotmail.com");
		lblForFurtherDetails.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblForFurtherDetails.setBounds(30, 758, 871, 28);
		panel.add(lblForFurtherDetails);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(cancel.class.getResource("/image/page12.jpg")));
		lblNewLabel.setBounds(0, 0, 1902, 1055);
		panel.add(lblNewLabel);
		
	
	}

	public static void NewScreen() {
		// TODO Auto-generated method stub
		
	}
}
