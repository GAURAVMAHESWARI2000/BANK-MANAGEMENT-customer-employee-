package models;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EmployeeSuccess extends JFrame{
	JLabel j;
	JButton b1,b2,b3,b4; 
	public EmployeeSuccess() {
		j=new JLabel("CHOOSE FROM  OPTION:");
		b1=new JButton ("CREATE NEW ACCOUNT");
		b2=new JButton ("DELETE AN ACCOUNT");
		b3=new JButton ("UPDATE EXISTING ACCOUNT");
		b4=new JButton ("LOGOUT");
		setLayout(null);
		
		j.setBounds(130,30,300,30);             j.setFont(new Font("ROCKWELL",Font.BOLD,18));j.setForeground(Color.black);
		b1.setBounds(50,80,400,30);             b1.setBackground(Color.blue);b1.setForeground(Color.white); b1.setFont(new Font("Sherif",Font.BOLD,22));
		b2.setBounds(50,130,400,30);            b2.setBackground(Color.blue);b2.setForeground(Color.white); b2.setFont(new Font("Sherif",Font.BOLD,22));
		b3.setBounds(50,180,400,30);            b3.setBackground(Color.blue);b3.setForeground(Color.white); b3.setFont(new Font("Sherif",Font.BOLD,22));
		b4.setBounds(50,230,400,30);            b4.setBackground(Color.blue);b4.setForeground(Color.white); b4.setFont(new Font("Sherif",Font.BOLD,22));
		b1.addActionListener(new myhandler());
		b2.addActionListener(new myhandler());
	    b3.addActionListener(new myhandler());    
		b4.addActionListener(new myhandler());    
		add(b1); add(b2); add(b3); add(b4); add(j);
	}
	class myhandler implements ActionListener{
        	  public void actionPerformed (ActionEvent e) {
        		    if(e.getSource()==b1) {
        			  AccountCreationPage1.main(new String[]{});
        			  dispose();
        		  }
        		    if(e.getSource()==b2) {
        			 try {
						DeleteAccount.main(new String[]{});
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
        			  dispose();
        		  }
        		      if(e.getSource()==b3) {
        			    UpdateInformation.main(new String[]{});
        			    dispose();   
        		    }   
        		      if(e.getSource()==b4) {
        			  LoginScreen.main(new String[]{});
        			  dispose();
        		  }
        		   
          }
          }
	public static void main(String [] args) {
		EmployeeSuccess ES =new EmployeeSuccess();
		ES.setSize(500,500);
		ES.setVisible(true);
		ES.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	}
	