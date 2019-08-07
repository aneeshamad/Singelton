/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Util.Logger;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainForm extends JFrame {
    
    public MainForm() {
        this.setDefaultCloseOperation(3);
        this.setTitle("Main Form");
        this.setSize(600, 200);
        this.setLayout(new FlowLayout(2));
        this.setVisible(true);
        JButton b1 = new JButton("Show Calender 1");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                MainForm.this.showNewCalender();
            }
        });
        JButton b2 = new JButton("Show Calender 2");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                MainForm.this.showNewCalender();
            }
        });
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(2));
        panel.add(b1);
        panel.add(b2);
        this.add(panel);
    }

    public void  showNewCalender() {
        SwingCalendar sc = SwingCalendar.getInstance();
        Logger.log("Object HC: " + sc.hashCode());
        
        sc.setVisible(true);
        
    }
}