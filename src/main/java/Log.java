import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by dani on 2016-11-09.
 */
@Entity
@Table(name="log")
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User owner;

    @Column(name = "title", nullable = false, length = 80)
    private String title;

    @Column(name = "content", nullable = false, length = 140)
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
}
