import java.util.ArrayList;

/**
 * Main class to demonstrate health professional management and appointment booking.
 * Covers object creation (Part 3) and collection management (Part 5).
 */
public class AssignmentOne {
    private static final ArrayList<Appointment> appointmentList = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3: Create health professional objects
        System.out.println("=== Part 3: Health Professional Objects ===");
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Emily Clark", "Family Medicine", 25);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. James Wilson", "General Practice", 22);
        Radiologist rad1 = new Radiologist(201, "Dr. Michael Brown", "Diagnostic Radiology", "MRI Scanner");
        Radiologist rad2 = new Radiologist(202, "Dr. Lisa Garcia", "Interventional Radiology", "CT Scanner");

        // Print details
        gp1.printDetails();
        System.out.println();
        gp2.printDetails();
        System.out.println();
        rad1.printDetails();
        System.out.println();
        rad2.printDetails();

        System.out.println("------------------------------");

        // Part 5: Manage appointments
        System.out.println("\n=== Part 5: Appointment Management ===");
        createAppointment("John Smith", "0412345678", "08:30", gp1);
        createAppointment("Emma Davis", "0423456789", "10:15", gp2);
        createAppointment("Michael Wilson", "0434567890", "14:00", rad1);
        createAppointment("Sophia Martinez", "0445678901", "15:30", rad2);

        // Print all appointments
        System.out.println("\n=== All Appointments After Creation ===");
        printExistingAppointments();

        // Cancel an appointment
        String cancelMobile = "0423456789";
        System.out.println("\n=== Canceling Appointment for Mobile: " + cancelMobile + " ===");
        cancelBooking(cancelMobile);

        // Print updated appointments
        System.out.println("\n=== All Appointments After Cancellation ===");
        printExistingAppointments();


        System.out.println("------------------------------");
    }

    /** Creates and adds an appointment to the collection (with validation). */
    private static void createAppointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        try {
            Appointment newAppointment = new Appointment(patientName, patientMobile, timeSlot, doctor);
            // HD Optimization: Check for time slot conflicts
            if (isTimeSlotAvailable(doctor, timeSlot)) {
                appointmentList.add(newAppointment);
                System.out.println("Appointment created successfully for " + patientName);
            } else {
                System.out.println("Failed: Doctor is already booked at " + timeSlot);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to create appointment: " + e.getMessage());
        }
    }

    /** Helper method to check for time slot conflicts. */
    private static boolean isTimeSlotAvailable(HealthProfessional doctor, String timeSlot) {
        for (Appointment appt : appointmentList) {
            // 通过 Getter 方法访问 Appointment 中的私有字段
            if (appt.getSelectedDoctor().getId() == doctor.getId() && appt.getTimeSlot().equals(timeSlot)) {
                return false;
            }
        }
        return true;
    }

    /** Prints all existing appointments. */
    private static void printExistingAppointments() {
        if (appointmentList.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }
        for (int i = 0; i < appointmentList.size(); i++) {
            System.out.println("\n--- Appointment " + (i + 1) + " ---");
            appointmentList.get(i).printDetails();
        }
    }

    /** Cancels an appointment by patient mobile number. */
    private static void cancelBooking(String patientMobile) {
        boolean removed = false;
        for (int i = 0; i < appointmentList.size(); i++) {
            if (appointmentList.get(i).getPatientMobile().equals(patientMobile)) {
                appointmentList.remove(i);
                removed = true;
                System.out.println("Appointment canceled for " + patientMobile);
                break;
            }
        }
        if (!removed) {
            System.out.println("No appointment found for " + patientMobile);
        }
    }
}