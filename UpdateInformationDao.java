import java.sql.*;

public class UpdateInformationDao {
	public static int updateName(String value,String CID)throws Exception{
		Connection con = DB.getConnection();
		PreparedStatement st = con.prepareStatement("update PAGE1 set NAME=? where CUSTOMERID=?"); 
		st.setString(1,value);
		st.setString(2,CID);
		int i=st.executeUpdate();
		return i;
	}
	
	public static int updateSurname(String value,String CID) throws Exception{
		Connection con = DB.getConnection();
		PreparedStatement st = con.prepareStatement("update PAGE1 set SURNAME=? where CUSTOMERID=?"); 
		st.setString(1,value);
		st.setString(2,CID);
		int i=st.executeUpdate();
		return i;
	}
	
	public static int updateFatherName(String value,String CID) throws Exception{
		Connection con = DB.getConnection();
		PreparedStatement st = con.prepareStatement("update PAGE1 set FATHERNAME=? where CUSTOMERID=?"); 
		st.setString(1,value);
		st.setString(2,CID);
		int i=st.executeUpdate();
		return i;
	}
	
	public static int updateDOB(String value,String CID) throws Exception{
		Connection con = DB.getConnection();
		PreparedStatement st = con.prepareStatement("update PAGE1 set DOB=? where CUSTOMERID=?"); 
		st.setString(1,value);
		st.setString(2,CID);
		int i=st.executeUpdate();
		return i;
	}
	
	public static int updateGender(String value,String CID) throws Exception{
		Connection con = DB.getConnection();
		PreparedStatement st = con.prepareStatement("update PAGE1 set GENDER=? where CUSTOMERID=?"); 
		st.setString(1,value);
		st.setString(2,CID);
		int i=st.executeUpdate();
		return i;
	}
	
	public static int updateEmail(String value,String CID) throws Exception{
		Connection con = DB.getConnection();
		PreparedStatement st = con.prepareStatement("update PAGE1 set EMAIL=? where CUSTOMERID=?"); 
		st.setString(1,value);
		st.setString(2,CID);
		int i=st.executeUpdate();
		return i;
	}
	
	public static int updateAddress(String value,String CID) throws Exception{
		Connection con = DB.getConnection();
		PreparedStatement st = con.prepareStatement("update PAGE1 set ADDRESS=? where CUSTOMERID=?"); 
		st.setString(1,value);
		st.setString(2,CID);
		int i=st.executeUpdate();
		return i;
	}
	
	public static int updateCity(String value,String CID) throws Exception{
		Connection con = DB.getConnection();
		PreparedStatement st = con.prepareStatement("update PAGE1 set CITY=? where CUSTOMERID=?"); 
		st.setString(1,value);
		st.setString(2,CID);
		int i=st.executeUpdate();
		return i;
	}	
}
		
	

