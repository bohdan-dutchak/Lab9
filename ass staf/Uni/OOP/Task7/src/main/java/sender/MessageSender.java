package sender;

import java.util.Date;

public class MessageSender {
    public MessageSender() {
    }

    public static boolean send(String text, User user, String country) {
        if (user.getCountry().equals(country)) {
            Date currentDate = new Date();
            Long hourInMs = new Long(3600000L);
            if (hourInMs.compareTo(currentDate.getTime() - user.getLastActiveTime().getTime()) > 0) {
                message(text, user.getEmail());
                System.out.println("message sent successfully");
                return true;
            } else {
                System.out.println("user hasn't been active last hour");
                return false;
            }
        } else {
            System.out.println("country does not match");
            return false;
        }
    }

    private static boolean message(String text, String email) {
        if (!email.isEmpty()) {
            System.out.printf("From: Developer\nTo: %s\n\n%s\n", email, text);
            return true;
        } else {
            System.out.println("invalid email");
            return false;
        }
    }
}
