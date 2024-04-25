package peaksoft.service.serviceImpl;

import peaksoft.dao.UserDao;
import peaksoft.dao.daoImpl.UserDaoHibernateImpl;
import peaksoft.model.User;
import peaksoft.service.UserService;

import java.util.List;

public class UserHibernateImpl implements UserService {
    UserDao userDao = new UserDaoHibernateImpl();
    @Override
    public void createUsersTable() {

    }

    @Override
    public void dropUsersTable() {
        userDao.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name,lastName,age);

    }

    @Override
    public void removeUserById(long id) {
        userDao.removeUserById(id);

    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }
}
