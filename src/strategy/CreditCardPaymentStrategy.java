package strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Payment done by Credit card ...");
    }
}
