package facadePattern;

class FrontDesk {
    public void valetParking(String plateNumber) {
        HotelService valetService = new Valet(plateNumber);
        valetService.performService();
    }

    public void houseKeeping(int roomNumber) {
        HotelService houseKeepingService = new HouseKeeping(roomNumber);
        houseKeepingService.performService();
    }

    public void requestCart(int numberOfCarts) {
        HotelService cartService = new Cart(numberOfCarts);
        cartService.performService();
    }
}