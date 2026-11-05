package lecture5_6_SOLID_DESIGN.DIP.follwed;

// MongoDB implementation (Low-level module)
public class MongoDBDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println(
                "Executing MongoDB Function: db.users.insert({name: '"
                        + data + "'})"
        );
    }
}
