
public class Patient {

    private int patientId;
    private int bedType;
    private int days;

    public Patient() {
        this.patientId = 0;
        this.bedType = 0;
        this.days = 0;
    }

    public Patient(int patientId, int bedType, int days) {
        this.patientId = patientId;
        this.bedType = bedType;
        this.days = days;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getBedType() {
        return bedType;
    }

    public void setBedType(int bedType) {
        this.bedType = bedType;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPricePerDay() {

        double price;

        switch (bedType) {
            case 1:
                price = 500;
                break;

            case 2:
                price = 350;
                break;

            case 3:
                price = 200;
                break;
            default:
                price = 250;
        }
        return price;
    }

    public double getBill() {
        return days * getPricePerDay();
    }

    public String toString() {
        return "Patient [Id=" + patientId + ", BedType=" + bedType + ", Days=" + days + "]";
    }

}