import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by dani on 2016-11-02.
 */
@ManagedBean(name="beanTest", eager = true)
@SessionScoped
public class BeanTest{

    public BeanTest(){
        System.out.println("HelloWorld started!");
    }

    public String getName() {
        return "Welcome to my world!";
    }
}
