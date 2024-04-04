import java.util.Scanner;

public class ELYASTIHW2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SLL<Passenger> passengerList = new SLL<>();

        while (true) {
            // Displaying the menu options
            System.out.println("\nAirline Ticket Reservation System");
            System.out.println("1. Reserve a Ticket");
            System.out.println("2. Cancel a Reservation");
            System.out.println("3. Check Reservation");
            System.out.println("4. Display Passengers");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Reserve a ticket by taking passenger name as input
                    System.out.print("Enter passenger name to reserve a ticket: ");
                    String reserveName = scanner.nextLine().trim();
                    reserveTicket(passengerList, reserveName);
                    break;
                case 2:
                    // Cancel a reservation by taking passenger name as input
                    System.out.print("Enter passenger name to cancel reservation: ");
                    String cancelName = scanner.nextLine().trim();
                    cancelReservation(passengerList, cancelName);
                    break;
                case 3:
                    // Check reservation by taking passenger name as input
                    System.out.print("Enter passenger name to check reservation: ");
                    String checkName = scanner.nextLine().trim();
                    checkReservation(passengerList, checkName);
                    break;
                case 4:
                    // Display the list of passengers
                    System.out.println("Passengers:");
                    passengerList.print();
                    break;
                case 5:
                    // Exit the program
                    System.out.println("Exiting the program. Thank you!");
                    System.exit(0);
                default:
                    // Invalid choice handling
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void reserveTicket(SLL<Passenger> list, String name) {
        // Insert the passenger in alphabetical order
        insertInAlphabeticalOrder(list, new Passenger(name));
        System.out.println("Ticket reserved for " + name);
    }

    private static void cancelReservation(SLL<Passenger> list, String name) {
        if (list.head != null) {
            SLLNode<Passenger> current = list.head;
            SLLNode<Passenger> previous = null;

            while (current != null && !current.info.getName().equalsIgnoreCase(name)) {
                // Search for the passenger to cancel reservation
                previous = current;
                current = current.next;
            }

            if (current != null) {
                // Found the passenger, cancel the reservation
                if (previous == null) {
                    list.head = current.next;
                    if (list.head == null) {
                        list.tail = null;
                    }
                } else {
                    previous.next = current.next;
                    if (current.next == null) {
                        list.tail = previous;
                    }
                }
                System.out.println("Reservation canceled for " + name);
            } else {
                // No reservation found for the given name
                System.out.println("No reservation found for " + name);
            }
        } else {
            // No reservations to cancel
            System.out.println("No reservations to cancel.");
        }
    }

    private static void checkReservation(SLL<Passenger> list, String name) {
        if (list.head != null) {
            SLLNode<Passenger> current = list.head;

            while (current != null) {
                // Search for the reservation by comparing passenger names
                if (current.info.getName().equalsIgnoreCase(name)) {
                    System.out.println("Reservation found for " + name);
                    return;
                }
                current = current.next;
            }
            // No reservation found for the given name
            System.out.println("No reservation found for " + name);
        } else {
            // No reservations in the list
            System.out.println("No reservations found.");
        }
    }

    private static void insertInAlphabeticalOrder(SLL<Passenger> list, Passenger passenger) {
        // Get the head of the linked list
        SLLNode<Passenger> current = list.head;
        // Keep track of the node before the current node
        SLLNode<Passenger> previous = null;

        // Traverse the list to find the correct position to insert the new passenger
        while (current != null && passenger.getName().compareToIgnoreCase(current.info.getName()) > 0) {
            // Move to the next node in the list
            previous = current;
            current = current.next;
        }

        // Create a new node with the passenger data
        SLLNode<Passenger> newNode = new SLLNode<>(passenger);

        // Check if the new node needs to be inserted at the beginning of the list
        if (previous == null) {
            // Insert at the head of the list
            list.insertAtHead(newNode.info);
        } else {
            // Insert the new node between the previous and current nodes
            previous.next = newNode;
            newNode.next = current;

            // Check if the new node is the last node in the list
            if (current == null) {
                // Update the tail of the list to the new node
                list.tail = newNode;
            }
        }
    }

}

// Passenger class representing a passenger with a name
class Passenger {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
