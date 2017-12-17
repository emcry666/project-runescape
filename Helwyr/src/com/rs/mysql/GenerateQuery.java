package com.rs.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.rs.Settings;
import com.rs.cache.loaders.Configs;

public abstract class GenerateQuery {
	
	private Connection con = null;
	
	private PreparedStatement ps = null;
	
	public StringBuilder sb = new StringBuilder();
	
	
	public void write() {
		try {
			con = DriverManager.getConnection(Settings.SQL_URL, Configs.USERNAME, Configs.PASSWORD);
			ps = con.prepareStatement(queryStatement());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null)
					con.close();
					con = null;
				if(ps != null)
					ps.close();
					ps = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public String queryStatement() {
		return sb.toString();
	}

}
