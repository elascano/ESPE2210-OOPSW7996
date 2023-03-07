package ec.espe.edu.objectpool.controller;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class Client implements Runnable {
    private final ConnectionPool pool;
    private final String query;

    public Client(ConnectionPool pool, String query) {
        this.pool = pool;
        this.query = query;
    }

    @Override
    public void run() {
        DBConnection connection = pool.getConnection("localhost", 5432);
        System.out.println(connection.executeQuery(query));
        pool.releaseConnection(connection);
    }
}

