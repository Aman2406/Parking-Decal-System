import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;
import java.awt.Label;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	Connection connection = null;
	
	public login() {
		initialize();
		connection = Sqliteconnection.dbconnector();  
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("deprecation")
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 866, 554);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel.setBounds(433, 162, 82, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(434, 230, 81, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(539, 162, 191, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(539, 226, 191, 37);
		frame.getContentPane().add(passwordField);
		
		Button submit = new Button("Submit");
		submit.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
			}
		});
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "Select * from credentials where username=? and password=? ";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1,textField.getText() );
					pst.setString(2,passwordField.getText() );
					
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while(rs.next()) {
						count = count+1;	
					}
					if(count ==1) {
						JOptionPane.showMessageDialog(null,"Correct Credentials");
						frame.dispose();
						Decalpage dp = new Decalpage();
						dp.setVisible(true);
					}
					else if(count > 1) {
						JOptionPane.showMessageDialog(null,"Duplicate Credentials");
					}else{
						JOptionPane.showMessageDialog(null,"Incorrect Credentials");
					}
					rs.close();
					pst.close();
				}catch(Exception e){
				JOptionPane.showMessageDialog(null, e);
				}
				finally {
					try {
						
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, e);
					}
				}
			}
		});
		submit.setForeground(Color.DARK_GRAY);
		submit.setBounds(433, 327, 79, 24);
		frame.getContentPane().add(submit);
		
		Button rst = new Button("Reset");
		rst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		rst.setForeground(Color.DARK_GRAY);
		rst.setBounds(539, 327, 79, 24);
		frame.getContentPane().add(rst);
		
		Button exit = new Button("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setForeground(Color.DARK_GRAY);
		exit.setBounds(643, 327, 79, 24);
		frame.getContentPane().add(exit);
		
		JTextArea textarea = new JTextArea();
		textarea.setFont(new Font("Arial Black", Font.PLAIN, 14));
		textarea.setBackground(Color.GRAY);
		textarea.setForeground(Color.GRAY);
		textarea.setBounds(0, 440, 782, 54);
		frame.getContentPane().add(textarea);
		
		Label label = new Label("Login : Decal System");
		label.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		label.setForeground(Color.LIGHT_GRAY);
		label.setBounds(225, 10, 284, 59);
		frame.getContentPane().add(label);
		
		Panel panel = new Panel();
		panel.setBackground(Color.GRAY);
		panel.setForeground(Color.LIGHT_GRAY);
		panel.setBounds(24, 61, 70, 446);
		frame.getContentPane().add(panel);
		
		JLabel image = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		image.setIcon(new ImageIcon(img));
		image.setBounds(118, 130, 263, 231);
		frame.getContentPane().add(image);
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
	}
}
