import java.sql.Connection;
import java.sql.PreparedStatement;

public class AccountCreationPage2Dao {
	public static int save (String CID,String religion,String category,String income,String education,String occupation,String pan,String aadhaar) throws Exception {
		Connection con =DB.getConnection();
		String query="insert into PAGE2 values(?,?,?,?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1,CID);
		st.setString(2,religion);
		st.setString(3,category);
		st.setString(4,income);
		st.setString(5,education);
		st.setString(6,occupation);
		st.setString(7,pan);
		st.setString(8,aadhaar);
		int count = st.executeUpdate();
		con.close();
		return count;
	}

}
