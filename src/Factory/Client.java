package Factory;

public class Client {
    public static void main(String[] args) {
        String value = "MySQL";

        Database db = DatabaseFactory.getDatabase("MySQL");

    }
}
