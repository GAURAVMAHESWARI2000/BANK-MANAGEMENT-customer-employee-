import java.awt.event.*;
import javax.swing.*;

public class AccountCreationPage2 extends JFrame{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField religion,category,income,education,occupation,pan,aadhaar;
	JButton back,submit; 
	String CID;
	String PASSWORD;
	public AccountCreationPage2(String N,String password) {
		CID=N;
		PASSWORD=password;
		l1=new JLabel("Account Creation Page2 CID="+CID);
		l2=new JLabel("Religion");
		l3=new JLabel("Category");
		l4=new JLabel("Income");
		l5=new JLabel("Educational Qualification");
		l6=new JLabel("Occupation");
		l7=new JLabel("PAN Number");
		l8=new JLabel("AADHAAR Number");
		
		
		religion=new JTextField();
		category=new JTextField();
		income=new JTextField();
		education=new JTextField();
		occupation=new JTextField();
		pan=new JTextField();
		aadhaar=new JTextField();                             
		
		back=new JButton ("BACK");
		submit=new JButton ("SUBMIT");
		setLayout(null);
		 
		l1.setBounds(30,20,300,30);                              
		l2.setBounds(20,60,100,20);
		religion.setBounds(130,60,100,20);
		l3.setBounds(20,90,100,20);
		category.setBounds(130,90,100,20);
		l4.setBounds(20,120,100,20);
		income.setBounds(130,120,100,20);
		l5.setBounds(20,150,100,20);
		education.setBounds(130,150,100,20);
		l6.setBounds(20,180,100,20);
		occupation.setBounds(130,180,100,20);
		l7.setBounds(20,210,100,20);
		pan.setBounds(130,210,100,20);
		l8.setBounds(20,240,100,20);
		aadhaar.setBounds(130,240,100,20);
		
		back.setBounds(20,300,120,30);
		submit.setBounds(150,300,120,30);

		
		submit.addActionListener(new myhandler());
		back.addActionListener(new myhandler());
		
		add(religion); add(category); add(income); add(education); 
		add(occupation); add(pan); add(aadhaar);
		add(l1); add(l2); add(l3); add(l4); add(l5); add(l6); add(l7); add(l8); 
		add(back); add(submit);
	}
	class myhandler implements ActionListener{
        	  public void actionPerformed (ActionEvent e) {
        		  if(e.getSource()==back) {
        			  AccountCreationPage1.main(new String[]{});
        			  dispose();
        		  }
        		 if(e.getSource()==submit) {
        			 String a=religion.getText();
        			 String b=category.getText();
        			 String c=income.getText();
        			 String d=education.getText();
        			 String k=occupation.getText();
        			 String f=pan.getText();
        			 String g=aadhaar.getText();
        			 try {
						int i=AccountCreationPage2Dao.save(CID,a,b,c,d,k,f,g);
						int n=Integer.parseInt(CID);
						 CreateAccountDao.save(n);
						 
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
        			 JOptionPane.showMessageDialog(null,"ACCOUNT CREATED SUCCESSFULLY");
        			 JOptionPane.showMessageDialog(null,"CUSTOMERID:"+CID+" & PASSWORD:"+PASSWORD);
        			 EmployeeSuccess.main(new String[]{});
        			 dispose();
        		  }
        	          }
	}
	public static void lain(String N,String password) {
		AccountCreationPage2 E =new AccountCreationPage2(N,password);
		E.setSize(300,600);
		E.setVisible(true);
		E.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	}
	
