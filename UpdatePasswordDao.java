import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdatePasswordDao {
	public static int updatePassword(int CID,String pass)throws Exception{
		Connection con = DB.getConnection();
		PreparedStatement st = con.prepareStatement("update PAGE1 set PASSWORD=? where CUSTOMERID=?"); 
		st.setString(1,pass);
		st.setInt(2,CID);
		int i=st.executeUpdate();
		return i;
	}
}