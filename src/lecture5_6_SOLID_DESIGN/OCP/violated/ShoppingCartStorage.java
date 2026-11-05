package lecture5_6_SOLID_DESIGN.OCP.violated;

class ShoppingCartStorage {
    private ShoppingCart cart;

    ShoppingCartStorage(ShoppingCart cart) {
        this.cart = cart;
    }

    void saveToSQLDatabase() {
        System.out.println("Saving shopping cart to SQL DB...");
    }

    void saveToMongoDatabase() {
        System.out.println("Saving shopping cart to Mongo DB...");
    }

    void saveToFile() {
        System.out.println("Saving shopping cart to File...");
    }
}
