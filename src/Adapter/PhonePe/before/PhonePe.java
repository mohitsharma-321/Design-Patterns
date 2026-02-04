package Adapter.PhonePe.before;

public class PhonePe {

    YBApi ybApi = new YBApi();

    void pay(int id,int to) {
        ybApi.makePayment(id,to);
        ybApi.checkSuccess(id);
    }

    void checkStatus(int id) {
        ybApi.makePayment(id,7889);
        ybApi.checkSuccess(id);
    }

    void recieve() {
        ybApi.checkSuccess(1234);
    }
    void closePayement() {

        ybApi.checkSuccess(1234);
    }
}
