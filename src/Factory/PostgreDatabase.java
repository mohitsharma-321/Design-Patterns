package Factory;

public class PostgreDatabase implements Database {
    @Override
    public String getUrl() {
        return null;
    }

    @Override
    public int getConnectionLimit() {
        return 0;
    }

    @Override
    public String getDbName() {
        return null;
    }

    @Override
    public Query getQuery() {
        return new PostgreQuery();
    }
}
