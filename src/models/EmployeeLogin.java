package models;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class EmployeeLogin extends JFrame{
	JLabel l1,l2,l3;
	JTextField t;
	JPasswordField p;
	JButton b1,b2; 
	public EmployeeLogin() {
		l1=new JLabel("LOGIN AS EMPLOYEE");
		l2=new JLabel("Username");
		l3=new JLabel("Password");
		t=new JTextField();
		p=new JPasswordField();
		b1=new JButton ("BACK");
		b2=new JButton ("LOGIN");
		setLayout(null);
		
		l1.setBounds(100,40,300,40);          l1.setFont(new Font("ROCKWELL",Font.BOLD,25));l1.setForeground(Color.BLUE);
		l2.setBounds(60,160,300,30);          l2.setFont(new Font("TAHOMA",Font.CENTER_BASELINE,20));
		l3.setBounds(60,200,300,30);          l3.setFont(new Font("Sherif",Font.BOLD,20));
		t.setBounds(200,160,200,30);
		p.setBounds(200,200,200,30);
		b1.setBounds(30,300,200,50);          b1.setBackground(Color.blue);b1.setForeground(Color.white); b1.setFont(new Font("Sherif",Font.BOLD,25));
		b2.setBounds(250,300,200,50);         b2.setBackground(Color.blue);b2.setForeground(Color.white); b2.setFont(new Font("Sherif",Font.BOLD,25)); 
		b1.addActionListener(new myhandler());
		b2.addActionListener(new myhandler());
		add(l1); add(l2); add(l3); add(t); add(p); add(b1); add(b2); 
	}
	class myhandler implements ActionListener{
        	  public void actionPerformed (ActionEvent e) {
        		  if(e.getSource()==b1) {
        			  LoginScreen.main(new String[]{});
        			  dispose();
        		  }
        		  if(e.getSource()==b2) {
        			String s = t.getText();
        			String P=String.valueOf(p.getPassword());
        		  if(s.equals("employee") && P.equals("employee123")) {
        			  EmployeeSuccess.main(new String[]{});
        			  dispose();  
        		  }
        		  else { 
        			  JOptionPane.showMessageDialog(null,"INCORRECT USERNAME OR PASSWORD");
        	         t.setText("");
        		     p.setText("");
        		  }
        		  }
        	          }
          }
	public static void main(String [] args) {
		EmployeeLogin E =new EmployeeLogin();
		E.setSize(500,500);
		E.setVisible(true);
		E.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	}
	