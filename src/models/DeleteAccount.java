package models;
import Dao.*;

import javax.swing.*;
import java.awt.event.*;

public class DeleteAccount extends JFrame {
	JLabel l;
	JTextField t;
	JButton back,delete;
	
	public DeleteAccount() throws Exception {
		l=new JLabel("ENTER CUSTOMERID OF CUSTOMER TO DELETE ACCOUNT");
		t=new JTextField();
		back=new JButton("Back");
		delete=new JButton("Delete");
		
		setLayout(null);
		l.setBounds(25,30,350,30);
		t.setBounds(70,70,250,20);
		back.setBounds(50,100,100,30);
		delete.setBounds(240,100,100,30);
		
		back.addActionListener(new myhandler());
		delete.addActionListener(new myhandler());
		
		add(l);add(t);add(back);add(delete);
	}
	
	
	class myhandler implements ActionListener{
		public  void actionPerformed(ActionEvent e) {
			if(e.getSource()==back) {
				EmployeeSuccess.main(new String[]{});
				dispose();
			}
			if(e.getSource()==delete) {
				 String CUSTOMERID = t.getText();
				try {
					DeleteAccountDao.delete(CUSTOMERID);
       			 JOptionPane.showMessageDialog(null,"ACCOUNT DELETED SUCCESSFULLY");
    			 EmployeeSuccess.main(new String[]{});

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
			
			
		}
	}
	
	public static void main(String [] args) throws Exception { 
	    DeleteAccount E = new DeleteAccount();
	    E.setSize(390,200);
	    E.setVisible(true);
	    E.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}