import java.sql.Connection;
//import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;


public class MysqlModule extends Module {
	
	private MysqlDataSource dataSource; 
	private Connection connection;
	private boolean isOpen;
	
	@Override
	public String getName() {
		return "mysql";
	}
	
	void open() throws SQLException {
		isOpen = true;
		
		dataSource = new MysqlDataSource();
		
		dataSource.setUser("scott");
		dataSource.setPassword("tiger");
		dataSource.setServerName("mysql.server.com");
		
		connection = dataSource.getConnection();
	}

//	@Override
//	public void evaluate(Statement statement) {
//		try { 
//			if (!isOpen)
//				open();
//			
//			// TODO : evaluate stuff
//			
//			// test code follows
//			java.sql.Statement stmt = connection.createStatement();
//			ResultSet rs = stmt.executeQuery("SELECT * FROM Table");
//			
//			rs.close();
//			stmt.close();
//			
//		} catch (SQLException ex) {
//			ex.printStackTrace();
//		}
//	}
	
	@Override
	public void close() {
		if (!isOpen) return;
		
		try {
			connection.close();
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void set(String name, int value) {
	}

	@Override
	public void set(String name, String value) {
	}

	@Override
	public void set(String name, ValueCollection value) {
	}

	@Override
	public void set(String name, int[] values) {
	}

	@Override
	public void set(String name, String[] values) {
	}

	@Override
	public void execute(String operation) {
	}
}
