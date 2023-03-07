package ec.espe.edu.objectpool.controller;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class Main {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool(2);
        String[] queries = {"SELECT * FROM customers", "SELECT * FROM orders", "SELECT * FROM products", "SELECT * FROM suppliers"};
        for (int i = 0; i < queries.length; i++) {
            new Thread(new Client(pool, queries[i])).start();
        }
    }
}

