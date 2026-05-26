public class Room {

    private int roomNumber;
    private String category;
    private double price;
    private boolean isBooked;

    public Room(int roomNumber, String category, double price) {

        this.roomNumber = roomNumber;
        this.category = category;
        this.price = price;
        this.isBooked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookRoom() {
        isBooked = true;
    }

    public void cancelBooking() {
        isBooked = false;
    }

    @Override
    public String toString() {

        return "Room " + roomNumber +
                " | " + category +
                " | ₹" + price +
                " | " + (isBooked ? "Booked" : "Available");
    }
}