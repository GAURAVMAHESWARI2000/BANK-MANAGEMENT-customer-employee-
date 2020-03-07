import java.sql.*;

public class AccountCreationPage1Dao {
	public static int save (String CID,String password,String name,String surname,String father,String DOB,String gender,String email,String address,String city) throws Exception {
		Connection con =DB.getConnection();
		String query="insert into PAGE1 values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1,CID);
		st.setString(2,password);
		st.setString(3,name);
		st.setString(4,surname);
		st.setString(5,father);
		st.setString(6,DOB);
		st.setString(7,gender);
		st.setString(8,email);
		st.setString(9,address);
		st.setString(10,city);
		int count = st.executeUpdate();
		con.close();
		return count;
	}

}
