import javax.persistence.*;

/**
 * Created by dani on 2016-11-02.
 */
@Entity
@Table(name="Product_test")
public class ProductTest {

    @Id
    @Column(name="id")
    private int test;
}
