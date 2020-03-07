import java.sql.*;

public class DeleteAccountDao {
	public static int delete(String CUSTOMERID) throws Exception{
		Connection con = DB.getConnection();
		PreparedStatement st ;
		st = con.prepareStatement("delete from PAGE1 where CUSTOMERID=?");
		st.setString(1,CUSTOMERID);
		int i=st.executeUpdate();
		st = con.prepareStatement("delete from PAGE2 where CUSTOMERID=?");
		st.setString(1,CUSTOMERID);
		i=st.executeUpdate();
		st = con.prepareStatement("delete from PAGE3 where CUSTOMERID=?");
		st.setString(1,CUSTOMERID);
		i=st.executeUpdate();

		return i;
	}
	
	public static int checkAccount(String name) throws Exception{
		Connection con = DB.getConnection();
		PreparedStatement st = con.prepareStatement("delete from Page1 where name=?");
		st.setString(1,name);
		int i=st.executeUpdate();
		return i;
	}


}
