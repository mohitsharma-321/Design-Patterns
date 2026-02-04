package Adapter.PhonePe.after;

import Adapter.PhonePe.after.YBApi;

public class YBApiAdapter implements BankAPI{

    YBApi ybApi = new YBApi();

    @Override
    public void pay(int paymentId, int recieverId) {
        ybApi.makePayment(paymentId,recieverId);
    }

    @Override
    public void checkStatus(int paymentId) {
        ybApi.checkSuccess(paymentId);
    }
}
