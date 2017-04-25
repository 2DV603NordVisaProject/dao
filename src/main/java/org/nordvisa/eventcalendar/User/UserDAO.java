package org.nordvisa.eventcalendar.User;

import org.nordvisa.eventcalendar.DAO.DAO;

import java.util.List;

public class UserDAO extends DAO implements IUserDAO {

    public User getUser(String id) {
        return new User();
    }

    public List<User> getUsers() {
        return null;
    }

    public void createUser(User user) {

    }

    public void updateUser(User user) {

    }

    public void deleteUser(String userId) {

    }

    public void recoverPassword(String email) {

    }

    public void resetPassword(String userId) {

    }

    public void makeAdministrator(String userId) {

    }

    public void removeAdministrator(String userId) {

    }

    public void makeSuperAdministrator(String userId) {

    }

    public void login() {

    }

    public void logout() {

    }

    public void verifyEmail(String email) {

    }

    public void validateEmail() {

    }
}
