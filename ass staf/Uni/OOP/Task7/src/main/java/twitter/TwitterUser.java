package twitter;

import java.util.Date;

public class TwitterUser {
    private String userMail;
    private String country;
    private Date lastActiveTime;

    public String getUserMail() {
        return this.userMail;
    }

    public String getCountry() {
        return this.country;
    }

    public Date getLastActiveTime() {
        return this.lastActiveTime;
    }

    public TwitterUser(String userMail, String country, Date lastActiveTime) {
        this.userMail = userMail;
        this.country = country;
        this.lastActiveTime = lastActiveTime;
    }
}