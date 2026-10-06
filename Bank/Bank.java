public class Bank {

    public static double getSI(double principle, double rate, double period) {

        double si;

        si = (principle * rate * period) / 100;

        return si;

    }

    public static double getCI(double principle, double rate, double period) {

        double ci;

        ci = principle * Math.pow((1 + rate / 100), period) - principle;

        return ci;
    }
}