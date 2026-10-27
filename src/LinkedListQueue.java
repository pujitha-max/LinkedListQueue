
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListQueue {

    private LinkedList<Integer> queue = new LinkedList<>();

    // Add an element to the queue
    public void enqueue(int element) {
        queue.addLast(element);
        System.out.println(element + " added to the queue.");
    }

    // Remove an element from the queue
    public void dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty. Nothing to remove.");
        } else {
            int removed = queue.removeFirst();
            System.out.println("Removed element: " + removed);
        }
    }

    // Display queue elements
    public void display() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue: " + queue);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListQueue q = new LinkedListQueue();

        int choice;

        do {
            System.out.println("\n--- LinkedList Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    int element = sc.nextInt();
                    q.enqueue(element);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
