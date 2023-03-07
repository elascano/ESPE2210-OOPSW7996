
package ec.edu.espe.ecomarket.controller;

import ec.edu.espe.ecomarket.model.Product;
import org.bson.Document;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class ProductController extends BasicController<Product> {

    public ProductController(Product object, String collectionName) {
        super(object, collectionName);
    }
     public ProductController() {
        super(new Product(), "products");
    }
     
     
     
    public Document buildDocument(Product product) {
        Document document = new Document();

        document.append("name", product.getName()).
                append("price", product.getPrice()).
                append("expiration", product.getExpiration()).
                append("stock", product.getStock());
        return document;
    }

}
