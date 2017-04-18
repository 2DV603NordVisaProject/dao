package spring_rest;

import java.util.Date;
import java.util.List;

public class User {

    private int id;
    private String email;
    private String password;
    private UserAuthenticationLink resetPasswordLink;
    private UserAuthenticationLink validateEmailLink;
    private boolean isAdmin;
    private boolean isSuperAdmin;
    private Date createdAt;
    private Date updatedAt;
    private List<Event> events;

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserAuthenticationLink getResetPasswordLink() {
        return resetPasswordLink;
    }

    public void setResetPasswordLink(UserAuthenticationLink resetPasswordLink) {
        this.resetPasswordLink = resetPasswordLink;
    }

    public UserAuthenticationLink getValidateEmailLink() {
        return validateEmailLink;
    }

    public void setValidateEmailLink(UserAuthenticationLink validateEmailLink) {
        this.validateEmailLink = validateEmailLink;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isSuperAdmin() {
        return isSuperAdmin;
    }

    public void setSuperAdmin(boolean superAdmin) {
        isSuperAdmin = superAdmin;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
