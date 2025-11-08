public class GeneralPractitioner extends HealthProfessional {
    private String consultationHours;

    // Default constructor
    public GeneralPractitioner() {
        super();
        this.consultationHours = "Not Specified";
    }

    // Parameterized constructor
    public GeneralPractitioner(int id, String name, String specialty, String consultationHours) {
        super(id, name, specialty);
        this.consultationHours = consultationHours;
    }

    // Override print method
    @Override
    public void printDetails() {
        System.out.print("【General Practitioner】 ");
        super.printDetails();
        System.out.printf(" | Consultation Hours: %s%n", consultationHours);
    }
}