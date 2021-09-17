package com.m2i.tpjson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

public class MainJDBC {

	public static void main(String[] args) {
		TodoDAO dao;
		try {
			Properties props = new Properties();
			props.load(new FileReader("jdbc.properties"));
			dao = new TodoDAO(props.getProperty("url"), props.getProperty("user"), props.getProperty("password"));
			List<Todo> l = dao.findAll();

			l.forEach(System.out::println);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main_JDBC(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn = null;

			conn = DriverManager.getConnection("jdbc:mysql://mysql-formation.mysql.database.azure.com/user09",
					"user09@mysql-formation", "12345");
			Statement st = conn.createStatement();

			// st.execute("INSERT INTO user09(user_id,title,completed) VALUES(1,'le
			// titre',1)");
			ResultSet rs = st.executeQuery("SELECT * FROM todos");

			rs.next();
			System.out.println(rs.getString("title"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
