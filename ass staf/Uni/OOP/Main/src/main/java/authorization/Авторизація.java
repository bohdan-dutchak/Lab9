package authorization;

import db.БазаДаних;

public class Авторизація {
    public boolean авторизуватися(БазаДаних db) {
        db.отриматиДаніКористувача();
        return true;
    }
}
