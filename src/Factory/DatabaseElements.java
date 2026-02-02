package Factory;

// Now this is Abstract Factory Interface - Method with ONLY Factory methods

public interface DatabaseElements {

    Query getQuery();

    Connection getConnection();

    Transaction getTransaction();
}
