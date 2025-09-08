package Com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.internal.compiler.ast.WhileStatement;

public class DatabaseLogics {

	public static void addrecoard(String stdName, String stdAddress, String stdMarks) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = ConnectionFactory.myconnection();
			PreparedStatement pd = con.prepareStatement("INSERT INTO std_data (name, address, marks) VALUES (?, ?, ?)");

			pd.setString(1, stdName);
			pd.setString(2, stdAddress);
			pd.setString(3, stdMarks);

			int rs = pd.executeUpdate();
			System.out.println(rs);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void updaterecoard(String stdName, String stdAddress, String stdMarks, int id) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = ConnectionFactory.myconnection();

			PreparedStatement fetchStmt = con.prepareStatement("SELECT name, address, marks FROM std_data WHERE id=?");
			fetchStmt.setInt(1, id);
			ResultSet rs = fetchStmt.executeQuery();

			String currentName = null, currentAddress = null, currentMarks = null;
			if (rs.next()) {
				currentName = rs.getString("name");
				currentAddress = rs.getString("address");
				currentMarks = rs.getString("marks");
			}

			
			stdName = (stdName == null || stdName.trim().isEmpty()) ? currentName : stdName;
			stdAddress = (stdAddress == null || stdAddress.trim().isEmpty()) ? currentAddress : stdAddress;
			stdMarks = (stdMarks == null || stdMarks.trim().isEmpty()) ? currentMarks : stdMarks;

			PreparedStatement pd = con.prepareStatement("update std_data set name=?,address=?,marks=? where id=?");

			pd.setString(1, stdName);
			pd.setString(2, stdAddress);
			pd.setString(3, stdMarks);
			pd.setInt(4, id);

			int rs1 = pd.executeUpdate();
			System.out.println(rs1);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static student selectdata(int id) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = ConnectionFactory.myconnection();
			PreparedStatement pd = con.prepareStatement("select * from std_data where id = ?");

			pd.setInt(1, id);

			ResultSet rs = pd.executeQuery();
			rs.next();

			student std = new student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));

			return std;

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	public static int deletedata(int id) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = ConnectionFactory.myconnection();
			PreparedStatement pd = con.prepareStatement("DELETE FROM student.std_data WHERE id = ?");

			pd.setInt(1, id);

			int rs = pd.executeUpdate();

			return rs;

		} catch (Exception e) {
			System.out.println(e);
		}
		return id;
		
	}

	public static List<student> selectAlldata() {
		try {
			List<student> list = new ArrayList<student>();

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = ConnectionFactory.myconnection();
			PreparedStatement pd = con.prepareStatement("select * from std_data");

			ResultSet rs = pd.executeQuery();

			while (rs.next()) {
				student std = new student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				list.add( std);

				
			}
			return list;

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
