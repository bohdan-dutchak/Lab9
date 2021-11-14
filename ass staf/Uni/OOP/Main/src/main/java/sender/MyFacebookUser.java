package sender;

import facebook.FacebookUser;
import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class MyFacebookUser implements  User{
    private FacebookUser user;

    @Override
    public String getCountry(){
        return user.getUserCountry();
    }

    @Override
    public Date getLastActiveTime(){
        return user.getUserActiveTime();
    }

    @Override
    public String getEmail(){
        return  user.getEmail();
    }
}
