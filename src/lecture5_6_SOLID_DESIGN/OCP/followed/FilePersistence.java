package lecture5_6_SOLID_DESIGN.OCP.followed;


class FilePersistence implements Persistence {
    @Override
    public void save(ShoppingCart cart) {
        System.out.println("Saving shopping cart to a file...");
    }
}
