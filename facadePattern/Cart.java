package facadePattern;

class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void performService() {
        System.out.println();
        System.out.println("Luggage cart service requested for " + numberOfCarts + " cart(s)");
        System.out.println("Luggage cart/s arrived at the destination and ready to use.");
    }
}
