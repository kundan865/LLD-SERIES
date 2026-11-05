package lecture5_6_SOLID_DESIGN.OCP.followed;

class MongoPersistence implements Persistence {
    @Override
    public void save(ShoppingCart cart) {
        System.out.println("Saving shopping cart to MongoDB...");
    }
}
