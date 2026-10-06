public class BankTest {

    public static void main(String[] args) {

        double si = Bank.getSI(10000, 2, 2);

        double ci = Bank.getCI(10000, 2, 2);

        System.out.println("Simple Interest " + si);
        System.out.println("Compound Interest " + ci);
    }

}
