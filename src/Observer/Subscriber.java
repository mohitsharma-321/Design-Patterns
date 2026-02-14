package Observer;

public class Subscriber implements Observer{

    private String name;

     public Subscriber(String name) {
        this.name = name;
    }
    @Override
    public void notifyUpdate() {
        System.out.println("New Video Uploaded : " + name);
    }
}
