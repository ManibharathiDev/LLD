package correctdependencyinversion;

import diamond.D;

public class MainDB {
    public static void main(String[] args)
    {



        CloudDb cloudDb = new GcpDb();
        DatabaseManager databaseManager = new DatabaseManager(cloudDb);
        databaseManager.addStudent();
        databaseManager.makeConnection();
    }
}
