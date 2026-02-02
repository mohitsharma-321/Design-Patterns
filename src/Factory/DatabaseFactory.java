package Factory;

public class DatabaseFactory {

    public static Database getDatabase(String value) {
        if(value.equals("MySQL"))
            return new MySQLDatabase();
        else if (value.equals("Postgre")){
            return new PostgreDatabase();
        }
        return null;
    }
}
