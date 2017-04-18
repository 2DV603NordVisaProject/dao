package User;

import java.util.List;

/**
 * Work in progress
 */
public interface IUserDAO {

    User getUser(String id);            // Get a single user
    List<User> getUsers();              // Get all users
    void createUser(User user);         // Create user
    void updateUser(User user);         // Update user
    void deleteUser(String userId);     // Delete user

    void recoverPassword(String email); // Recover user password
    void resetPassword(String userId);  // Reset user password

    void makeAdministrator(String userId); // Make user administrator
    void removeAdministrator(String userId); // Remove administrator privileges from user
    void makeSuperAdministrator(String userId); // Give user super administrator privileges

    void login();                       // Login
    void logout();                      // Logout
    void verifyEmail(String email);     // Verify user email
    void validateEmail();               //

}
