import java.util.*;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>();

        queue.add(new Patient("Ali", 3));
        queue.add(new Patient("Ayşe", 1));
        queue.add(new Patient("Mehmet", 2));

        System.out.println("=== Hasta Sırası ===");
        while (!queue.isEmpty())
            System.out.println(queue.poll());
    }
}