package facadePattern;

class HouseKeeping implements HotelService {
    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void performService() {
        System.out.println();
        System.out.println("Housekeeping service for room number: " + roomNumber);
        System.out.println("Housekeeping is on the way, please wait patiently.");
        System.out.println("Thank you!");
    }
}

