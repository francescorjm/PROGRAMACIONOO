package POO;



public class main {
	
		public static void main(String[] args) {
			//	TODO Auto-generated method stub
			DB db = DB.getInstance();
			Object[] obj = { "pedro", "pedro@gmail.com", "pedro"};
			db.dbPrepareStatement("insert into user(username, email, pass) values( ?, ?, ? )", obj);
			db.dbStatement("SELECT *FROM users");
			db.dbClose();
		}	
			
}