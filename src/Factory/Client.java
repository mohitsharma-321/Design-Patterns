package Factory;

public class Client {
    public static void main(String[] args) {
        String value = "MySQL";

        Database db = DatabaseFactory.getDatabase(value);

        Query query = db.getDatabaseElements().getQuery();
        System.out.println(query);

        value = "Postgre";
        Database db1 = DatabaseFactory.getDatabase(value);

        Query query1 = db1.getDatabaseElements().getQuery();
        System.out.println(query1);
    }
}
