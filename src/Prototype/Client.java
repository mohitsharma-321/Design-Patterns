package Prototype;

public class Client {

    public static void main(String[] args) throws InterruptedException {

        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp("123.123.123.123 :    ");
        networkConnection.loadImpData();

        System.out.println(networkConnection);

        System.out.println(networkConnection.clone());
        System.out.println(networkConnection.clone());
    }
}
