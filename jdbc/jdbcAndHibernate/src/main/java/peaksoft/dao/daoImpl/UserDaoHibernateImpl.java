package peaksoft.dao.daoImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import peaksoft.Util.HibernateConfig;
import peaksoft.dao.UserDao;
import peaksoft.model.User;

import java.util.List;

public class UserDaoHibernateImpl implements UserDao {
    //EntityManagerFactory entityManagerFactory = HibernateConfig.getSession();
    EntityManagerFactory getEntityManagerFactory = HibernateConfig.getEntityManagerFactory();


    @Override
    public void createUsersTable() {

    }

    @Override
    public void dropUsersTable() {
        try (EntityManager entityManager = getEntityManagerFactory.createEntityManager()) {
            entityManager.getTransaction().begin();
            entityManager.createNativeQuery("drop table  users").executeUpdate();
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        try (EntityManager entityManager = getEntityManagerFactory.createEntityManager()){
            entityManager.getTransaction().begin();
            User user = new User(name, lastName,age);
            entityManager.persist(user);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void removeUserById(long id) {
        try (EntityManager entityManager = getEntityManagerFactory.createEntityManager()) {
            entityManager.getTransaction().begin();
            entityManager.createQuery("delete from User c where c.id = :id")
                    .setParameter("id", id)
                    .executeUpdate();
            entityManager.getTransaction().commit();

        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }



    @Override
    public List<User> getAllUsers() {
            EntityManager entityManager = getEntityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            List<User> allUsers = entityManager.createQuery("select u from User u ", User.class).getResultList();
            entityManager.getTransaction().commit();
        return allUsers;
    }

    @Override
    public void cleanUsersTable() {
        try (EntityManager entityManager = getEntityManagerFactory.createEntityManager()){
            entityManager.getTransaction().begin();
            entityManager.createQuery("delete from User ").executeUpdate();
            entityManager.getTransaction().commit();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
