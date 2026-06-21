
        package com.faturalama;

import javax.swing.*;
import java.awt.*;

public class KayitOlEkrani extends JFrame {

    JTextField tcField;
    JPasswordField sifreField;

    JButton kayitButon;

    public KayitOlEkrani() {

        setTitle("Kayıt Ol");
        setSize(500, 450);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(28, 35, 49));
        panel.setLayout(null);

        JLabel baslik =
                new JLabel("Yeni Kullanıcı Kaydı");

        baslik.setBounds(90, 35, 350, 40);
        baslik.setForeground(Color.WHITE);
        baslik.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        26
                )
        );

        JLabel tcLabel =
                new JLabel("TC Kimlik No");

        tcLabel.setBounds(
                70,
                110,
                200,
                25
        );

        tcLabel.setForeground(
                Color.WHITE
        );

        tcField =
                new JTextField();

        tcField.setBounds(
                70,
                135,
                340,
                38
        );

        JLabel sifreLabel =
                new JLabel("Şifre");

        sifreLabel.setBounds(
                70,
                190,
                200,
                25
        );

        sifreLabel.setForeground(
                Color.WHITE
        );

        sifreField =
                new JPasswordField();

        sifreField.setBounds(
                70,
                215,
                340,
                38
        );

        kayitButon =
                new JButton("Kayıt Ol");

        kayitButon.setBounds(
                70,
                290,
                340,
                45
        );

        kayitButon.setBackground(
                new Color(
                        52,
                        152,
                        219
                )
        );

        kayitButon.setForeground(
                Color.WHITE
        );

        kayitButon.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        15
                )
        );

        panel.add(baslik);
        panel.add(tcLabel);
        panel.add(tcField);
        panel.add(sifreLabel);
        panel.add(sifreField);
        panel.add(kayitButon);

        add(panel);

        kayitButon.addActionListener(e -> {

            Hesap yeniHesap =
                    new Hesap(
                            tcField.getText(),
                            new String(
                                    sifreField.getPassword()
                            )
                    );

            Veritabani.hesaplar.add(
                    yeniHesap
            );

            JOptionPane.showMessageDialog(
                    null,
                    "Kayıt Başarıyla Oluşturuldu!"
            );

            dispose();

        });

        setVisible(true);

    }

}

