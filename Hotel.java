import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms = new ArrayList<>();

    public Hotel() {

        rooms.add(new Room(101, "Standard", 2000));
        rooms.add(new Room(102, "Standard", 2000));
        rooms.add(new Room(201, "Deluxe", 3500));
        rooms.add(new Room(202, "Deluxe", 3500));
        rooms.add(new Room(301, "Suite", 5000));
    }

    public void showAvailableRooms() {

        System.out.println("\n----- Available Rooms -----");

        for (Room room : rooms) {

            if (!room.isBooked()) {
                System.out.println(room);
            }
        }
    }

    public Room findRoom(int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }

        return null;
    }
}