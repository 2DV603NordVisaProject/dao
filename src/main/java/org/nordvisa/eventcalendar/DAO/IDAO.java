package org.nordvisa.eventcalendar.DAO;

/**
 * Handles database connection
 */
public interface IDAO {

    void connect();
    void disconnect();

}
