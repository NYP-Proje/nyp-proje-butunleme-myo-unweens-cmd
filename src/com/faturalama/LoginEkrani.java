package com.faturalama;

import javax.swing.*;
import java.awt.*;

public class LoginEkrani extends JFrame {

    JTextField tcField;
    JPasswordField sifreField;
    JButton girisButon;

    public LoginEkrani() {

        setTitle("Telefon Faturalama Sistemi");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel tcLabel = new JLabel("TC Kimlik No:");
        JLabel sifreLabel = new JLabel("Şifre:");

        tcField = new JTextField();
        sifreField = new JPasswordField();

        girisButon = new JButton("Giriş Yap");

        panel.add(tcLabel);
        panel.add(tcField);

        panel.add(sifreLabel);
        panel.add(sifreField);

        panel.add(new JLabel(""));
        panel.add(girisButon);

        add(panel);

        girisButon.addActionListener(e -> {

            String tc = tcField.getText();
            String sifre = new String(sifreField.getPassword());

            if (tc.equals("12345678901") &&
                    sifre.equals("admin123")) {

                dispose();

                new AnaMenu();

            } else {

                JOptionPane.showMessageDialog(
                        null,
                        "TC veya Şifre Hatalı!"
                );

            }

        });

        setVisible(true);
    }

    public static void main(String[] args) {

        new LoginEkrani();

    }
}