import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel hotel = new Hotel();

        Reservation reservation = new Reservation();

        int choice;

        do {

            System.out.println("\n===== Hotel Reservation System =====");

            System.out.println("1. View Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    hotel.showAvailableRooms();
                    break;

                case 2:

                    try {

                        hotel.showAvailableRooms();

                        System.out.print("\nEnter room number to book: ");
                        int roomNumber = sc.nextInt();

                        Room room = hotel.findRoom(roomNumber);

                        if (room == null) {

                            System.out.println("\nInvalid room number.");
                            break;
                        }

                        reservation.bookRoom(room);

                    } catch (Exception e) {

                        System.out.println("\nInvalid input.");
                        sc.nextLine();
                    }

                    break;

                case 3:

                    try {

                        System.out.print("\nEnter room number to cancel: ");
                        int roomNumber = sc.nextInt();

                        Room room = hotel.findRoom(roomNumber);

                        if (room == null) {

                            System.out.println("\nInvalid room number.");
                            break;
                        }

                        reservation.cancelReservation(room);

                    } catch (Exception e) {

                        System.out.println("\nInvalid input.");
                        sc.nextLine();
                    }

                    break;

                case 4:

                    System.out.println("\nProgram closed.");
                    break;

                default:

                    System.out.println("\nInvalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}