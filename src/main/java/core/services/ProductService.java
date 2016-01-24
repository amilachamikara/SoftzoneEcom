package core.services;

import core.domain.Product;

import java.util.List;

/**
 * Created by Amila on 1/20/16.
 */
public interface ProductService {
    public Product getProduct(int id);

    public List<Product> getAllProducts();

    public void deleteProduct(int id);

    public void saveOrUpdate(Product product);

    public void deleteProduct(Product product);
}
