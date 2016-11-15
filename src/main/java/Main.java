import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by dani on 2016-11-08.
 */
public class Main {
  /*  private static final SessionFactory ourSessionFactory;
    private static final ServiceRegistry serviceRegistry;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    } */

    public static void test(){
    /*    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = (new Configuration().configure().buildSessionFactory()).openSession();


        session.beginTransaction();

        User usert = new User();
        usert.setAddress("tag");

        Log log = new Log();
        log.setContent("HELOO BOY");
        log.setOwner(usert);
        User user = new User();
        user.setAddress("test");
        user.setAge(12);
        user.setPassword("123");
        user.setUsername("Dani Daryaweesh");
        // user.setLog(log);

        session.save(user);
        session.getTransaction().commit();
        session.close();*/


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPU");
        EntityManager em = emf.createEntityManager();
        User user = new User();
        user.setPassword("12345");
        user.setUsername("DarBirc");
        user.setAge(12);
        user.setWorkTitle("Garden");
        em.persist(user);
        em.close();
        emf.close();
    }

    public static void main(final String[] args) throws Exception {

        System.out.println("Program is oN");
    }
}