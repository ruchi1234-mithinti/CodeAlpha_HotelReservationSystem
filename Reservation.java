public class Reservation {

    public void bookRoom(Room room) {

        if (room.isBooked()) {

            System.out.println("\nRoom already booked.");
            return;
        }

        room.bookRoom();

        System.out.println("\nPayment Successful.");
        System.out.println("Room booked successfully.");
    }

    public void cancelReservation(Room room) {

        if (!room.isBooked()) {

            System.out.println("\nRoom is not booked.");
            return;
        }

        room.cancelBooking();

        System.out.println("\nReservation cancelled successfully.");
    }
}