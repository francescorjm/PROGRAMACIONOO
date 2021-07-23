package POO;

import java.sql.Connection;

public class DB {
	
	private static DB DB = new DB();
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String driverDB = "org.postgresql.Driver";
	private String dbName = "Register";
	private String urlDB = "jdbc:postgresql://localhost:5432/" + this.dbName;
	private String userDB = "postgres";
	private String passDB = "admin";
	
	private DB(){
		try {
			Class.forName(driverDB);
			this.conn = DriverManager.getConnection(urlDB, userDB, passDB);
			System.out.println("Conexión establecida");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public static DB getInstance() {
		return DB;
	}

		public ResultSet dbStatement(String query) {
			try {
				this.stmt = this.conn.createStatement();
				this.rs = this.stmt.executeQuery(query);
				while(rs.next()) {
					System.out.println(rs.getString(&quot;username&quot;));}

			} catch (SQLException e) {

			}finally {
				try {
				this.stmt.close();
				this.rs.close();
				} catch (SQLException e) {
						e.printStackTrace();
				}
		}
		return rs;
	}

		public void dbPrepareStatement(String query, Object[] obj) {
			try {
					this.pstmt = this.conn.prepareStatement(query);

					this.pstmt.setString(1, (String) obj[0]);
					this.pstmt.setString(2, (String) obj[1]);
					this.pstmt.setString(3, (String) obj[2]);
					this.pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

						try {
						this.pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
		}
		}

		public void dbClose() {
			try {
				this.conn.close();
				System.out.println(Conexion cerrada;);
			} catch (SQLException e) {
					e.printStackTrasce();
			}
			}

		}