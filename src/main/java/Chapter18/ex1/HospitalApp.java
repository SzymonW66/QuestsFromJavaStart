package Chapter18.ex1;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.addCrewMember(new Doctor("Maciek", "Bury", 6000, 1000));
        hospital.addCrewMember(new Doctor("Maciek2", "Bury1", 46000, 16000));
        hospital.addCrewMember(new Doctor("Maciek1", "Bury2", 16000, 10700));
        System.out.println(hospital.getInfo());
    }
}
