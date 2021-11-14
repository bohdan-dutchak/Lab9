package legacy;

import authorization.Authorization;
import db.DataBase;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorization authorization = new Authorization();
        if (authorization.authorize(db)) {
            new ReportBuilder(db);
        }

    }
}
