package models;
import Dao.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class AccountCreationPage1 extends JFrame{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JTextField name,surname,father,DOB,gender,email,address,city;
	JButton back,submit; 
	Random ran=new Random();
	int n=ran.nextInt(999999);
	int p=ran.nextInt(6574898);
	String CID=Integer.toString(n);
	String PASSWORD=Integer.toString(p);
	public AccountCreationPage1() {
		
		l1=new JLabel("Account Creation Page1  CID="+n);
		l2=new JLabel("Name");
		l3=new JLabel("Surname");
		l4=new JLabel("s/o");
		l5=new JLabel("Date Of Birth");
		l6=new JLabel("Gender");
		l7=new JLabel("Email Address");
		l8=new JLabel("Address");
		l9=new JLabel("City");
		
		name=new JTextField();
		surname=new JTextField();
		father=new JTextField();
		DOB=new JTextField();
		gender=new JTextField();
		email=new JTextField();
		address=new JTextField();
		city=new JTextField();
		
		back=new JButton ("BACK");
		submit=new JButton ("SUBMIT");
		setLayout(null);
		
		l1.setBounds(30,20,300,30);
	
		l2.setBounds(20,60,100,20);
		name.setBounds(130,60,100,20);
		l3.setBounds(20,90,100,20);
		surname.setBounds(130,90,100,20);
		l4.setBounds(20,120,100,20);
		father.setBounds(130,120,100,20);
		l5.setBounds(20,150,100,20);
		DOB.setBounds(130,150,100,20);
		l6.setBounds(20,180,100,20);
		gender.setBounds(130,180,100,20);
		l7.setBounds(20,210,100,20);
		email.setBounds(130,210,100,20);
		l8.setBounds(20,240,100,20);
		address.setBounds(130,240,100,20);
		l9.setBounds(20,270,100,20);
		city.setBounds(130,270,100,20);
		back.setBounds(20,300,120,30);
		submit.setBounds(150,300,120,30);

		
		submit.addActionListener(new myhandler());
		back.addActionListener(new myhandler());
		
		add(name); add(surname); add(father); add(DOB); 
		add(gender); add(email); add(address);add(city);
		add(l1); add(l2); add(l3); add(l4); add(l5); add(l6); add(l7); add(l8); add(l9); 
		add(back); add(submit);
	}
	class myhandler implements ActionListener{
        	  public void actionPerformed (ActionEvent e) {
        		  if(e.getSource()==back) {
        			  EmployeeSuccess.main(new String[]{});
        			  dispose();
        		  }
        		 if(e.getSource()==submit) {
        			 String a=name.getText();
        			 String b=surname.getText();
        			 String c=father.getText();
        			 String d=DOB.getText();
        			 String k=gender.getText();
        			 String f=email.getText();
        			 String g=address.getText();
        			 String h=city.getText();
        			
        		 	 try {
					int i=AccountCreationPage1Dao.save(CID,PASSWORD,a,b,c,d,k,f,g,h);
					} catch (Exception e1) {
						e1.getMessage();
					}
        		      	dispose();
        			  AccountCreationPage2.lain(CID,PASSWORD);
        			 
        		  }
        		  }
        	          }
	public static void main(String [] args) {
		AccountCreationPage1 E =new AccountCreationPage1();
		E.setSize(300,600);
		E.setVisible(true);
		E.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	}
	