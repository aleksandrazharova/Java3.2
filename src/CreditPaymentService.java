public class CreditPaymentService {
    public int calculate(int month, int amount, double percent) {
        double loan_percent = percent / 100 / 12;
        double payment = (loan_percent * Math.pow(1 + loan_percent, month) / (Math.pow(1 + loan_percent, month) - 1));

        return (int) (amount * payment);
    }
}