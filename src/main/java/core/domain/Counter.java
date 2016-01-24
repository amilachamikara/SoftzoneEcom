package core.domain;

import javax.persistence.*;

/**
 * Created by Amila on 1/20/16.
 */
@Entity
public class Counter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Product product;
    private long soldCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public long getSoldCount() {
        return soldCount;
    }

    public void setSoldCount(long soldCount) {
        this.soldCount = soldCount;
    }
}
