public class Radiologist extends HealthProfessional {
    private String specializedEquipment;

    // Default constructor
    public Radiologist() {
        super();
        this.specializedEquipment = "Not Specified";
    }

    // Parameterized constructor
    public Radiologist(int id, String name, String specialty, String specializedEquipment) {
        super(id, name, specialty);
        this.specializedEquipment = specializedEquipment;
    }

    // Override print method
    @Override
    public void printDetails() {
        System.out.print("【Radiologist】 ");
        super.printDetails();
        System.out.printf(" | Specialized Equipment: %s%n", specializedEquipment);
    }
}