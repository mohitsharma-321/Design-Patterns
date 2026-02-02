package Factory;

public interface Database {
    String getUrl();
    int getConnectionLimit();
    String getDbName();

    Query getQuery();
}
