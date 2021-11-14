package sender;

import facebook.FacebookUser;
import java.util.Date;

public class MyFacebookUser implements User {
    private FacebookUser user;

    public String getCountry() {
        return this.user.getUserCountry();
    }

    public Date getLastActiveTime() {
        return this.user.getUserActiveTime();
    }

    public String getEmail() {
        return this.user.getEmail();
    }

    public MyFacebookUser(FacebookUser user) {
        this.user = user;
    }
}
