package models;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Dao.*;

public class CustomerLogin extends JFrame{
	JLabel l1,l2,l3;
	JTextField t,p;
	JButton b1,b2; 
	public CustomerLogin() {
		l1=new JLabel("LOGIN AS CUSTOMER");
		l2=new JLabel("CUSTOMERID");
		l3=new JLabel("PASSWORD");
		t=new JTextField();
		p=new JTextField();
		b1=new JButton ("BACK");
		b2=new JButton ("LOG IN");
		setLayout(null);
		
		l1.setBounds(100,40,300,40);          l1.setFont(new Font("ROCKWELL",Font.BOLD,25));l1.setForeground(Color.BLUE);
		l2.setBounds(60,160,300,30);          l2.setFont(new Font("TAHOMA",Font.CENTER_BASELINE,18));
		l3.setBounds(60,200,300,30);          l3.setFont(new Font("Sherif",Font.BOLD,18));
		t.setBounds(210,160,200,30);
		p.setBounds(210,200,200,30);
		b1.setBounds(30,300,200,50);          b1.setBackground(Color.blue);b1.setForeground(Color.white); b1.setFont(new Font("Sherif",Font.BOLD,25));
		b2.setBounds(250,300,200,50);         b2.setBackground(Color.blue);b2.setForeground(Color.white); b2.setFont(new Font("Sherif",Font.BOLD,25));
		b1.addActionListener(new myhandler());
		b2.addActionListener(new myhandler());
		add(l1); add(l2); add(l3); add(t); add(p); add(b1); add(b2); 
	}
	class myhandler implements ActionListener{
        	  public void actionPerformed (ActionEvent e){
        		  if(e.getSource()==b1) {
        			  LoginScreen.main(new String[]{});
        			  dispose();
        		  }
        		  if(e.getSource()==b2) {
        			  int CID=Integer.parseInt(t.getText());
        			  String pass=p.getText();
        			  try {
						CustomerLoginDao.login(CID,pass);
						dispose();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
        			  
        		  }
              }
          }
	public static void main(String [] args) {
		CustomerLogin E =new CustomerLogin();
		E.setSize(500,500);
		E.setVisible(true);
		E.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	}
	