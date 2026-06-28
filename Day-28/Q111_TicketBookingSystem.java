import java.util.Scanner;

class Q111_TicketBookingSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int totalSeats = 10;
        boolean[] seatBooked = new boolean[totalSeats];
        String[] passengerNames = new String[totalSeats];

        int choice = -1;

        while (choice != 4)
        {
            System.out.println("\n----- TICKET BOOKING SYSTEM -----");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display All Bookings");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1)
            {
                System.out.println("Enter Seat Number (1 to " + totalSeats + "): ");
                int seatNo = sc.nextInt();

                if (seatNo < 1 || seatNo > totalSeats)
                {
                    System.out.println("Invalid seat number.");
                }
                else if (seatBooked[seatNo - 1] == true)
                {
                    System.out.println("Seat already booked.");
                }
                else
                {
                    System.out.println("Enter Passenger Name: ");
                    String name = sc.next();

                    seatBooked[seatNo - 1] = true;
                    passengerNames[seatNo - 1] = name;
                    System.out.println("Ticket booked successfully.");
                }
            }
            else if (choice == 2)
            {
                System.out.println("Enter Seat Number to cancel: ");
                int seatNo = sc.nextInt();

                if (seatNo < 1 || seatNo > totalSeats)
                {
                    System.out.println("Invalid seat number.");
                }
                else if (seatBooked[seatNo - 1] == false)
                {
                    System.out.println("Seat is not booked.");
                }
                else
                {
                    seatBooked[seatNo - 1] = false;
                    passengerNames[seatNo - 1] = null;
                    System.out.println("Ticket cancelled successfully.");
                }
            }
            else if (choice == 3)
            {
                System.out.println("\n--- Booking Status ---");
                for (int i = 0; i < totalSeats; i++)
                {
                    if (seatBooked[i] == true)
                    {
                        System.out.println("Seat " + (i + 1) + " : Booked by " + passengerNames[i]);
                    }
                    else
                    {
                        System.out.println("Seat " + (i + 1) + " : Available");
                    }
                }
            }
            else if (choice == 4)
            {
                System.out.println("Exiting Ticket Booking System.");
            }
            else
            {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}