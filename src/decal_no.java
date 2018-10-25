import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")
public class decal_no {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					decal_no window = new decal_no();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 * @param uid 
	 */
	public decal_no(String uid) {
		Connection con = sqliteDecal.dconnector(); 
		initialize(con,uid);
	}
	
//	public decal_no() {
//		//Connection con = sqliteDecal.dconnector(); 
//		initialize(con,uid);
//	}

	/**
	 * Initialize the contents of the frame.
	 * @param uid 
	 */
	private void initialize(Connection con, String uid) {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 616, 441);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		StringBuilder sb= new StringBuilder();
		String cd = "SHU";
		Random rnd = new Random();
		int dn = rnd.nextInt(90000)+10000;
		String randAsString = cd + String.valueOf(dn);
		//System.out.println(randAsString);
		
		String query="Insert into number_store  values(?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(query);
			 pst.setString(1,randAsString);
			 pst.setString(2,uid);
			 pst.execute();
			
			
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		//sb= dn.toString();
		//String dns.setText(textField);
		//randAsString.setText(textField);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 324, 598, 41);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(38, 13, 40, 381);
		frame.getContentPane().add(panel_1);
		
		textField = new JTextField();
		textField.setBounds(329, 73, 123, 25);
		frame.getContentPane().add(textField);
		textField.setEditable(false);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Boolean complete = textField.print();
					if(complete) {
						JOptionPane.showMessageDialog(null, "Printing DOne...");
					}
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(161, 236, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(329, 236, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblDecalNumber = new JLabel("Invoice");
		lblDecalNumber.setForeground(Color.LIGHT_GRAY);
		lblDecalNumber.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		lblDecalNumber.setBounds(242, 13, 83, 60);
		frame.getContentPane().add(lblDecalNumber);
		
		JLabel lblKindyVisitHc = new JLabel("Kindly visit HC-103 for the cash payment and collect your Decal Sticker");
		lblKindyVisitHc.setForeground(Color.LIGHT_GRAY);
		lblKindyVisitHc.setBounds(100, 259, 418, 35);
		frame.getContentPane().add(lblKindyVisitHc);
		
		JLabel lblNewLabel = new JLabel("Timming Monday to Fridat [10AM to 4PM]");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(161, 290, 240, 21);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(329, 111, 123, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(329, 146, 123, 22);
		textField_2.setEditable(false);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(329, 181, 123, 22);
		textField_3.setEditable(false);
		//textField_3.setText("30");
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1 = new JLabel("Decal Number:");
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(161, 77, 112, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblStudentId = new JLabel("Student ID:");
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudentId.setForeground(Color.LIGHT_GRAY);
		lblStudentId.setBounds(161, 114, 97, 16);
		frame.getContentPane().add(lblStudentId);
		
		JLabel lblCarPlateNo = new JLabel("Car Plate No:");
		lblCarPlateNo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCarPlateNo.setForeground(Color.LIGHT_GRAY);
		lblCarPlateNo.setBounds(161, 149, 97, 16);
		frame.getContentPane().add(lblCarPlateNo);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrice.setForeground(Color.LIGHT_GRAY);
		lblPrice.setBounds(161, 184, 81, 16);
		frame.getContentPane().add(lblPrice);
		
		
		try {
			
			String testQuery = "SELECT fname,lname,cr_no FROM orderinfo natural join number_store WHERE number_store.uid = "+uid;
			Statement stmtFinal  = con.createStatement();
			ResultSet rsFinal    = stmtFinal.executeQuery(testQuery);
			
			textField.setText(randAsString);
			textField_1.setText(uid);
			textField_2.setText(rsFinal.getString("cr_no"));
			textField_3.setText(rsFinal.getString("fname")+" "+rsFinal.getString("lname")); 
			
			

			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
}
