package strategy;

public class NetbankingPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Payment Done by Netbanking ...");
    }
}
