package main.java.com.georgescuconstantin.designpatterns.creationals.singleton;

public class DemoSingleton {

    public static void main(String[] args) {
        Database database = Database.getDatabaseInstance();
        database.connect();
        database.query();
        database.disconnect();
    }
}
