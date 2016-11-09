import javax.persistence.*;
import java.util.ArrayList;

/**
 * Created by dani on 2016-11-09.
 */
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "username", unique = true, length = 45)
    private String username;

    @Column(name = "password",
            nullable = false, length = 80)
    private String password;

    @OneToMany(mappedBy = "id")
    private Log log;

    @OneToMany(mappedBy = "id")
    private ArrayList<Message> senderMessage;

    @OneToMany(mappedBy = "id")
    private ArrayList<Message> recieverMessage;

    private int age;
    private String address;
    private String workTitle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Log getLocalLog() {
        return log;
    }

    public void setLocalLog(Log log) {
        this.log = log;
    }

    public ArrayList<Message> getSenderMessage() {
        return senderMessage;
    }

    public void setSenderMessage(ArrayList<Message> senderMessage) {
        this.senderMessage = senderMessage;
    }

    public ArrayList<Message> getRecieverMessage() {
        return recieverMessage;
    }

    public void setRecieverMessage(ArrayList<Message> recieverMessage) {
        this.recieverMessage = recieverMessage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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
}
