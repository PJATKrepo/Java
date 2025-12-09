// Patients
public class Problem3 {
    void main() {
        Patient[] patients = {
                new IllHead("Johny"),
                new IllLeg("Eddy"),
                new IllDyspepsia("Manny")
        };
        for (Patient p : patients) {
            System.out.println("Patient:   " +
                    p.name() + '\n' + "Illness:   " +
                    p.illness() + '\n' + "Treatment: "  +
                    p.treatment() +"\n"
            );
        }
    }
}