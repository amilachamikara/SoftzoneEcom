package core.services;

import core.domain.Product;
import core.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Amila on 1/20/16.
 */
@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;

    @Autowired
    public void setRepository(ProductRepository repository) {
        this.repository = repository;
    }

    public Product getProduct(int id){
        return repository.getById(id);
    }

    public List<Product> getAllProducts(){
        return repository.list();
    }

    public void deleteProduct(int id){
        repository.delete(id);
    }

    public void saveOrUpdate(Product product){
        repository.save(product);
    }

    public void deleteProduct(Product product) {
        repository.delete(product);
    }
}
