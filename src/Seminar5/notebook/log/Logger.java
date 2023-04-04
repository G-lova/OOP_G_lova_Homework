package Seminar5.notebook.log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
    private Date date;
    private static final String logFilePath = "log.txt";
    private String info;

    public Logger(String info) {
        this.date = new Date();
        this.info = info;
        try (FileWriter fw = new FileWriter("log.txt", true)) {
            StringBuilder str = new StringBuilder(date.toString());
            str.append(": ").append(info);
            fw.write(str.toString());
            fw.write('\n');
            fw.flush();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createLogFile(){
        try {
            File logFile = new File(logFilePath);
            if (logFile.createNewFile()) {
                System.out.println("LOG_FILE created");
            }
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
