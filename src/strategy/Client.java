package strategy;

public class Client {
    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext(new CreditCardPaymentStrategy());
        paymentContext.doPayment();

        PaymentContext paymentContext1 = new PaymentContext(new UpiPaymentStrategy());
        paymentContext1.doPayment();

    }
}
