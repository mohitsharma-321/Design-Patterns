package Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Producer{

    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Observer sub) {
        subscribers.add(sub);
    }

    @Override
    public void removeSubscriber(Observer subs) {
        subscribers.remove(subs);
    }

    @Override
    public void notifyChanges() {
        for(Observer subs : subscribers) {
            subs.notifyUpdate();
        }
    }
}
