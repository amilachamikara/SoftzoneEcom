package core.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Amila on 1/20/16.
 */
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Buyer buyer;
    private double total;
    private Date date;

}
