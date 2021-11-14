package db;

public class DataBase {
    public DataBase() {
    }

    public String getUserData() {
        БазаДаних temp = new БазаДаних();
        return temp.отриматиДаніКористувача();
    }

    public String getStats() {
        БазаДаних temp = new БазаДаних();
        return temp.отриматиСтатистичніДані();
    }
}