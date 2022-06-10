import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {
    public static class Employee {
        private int id;
        private String firstName,lastName;

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }


    }

public static void main(String[] args) {

    //Create typesafe ServiceRegistry object
    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

SessionFactory factory = meta.getSessionFactoryBuilder().build();
Session session = factory.openSession();
Transaction t = session.beginTransaction();

    // computer uses the time to generate a unique id, user enters the employee's first and last names
    try (Scanner scan = new Scanner(System.in)) {
        System.out.println("ready to add user");
        Employee emp = new Employee();
        int id = Math.toIntExact(new Date().getTime());

        emp.setId(id);
        emp.setFirstName(scan.nextLine());
        emp.setLastName(scan.nextLine());

        session.save(emp);
        t.commit();
        System.out.println("successfully saved user "+emp);
        factory.close();
        session.close();
    }
}
}