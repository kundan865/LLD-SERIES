package lecture5_6_SOLID_DESIGN.DIP.violated;

public class UserService {  // High-level module (Tightly coupled)
    private final MySQLDatabase sqlDb = new MySQLDatabase();
    private final MongoDBDatabase mongoDb = new MongoDBDatabase();

    public void storeUserToSQL(String user) {
        // MySQL-specific code
        sqlDb.saveToSQL(user);
    }

    public void storeUserToMongo(String user) {
        // MongoDB-specific code
        mongoDb.saveToMongo(user);
    }
}
