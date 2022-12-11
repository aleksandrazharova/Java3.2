public class Main {
    public static void main(String[] args) {
        int amount = 1_000_000;
        double percent = 9.99;
        int credit_1_year = 12;
        int credit_2_years = 24;
        int credit_3_years = 36;

        CreditPaymentService service = new CreditPaymentService();

        int payment1year = service.calculate(credit_1_year, amount, percent);
        System.out.println(payment1year);

        int payment2years = service.calculate(credit_2_years, amount, percent);
        System.out.println(payment2years);

        int payment3years = service.calculate(credit_3_years, amount, percent);
        System.out.println(payment3years);
    }
}