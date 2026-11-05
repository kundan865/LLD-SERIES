package lecture5_6_SOLID_DESIGN.DIP.violated;

public class MySQLDatabase {  // Low-level module
    public void saveToSQL(String data) {
        System.out.println(
                "Executing SQL Query: INSERT INTO users VALUES('"
                        + data + "');"
        );
    }
}
