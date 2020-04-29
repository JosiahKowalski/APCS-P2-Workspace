package com.example.helloworld;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpeedingTicket {

    int speedingTicket;

    public SpeedingTicket() {

        speedingTicket = 500;
    }

    public int getSpeedingTicket() {
        return speedingTicket;
    }

    public void setSpeedingTicket(int speedingTicket) {
        this.speedingTicket = speedingTicket;
    }
}

 class SpeedingTicketGUI extends JPanel {

    SpeedingTicket st;

    SpeedingTicketGUI() {

        st = new SpeedingTicket();
        setLayout(new FlowLayout(FlowLayout.LEFT));
        JTextField txtField = new JTextField(10);
        txtField.setText(""+st.getSpeedingTicket());
        add(txtField);

        JButton btn = new JButton("Update");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSpeedingTicket(txtField.getText());
            }
        });
        add(btn);
    }

    private void setSpeedingTicket(String text) {

        try {
            int speedTicket = Integer.parseInt(text);
            st.setSpeedingTicket(speedTicket);
            System.out.println("Speeding ticket set to " +st.getSpeedingTicket());
        } catch (NumberFormatException ex) {
            System.out.println("Invalid value " +text);
            ex.printStackTrace();
        }
    }

    public static void main(String[] args){

        JFrame frame = new JFrame("Speeding Ticket");
        frame.setSize(400,100);
        frame.add(new SpeedingTicketGUI());
        frame.setVisible(true);
    }
}