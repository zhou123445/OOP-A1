/**
 * Subclass of HealthProfessional representing a General Practitioner.
 * Extends base class with a unique attribute: max patients per day.
 */
public class GeneralPractitioner extends HealthProfessional {
    private final int maxPatientsPerDay;

    /** Default constructor with default values. */
    public GeneralPractitioner() {
        super();
        this.maxPatientsPerDay = 20;
    }

    /**
     * Constructor to initialize all instance variables (base + subclass).
     * @param id See HealthProfessional.
     * @param name See HealthProfessional.
     * @param specialtyArea See HealthProfessional.
     * @param maxPatientsPerDay Maximum daily patients (10-30 recommended).
     */
    public GeneralPractitioner(int id, String name, String specialtyArea, int maxPatientsPerDay) {
        super(id, name, specialtyArea);
        if (maxPatientsPerDay < 10 || maxPatientsPerDay > 30) {
            throw new IllegalArgumentException("Max patients per day must be between 10-30.");
        }
        this.maxPatientsPerDay = maxPatientsPerDay;
    }

    /** Overrides printDetails to include subclass-specific info. */
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        System.out.println("Type: General Practitioner");
        super.printDetails();
        System.out.println("Max Patients Per Day: " + maxPatientsPerDay);
    }

    // Getter for subclass attribute
    public int getMaxPatientsPerDay() { return maxPatientsPerDay; }
}