import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
// test again
// again
/**
 * Created by dani on 2016-11-02.
 */
@ManagedBean(name="beanTest", eager = true)
@SessionScoped
public class BeanTest{
    private String username;
    private String password;
    private String age;
    private String address;
    private String workTitle;
    private User user;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkTitle() {
        return workTitle;
    }

    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle;
    }

    public BeanTest(){
        System.out.println("HelloWorld started!");
        username = "enter username";
        password = "enter password";
    }

    public String getName() {
        //Main.test();
        return "Welcome to my world!";
    }





    public String getPassword() {
        return password;
    }

    public void setPassword(String passWord) {
        this.password = passWord;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String doLogin() {
        System.out.println("Username: " + username + " Password: " + password);
        return "Username: " + username + " Password: " + password;
    }

    public String backToLogin(){
        return "login.xhtml";
    }

    public String doRegister(){
        System.out.println("Switching to register");
        return "register.xhtml";
    }

    public String registerMe(){
        user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(Integer.parseInt(age));
        user.setAddress(address);
        user.setWorkTitle(workTitle);
        System.out.println(user.toString());
        return "myprofile.xhtml";
    }
}//class
