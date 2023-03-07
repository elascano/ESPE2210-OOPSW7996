package ec.espe.edu.objectpool.controller;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class DBConnection {
    private String host;
    private int port;
    private boolean isConnected;

    public DBConnection(String host, int port) {
        this.host = host;
        this.port = port;
        this.isConnected = false;
    }

    public void connect() {
        System.out.println("Connecting to " + host + ":" + port);
        try {
            Thread.sleep(1000); // Simulate a delay in connecting
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
        isConnected = true;
    }

    public void disconnect() {
        System.out.println("Disconnecting from " + host + ":" + port);
        isConnected = false;
    }

    public String executeQuery(String query) {
        if (!isConnected) {
            throw new IllegalStateException("Not connected");
        }
        System.out.println("Executing query '" + query + "' on " + host + ":" + port);
        try {
            Thread.sleep(500); // Simulate a delay in executing the query
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
        return "Result of query '" + query + "' on " + host + ":" + port;
    }
}
