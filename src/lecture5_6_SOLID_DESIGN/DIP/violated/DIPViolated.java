package lecture5_6_SOLID_DESIGN.DIP.violated;

public class DIPViolated {
    public static void main(String[] args) {
        UserService service = new UserService();
        service.storeUserToSQL("Aditya");
        service.storeUserToMongo("Rohit");
    }
}