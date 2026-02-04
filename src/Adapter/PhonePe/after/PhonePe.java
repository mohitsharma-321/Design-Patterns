package Adapter.PhonePe.after;

public class PhonePe {

 //   BankAPI bankAPI = new YBApiAdapter();           // changes from YbApi to BankApi -> now flexible
    BankAPI bankAPI = new ICICIApiAdapter();            // just a line change and we can use ICICI one
    void pay(int id,int to) {
        bankAPI.pay(id,to);
        bankAPI.checkStatus(id);
    }

    void checkStatus(int id) {
        bankAPI.pay(id,7889);
        bankAPI.checkStatus(id);
    }

    void recieve() {
        bankAPI.checkStatus(1234);
    }
    void closePayement() {

        bankAPI.checkStatus(1234);     }
}
