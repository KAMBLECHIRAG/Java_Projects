public class InHousePatient extends Patient {

    private double discount = 10;

    public InHousePatient() {
        super();
    }

    public InHousePatient(int patientId, int bedType, int days) {
        super(patientId, bedType, days);
    }

    public InHousePatient(int patientId, int bedType, int days, double discount) {

        super(patientId, bedType, days);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getBill() {
        double amount = super.getBill();

        return amount = (amount * discount / 100);
    }

    public String toString() {
        return "Patient [Id=" + getPatientId() + ", BedType=" + getBedType() + ", Days=" + getDays() + ", Discount="
                + discount + "%]";
    }

}
