/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {

    public static void log(String s) {
        try {
            FileWriter fw = new FileWriter("log_file.txt", true);
            fw.write("New Log (" + getCurrentTime() + "): " + s + '\n');
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Done...\n");
    }

    private static String getCurrentTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        return sdf.format(cal.getTime());
    }
}