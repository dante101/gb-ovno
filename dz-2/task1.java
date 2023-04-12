package dz-2;

import java.io.IOException;
import java.util.logging.*;

public class Task_1 {
    static Logger logger;

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Task_1.class.getName());
        loggerSettings(logger);

        String text = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, " +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        parsing(text, logger);
    }
    
    static void loggerSettings(Logger logger) {
        FileHandler fh;
        try {
            fh = new FileHandler("dz-2/log.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.info("Test loggining ");
        } catch (SecurityException e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        }

    }

    static void parsing(String text, Logger logger) {
        text = text.replaceAll("[\\[\\]{\"]", "");

        String[] students;
        try {
            students = text.split("},"); 
            logger.log(Level.INFO, "the string was succesfully deleted");

            for (String note : students) {
                String[] temp = note.split(",");
                String[] name = temp[0].split(":");
                String[] ball = temp[1].split(":");
                String[] lesson = temp[2].split(":");
                lesson[1] = lesson[1].replace("}", "");

                StringBuilder sb = new StringBuilder();
                sb.append("a student ");
                sb.append(name[1]);
                sb.append(" got ");
                sb.append(ball[1]);
                sb.append(" grade ");
                sb.append(lesson[1]);
                System.out.println(sb.toString());
            }
            logger.log(Level.INFO, "get data");
        } catch (Exception e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
            logger.log(Level.INFO, "don`t get data");
        }
    }
}
