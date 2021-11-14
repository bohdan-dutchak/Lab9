package sender;

import lombok.AllArgsConstructor;
import twitter.TwitterUser;
import java.util.Date;

@AllArgsConstructor
public class MyTwitterUser implements  User{
    private TwitterUser user;

    @Override
    public String getCountry(){
        return user.getCountry();
    }

    @Override
    public Date getLastActiveTime(){
        return user.getLastActiveTime();
    }

    @Override
    public String getEmail(){
        return  user.getUserMail();
    }
}
