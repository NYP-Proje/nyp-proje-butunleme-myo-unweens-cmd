package com.faturalama;

import javax.swing.*;
import java.awt.*;

public class LoginEkrani extends JFrame {

    JTextField tcField;
    JPasswordField sifreField;

    JButton girisButon;
    JButton kayitOlButon;
    JButton sifremiUnuttumButon;

    public LoginEkrani() {

        setTitle("Telefon Faturalama Sistemi");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(34, 139, 34));
        panel.setLayout(null);

        JLabel baslik = new JLabel("Telefon Faturalama Sistemi");
        baslik.setBounds(70, 30, 400, 40);
        baslik.setForeground(Color.WHITE);
        baslik.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel tcLabel = new JLabel("TC Kimlik No");
        tcLabel.setBounds(70, 100, 200, 25);
        tcLabel.setForeground(Color.WHITE);

        tcField = new JTextField();
        tcField.setBounds(70, 125, 340, 35);

        JLabel sifreLabel = new JLabel("Şifre");
        sifreLabel.setBounds(70, 175, 200, 25);
        sifreLabel.setForeground(Color.WHITE);

        sifreField = new JPasswordField();
        sifreField.setBounds(70, 200, 340, 35);

        girisButon = new JButton("Giriş Yap");
        girisButon.setBounds(70, 260, 340, 40);

        kayitOlButon = new JButton("Kayıt Ol");
        kayitOlButon.setBounds(70, 310, 165, 40);

        sifremiUnuttumButon = new JButton("Şifremi Unuttum");
        sifremiUnuttumButon.setBounds(245, 310, 165, 40);

        panel.add(baslik);
        panel.add(tcLabel);
        panel.add(tcField);
        panel.add(sifreLabel);
        panel.add(sifreField);
        panel.add(girisButon);
        panel.add(kayitOlButon);
        panel.add(sifremiUnuttumButon);

        add(panel);

        girisButon.addActionListener(e -> {

            String tc = tcField.getText();
            String sifre =
                    new String(sifreField.getPassword());

            if (tc.equals(Veritabani.kayitliTc)
                    &&
                    sifre.equals(Veritabani.kayitliSifre)) {

                dispose();
                new AnaMenu();

            } else {

                JOptionPane.showMessageDialog(
                        null,
                        "TC veya Şifre Hatalı!"
                );

            }

        });

        kayitOlButon.addActionListener(e -> {

            new KayitOlEkrani();

        });

        sifremiUnuttumButon.addActionListener(e -> {

            JOptionPane.showMessageDialog(
                    null,
                    "Kayıtlı Şifre: "
                            + Veritabani.kayitliSifre
            );

        });

        setVisible(true);
    }

    public static void main(String[] args) {

        new LoginEkrani();

    }
}