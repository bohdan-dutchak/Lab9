package facebook;

import java.util.Date;

public class FacebookUser {
    private String email;
    private String userCountry;
    private Date userActiveTime;

    public String getEmail() {
        return this.email;
    }

    public String getUserCountry() {
        return this.userCountry;
    }

    public Date getUserActiveTime() {
        return this.userActiveTime;
    }

    public FacebookUser(String email, String userCountry, Date userActiveTime) {
        this.email = email;
        this.userCountry = userCountry;
        this.userActiveTime = userActiveTime;
    }
}