package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();
        UserDaoJDBCImpl userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();

        userDao.saveUser("Name2", "LastName1", (byte) 20);

        userDao.cleanUsersTable();
        System.out.println(userDao.getAllUsers());
//        userDao.dropUsersTable();
    }
}
