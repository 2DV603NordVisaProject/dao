package org.nordvisa.eventcalendar.User;

import java.util.Date;

public class UserAuthenticationLink {

    private String url;
    private Date timestamp;

    public UserAuthenticationLink() {

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
