import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;
import java.util.regex.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Decalpage {

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
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Decalpage window = new Decalpage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection conn=null;
	Connection con=null;
	ResultSet rs=null;
	PreparedStatement pst=null;
	ResultSet rst=null;
	PreparedStatement ps=null;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	/**
	 * Create the application.
	 */
	public Decalpage() {
		con = sqliteDecal.dconnector(); 
		conn = Sqliteconnection.dbconnector();
		initialize();  

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().setForeground(Color.RED);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 988, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblCommuterParkingDecal = new JLabel("Commuter Parking Decal Request");
		lblCommuterParkingDecal.setBackground(Color.WHITE);
		lblCommuterParkingDecal.setForeground(Color.LIGHT_GRAY);
		lblCommuterParkingDecal.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		lblCommuterParkingDecal.setBounds(261, 13, 426, 84);
		frame.getContentPane().add(lblCommuterParkingDecal);

		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(55, 508, 915, 62);
		frame.getContentPane().add(textArea);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.LIGHT_GRAY);
		textArea_1.setBounds(865, 31, 65, 572);
		frame.getContentPane().add(textArea_1);

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String PATTERN="^[0-9]{6,10}$";
				Pattern pattern = Pattern.compile(PATTERN);
				Matcher matt = pattern.matcher(textField.getText());
				if(!matt.matches()) {
					textField_12.setText("Wrong ID");
				}else{
					textField_12.setText(null);
				}
			}
		});
		textField.setBounds(55, 171, 143, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblStudentId = new JLabel("Student ID:");
		lblStudentId.setForeground(Color.GRAY);
		lblStudentId.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblStudentId.setBounds(55, 132, 143, 30);
		frame.getContentPane().add(lblStudentId);

		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblFirstName.setForeground(Color.GRAY);
		lblFirstName.setBounds(55, 224, 143, 30);
		frame.getContentPane().add(lblFirstName);

		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				String PATTERN="^[a-zA-Z]{4,10}$";
				Pattern pattern = Pattern.compile(PATTERN);
				Matcher matt = pattern.matcher(textField_1.getText());
				if(!matt.matches()) {
					textField_13.setText("Wrong Naming");
				}else{
					textField_13.setText(null);
				}
			}
		});
		textField_1.setBounds(55, 267, 143, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setForeground(Color.GRAY);
		lblLastName.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblLastName.setBounds(55, 313, 143, 30);
		frame.getContentPane().add(lblLastName);

		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String PATTERN="^[a-zA-Z]{4,10}$";
				Pattern pattern = Pattern.compile(PATTERN);
				Matcher matt = pattern.matcher(textField_2.getText());
				if(!matt.matches()) {
					textField_14.setText("Wrong Naming");
				}else{
					textField_14.setText(null);
				}
			}
		});
		textField_2.setBounds(55, 356, 143, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblEmailAddress = new JLabel("Email Address:");
		lblEmailAddress.setForeground(Color.GRAY);
		lblEmailAddress.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblEmailAddress.setBounds(261, 132, 143, 30);
		frame.getContentPane().add(lblEmailAddress);

		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String PATTERN="^[a-zA-Z0-9]{4,15}[@][a-zA-Z]{1,12}[.][a-zA-Z]{2,5}$";
				Pattern pattern = Pattern.compile(PATTERN);
				Matcher matt = pattern.matcher(textField_3.getText());
				if(!matt.matches()) {
					textField_17.setText("Wrong Email");
				}else{
					textField_17.setText(null);
				}

			}
		});
		textField_3.setColumns(10);
		textField_3.setBounds(261, 171, 143, 22);
		frame.getContentPane().add(textField_3);

		JLabel lblContactNumber = new JLabel("Mobile Number:");
		lblContactNumber.setForeground(Color.GRAY);
		lblContactNumber.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblContactNumber.setBounds(261, 224, 143, 30);
		frame.getContentPane().add(lblContactNumber);

		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String PATTERN="^[0-9]{10,11}$";
				Pattern pattern = Pattern.compile(PATTERN);
				Matcher matt = pattern.matcher(textField_4.getText());
				if(!matt.matches()) {
					textField_16.setText("Wrong Email");
				}else{
					textField_16.setText(null);
				}
			}
		});
		textField_4.setColumns(10);
		textField_4.setBounds(261, 267, 143, 22);
		frame.getContentPane().add(textField_4);

		JLabel lblCarColor = new JLabel("Car Color:");
		lblCarColor.setForeground(Color.GRAY);
		lblCarColor.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblCarColor.setBounds(261, 313, 116, 30);
		frame.getContentPane().add(lblCarColor);

		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String PATTERN="^[a-zA-Z]{3,12}$";
				Pattern pattern = Pattern.compile(PATTERN);
				Matcher matt = pattern.matcher(textField_5.getText());
				if(!matt.matches()) {
					textField_15.setText("Wrong Color");
				}else{
					textField_15.setText(null);
				}
			}
		});
		textField_5.setColumns(10);
		textField_5.setBounds(261, 356, 143, 22);
		frame.getContentPane().add(textField_5);

		JLabel lblLocalAddress = new JLabel("Local Address:");
		lblLocalAddress.setForeground(Color.GRAY);
		lblLocalAddress.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblLocalAddress.setBounds(474, 132, 143, 30);
		frame.getContentPane().add(lblLocalAddress);

		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String PATTERN="^[a-zA-Z0-9]{3,25}[ ][a-zA-Z0-9]{3,25}[ ][a-zA-Z0-9]{3,25}$";
				Pattern pattern = Pattern.compile(PATTERN);
				Matcher matt = pattern.matcher(textField_6.getText());
				if(!matt.matches()) {
					textField_18.setText("Wrong Address");
				}else{
					textField_18.setText(null);
				}

			}
		});
		textField_6.setColumns(10);
		textField_6.setBounds(474, 171, 143, 22);
		frame.getContentPane().add(textField_6);

		JLabel lblLocalCity = new JLabel("Local City");
		lblLocalCity.setForeground(Color.GRAY);
		lblLocalCity.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblLocalCity.setBounds(474, 224, 143, 30);
		frame.getContentPane().add(lblLocalCity);

		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String PATTERN="^[a-zA-Z]{5,17}$";
				Pattern pattern = Pattern.compile(PATTERN);
				Matcher matt = pattern.matcher(textField_7.getText());
				if(!matt.matches()) {
					textField_19.setText("Wrong City");
				}else{
					textField_19.setText(null);
				}
			}
		});
		textField_7.setColumns(10);
		textField_7.setBounds(474, 267, 143, 22);
		frame.getContentPane().add(textField_7);

		JLabel lblLocalState = new JLabel("Local State:");
		lblLocalState.setForeground(Color.GRAY);
		lblLocalState.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblLocalState.setBounds(474, 313, 143, 30);
		frame.getContentPane().add(lblLocalState);

		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String PATTERN="^[a-zA-Z]{5,25}$";
				Pattern pattern = Pattern.compile(PATTERN);
				Matcher matt = pattern.matcher(textField_8.getText());
				if(!matt.matches()) {
					textField_20.setText("Wrong State");
				}else{
					textField_20.setText(null);
				}
			}
		});
		textField_8.setColumns(10);
		textField_8.setBounds(474, 356, 143, 22);
		frame.getContentPane().add(textField_8);

		JLabel lblNumber = new JLabel("Plate Number:");
		lblNumber.setForeground(Color.GRAY);
		lblNumber.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblNumber.setBounds(671, 132, 143, 30);
		frame.getContentPane().add(lblNumber);

		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String PATTERN="^[a-zA-Z0-9]{4,12}$";
				Pattern pattern = Pattern.compile(PATTERN);
				Matcher matt = pattern.matcher(textField_9.getText());
				if(!matt.matches()) {
					textField_23.setText("Wrong Plate Number");
				}else{
					textField_23.setText(null);
				}
			}
		});
		textField_9.setColumns(10);
		textField_9.setBounds(671, 171, 143, 22);
		frame.getContentPane().add(textField_9);

		JLabel lblStateRegistered = new JLabel("Car State:");
		lblStateRegistered.setForeground(Color.GRAY);
		lblStateRegistered.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblStateRegistered.setBounds(671, 224, 143, 30);
		frame.getContentPane().add(lblStateRegistered);

		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String PATTERN="^[a-zA-Z0-9]{5,12}$";
				Pattern pattern = Pattern.compile(PATTERN);
				Matcher matt = pattern.matcher(textField_10.getText());
				if(!matt.matches()) {
					textField_22.setText("Wrong State");
				}else{
					textField_22.setText(null);
				}
			}
		});
		textField_10.setColumns(10);
		textField_10.setBounds(671, 267, 143, 22);
		frame.getContentPane().add(textField_10);

		JLabel lblCareMake = new JLabel("Make & Model:");
		lblCareMake.setForeground(Color.GRAY);
		lblCareMake.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblCareMake.setBounds(671, 313, 143, 30);
		frame.getContentPane().add(lblCareMake);

		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String PATTERN="^[a-zA-Z]{3,12}[ ][0-9]{3,12}$";
				Pattern pattern = Pattern.compile(PATTERN);
				Matcher matt = pattern.matcher(textField_11.getText());
				if(!matt.matches()) {
					textField_21.setText("Wrong Make and Model");
				}else{
					textField_21.setText(null);
				}
			}
		});
		textField_11.setColumns(10);
		textField_11.setBounds(671, 356, 143, 22);
		frame.getContentPane().add(textField_11);


		
	
	
		JButton btnSubmit = new JButton("Submit");

		

		
		btnSubmit.addActionListener(new ActionListener() {
			
			int flag=0;
			
			public void actionPerformed(ActionEvent arg0) {
				

			
				
				

				String testQuery = "SELECT tname FROM secure WHERE tcode = 'oi'";

				String tableName = "" ;

				try (
						Statement stmt  = con.createStatement();

						ResultSet rs    = stmt.executeQuery(testQuery)){

					while (rs.next()) {

						tableName = rs.getString("tname");

					}

				} catch (SQLException e) {

					System.out.println(e.getMessage());

				}

				try {
					
					String query="Insert into " + tableName + " values(?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst = con.prepareStatement(query);
					
					if(textField_4.getText().length()<=0) {
						JOptionPane.showMessageDialog(null, "Mobile Number Cant be Blank");	
						flag=1;
					}
					else pst.setString(1,textField_4.getText());
					
					if(textField_5.getText().length()<=0){
						JOptionPane.showMessageDialog(null, "Car Color Cant be Blank");	
						flag=1;

					}
					else pst.setString(2,textField_5.getText());
					
					if(textField_6.getText().length()<=0){
						JOptionPane.showMessageDialog(null, "Local Address Cant be Blank");	
						flag=1;

					}
					else pst.setString(3,textField_6.getText());
					
					if(textField_7.getText().length()<=0){
						JOptionPane.showMessageDialog(null, "Local City Cant be Blank");	
						flag=1;

					}
					else pst.setString(4,textField_7.getText());
					
					if(textField_8.getText().length()<=0){
						JOptionPane.showMessageDialog(null, "Local State Cant be Blank");	
						flag=1;

					}
					else pst.setString(5,textField_8.getText());
					
					if(textField_9.getText().length()<=0){
						JOptionPane.showMessageDialog(null, "Registration Plate Number Cant be Blank");	
						flag=1;

					}
					else pst.setString(6,textField_9.getText());
					
					if(textField_10.getText().length()<=0){
						JOptionPane.showMessageDialog(null, "Car Registered State Cant be Blank");	
						flag=1;

					}
					else pst.setString(7,textField_10.getText());
					
					if(textField_11.getText().length()<=0){
						JOptionPane.showMessageDialog(null, "Make and Model of Car Cant be Blank");	
						flag=1;

					}
					else pst.setString(8,textField_11.getText());
					
					if(textField.getText().length()<=0){
						JOptionPane.showMessageDialog(null, "First Name Cant be Blank");	
						flag=1;

					}
					else pst.setString(9,textField.getText());
					
					if(textField_1.getText().length()<=0){
						JOptionPane.showMessageDialog(null, "First Name Cant be Blank");	
						flag=1;

					}
					else pst.setString(10,textField_1.getText());
					
					if(textField_2.getText().length()<=0){
						JOptionPane.showMessageDialog(null, "Last Name Cant be Blank");
						flag=1;

					}
					else pst.setString(11,textField_2.getText());
					
					if(textField_3.getText().length()<=0){
						JOptionPane.showMessageDialog(null, "Email Address Cant be Blank");
						flag=1;

					}
					else pst.setString(12,textField_3.getText());					

					if(flag==1)
					{	
						flag=0;
						initialize();
					}
					else
					{
					
					pst.execute();
					JOptionPane.showMessageDialog(null, "Order Confirmed");
					
					decal_no swp = new decal_no(textField.getText());
					frame.dispose();
					swp.setVisible(true);
					pst.close();
					con.close();
					}
				}catch(Exception e){
					e.printStackTrace();
				}
			}

//			private void executeStatments(int flag2,PreparedStatement pst) {
//				// TODO Auto-generated method stub
//				
//				if(flag==0)
//				{
//				try {
//					pst.execute();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				}
//				
//				else
//					
//			}
			
		
			
		});
	
		
		
		btnSubmit.setBounds(187, 437, 97, 25);
		frame.getContentPane().add(btnSubmit);


		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
			}
		});
		btnClear.setBounds(391, 437, 97, 25);
		frame.getContentPane().add(btnClear);

		JButton btnExit = new JButton("Logout");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.exit(0);
				frame.dispose();
				login lg = new login();
				lg.setVisible(true);

			}
		});
		btnExit.setBounds(590, 437, 97, 25);
		frame.getContentPane().add(btnExit);

		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {

		});
		textField_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_12.setBackground(Color.DARK_GRAY);
		textField_12.setForeground(Color.RED);
		textField_12.setColumns(10);
		textField_12.setBounds(55, 192, 143, 22);
		textField_12.setEditable(false);
		frame.getContentPane().add(textField_12);

		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_13.setBackground(Color.DARK_GRAY);
		textField_13.setForeground(Color.RED);
		textField_13.setColumns(10);
		textField_13.setBounds(55, 288, 143, 22);
		textField_13.setEditable(false);
		frame.getContentPane().add(textField_13);

		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_14.setBackground(Color.DARK_GRAY);
		textField_14.setForeground(Color.RED);
		textField_14.setColumns(10);
		textField_14.setBounds(55, 378, 143, 22);
		textField_14.setEditable(false);
		frame.getContentPane().add(textField_14);

		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_15.setBackground(Color.DARK_GRAY);
		textField_15.setForeground(Color.RED);
		textField_15.setColumns(10);
		textField_15.setBounds(261, 378, 143, 22);
		textField_15.setEditable(false);
		frame.getContentPane().add(textField_15);

		textField_16 = new JTextField();
		textField_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_16.setBackground(Color.DARK_GRAY);
		textField_16.setForeground(Color.RED);
		textField_16.setColumns(10);
		textField_16.setBounds(261, 288, 143, 22);
		textField_16.setEditable(false);
		frame.getContentPane().add(textField_16);

		textField_17 = new JTextField();
		textField_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_17.setBackground(Color.DARK_GRAY);
		textField_17.setForeground(Color.RED);
		textField_17.setColumns(10);
		textField_17.setBounds(261, 192, 143, 22);
		textField_17.setEditable(false);
		frame.getContentPane().add(textField_17);

		textField_18 = new JTextField();
		textField_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_18.setBackground(Color.DARK_GRAY);
		textField_18.setForeground(Color.RED);
		textField_18.setColumns(10);
		textField_18.setBounds(474, 189, 143, 22);
		frame.getContentPane().add(textField_18);

		textField_19 = new JTextField();
		textField_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_19.setBackground(Color.DARK_GRAY);
		textField_19.setForeground(Color.RED);
		textField_19.setColumns(10);
		textField_19.setBounds(474, 288, 143, 22);
		textField_19.setEditable(false);
		frame.getContentPane().add(textField_19);

		textField_20 = new JTextField();
		textField_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_20.setBackground(Color.DARK_GRAY);
		textField_20.setForeground(Color.RED);
		textField_20.setColumns(10);
		textField_20.setBounds(474, 378, 143, 22);
		textField_20.setEditable(false);
		frame.getContentPane().add(textField_20);

		textField_21 = new JTextField();
		textField_21.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_21.setBackground(Color.DARK_GRAY);
		textField_21.setForeground(Color.RED);
		textField_21.setColumns(10);
		textField_21.setBounds(671, 378, 143, 22);
		textField_21.setEditable(false);
		frame.getContentPane().add(textField_21);

		textField_22 = new JTextField();
		textField_22.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_22.setBackground(Color.DARK_GRAY);
		textField_22.setForeground(Color.RED);
		textField_22.setColumns(10);
		textField_22.setBounds(671, 288, 143, 22);
		textField_22.setEditable(false);
		frame.getContentPane().add(textField_22);

		textField_23 = new JTextField();
		textField_23.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_23.setBackground(Color.DARK_GRAY);
		textField_23.setForeground(Color.RED);
		textField_23.setColumns(10);
		textField_23.setBounds(671, 192, 143, 22);
		textField_23.setEditable(false);
		frame.getContentPane().add(textField_23);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
}
