/**
 * Class to manage patient appointments with health professionals.
 * Uses polymorphism to accept any HealthProfessional subclass.
 */
public class Appointment {
    private final String patientName;
    private final String patientMobile;
    private final String timeSlot;
    private final HealthProfessional selectedDoctor;

    /** Default constructor with default values. */
    public Appointment() {
        this.patientName = "Unknown";
        this.patientMobile = "0000000000";
        this.timeSlot = "00:00";
        this.selectedDoctor = new HealthProfessional();
    }

    /**
     * Constructor to initialize all instance variables.
     * @param patientName Patient's full name.
     * @param patientMobile Patient's 10-digit mobile number.
     * @param timeSlot Booking time (e.g., "09:30").
     * @param selectedDoctor Any HealthProfessional subclass (GP/Radiologist).
     */
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional selectedDoctor) {
        if (patientName == null || patientName.trim().isEmpty()) {
            throw new IllegalArgumentException("Patient name cannot be empty.");
        }
        if (patientMobile == null || !patientMobile.matches("\\d{10}")) {
            throw new IllegalArgumentException("Mobile number must be 10 digits.");
        }
        if (timeSlot == null || !timeSlot.matches("\\d{2}:\\d{2}")) {
            throw new IllegalArgumentException("Time slot must be in HH:MM format.");
        }
        if (selectedDoctor == null) {
            throw new IllegalArgumentException("Doctor cannot be null.");
        }
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    /** Prints all appointment details (patient + doctor info). */
    public void printDetails() {
        System.out.println("\nAppointment Details:");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Assigned Doctor Details:");
        selectedDoctor.printDetails();
    }

    // Getter for cancellation logic
    public String getPatientMobile() { return patientMobile; }

    // Add Getter methods to access selectedDoctor and timeSlot
    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    public String getTimeSlot() {
        return timeSlot;
    }
}