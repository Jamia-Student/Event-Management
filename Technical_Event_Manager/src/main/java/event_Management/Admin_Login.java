package event_Management;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Admin_Login extends JFrame implements ActionListener{
	
	JButton login,signup,clear;
	JTextField userid;
	JPasswordField pswd;
	Admin_Login(){
		
		setTitle("Admin_Login");
		setLayout(null);
		setSize(800,480);
		setVisible(true);
		setLocation(350,200);
		
		
		JLabel text = new JLabel("Admin Login");
		text.setFont(new Font("Osward",Font.BOLD,38));
		add(text);
		text.setBounds(280,40,400,50);
		
		JLabel LoginJlabel = new JLabel("Login Id");
		LoginJlabel.setFont(new Font("Osward",Font.BOLD,18));
		add(LoginJlabel);
		LoginJlabel.setBounds(200,180,200,40);
		
		userid = new JTextField();
		userid.setBounds(500,180,200,40);
		add(userid);
		
		login = new JButton("SIGN IN");
		login.setBounds(300,250,100,40);
		login.addActionListener(this);
		add(login);
		
		JLabel UserJlabel = new JLabel("Password");
		UserJlabel.setFont(new Font("Osward",Font.BOLD,18));
		add(UserJlabel);
		UserJlabel.setBounds(200,130,200,40);
		
		pswd = new JPasswordField();
		pswd.setBounds(500,130,200,40);
		add(pswd);
		
		signup = new JButton("SIGN UP");
		signup.setBounds(450,250,100,40);
		signup.addActionListener(this);
		add(signup);
		
		clear = new JButton("Clear");
		clear.setBounds(380,300,100,40);
		clear.addActionListener(this);
		add(clear);
		
		
		getContentPane().setBackground(Color.WHITE);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		if(ae.getSource() == login) {
			String Userid = userid.getText();
			String Pswd = pswd.getText();
			Conn conn = new Conn();
			String query = "select * from adminlogin where email = '"+Userid+"' and Password = '"+Pswd+"'";
			try {
				ResultSet rs = conn.s.executeQuery(query);
				if(rs.next()) {
					setVisible(false);
					new admin_page();
				}
				else {
					JOptionPane.showMessageDialog(null, "Wrong Credentials");
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		else if(ae.getSource() == signup) {
			setVisible(false);
			new admin_signup();
		}
		
		else if(ae.getSource() == clear) {
			userid.setText("");
			pswd.setText("");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Admin_Login();
	}

}
