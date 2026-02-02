package Factory;

import java.sql.Connection;

public interface Database {
    String getUrl();
    int getConnectionLimit();
    String getDbName();


    //Now having these factory method in same class voilates SRP,
    // so we can spilit the class and make new interface with ONLY Factory methods there


    // This is Factory method
//    Query getQuery();
//
//    // This is Factory method
//    Connection connection;
//
//    // This is Factory method
//    Transaction transaction;

    DatabaseElements getDatabaseElements();
}
