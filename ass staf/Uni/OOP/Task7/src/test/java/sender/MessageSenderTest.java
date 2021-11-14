package sender;

import facebook.FacebookUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {

    @Test
    void send_but_wrong_country() {
        Date date = new Date();
        FacebookUser fb = new FacebookUser("Naruto@gmail.com", "Japan", date);
        User user = new MyFacebookUser(fb);
        Assertions.assertEquals(false, MessageSender.send("Help, I can't deal with my problems", user, "China"));
    }

    @Test
    void send_exp_false() {
        Calendar cal = Calendar.getInstance();
        cal.set(1, 2020);
        cal.set(2, 10);
        cal.set(5, 10);
        cal.set(11, 10);
        cal.set(12, 10);
        cal.set(13, 0);
        cal.set(14, 0);
        Date date = cal.getTime();
        FacebookUser fb = new FacebookUser("Naruto@gmail.com", "Japan", date);
        User user = new MyFacebookUser(fb);
        Assertions.assertEquals(false, MessageSender.send("Help, I can't deal with my problems", user, "Japan"));
    }

    @Test
    void send_exp_true() {
        Calendar cal = Calendar.getInstance();
        cal.set(1, 2021);
        cal.set(2, 11);
        cal.set(5, 14);
        cal.set(11, 23);
        cal.set(12, 5);
        cal.set(13, 0);
        cal.set(14, 0);
        Date date = cal.getTime();
        TwitterUser tu = new TwitterUser("Sasuke@gmail.com", "Japan", date);
        User user = new MyTwitterUser(tu);
        Assertions.assertEquals(true, MessageSender.send("Help, I can't deal with my problems", user, "Japan"));
    }
}