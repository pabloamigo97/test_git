package hibernate_test_2.entity;

import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(hibernate_test_2.entity.Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

        try {

            /*Session session = factory.getCurrentSession();
            Employee employee = new Employee("Pavel", "Sokolov", "IT", 500);
            Detail detail = new Detail("Spb", "89062716717", "pasha.sokolov97@mail.ru");
            employee.setEmpDetail(detail);
            session.beginTransaction();

            session.save(employee);



            session.getTransaction().commit();
            System.out.println("Done!");


            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 700);
            Detail detail = new Detail("Moscow", "89032617181", "olejka@gmail.com");
            employee.setEmpDetail(detail);
            session.beginTransaction();

            session.save(employee);



            session.getTransaction().commit();
            System.out.println("Done!");



           session = factory.getCurrentSession();

           session.beginTransaction();

            Employee employee = session.get(Employee.class, 10);
            System.out.println(employee.getEmpDetail());

            session.getTransaction().commit();
            System.out.println("Done!");*/



            session = factory.getCurrentSession();

            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done!");

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
