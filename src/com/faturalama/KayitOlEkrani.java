package com.faturalama;

import javax.swing.*;
import java.awt.*;

public class KayitOlEkrani extends JFrame {

    JTextField tcField;
    JPasswordField sifreField;

    JButton kayitButon;

    public KayitOlEkrani() {

        setTitle("Kayıt Ol");
        setSize(450, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(230, 255, 230));
        panel.setLayout(null);

        JLabel baslik =
                new JLabel("Yeni Kullanıcı Kaydı");

        baslik.setBounds(110, 20, 250, 30);
        baslik.setFont(
                new Font("Arial",
                        Font.BOLD,
                        20)
        );

        JLabel tcLabel =
                new JLabel("TC Kimlik No");

        tcLabel.setBounds(50, 80, 150, 25);

        tcField = new JTextField();
        tcField.setBounds(50, 105, 320, 35);

        JLabel sifreLabel =
                new JLabel("Şifre");

        sifreLabel.setBounds(50, 150, 150, 25);

        sifreField =
                new JPasswordField();

        sifreField.setBounds(50, 175, 320, 35);

        kayitButon =
                new JButton("Kayıt Ol");

        kayitButon.setBounds(
                50,
                220,
                320,
                35
        );

        panel.add(baslik);
        panel.add(tcLabel);
        panel.add(tcField);
        panel.add(sifreLabel);
        panel.add(sifreField);
        panel.add(kayitButon);

        add(panel);

        kayitButon.addActionListener(e -> {

            Veritabani.kayitliTc =
                    tcField.getText();

            Veritabani.kayitliSifre =
                    new String(
                            sifreField.getPassword()
                    );

            JOptionPane.showMessageDialog(
                    null,
                    "Kayıt Başarılı!"
            );

            dispose();

        });

        setVisible(true);
    }
}