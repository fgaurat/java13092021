package com.m2i.tpjson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class MainJDBC {

	public static void main(String[] args) {
		TodoDAO dao;
		try {
			dao = new TodoDAO();
			List<Todo> l = dao.findAll();

			l.forEach(System.out::println);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main_JDBC(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn = null;

			conn = DriverManager.getConnection("jdbc:mariadb://5.196.102.146/user01", "user01", "12345");
			Statement st = conn.createStatement();

			// st.execute("INSERT INTO user09(user_id,title,completed) VALUES(1,'le
			// titre',1)");
			ResultSet rs = st.executeQuery("SELECT * FROM user09");

			rs.next();
			System.out.println(rs.getString("title"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
