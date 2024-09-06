package event_Management;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class maintain_user extends JFrame implements ActionListener {
	
	JButton home,logout,add1,add2,update1,update2;
	maintain_user(){
		setTitle("User Management");
		setLayout(null);
		setSize(800,480);
		setVisible(true);
		setLocation(350,200);
		
		JLabel Jmembership = new JLabel("Membership");
		Jmembership.setFont(new Font("Osward",Font.BOLD,18));
		add(Jmembership);
		Jmembership.setBounds(180,100,200,40);
		
		JLabel Juser = new JLabel("User Management");
		Juser.setFont(new Font("Osward",Font.BOLD,18));
		add(Juser);
		Juser.setBounds(180,300,200,40);
		
		home = new JButton("Home");
		home.addActionListener(this);
		add(home);
		home.setBounds(20,10,100,30);
		
		logout = new JButton("Logout");
		logout.addActionListener(this);
		add(logout);
		logout.setBounds(600,10,100,30);
		
		add1 = new JButton("Add");
		add1.addActionListener(this);
		add(add1);
		add1.setBounds(400,100,200,40);
		
		add2 = new JButton("Add");
		add2.addActionListener(this);
		add(add2);
		add2.setBounds(400,300,200,40);
		
		update1 = new JButton("Update");
		update1.addActionListener(this);
		add(update1);
		update1.setBounds(400,340,200,40);
		
		update2 = new JButton("Update");
		update2.addActionListener(this);
		add(update2);
		update2.setBounds(400,140,200,40);
		
		getContentPane().setBackground(Color.WHITE);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource() == home) {
			setVisible(false);
			new admin_page();
		}
		else if(ae.getSource() == logout) {
			setVisible(false);
			new Admin_Login();
		}
		
		else if(ae.getSource() == add1){
			setVisible(false);
			new add_member();
		}
		else if(ae.getSource() == add2){
			setVisible(false);
			//new add_user();
		}
		else if(ae.getSource() == update1){
			setVisible(false);
			new update_member();
		}
		else if(ae.getSource() == update2){
			setVisible(false);
			//new update_user();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new maintain_user();
	}

}
