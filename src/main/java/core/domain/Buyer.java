package core.domain;

import javax.persistence.*;

/**
 * Created by Amila on 1/20/16.
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Buyer extends User {


}
