package Factory;

public class PostgreDatabaseElements implements DatabaseElements{
    @Override
    public Query getQuery() {
        return new PostgreQuery();
    }

    @Override
    public Connection getConnection() {
        return new PostgreConnection();
    }

    @Override
    public Transaction getTransaction() {
        return new PostgreTransaction();
    }
}
