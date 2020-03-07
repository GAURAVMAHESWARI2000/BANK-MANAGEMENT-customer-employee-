import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateAccountDao {
	public static int save (int CID) throws Exception {
		Connection con =DB.getConnection();
		String query="insert into PAGE3 values(?,0,0)";
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1,CID);
		int count = st.executeUpdate();
		con.close();
		return count;
	}

}
