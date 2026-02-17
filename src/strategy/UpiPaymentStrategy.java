package strategy;

public class UpiPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Payemt done by UPI ...");
    }
}
