package lecture5_6_SOLID_DESIGN.DIP.follwed;

// High-level module (Now loosely coupled via Dependency Injection)
public class UserService {
    private final Database db;

    public UserService(Database database) {
        this.db = database;
    }

    public void storeUser(String user) {
        db.save(user);
    }
}
