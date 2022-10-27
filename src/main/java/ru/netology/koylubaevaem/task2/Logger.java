package ru.netology.koylubaevaem.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {

    private int num = 1;
    private static Logger logger;
    private static final SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    private Logger() {

    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("[" + formatter.format(calendar.getTime()) + num++ + "] " + msg);
    }
}
