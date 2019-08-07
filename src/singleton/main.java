/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import Forms.MainForm;

import java.io.File;

public class main {
    public static void main(String[] arguments) {

        // Delete log file on project start
        File file = new File("log_file.txt");

        if (file.delete()) {
            System.out.println("File deleted successfully");
        }

        // Create main form
        new MainForm();
    }

}