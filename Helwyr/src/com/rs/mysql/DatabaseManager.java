package com.rs.mysql;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.rs.Settings;

public class DatabaseManager {

	private boolean connected;

	public DatabaseManager() {

	}

	public void connect() {
			try {
				DataSource.getInstance();
			} catch (IOException | SQLException | PropertyVetoException e) {
				e.printStackTrace();
			}
	}

	public boolean connected() {
		return connected;
	}

	public Connection getConnection() {
		try {
			return DataSource.getInstance().getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
