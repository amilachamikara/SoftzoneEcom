package core.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amila on 1/19/16.
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Seller extends User {

    @OneToMany
    private List<Product> productList;

    public Seller() {
        this.productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

}
