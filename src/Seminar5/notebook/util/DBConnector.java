package Seminar5.notebook.util;

import Seminar5.notebook.log.Logger;

import java.io.File;

public class DBConnector {
    public static final String DB_PATH = "db.txt";
    public static void createDB() {
        StringBuilder info = new StringBuilder("createDB: ");
        try {
            File db = new File(DB_PATH);
            if (db.createNewFile()) {
                info.append("successful");
                Logger log = new Logger(info.toString());
                System.out.println(info.toString());
            }
            else {
                System.out.println("DB exists");
            }
        }
        catch (Exception e) {
            info.append("ERROR ").append(e);
            Logger log = new Logger(info.toString());
            System.err.println(e);
        }
    }
}