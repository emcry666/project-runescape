package com.rs.mysql;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.rs.cache.loaders.Configs;


public class DataSource {

	/**
	 * The data source instance.
	 */
	private Connection connection;

	//private final ComboPooledDataSource cpds;
	private static DataSource datasource;

	private DataSource() throws IOException, SQLException, PropertyVetoException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://" + Configs.HOST + "/" + Configs.DATABASE, Configs.USERNAME, Configs.PASSWORD);
			System.out.println("Successfully connected to the database.");
		} catch (Throwable t1) {
			System.out.println("Failed to connect to the database host: " + Configs.HOST + "");
			t1.printStackTrace();
		}
	}

	public static DataSource getInstance() throws IOException, SQLException, PropertyVetoException {
		if (datasource == null) {
			datasource = new DataSource();
			return datasource;
		} else {
			return datasource;
		}
	}

	/**
	 * Get the actual database connection.
	 * @return {@code connection}
	 */
	public Connection getConnection() {
			try {
				connection = DriverManager.getConnection("jdbc:mysql://" + Configs.HOST + "/" + Configs.DATABASE, Configs.USERNAME, Configs.PASSWORD);
				return connection;
			} catch (Throwable t) {
				t.printStackTrace();
				System.out.println("ERROR: Connection was unsuccessful, trying Again...");
				getConnection(); //tries again if connection was unsuccessful
			}
	    return connection;
	}
}