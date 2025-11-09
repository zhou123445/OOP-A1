/**
 * Subclass of HealthProfessional representing a Radiologist.
 * Extends base class with a unique attribute: specialized equipment.
 */
public class Radiologist extends HealthProfessional {
    private final String specializedEquipment;

    /** Default constructor with default values. */
    public Radiologist() {
        super();
        this.specializedEquipment = "X-Ray Machine";
    }

    /**
     * Constructor to initialize all instance variables (base + subclass).
     * @param id See HealthProfessional.
     * @param name See HealthProfessional.
     * @param specialtyArea See HealthProfessional (e.g., "Diagnostic Radiology").
     * @param specializedEquipment Equipment expertise (e.g., "MRI Scanner").
     */
    public Radiologist(int id, String name, String specialtyArea, String specializedEquipment) {
        super(id, name, specialtyArea);
        if (specializedEquipment == null || specializedEquipment.trim().isEmpty()) {
            throw new IllegalArgumentException("Specialized equipment cannot be empty.");
        }
        this.specializedEquipment = specializedEquipment;
    }

    /** Overrides printDetails to include subclass-specific info. */
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        System.out.println("Type: Radiologist");
        super.printDetails();
        System.out.println("Specialized Equipment: " + specializedEquipment);
    }

    // Getter for subclass attribute
    public String getSpecializedEquipment() { return specializedEquipment; }
}