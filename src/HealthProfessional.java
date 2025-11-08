public class HealthProfessional {
    private int id;
    private String name;
    private String specialty;

    // Default constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "Not Specified";
        this.specialty = "Not Specified";
    }

    // Parameterized constructor
    public HealthProfessional(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    // Print basic details
    public void printDetails() {
        System.out.printf("ID: %d | Name: %s | Specialty: %s%n", id, name, specialty);
    }
}