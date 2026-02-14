package Observer;

public class Client {

    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber Mohit = new Subscriber("Mohit");
        Subscriber Rohit = new Subscriber("Rohit");

        channel.addSubscriber(Mohit);
        channel.addSubscriber(Rohit);

        channel.notifyChanges();

    }
}
