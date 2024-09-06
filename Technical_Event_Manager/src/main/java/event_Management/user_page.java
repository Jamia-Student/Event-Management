package event_Management;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class user_page extends JFrame implements ActionListener{
	user_page(){
		setTitle("User Page");
		setLayout(null);
		setSize(800,480);
		setVisible(true);
		setLocation(350,200);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new user_page();
	}

}
