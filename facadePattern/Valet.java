package facadePattern;

class Valet implements HotelService {
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void performService() {
        System.out.println();
        System.out.println("Valet parking service for vehicle with plate number: " + plateNumber);
        System.out.println("Valet Parking Done!");
    }
}