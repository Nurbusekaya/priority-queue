import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
public class PatientTest {

    @Test
    public void testFirstPatient() {
        PriorityQueue<Patient> queue = new PriorityQueue<>();
        queue.add(new Patient("Ali", 3));
        queue.add(new Patient("Ayşe", 1));
        queue.add(new Patient("Mehmet", 2));

        assertEquals("Ayşe", queue.poll().name);
    }

    @Test
    public void testOrder() {
        PriorityQueue<Patient> queue = new PriorityQueue<>();
        queue.add(new Patient("Ali", 3));
        queue.add(new Patient("Ayşe", 1));
        queue.add(new Patient("Mehmet", 2));

        assertEquals("Ayşe", queue.poll().name);
        assertEquals("Mehmet", queue.poll().name);
        assertEquals("Ali", queue.poll().name);
    }

    @Test
    public void testEmptyQueue() {
        PriorityQueue<Patient> queue = new PriorityQueue<>();
        assertTrue(queue.isEmpty());
    }
}
