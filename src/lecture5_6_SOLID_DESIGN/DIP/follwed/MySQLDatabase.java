package lecture5_6_SOLID_DESIGN.DIP.follwed;

public class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println(
                "Executing SQL Query: INSERT INTO users VALUES('"
                        + data + "');"
        );
    }
}
