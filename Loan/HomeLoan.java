class HomeLoan extends Loan {
    @Override
    public float GetRate() {
        if (GetPrinciple() <= 2000000) {
            return 10;
        } else {
            return 11;
        }
    }
}