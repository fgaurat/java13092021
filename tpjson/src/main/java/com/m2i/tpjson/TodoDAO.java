package com.m2i.tpjson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TodoDAO {
	private Connection conn;

	TodoDAO() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mariadb://5.196.102.146/user01", "user01", "12345");
	}

	/*
	 * public Todo findById(int id) {
	 * 
	 * }
	 * 
	 * public List<Todo> findByAll() {
	 * 
	 * }
	 */
	public void save(Todo todo) throws SQLException {
		Statement st = conn.createStatement();
		int user_id = todo.getUserId();
		String title = todo.getTitle();
		Boolean completed = todo.getCompleted();
		st.execute("INSERT INTO user09(user_id,title,completed) VALUES(" + user_id + ",'" + title + "'," + completed
				+ ")");
	}
	/*
	 * public void delete(Todo todo) {
	 * 
	 * }
	 */
}
