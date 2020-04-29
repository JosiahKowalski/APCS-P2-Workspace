package com.example.helloworld;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIClass {

    String pass = "boi";



    public String getPassword() {
        return pass;
    }

    public void setPassword(String pass) {
        this.pass = pass;
    }
}

class GUI extends JPanel {

    GUIClass pw;

    GUI() {

        pw = new GUIClass();
        setLayout(new FlowLayout(FlowLayout.LEFT));
        JTextField txtField = new JTextField(10);
        txtField.setText(""+pw.getPassword());
        add(txtField);

        JButton btn = new JButton("Update");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setPassword(txtField.getText());
            }
        });
        add(btn);
    }

    private void setPassword(String text) {

        try {
            pw.setPassword(text);
            System.out.println("Speeding ticket set to " +pw.getPassword());
        } catch (NumberFormatException ex) {
            System.out.println("Invalid value " +text);
            ex.printStackTrace();
        }
    }

    public static void main(String[] args){

        JFrame frame = new JFrame("Speeding Ticket");
        frame.setSize(400,100);
        frame.add(new GUI());
        frame.setVisible(true);
    }
}