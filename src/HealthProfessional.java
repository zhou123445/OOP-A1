/**
 * Base class for all health professionals (e.g., GP, Radiologist).
 * Encapsulates common attributes and behaviors to avoid code duplication.
 */
public class HealthProfessional {
    private final int id;
    private final String name;
    private final String specialtyArea;

    /** Default constructor with default values. */
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.specialtyArea = "General Health";
    }

    /**
     * Constructor to initialize all instance variables.
     * @param id Unique identifier (positive integer).
     * @param name Professional's full name.
     * @param specialtyArea Medical specialty (e.g., "Family Medicine").
     */
    public HealthProfessional(int id, String name, String specialtyArea) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be a positive integer.");
        }
        this.id = id;
        this.name = name;
        this.specialtyArea = specialtyArea;
    }

    /** Prints all instance variables in a readable format. */
    public void printDetails() {
        System.out.println("Health Professional ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialty Area: " + specialtyArea);
    }

    // Getters (required for Appointment and subclass access)
    public int getId() { return id; }
    public String getName() { return name; }
    public String getSpecialtyArea() { return specialtyArea; }
}