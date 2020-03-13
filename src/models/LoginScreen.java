package models;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class LoginScreen extends JFrame{
	JLabel l1,l2;
	JButton b1,b2;
	void setComponents() {
		l1=new JLabel("WELCOME TO ABCD BANK");     l1.setFont(new Font("ROCKWELL",Font.BOLD,24));l1.setForeground(Color.BLUE);
		l2=new JLabel("You want to login as:");    l2.setFont(new Font("Sherif",Font.BOLD,18)); 
		b1=new JButton("EMPLOYEE");
		b2=new JButton("CUSTOMER");
		setLayout(null);
		l1.setBounds(120,40,450,50);
		l2.setBounds(180,120,250,30);
		b1.setBounds(100,180,400,50);                b1.setBackground(Color.blue);b1.setForeground(Color.white); b1.setFont(new Font("Sherif",Font.BOLD,25));
		b2.setBounds(100,250,400,50);                b2.setBackground(Color.blue);b2.setForeground(Color.white); b2.setFont(new Font("Sherif",Font.BOLD,25));
		b1.addActionListener(new myhandler());
		b2.addActionListener(new myhandler());
		add(l1); add(l2); add(b1); add(b2); 
	}
	
	class myhandler implements ActionListener{
  	  public void actionPerformed (ActionEvent e) {
  		  if(e.getSource()==b1) {
  			  EmployeeLogin.main(new String[]{});
  			  dispose();
  		  }
  		  if(e.getSource()==b2) {
  			  CustomerLogin.main(new String []{});
  			  dispose();
  	      }
    }
    }
	
	
	public static void main(String [] args) {
		LoginScreen s=new LoginScreen();
		s.setComponents();
		s.setSize(600,600);
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
