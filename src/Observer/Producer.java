package Observer;

public interface Producer {

    void addSubscriber(Observer sub);

    void removeSubscriber(Observer sub);

    void notifyChanges();
}
