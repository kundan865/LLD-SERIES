package lecture5_6_SOLID_DESIGN.DIP.follwed;

public class DIPFollowed {
    public static void main(String[] args) {
        MySQLDatabase mysql = new MySQLDatabase();
        MongoDBDatabase mongodb = new MongoDBDatabase();

        UserService service1 = new UserService(mysql);
        service1.storeUser("Aditya");

        UserService service2 = new UserService(mongodb);
        service2.storeUser("Rohit");
    }
}
