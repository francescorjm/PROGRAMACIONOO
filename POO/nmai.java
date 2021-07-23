package POO;



public class main{

        public static void main(string[]args){
            // TODO Auto-generated method stub
            DB db = DB.getInstance();
            Object[] obj={ "pedro", "pedro@gmail.com", "pedro"};
            db.dbPrepareStatement("insert into user(username, email, pass) values( ?, ?, ? )");
            db.dbStatement("SELECT * FROM user");
            db.dbClose
        }
}