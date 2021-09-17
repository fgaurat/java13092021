package com.m2i.tpjson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TodoDAO {
	private Connection conn;

	TodoDAO(String url, String user, String password) throws SQLException {
		conn = DriverManager.getConnection(url, user, password);
	}

	/*
	 * public Todo findById(int id) {
	 * 
	 * }
	 */
	public List<Todo> findAll() throws SQLException {
		List<Todo> l = new ArrayList<Todo>();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM user09");
		while (rs.next()) {
			int id = rs.getInt("id");
			int user_id = rs.getInt("user_id");
			String title = rs.getString("title");
			Boolean completed = rs.getBoolean("completed");
			Todo t = new Todo(user_id, id, title, completed);
			l.add(t);

		}

		return l;
	}

	public void save(Todo todo) throws SQLException {
		Statement st = conn.createStatement();
		int user_id = todo.getUserId();
		String title = todo.getTitle();
		Boolean completed = todo.getCompleted();
		st.execute(
				"INSERT INTO todos(user_id,title,completed) VALUES(" + user_id + ",'" + title + "'," + completed + ")");
	}
	/*
	 * public void delete(Todo todo) {
	 * 
	 * }
	 */
}
