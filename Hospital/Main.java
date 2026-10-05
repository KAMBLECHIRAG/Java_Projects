
public class Main {

    public static void main(String[] args) {

        Patient p1 = new Patient(101, 1, 3);
        Patient p2 = new Patient(102, 2, 4);
        Patient p3 = new Patient(103, 3, 5);
        Patient p4 = new Patient(104, 7, 2);

        InHousePatient e1 = new InHousePatient(201, 1, 3);

        InHousePatient e2 = new InHousePatient(202, 2, 4);

        p4.setDays(6);
        e2.setDiscount(15);

        System.out.println("--------------------Hospital Bills-----------");

        Patient[] patient = { p1, p2, p3, p4, e1, e2 };

        for (Patient p : patient) {
            System.out.println(p);
            System.out.println("Price per day : " + p.getPricePerDay());
            System.out.println("Bill :" + p.getBill());
            System.out.println();
        }
    }

}
