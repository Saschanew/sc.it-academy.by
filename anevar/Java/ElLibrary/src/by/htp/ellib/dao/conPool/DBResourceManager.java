package by.htp.ellib.dao.conPool;

import java.util.ResourceBundle;

public class DBResourceManager {
	
	private final static DBResourceManager instance = new DBResourceManager();

	ResourceBundle jdbcProperties = ResourceBundle.getBundle("resources.db");

	public static DBResourceManager getInstance() {
		return instance;
	}
	
	public String getValue(String key) {
		return jdbcProperties.getString(key);
	}

}
