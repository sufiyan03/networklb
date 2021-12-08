package com.maven;
import java.sql.*;
public class JDBC_Test {

	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sufyan","root","root");
			System.out.println(conn);
			Statement s=conn.createStatement();
			String qry="commit;";
			s.execute(qry);
			System.out.println("Id"+"\t\t"+"Name"+"\t\t"+"City");
			ResultSet rs=s.executeQuery("select * from Student");
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t\t"+
				rs.getString(2)+"\t\t"+rs.getString(3)+"\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
