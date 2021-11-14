package sender;

import facebook.FacebookUser;
import twitter.TwitterUser;

import java.util.Date;
import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {

    @org.junit.jupiter.api.Test
    void send_but_wrong_country() {
        Date date = new Date();
        FacebookUser fb = new FacebookUser("Naruto@gmail.com","Japan", date);
        User user = new MyFacebookUser(fb);
        assertEquals(false, MessageSender.send("Help, I can't deal with my problems",user,"China"));
    }

    @org.junit.jupiter.api.Test
    void send_exp_false() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH,10);
        cal.set(Calendar.DAY_OF_MONTH,10);
        cal.set(Calendar.HOUR_OF_DAY,10);
        cal.set(Calendar.MINUTE,10);
        cal.set(Calendar.SECOND,0);
        cal.set(Calendar.MILLISECOND,0);

        Date date = cal.getTime();
        FacebookUser fb = new FacebookUser("Naruto@gmail.com","Japan", date);
        User user = new MyFacebookUser(fb);
        assertEquals(false, MessageSender.send("Help, I can't deal with my problems",user,"Japan"));
    }

    @org.junit.jupiter.api.Test
    void send_exp_true() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2021);
        cal.set(Calendar.MONTH,11);
        cal.set(Calendar.DAY_OF_MONTH,14);
        cal.set(Calendar.HOUR_OF_DAY,21);
        cal.set(Calendar.MINUTE,50);
        cal.set(Calendar.SECOND,0);
        cal.set(Calendar.MILLISECOND,0);
        Date date = cal.getTime();

        TwitterUser tu = new TwitterUser("Sasuke@gmail.com","Japan", date);
        User user = new MyTwitterUser(tu);
        assertEquals(true, MessageSender.send("Help, I can't deal with my problems",user,"Japan"));
    }
}