package Adapter.PhonePe.after;

public interface BankAPI {

    void pay(int paymentId,int recieverId);

    void checkStatus(int paymentId);
}
