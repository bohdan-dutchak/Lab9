package authorization;

import db.БазаДаних;

public class Авторизація {
    public Авторизація() {
    }

    public boolean авторизуватися(БазаДаних db) {
        db.отриматиДаніКористувача();
        return true;
    }
}
