package sender;

import java.util.Date;
import twitter.TwitterUser;

public class MyTwitterUser implements User {
    private TwitterUser user;

    public String getCountry() {
        return this.user.getCountry();
    }

    public Date getLastActiveTime() {
        return this.user.getLastActiveTime();
    }

    public String getEmail() {
        return this.user.getUserMail();
    }

    public MyTwitterUser(TwitterUser user) {
        this.user = user;
    }
}
