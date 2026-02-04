package Adapter.PhonePe.after;

public class ICICIApiAdapter implements BankAPI{

    ICICIApi iciciApi = new ICICIApi();

    @Override
    public void pay(int paymentId, int recieverId) {
        iciciApi.payTo(paymentId,recieverId);
    }

    @Override
    public void checkStatus(int paymentId) {
        iciciApi.checkTransaction(paymentId);
    }
}
