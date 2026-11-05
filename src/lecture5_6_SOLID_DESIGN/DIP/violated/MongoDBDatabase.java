package lecture5_6_SOLID_DESIGN.DIP.violated;

public class MongoDBDatabase {  // Low-level module
    public void saveToMongo(String data) {
        System.out.println(
                "Executing MongoDB Function: db.users.insert({name: '"
                        + data + "'})"
        );
    }
}
