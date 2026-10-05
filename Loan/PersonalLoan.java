public class PersonalLoan extends Loan {
    @Override
    public float GetRate() {
        if (GetPrinciple() <= 500000) {
            return 15;
        } else {
            return 16;
        }
    }
}