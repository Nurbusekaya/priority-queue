public class Patient implements Comparable<Patient> {
    String name;
    int priority;

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Patient other) {
        return this.priority - other.priority;
    }

    @Override
    public String toString() {
        return name + "(Priority:=" + priority + ")";
    }
}
