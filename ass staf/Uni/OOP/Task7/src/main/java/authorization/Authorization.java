package authorization;

import db.DataBase;

public class Authorization {
    public Authorization() {
    }

    public boolean authorize(DataBase db) {
        db.getUserData();
        return true;
    }
}
