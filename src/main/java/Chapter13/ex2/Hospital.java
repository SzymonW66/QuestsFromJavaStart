package Chapter13.ex2;

public class Hospital {
    final int maxPaitentNumbers = 10;
    private Patient[] patients = new Patient[maxPaitentNumbers];
    private int regPatients = 0;

    public void addPatient(Patient patient) {
        if (regPatients < maxPaitentNumbers) {
            patients[regPatients] = patient;
            regPatients++;
        }
    }


    public void printPatients() {
        for (int i = 0; i < regPatients; i++) {
            System.out.println(patients[i].getName() + " " + patients[i].getLastName() + " " + patients[i].getPesel());
        }
    }
}
