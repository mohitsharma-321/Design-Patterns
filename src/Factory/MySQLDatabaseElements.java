package Factory;

public class MySQLDatabaseElements implements DatabaseElements{

    @Override
    public Query getQuery() {
        return new MySQLQuery();
    }

    @Override
    public Connection getConnection() {
        return new MySQLConnection();
    }

    @Override
    public Transaction getTransaction() {
        return new MySQLTransaction();
    }
}
