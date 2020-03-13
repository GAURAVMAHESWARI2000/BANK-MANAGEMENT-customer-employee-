package models;
import DATABASE.*;
import java.awt.event.*;
import Dao.*;
import javax.swing.*;

public class UpdateAddress extends JFrame{
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b1,b2; 
	public UpdateAddress() {
		l1=new JLabel("UPDATE ADDRESS");
		l2=new JLabel("ENTER CUSTOMERID WHOSE DATA TO BE UPDATED");
		l3=new JLabel("ENTER NEW ADDRESS");

		t1=new JTextField();
		t2=new JTextField();
		b1=new JButton ("BACK");
		b2=new JButton ("SUBMIT");
		setLayout(null);
		
		l1.setBounds(100,20,300,40);
		l2.setBounds(20,60,160,20);
		l3.setBounds(20,100,160,20);
		t1.setBounds(190,60,100,20);
		t2.setBounds(190,100,100,20);
		b1.setBounds(30,130,100,20);
		b2.setBounds(140,130,100,20);
		  b1.addActionListener(new myhandler());
		  b2.addActionListener(new myhandler());
		add(l1); add(l2);  add(l3); add(t1); add(t2); add(b1); add(b2); 
	}
  	class myhandler implements ActionListener{
        	  public void actionPerformed (ActionEvent e) {
        		  if(e.getSource()==b1) {
        			  UpdateInformation.main(new String[]{});
        			  dispose();
        		  }
        		  if(e.getSource()==b2) {
        			  String value=t2.getText();
        			  String CID=t1.getText();
        			  try {
						UpdateInformationDao.updateAddress(value,CID);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
        			  JOptionPane.showMessageDialog(null,"ADDRESS UPDATED SUCCESSFULLY");
          			 EmployeeSuccess.main(new String[]{});
        			  dispose();
        		  }
        	          }
          }
	public static void main(String [] args) {
		UpdateAddress E =new UpdateAddress();
		E.setSize(400,200);
		E.setVisible(true);
		E.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	}
	
	