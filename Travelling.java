package Travelling_Ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Travelling {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travelling window = new Travelling();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
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
FileReader fr9;//for date(t)
FileWriter fw9;//for date(t)
FileReader fr10;//for actual date
FileWriter fw10;//for actual date
private JTextField textField_14;
	/**
	 * Create the application.
	 */
	public Travelling() {
		initialize();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0 , 0 , 1920, 1200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//System.out.println(s5);
		JLabel lblClassType = new JLabel("Class Type :");
		lblClassType.setForeground(Color.BLACK);
		lblClassType.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblClassType.setBounds(29, 148, 154, 30);
		frame.getContentPane().add(lblClassType);
		
		JRadioButton rdbtnEconomyClass = new JRadioButton("Economy Class");
		rdbtnEconomyClass.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnEconomyClass.setBounds(21, 202, 142, 25);
		frame.getContentPane().add(rdbtnEconomyClass);
		
		JRadioButton rdbtnBuisnessClass = new JRadioButton("Buisness Class");
		rdbtnBuisnessClass.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnBuisnessClass.setBounds(21, 252, 142, 25);
		frame.getContentPane().add(rdbtnBuisnessClass);
		
		JLabel lblFlightType = new JLabel("Flight Type :");
		lblFlightType.setForeground(Color.BLACK);
		lblFlightType.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblFlightType.setBounds(226, 148, 154, 30);
		frame.getContentPane().add(lblFlightType);
		
		JRadioButton rdbtnSingle = new JRadioButton("Single ");
		rdbtnSingle.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnSingle.setBounds(252, 202, 97, 25);
		frame.getContentPane().add(rdbtnSingle);
		
		JRadioButton rdbtnReturn = new JRadioButton("Returning");
		rdbtnReturn.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnReturn.setBounds(252, 252, 97, 25);
		frame.getContentPane().add(rdbtnReturn);
		
		JLabel lblPassengerType = new JLabel("Passenger Type :");
		lblPassengerType.setForeground(Color.BLACK);
		lblPassengerType.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPassengerType.setBounds(422, 148, 209, 30);
		frame.getContentPane().add(lblPassengerType);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnAdult.setBounds(463, 202, 97, 25);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnChild.setBounds(463, 252, 97, 25);
		frame.getContentPane().add(rdbtnChild);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(29, 133, 602, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(630, 133, 1, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(29, 286, 602, 2);
		frame.getContentPane().add(separator_2);
		
		JComboBox cmbFrom = new JComboBox();
		cmbFrom.setModel(new DefaultComboBoxModel(new String[] {"        From ", "Bengaluru", "New Delhi"}));
		cmbFrom.setFont(new Font("Tahoma", Font.BOLD, 18));
		cmbFrom.setBounds(29, 305, 134, 30);
		frame.getContentPane().add(cmbFrom);
		
		JComboBox cmbTo = new JComboBox();
		cmbTo.setModel(new DefaultComboBoxModel(new String[] {"          To", "Chennai", "Pune"}));
		cmbTo.setFont(new Font("Tahoma", Font.BOLD, 18));
		cmbTo.setBounds(218, 305, 134, 30);
		frame.getContentPane().add(cmbTo);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(29, 351, 602, 2);
		frame.getContentPane().add(separator_3);
		
		JLabel lblTax = new JLabel("Base Fare:");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTax.setBounds(29, 366, 119, 30);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Tax:");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSubTotal.setBounds(29, 413, 119, 30);
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotal.setBounds(29, 459, 77, 30);
		frame.getContentPane().add(lblTotal);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(160, 373, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(160, 420, 116, 22);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String amt = new String("");
				amt=textField_2.getText();
				try {
					fw3=new FileWriter("C:\\Users\\Abhishek\\Desktop\\Javap\\amt.txt");
					fw3.write(amt);
					fw3.close();
				} catch (IOException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
				
			}
		});
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(160, 466, 116, 22);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double tax= 420.69;
				double KMS500= 1200.00;
				double KMS1000= 2400.00;
				double KMS1500 = 3600.00;
				double KMS2000 = 4800.00;
				double totalCost, eco = 3.85, bclass=7.90;
				//-------------------------------------------------------Bengaluru to Chennai Economy--------------------------------------------------------//
				if((rdbtnEconomyClass.isSelected()) && (rdbtnSingle.isSelected())&& (rdbtnAdult.isSelected()) && cmbFrom.getSelectedItem().equals("Bengaluru") && 
				cmbTo.getSelectedItem().equals("Chennai"))
				{
					totalCost = (tax * KMS500)/100;
					String sTax = String.format("Rs.%.2f",totalCost);
					textField.setText(sTax);
					String subTotal = String.format("Rs.%.2f",KMS500);
					textField_1.setText(subTotal);
					String Total = String.format("Rs.%.2f",KMS500 + totalCost);
					textField_2.setText(Total); //Total//
					textField_12.setText(Total);//Price//
					textField_3.setText("Economy");//Class//
					textField_4.setText("One Way");//Ticket Type//
					textField_5.setText("1");//Adult//
					textField_6.setText("Non");//Child//
					}
				else if((rdbtnEconomyClass.isSelected()) && (rdbtnReturn.isSelected())&& (rdbtnAdult.isSelected()) && cmbFrom.getSelectedItem().equals("Bengaluru") && 
						cmbTo.getSelectedItem().equals("Chennai"))
						{
							totalCost = (tax * (KMS500*2))/100;
							String sTax = String.format("Rs.%.2f",totalCost);
							textField.setText(sTax);
							String subTotal = String.format("Rs.%.2f",KMS500*2);
							textField_1.setText(subTotal);
							String Total = String.format("Rs.%.2f",(KMS500 + totalCost)*2);
							textField_2.setText(Total); //Total//
							textField_12.setText(Total);//Price//
							textField_3.setText("Economy");//Class//
							textField_4.setText("Both Way");//Ticket Type//
							textField_5.setText("1");//Adult//
							textField_6.setText("Non");//Child//
							}
				else if((rdbtnEconomyClass.isSelected()) && (rdbtnSingle.isSelected())&& (rdbtnChild.isSelected()) && cmbFrom.getSelectedItem().equals("Bengaluru") && 
						cmbTo.getSelectedItem().equals("Chennai"))
						{
							totalCost = (tax * KMS500)/100;
							String sTax = String.format("Rs.%.2f",totalCost - 1200);
							textField.setText(sTax);
							String subTotal = String.format("Rs.%.2f",KMS500);
							textField_1.setText(subTotal);
							String Total = String.format("Rs.%.2f",KMS500 + totalCost - 1200);
							textField_2.setText(Total); //Total//
							textField_12.setText(Total);//Price//
							textField_3.setText("Economy");//Class//
							textField_4.setText("One Way");//Ticket Type//
							textField_5.setText("Non");//Adult//
							textField_6.setText("1");//Child//
							}
				else if((rdbtnEconomyClass.isSelected()) && (rdbtnReturn.isSelected())&& (rdbtnChild.isSelected()) && cmbFrom.getSelectedItem().equals("Bengaluru") && 
						cmbTo.getSelectedItem().equals("Chennai"))
						{
							totalCost = (tax * (KMS500*2))/100;
							String sTax = String.format("Rs.%.2f",totalCost - 700);
							textField.setText(sTax);
							String subTotal = String.format("Rs.%.2f",KMS500*2);
							textField_1.setText(subTotal);
							String Total = String.format("Rs.%.2f",((KMS500 + totalCost)*2) - 700);
							textField_2.setText(Total); //Total//
							textField_12.setText(Total);//Price//
							textField_3.setText("Economy");//Class//
							textField_4.setText("Both Way");//Ticket Type//
							textField_5.setText("Non");//Adult//
							textField_6.setText("1");//Child//
							}
				//------------------------------------------------Bengaluru to Chennai Buisness----------------------------------------//
				else if((rdbtnBuisnessClass.isSelected()) && (rdbtnSingle.isSelected())&& (rdbtnAdult.isSelected()) && cmbFrom.getSelectedItem().equals("Bengaluru") && 
						cmbTo.getSelectedItem().equals("Chennai"))
						{
							totalCost = (tax * KMS500)/100;
							String sTax = String.format("Rs.%.2f",totalCost + 1200);
							textField.setText(sTax);
							String subTotal = String.format("Rs.%.2f",KMS500);
							textField_1.setText(subTotal);
							String Total = String.format("Rs.%.2f",KMS500 + totalCost + 1200);
							textField_2.setText(Total); //Total//
							textField_12.setText(Total);//Price//
							textField_3.setText("Buisness");//Class//
							textField_4.setText("One Way");//Ticket Type//
							textField_5.setText("1");//Adult//
							textField_6.setText("Non");//Child//
							}
						else if((rdbtnBuisnessClass.isSelected()) && (rdbtnReturn.isSelected())&& (rdbtnAdult.isSelected()) && cmbFrom.getSelectedItem().equals("Bengaluru") && 
								cmbTo.getSelectedItem().equals("Chennai"))
								{
									totalCost = (tax * (KMS500*2))/100;
									String sTax = String.format("Rs.%.2f",totalCost + 1200);
									textField.setText(sTax);
									String subTotal = String.format("Rs.%.2f",(KMS500*2));
									textField_1.setText(subTotal);
									String Total = String.format("Rs.%.2f",((KMS500 + totalCost)*2)+1200);
									textField_2.setText(Total); //Total//
									textField_12.setText(Total);//Price//
									textField_3.setText("Buisness");//Class//
									textField_4.setText("Both Way");//Ticket Type//
									textField_5.setText("1");//Adult//
									textField_6.setText("Non");//Child//
									}
						else if((rdbtnBuisnessClass.isSelected()) && (rdbtnSingle.isSelected())&& (rdbtnChild.isSelected()) && cmbFrom.getSelectedItem().equals("Bengaluru") && 
								cmbTo.getSelectedItem().equals("Chennai"))
								{
									totalCost = (tax * KMS500)/100;
									String sTax = String.format("Rs.%.2f",totalCost);
									textField.setText(sTax);
									String subTotal = String.format("Rs.%.2f",KMS500);
									textField_1.setText(subTotal);
									String Total = String.format("Rs.%.2f",KMS500 + totalCost);
									textField_2.setText(Total); //Total//
									textField_12.setText(Total);//Price//
									textField_3.setText("Buisness");//Class//
									textField_4.setText("One Way");//Ticket Type//
									textField_5.setText("Non");//Adult//
									textField_6.setText("1");//Child//
									}
						else if((rdbtnBuisnessClass.isSelected()) && (rdbtnReturn.isSelected())&& (rdbtnChild.isSelected()) && cmbFrom.getSelectedItem().equals("Bengaluru") && 
								cmbTo.getSelectedItem().equals("Chennai"))
								{
									totalCost = (tax * KMS500)/100;
									String sTax = String.format("Rs.%.2f",totalCost);
									textField.setText(sTax);
									String subTotal = String.format("Rs.%.2f",KMS500);
									textField_1.setText(subTotal);
									String Total = String.format("Rs.%.2f",KMS500 + totalCost);
									textField_2.setText(Total); //Total//
									textField_12.setText(Total);//Price//
									textField_3.setText("Business");//Class//
									textField_4.setText("Both Way");//Ticket Type//
									textField_5.setText("Non");//Adult//
									textField_6.setText("1");//Child//
									}
		//------------------------------------------------Bengaluru to Pune Economy--------------------------------------------//
						else if((rdbtnEconomyClass.isSelected()) && (rdbtnSingle.isSelected())&& (rdbtnAdult.isSelected()) && cmbFrom.getSelectedItem().equals("Bengaluru") && 
						cmbTo.getSelectedItem().equals("Pune"))
						{
							totalCost = (tax * KMS1000)/100;
							String sTax = String.format("Rs.%.2f",totalCost);
							textField.setText(sTax);
							String subTotal = String.format("Rs.%.2f",KMS1000);
							textField_1.setText(subTotal);
							String Total = String.format("Rs.%.2f",KMS1000 + totalCost);
							textField_2.setText(Total); //Total//
							textField_12.setText(Total);//Price//
							textField_3.setText("Economy");//Class//
							textField_4.setText("One Way");//Ticket Type//
							textField_5.setText("1");//Adult//
							textField_6.setText("Non");//Child//
							}
						else if((rdbtnEconomyClass.isSelected()) && (rdbtnReturn.isSelected())&& (rdbtnAdult.isSelected()) && cmbFrom.getSelectedItem().equals("Bengaluru") && 
								cmbTo.getSelectedItem().equals("Pune"))
								{
									totalCost = (tax * KMS1000)/100;
									String sTax = String.format("Rs.%.2f",totalCost);
									textField.setText(sTax);
									String subTotal = String.format("Rs.%.2f",KMS1000);
									textField_1.setText(subTotal);
									String Total = String.format("Rs.%.2f",KMS1000 + totalCost);
									textField_2.setText(Total); //Total//
									textField_12.setText(Total);//Price//
									textField_3.setText("Economy");//Class//
									textField_4.setText("Both Way");//Ticket Type//
									textField_5.setText("1");//Adult//
									textField_6.setText("Non");//Child//
									}
						else if((rdbtnEconomyClass.isSelected()) && (rdbtnSingle.isSelected())&& (rdbtnChild.isSelected()) && cmbFrom.getSelectedItem().equals("Bengaluru") && 
								cmbTo.getSelectedItem().equals("Pune"))
								{
									totalCost = (tax * KMS1000)/100;
									String sTax = String.format("Rs.%.2f",totalCost);
									textField.setText(sTax);
									String subTotal = String.format("Rs.%.2f",KMS1000);
									textField_1.setText(subTotal);
									String Total = String.format("Rs.%.2f",KMS1000 + totalCost);
									textField_2.setText(Total); //Total//
									textField_12.setText(Total);//Price//
									textField_3.setText("Economy");//Class//
									textField_4.setText("One Way");//Ticket Type//
									textField_5.setText("Non");//Adult//
									textField_6.setText("1");//Child//
									}
						else if((rdbtnEconomyClass.isSelected()) && (rdbtnReturn.isSelected())&& (rdbtnChild.isSelected()) && cmbFrom.getSelectedItem().equals("Bengaluru") && 
								cmbTo.getSelectedItem().equals("Pune"))
								{
									totalCost = (tax * KMS1000)/100;
									String sTax = String.format("Rs.%.2f",totalCost);
									textField.setText(sTax);
									String subTotal = String.format("Rs.%.2f",KMS1000);
									textField_1.setText(subTotal);
									String Total = String.format("Rs.%.2f",KMS1000 + totalCost);
									textField_2.setText(Total); //Total//
									textField_12.setText(Total);//Price//
									textField_3.setText("Economy");//Class//
									textField_4.setText("Both Way");//Ticket Type//
									textField_5.setText("Non");//Adult//
									textField_6.setText("1");//Child//
									}
				//----------------------------------------------Bengaluru to Pune Buisness---------------------------------//
						else if((rdbtnBuisnessClass.isSelected()) && (rdbtnSingle.isSelected())&& (rdbtnAdult.isSelected()) && cmbFrom.getSelectedItem().equals("Bengaluru") && 
								cmbTo.getSelectedItem().equals("Pune"))
								{
									totalCost = (tax * KMS1000)/100;
									String sTax = String.format("Rs.%.2f",totalCost);
									textField.setText(sTax);
									String subTotal = String.format("Rs.%.2f",KMS1000);
									textField_1.setText(subTotal);
									String Total = String.format("Rs.%.2f",KMS1000 + totalCost);
									textField_2.setText(Total); //Total//
									textField_12.setText(Total);//Price//
									textField_3.setText("Buisness");//Class//
									textField_4.setText("One Way");//Ticket Type//
									textField_5.setText("1");//Adult//
									textField_6.setText("Non");//Child//
									}
								else if((rdbtnBuisnessClass.isSelected()) && (rdbtnReturn.isSelected())&& (rdbtnAdult.isSelected()) && cmbFrom.getSelectedItem().equals("Bengaluru") && 
										cmbTo.getSelectedItem().equals("Pune"))
										{
											totalCost = (tax * KMS1000)/100;
											String sTax = String.format("Rs.%.2f",totalCost);
											textField.setText(sTax);
											String subTotal = String.format("Rs.%.2f",KMS1000);
											textField_1.setText(subTotal);
											String Total = String.format("Rs.%.2f",KMS1000 + totalCost);
											textField_2.setText(Total); //Total//
											textField_12.setText(Total);//Price//
											textField_3.setText("Buisness");//Class//
											textField_4.setText("Both Way");//Ticket Type//
											textField_5.setText("1");//Adult//
											textField_6.setText("Non");//Child//
											}
								else if((rdbtnBuisnessClass.isSelected()) && (rdbtnSingle.isSelected())&& (rdbtnChild.isSelected()) && cmbFrom.getSelectedItem().equals("Bengaluru") && 
										cmbTo.getSelectedItem().equals("Pune"))
										{
											totalCost = (tax * KMS1000)/100;
											String sTax = String.format("Rs.%.2f",totalCost);
											textField.setText(sTax);
											String subTotal = String.format("Rs.%.2f",KMS1000);
											textField_1.setText(subTotal);
											String Total = String.format("Rs.%.2f",KMS1000 + totalCost);
											textField_2.setText(Total); //Total//
											textField_12.setText(Total);//Price//
											textField_3.setText("Buisness");//Class//
											textField_4.setText("One Way");//Ticket Type//
											textField_5.setText("Non");//Adult//
											textField_6.setText("1");//Child//
											}
								else if((rdbtnBuisnessClass.isSelected()) && (rdbtnReturn.isSelected())&& (rdbtnChild.isSelected()) && cmbFrom.getSelectedItem().equals("Bengaluru") && 
										cmbTo.getSelectedItem().equals("Pune"))
										{
											totalCost = (tax *KMS1000)/100;
											String sTax = String.format("Rs.%.2f",totalCost);
											textField.setText(sTax);
											String subTotal = String.format("Rs.%.2f",KMS1000);
											textField_1.setText(subTotal);
											String Total = String.format("Rs.%.2f",KMS1000 + totalCost);
											textField_2.setText(Total); //Total//
											textField_12.setText(Total);//Price//
											textField_3.setText("Buisness");//Class//
											textField_4.setText("Both Way");//Ticket Type//
											textField_5.setText("Non");//Adult//
											textField_6.setText("1");//Child//
											}
				//--------------------------------------New Delhi to Chennai Economy-------------------------------//
								else if((rdbtnEconomyClass.isSelected()) && (rdbtnSingle.isSelected())&& (rdbtnAdult.isSelected()) && cmbFrom.getSelectedItem().equals("New Delhi") && 
						cmbTo.getSelectedItem().equals("Chennai"))
						{
							totalCost = (tax * KMS1500)/100;
							String sTax = String.format("Rs.%.2f",totalCost);
							textField.setText(sTax);
							String subTotal = String.format("Rs.%.2f",KMS1500);
							textField_1.setText(subTotal);
							String Total = String.format("Rs.%.2f",KMS1500 + totalCost);
							textField_2.setText(Total); //Total//
							textField_12.setText(Total);//Price//
							textField_3.setText("Economy");//Class//
							textField_4.setText("One Way");//Ticket Type//
							textField_5.setText("1");//Adult//
							textField_6.setText("Non");//Child//
							}
						else if((rdbtnEconomyClass.isSelected()) && (rdbtnReturn.isSelected())&& (rdbtnAdult.isSelected()) && cmbFrom.getSelectedItem().equals("New Delhi") && 
								cmbTo.getSelectedItem().equals("Chennai"))
								{
									totalCost = (tax * KMS1500)/100;
									String sTax = String.format("Rs.%.2f",totalCost);
									textField.setText(sTax);
									String subTotal = String.format("Rs.%.2f",KMS1500);
									textField_1.setText(subTotal);
									String Total = String.format("Rs.%.2f",KMS1500 + totalCost);
									textField_2.setText(Total); //Total//
									textField_12.setText(Total);//Price//
									textField_3.setText("Economy");//Class//
									textField_4.setText("Both Way");//Ticket Type//
									textField_5.setText("1");//Adult//
									textField_6.setText("Non");//Child//
									}
						else if((rdbtnEconomyClass.isSelected()) && (rdbtnSingle.isSelected())&& (rdbtnChild.isSelected()) && cmbFrom.getSelectedItem().equals("New Delhi") && 
								cmbTo.getSelectedItem().equals("Chennai"))
								{
									totalCost = (tax * KMS1500)/100;
									String sTax = String.format("Rs.%.2f",totalCost);
									textField.setText(sTax);
									String subTotal = String.format("Rs.%.2f",KMS1500);
									textField_1.setText(subTotal);
									String Total = String.format("Rs.%.2f",KMS1500 + totalCost);
									textField_2.setText(Total); //Total//
									textField_12.setText(Total);//Price//
									textField_3.setText("Economy");//Class//
									textField_4.setText("One Way");//Ticket Type//
									textField_5.setText("Non");//Adult//
									textField_6.setText("1");//Child//
									}
						else if((rdbtnEconomyClass.isSelected()) && (rdbtnReturn.isSelected())&& (rdbtnChild.isSelected()) && cmbFrom.getSelectedItem().equals("New Delhi") && 
								cmbTo.getSelectedItem().equals("Chennai"))
								{
									totalCost = (tax * KMS1500)/100;
									String sTax = String.format("Rs.%.2f",totalCost);
									textField.setText(sTax);
									String subTotal = String.format("Rs.%.2f",KMS1500);
									textField_1.setText(subTotal);
									String Total = String.format("Rs.%.2f",KMS1500 + totalCost);
									textField_2.setText(Total); //Total//
									textField_12.setText(Total);//Price//
									textField_3.setText("Economy");//Class//
									textField_4.setText("Both Way");//Ticket Type//
									textField_5.setText("Non");//Adult//
									textField_6.setText("1");//Child//
									}
				//---------------------------------------------New Delhi to Chennai Buisness---------------------------------//
						else if((rdbtnBuisnessClass.isSelected()) && (rdbtnSingle.isSelected())&& (rdbtnAdult.isSelected()) && cmbFrom.getSelectedItem().equals("New Delhi") && 
								cmbTo.getSelectedItem().equals("Chennai"))
								{
									totalCost = (tax * KMS1500)/100;
									String sTax = String.format("Rs.%.2f",totalCost);
									textField.setText(sTax);
									String subTotal = String.format("Rs.%.2f",KMS1500);
									textField_1.setText(subTotal);
									String Total = String.format("Rs.%.2f",KMS1500 + totalCost);
									textField_2.setText(Total); //Total//
									textField_12.setText(Total);//Price//
									textField_3.setText("Buisness");//Class//
									textField_4.setText("One Way");//Ticket Type//
									textField_5.setText("1");//Adult//
									textField_6.setText("Non");//Child//
									}
								else if((rdbtnBuisnessClass.isSelected()) && (rdbtnReturn.isSelected())&& (rdbtnAdult.isSelected()) && cmbFrom.getSelectedItem().equals("New Delhi") && 
										cmbTo.getSelectedItem().equals("Chennai"))
										{
											totalCost = (tax * KMS1500)/100;
											String sTax = String.format("Rs.%.2f",totalCost);
											textField.setText(sTax);
											String subTotal = String.format("Rs.%.2f",KMS1500);
											textField_1.setText(subTotal);
											String Total = String.format("Rs.%.2f",KMS1500 + totalCost);
											textField_2.setText(Total); //Total//
											textField_12.setText(Total);//Price//
											textField_3.setText("Buisness");//Class//
											textField_4.setText("Both Way");//Ticket Type//
											textField_5.setText("1");//Adult//
											textField_6.setText("Non");//Child//
											}
								else if((rdbtnBuisnessClass.isSelected()) && (rdbtnSingle.isSelected())&& (rdbtnChild.isSelected()) && cmbFrom.getSelectedItem().equals("New Delhi") && 
										cmbTo.getSelectedItem().equals("Chennai"))
										{
											totalCost = (tax * KMS1500)/100;
											String sTax = String.format("Rs.%.2f",totalCost);
											textField.setText(sTax);
											String subTotal = String.format("Rs.%.2f",KMS1500);
											textField_1.setText(subTotal);
											String Total = String.format("Rs.%.2f",KMS1500 + totalCost);
											textField_2.setText(Total); //Total//
											textField_12.setText(Total);//Price//
											textField_3.setText("Buisness");//Class//
											textField_4.setText("One Way");//Ticket Type//
											textField_5.setText("Non");//Adult//
											textField_6.setText("1");//Child//
											}
								else if((rdbtnBuisnessClass.isSelected()) && (rdbtnReturn.isSelected())&& (rdbtnChild.isSelected()) && cmbFrom.getSelectedItem().equals("New Delhi") && 
										cmbTo.getSelectedItem().equals("Chennai"))
										{
											totalCost = (tax * KMS1500)/100;
											String sTax = String.format("Rs.%.2f",totalCost);
											textField.setText(sTax);
											String subTotal = String.format("Rs.%.2f",KMS1500);
											textField_1.setText(subTotal);
											String Total = String.format("Rs.%.2f",KMS1500 + totalCost);
											textField_2.setText(Total); //Total//
											textField_12.setText(Total);//Price//
											textField_3.setText("Buisness");//Class//
											textField_4.setText("Both Way");//Ticket Type//
											textField_5.setText("Non");//Adult//
											textField_6.setText("1");//Child//
											}
				//---------------------------------------------------New Delhi to Pune Economy----------------------//
								else if((rdbtnEconomyClass.isSelected()) && (rdbtnSingle.isSelected())&& (rdbtnAdult.isSelected()) && cmbFrom.getSelectedItem().equals("New Delhi") && 
						cmbTo.getSelectedItem().equals("Pune"))
						{
							totalCost = (tax * KMS2000)/100;
							String sTax = String.format("Rs.%.2f",totalCost);
							textField.setText(sTax);
							String subTotal = String.format("Rs.%.2f",KMS2000);
							textField_1.setText(subTotal);
							String Total = String.format("Rs.%.2f",KMS2000 + totalCost);
							textField_2.setText(Total); //Total//
							textField_12.setText(Total);//Price//
							textField_3.setText("Economy");//Class//
							textField_4.setText("One Way");//Ticket Type//
							textField_5.setText("1");//Adult//
							textField_6.setText("Non");//Child//
							}
						else if((rdbtnEconomyClass.isSelected()) && (rdbtnReturn.isSelected())&& (rdbtnAdult.isSelected()) && cmbFrom.getSelectedItem().equals("New Delhi") && 
								cmbTo.getSelectedItem().equals("Pune"))
								{
									totalCost = (tax * KMS2000)/100;
									String sTax = String.format("Rs.%.2f",totalCost);
									textField.setText(sTax);
									String subTotal = String.format("Rs.%.2f",KMS2000);
									textField_1.setText(subTotal);
									String Total = String.format("Rs.%.2f",KMS2000 + totalCost);
									textField_2.setText(Total); //Total//
									textField_12.setText(Total);//Price//
									textField_3.setText("Economy");//Class//
									textField_4.setText("Both Way");//Ticket Type//
									textField_5.setText("1");//Adult//
									textField_6.setText("Non");//Child//
									}
						else if((rdbtnEconomyClass.isSelected()) && (rdbtnSingle.isSelected())&& (rdbtnChild.isSelected()) && cmbFrom.getSelectedItem().equals("New Delhi") && 
								cmbTo.getSelectedItem().equals("Pune"))
								{
									totalCost = (tax * KMS2000)/100;
									String sTax = String.format("Rs.%.2f",totalCost);
									textField.setText(sTax);
									String subTotal = String.format("Rs.%.2f",KMS2000);
									textField_1.setText(subTotal);
									String Total = String.format("Rs.%.2f",KMS2000 + totalCost);
									textField_2.setText(Total); //Total//
									textField_12.setText(Total);//Price//
									textField_3.setText("Economy");//Class//
									textField_4.setText("One Way");//Ticket Type//
									textField_5.setText("Non");//Adult//
									textField_6.setText("1");//Child//
									}
						else if((rdbtnEconomyClass.isSelected()) && (rdbtnReturn.isSelected())&& (rdbtnChild.isSelected()) && cmbFrom.getSelectedItem().equals("New Delhi") && 
								cmbTo.getSelectedItem().equals("Pune"))
								{
									totalCost = (tax * KMS2000)/100;
									String sTax = String.format("Rs.%.2f",totalCost);
									textField.setText(sTax);
									String subTotal = String.format("Rs.%.2f",KMS2000);
									textField_1.setText(subTotal);
									String Total = String.format("Rs.%.2f",KMS2000 + totalCost);
									textField_2.setText(Total); //Total//
									textField_12.setText(Total);//Price//
									textField_3.setText("Economy");//Class//
									textField_4.setText("Both Way");//Ticket Type//
									textField_5.setText("Non");//Adult//
									textField_6.setText("1");//Child//
									}
				//---------------------------------------New Delhi to Pune Buisness---------------------------//
						else if((rdbtnBuisnessClass.isSelected()) && (rdbtnSingle.isSelected())&& (rdbtnAdult.isSelected()) && cmbFrom.getSelectedItem().equals("New Delhi") && 
								cmbTo.getSelectedItem().equals("Pune"))
								{
									totalCost = (tax * KMS2000)/100;
									String sTax = String.format("Rs.%.2f",totalCost);
									textField.setText(sTax);
									String subTotal = String.format("Rs.%.2f",KMS2000);
									textField_1.setText(subTotal);
									String Total = String.format("Rs.%.2f",KMS2000 + totalCost);
									textField_2.setText(Total); //Total//
									textField_12.setText(Total);//Price//
									textField_3.setText("Buisness");//Class//
									textField_4.setText("One Way");//Ticket Type//
									textField_5.setText("1");//Adult//
									textField_6.setText("Non");//Child//
									}
								else if((rdbtnBuisnessClass.isSelected()) && (rdbtnReturn.isSelected())&& (rdbtnAdult.isSelected()) && cmbFrom.getSelectedItem().equals("New Delhi") && 
										cmbTo.getSelectedItem().equals("Pune"))
										{
											totalCost = (tax * KMS2000)/100;
											String sTax = String.format("Rs.%.2f",totalCost);
											textField.setText(sTax);
											String subTotal = String.format("Rs.%.2f",KMS2000);
											textField_1.setText(subTotal);
											String Total = String.format("Rs.%.2f",KMS2000 + totalCost);
											textField_2.setText(Total); //Total//
											textField_12.setText(Total);//Price//
											textField_3.setText("Buisness");//Class//
											textField_4.setText("Both Way");//Ticket Type//
											textField_5.setText("1");//Adult//
											textField_6.setText("Non");//Child//
											}
								else if((rdbtnBuisnessClass.isSelected()) && (rdbtnSingle.isSelected())&& (rdbtnChild.isSelected()) && cmbFrom.getSelectedItem().equals("New Delhi") && 
										cmbTo.getSelectedItem().equals("Pune"))
										{
											totalCost = (tax * KMS2000)/100;
											String sTax = String.format("Rs.%.2f",totalCost);
											textField.setText(sTax);
											String subTotal = String.format("Rs.%.2f",KMS2000);
											textField_1.setText(subTotal);
											String Total = String.format("Rs.%.2f",KMS2000 + totalCost);
											textField_2.setText(Total); //Total//
											textField_12.setText(Total);//Price//
											textField_3.setText("Buisness");//Class//
											textField_4.setText("One Way");//Ticket Type//
											textField_5.setText("Non");//Adult//
											textField_6.setText("1");//Child//
											}
								else if((rdbtnBuisnessClass.isSelected()) && (rdbtnReturn.isSelected())&& (rdbtnChild.isSelected()) && cmbFrom.getSelectedItem().equals("New Delhi") && 
										cmbTo.getSelectedItem().equals("Pune"))
										{
											totalCost = (tax * KMS2000)/100;
											String sTax = String.format("Rs.%.2f",totalCost);
											textField.setText(sTax);
											String subTotal = String.format("Rs.%.2f",KMS2000);
											textField_1.setText(subTotal);
											String Total = String.format("Rs.%.2f",KMS2000 + totalCost);
											textField_2.setText(Total); //Total//
											textField_12.setText(Total);//Price//
											textField_3.setText("Buisness");//Class//
											textField_4.setText("Both Way");//Ticket Type//
											textField_5.setText("Non");//Adult//
											textField_6.setText("1");//Child//
											}
				
				
				
				
			
		
				
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				//--------------Time-------------//
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				textField_10.setText(tTime.format(timer.getTime()));
				//---------------Date------------//
				SimpleDateFormat dDate = new SimpleDateFormat("dd:MM:yy");
				textField_7.setText((String) cmbFrom.getSelectedItem()+ " *");
				textField_8.setText((String) cmbTo.getSelectedItem()+ " *");
				//-----Random Number Generator for Ticket Number-----//
				int num1;
				String q1="";
				num1= 1367 + (int) (Math.random()*4238);
				q1+= num1 + 1367;
				textField_11.setText(q1);
				//-----------For Route---------//
				textField_13.setText("ANY");
			}
				
				
				
				
				
				
				
			
		});
		btnNewButton.setToolTipText("Total Amount");
		btnNewButton.setFont(new Font("Sylfaen", Font.BOLD, 20));
		btnNewButton.setBounds(39, 523, 97, 30);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setToolTipText("Reset System");
		btnReset.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);//Base Fare//
				textField_1.setText(null);//Tax//
				textField_2.setText(null);//Total//
				textField_3.setText(null);//Class//
				textField_4.setText(null);//Ticket//
				textField_5.setText(null);//Adult//
				textField_6.setText(null);//Child//
				textField_7.setText(null);//From//
				textField_8.setText(null);//To//
				textField_10.setText(null);//Time//
				textField_11.setText(null);//Ticket Number//
				textField_12.setText(null);//Price//
				textField_13.setText(null);//Route//
				rdbtnEconomyClass.setSelected(false);
				rdbtnBuisnessClass.setSelected(false);
				rdbtnSingle.setSelected(false);
				rdbtnReturn.setSelected(false);
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);
				cmbFrom.setSelectedItem("        From "); 
				cmbTo.setSelectedItem("          To");
				}
		});
		btnReset.setFont(new Font("Sylfaen", Font.BOLD, 20));
		btnReset.setBounds(218, 523, 97, 30);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setToolTipText("Exit System");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame =new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Ticketing System",
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
				System.exit(0);
				}
				
			}
		});
		btnExit.setFont(new Font("Sylfaen", Font.BOLD, 20));
		btnExit.setBounds(402, 523, 97, 30);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(29, 502, 602, 2);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(661, 133, 8, 420);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(714, 133, 602, 2);
		frame.getContentPane().add(separator_6);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setForeground(Color.BLACK);
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblClass.setBounds(736, 160, 77, 30);
		frame.getContentPane().add(lblClass);
		
		JLabel lblTicket = new JLabel("Ticket");
		//System.out.println(s1);
		lblTicket.setForeground(Color.BLACK);
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTicket.setBounds(889, 160, 82, 30);
		frame.getContentPane().add(lblTicket);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setForeground(Color.BLACK);
		lblAdult.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAdult.setBounds(1059, 160, 77, 30);
		frame.getContentPane().add(lblAdult);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setForeground(Color.BLACK);
		lblChild.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblChild.setBounds(1203, 160, 77, 30);
		frame.getContentPane().add(lblChild);
		
		textField_3 = new JTextField();
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cls = new String("");
				cls=textField_3.getText();
				try {
					fw8=new FileWriter("C:\\Users\\Abhishek\\Desktop\\Javap\\class.txt");
					fw8.write(cls);
					fw8.close();
				} catch (IOException e8) {
					// TODO Auto-generated catch block
					e8.printStackTrace();
				}
			
		}
				
			
		});
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(698, 205, 147, 38);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(857, 205, 147, 38);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(1017, 204, 147, 38);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_6.setColumns(10);
		textField_6.setBounds(1169, 204, 147, 38);
		frame.getContentPane().add(textField_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(714, 275, 602, 2);
		frame.getContentPane().add(separator_7);
		
		JLabel lblFrom = new JLabel("From :");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblFrom.setBounds(714, 337, 99, 30);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To :");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTo.setBounds(714, 387, 60, 30);
		frame.getContentPane().add(lblTo);
		
		textField_7 = new JTextField();
		textField_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String org = new String("");
				org=textField_7.getText();
				try {
					fw5=new FileWriter("C:\\Users\\Abhishek\\Desktop\\Javap\\from.txt");
					fw5.write(org);
					fw5.close();
				} catch (IOException e5) {
					// TODO Auto-generated catch block
					e5.printStackTrace();
				}


				
			}
		});
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_7.setColumns(10);
		textField_7.setBounds(813, 338, 147, 38);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					String des = new String("");
					des=textField_8.getText();
					try {
						fw6=new FileWriter("C:\\Users\\Abhishek\\Desktop\\Javap\\to.txt");
						fw6.write(des);
						fw6.close();
					} catch (IOException e6) {
						// TODO Auto-generated catch block
						e6.printStackTrace();
					}
				
			}
		});
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_8.setColumns(10);
		textField_8.setBounds(813, 388, 147, 38);
		frame.getContentPane().add(textField_8);
		
		JLabel lblTime = new JLabel("Time :");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTime.setBounds(714, 437, 77, 30);
		frame.getContentPane().add(lblTime);
		String dt = new String("");
		try {
			fw9=new FileWriter("C:\\Users\\Abhishek\\Desktop\\Javap\\date.txt");
			fw9.write(dt);
			fw9.close();
		} catch (IOException e9) {
			// TODO Auto-generated catch block
			e9.printStackTrace();
		}
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_10.setColumns(10);
		textField_10.setBounds(813, 439, 147, 38);
		frame.getContentPane().add(textField_10);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(1003, 297, 1, 305);
		frame.getContentPane().add(separator_8);
		
		JLabel lblTicketNumber = new JLabel("Ticket Number");
		lblTicketNumber.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTicketNumber.setBounds(1107, 305, 190, 30);
		frame.getContentPane().add(lblTicketNumber);
		
		textField_11 = new JTextField();
		textField_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tno = new String("");
				tno=textField_11.getText();
				try {
					fw4=new FileWriter("C:\\Users\\Abhishek\\Desktop\\Javap\\tno.txt");
					fw4.write(tno);
					fw4.close();
				} catch (IOException e4) {
					// TODO Auto-generated catch block
					e4.printStackTrace();
				}
				
			}
		});
		textField_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_11.setColumns(10);
		textField_11.setBounds(1117, 351, 147, 38);
		frame.getContentPane().add(textField_11);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPrice.setBounds(1154, 399, 77, 30);
		frame.getContentPane().add(lblPrice);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_12.setColumns(10);
		textField_12.setBounds(1117, 438, 147, 38);
		frame.getContentPane().add(textField_12);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblRoute.setBounds(1154, 518, 77, 30);
		frame.getContentPane().add(lblRoute);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_13.setColumns(10);
		textField_13.setBounds(1117, 564, 147, 38);
		frame.getContentPane().add(textField_13);
		
		JButton btnNextPage = new JButton("Next Page");
		btnNextPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println(s1);
				akshay ak = new akshay();
				ak.NewScreen();
			}
		
			
		});
		btnNextPage.setToolTipText("Total Amount");
		btnNextPage.setFont(new Font("Sylfaen", Font.BOLD, 22));
		btnNextPage.setBounds(966, 810, 136, 38);
		frame.getContentPane().add(btnNextPage);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstpage window = new firstpage();
				window.frame.setVisible(true);
				dispose();
			}
		});
		btnGoBack.setToolTipText("Total Amount");
		btnGoBack.setFont(new Font("Sylfaen", Font.BOLD, 20));
		btnGoBack.setBounds(29, 856, 124, 30);
		frame.getContentPane().add(btnGoBack);
		
		JLabel lblNewLabel = new JLabel("                     Airline Travel User Details ");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(436, 43, 861, 49);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(29, 754, 25, 25);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblIHaveReviewed = new JLabel("I have reviewed and agreed on the fares and commision offered for this booking.");
		lblIHaveReviewed.setFont(new Font("Swis721 BT", Font.BOLD, 18));
		lblIHaveReviewed.setBounds(61, 754, 713, 25);
		frame.getContentPane().add(lblIHaveReviewed);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dt1 = new String("");
				dt1=textField_14.getText();
				try {
					fw10=new FileWriter("C:\\Users\\Abhishek\\Desktop\\Javap\\dt1.txt");
					fw10.write(dt1);
					fw10.close();
				} catch (IOException e10) {
					// TODO Auto-generated catch block
					e10.printStackTrace();
				}
				
			}
		});
		textField_14.setBounds(447, 310, 134, 25);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblDate_1 = new JLabel("Date:");
		lblDate_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDate_1.setBounds(380, 304, 60, 30);
		frame.getContentPane().add(lblDate_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setToolTipText("dd:mm:yyyy");
		lblNewLabel_1.setIcon(new ImageIcon(Travelling.class.getResource("/image/ef.jpg")));
		lblNewLabel_1.setBounds(0, -21, 1918, 1014);
		frame.getContentPane().add(lblNewLabel_1);
	}

	protected void dispose() {
		// TODO Auto-generated method stub
		
	}
}

