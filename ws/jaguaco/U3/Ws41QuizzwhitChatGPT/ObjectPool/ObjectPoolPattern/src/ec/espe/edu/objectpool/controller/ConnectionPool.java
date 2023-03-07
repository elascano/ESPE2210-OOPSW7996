package ec.espe.edu.objectpool.controller;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConnectionPool {
    private final int MAX_SIZE;
    private final BlockingQueue<DBConnection> pool;

    public ConnectionPool(int maxSize) {
        MAX_SIZE = maxSize;
        pool = new LinkedBlockingQueue<>(MAX_SIZE);
    }

    public DBConnection getConnection(String host, int port) {
        DBConnection connection = pool.poll();
        if (connection == null) {
            connection = new DBConnection(host, port);
        }
        connection.connect();
        return connection;
    }

    public void releaseConnection(DBConnection connection) {
        connection.disconnect();
        if (pool.size() < MAX_SIZE) {
            pool.offer(connection);
        }
    }
}

