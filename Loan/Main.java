public class Main {

    public static double GetTotalEmi(Loan[] loans) {
        double total = 0;

        for (Loan loan : loans) {
            total = total + loan.GetEMI();
        }

        return total;
    }

    public static void main(String[] args) {
        Loan[] loans = new Loan[3];

        loans[0] = new PersonalLoan();
        loans[1] = new HomeLoan();
        loans[2] = new PersonalLoan();

        loans[0].SetPrinciple(400000);
        loans[0].SetPeriod(5);

        loans[1].SetPrinciple(1500000);
        loans[1].SetPeriod(10);

        loans[2].SetPrinciple(600000);
        loans[2].SetPeriod(5);

        double total = GetTotalEmi(loans);

        System.out.println("Total EMI = " + total);
    }

}
