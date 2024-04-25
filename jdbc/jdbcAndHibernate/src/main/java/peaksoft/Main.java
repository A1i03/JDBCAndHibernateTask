package peaksoft;

import jakarta.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import peaksoft.Util.HibernateConfig;
import peaksoft.dao.daoImpl.UserDaoJdbcImpl;
import peaksoft.model.User;
import peaksoft.service.UserService;
import peaksoft.service.serviceImpl.UserHibernateImpl;
import peaksoft.service.serviceImpl.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
       // HibernateConfig.getEntityManagerFactory();
        //Session session = HibernateConfig.getSession().openSession();
//        Transaction transaction = session.beginTransaction();
//        transaction.commit();
////        session.close();
//
        UserService userServiceHibernate = new UserHibernateImpl();
//          userServiceHibernate.saveUser("Ali", "Kaldarbekov", (byte) 21);
//        System.out.println(userServiceHibernate.getAllUsers());
//        userServiceHibernate.removeUserById(1L);
//        userServiceHibernate.dropUsersTable();
//        userServiceHibernate.cleanUsersTable();


//
//           UserService userServiceJbdc =  new UserServiceImpl();
//        System.out.println("Create table: ");
//        userServiceJbdc.createUsersTable();
//
//        userServiceJbdc.saveUser("Ali","Kaldarbekov", (byte) 21);
//        userServiceJbdc.saveUser("Suke","Tologonuulu", (byte) 20);
//
//        System.out.println(userServiceJbdc.getAllUsers());
//
//        userServiceJbdc.removeUserById(1L);
//
//        userServiceJbdc.dropUsersTable();
//
//        userServiceJbdc.cleanUsersTable();

    }
}
