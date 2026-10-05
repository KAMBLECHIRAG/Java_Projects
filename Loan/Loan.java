abstract class Loan {
    private double principle;
    private float period;

    public double GetPrinciple() {
        return this.principle;
    }

    public void SetPrinciple(double principle) {
        this.principle = principle;
    }

    public float GetPeriod() {
        return this.period;
    }

    public void SetPeriod(float period) {
        this.period = period;
    }

    public abstract float GetRate();

    public double GetEMI() {
        double p = GetPrinciple();
        float r = GetRate();
        float n = GetPeriod();

        return p * (1 + r * n / 100) / (12 * n);
    }
}