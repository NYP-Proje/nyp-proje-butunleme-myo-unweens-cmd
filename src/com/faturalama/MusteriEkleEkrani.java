
        package com.faturalama;

import javax.swing.*;
import java.awt.*;

public class MusteriEkleEkrani extends JFrame {

    JTextField adField;
    JTextField soyadField;
    JTextField telefonField;

    JButton kaydetButon;

    public MusteriEkleEkrani() {

        setTitle("Müşteri Ekle");
        setSize(500, 450);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(28, 35, 49));
        panel.setLayout(null);

        JLabel baslik =
                new JLabel("Müşteri Ekle");

        baslik.setBounds(150, 30, 250, 35);
        baslik.setForeground(Color.WHITE);
        baslik.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        24
                )
        );

        JLabel adLabel =
                new JLabel("Ad");

        adLabel.setBounds(70, 100, 150, 25);
        adLabel.setForeground(Color.WHITE);

        adField =
                new JTextField();

        adField.setBounds(
                70,
                125,
                340,
                35
        );

        JLabel soyadLabel =
                new JLabel("Soyad");

        soyadLabel.setBounds(
                70,
                175,
                150,
                25
        );

        soyadLabel.setForeground(
                Color.WHITE
        );

        soyadField =
                new JTextField();

        soyadField.setBounds(
                70,
                200,
                340,
                35
        );

        JLabel telefonLabel =
                new JLabel("Telefon");

        telefonLabel.setBounds(
                70,
                250,
                150,
                25
        );

        telefonLabel.setForeground(
                Color.WHITE
        );

        telefonField =
                new JTextField();

        telefonField.setBounds(
                70,
                275,
                340,
                35
        );

        kaydetButon =
                new JButton("Müşteri Kaydet");

        kaydetButon.setBounds(
                70,
                340,
                340,
                40
        );

        kaydetButon.setBackground(
                new Color(
                        46,
                        204,
                        113
                )
        );

        kaydetButon.setForeground(
                Color.WHITE
        );

        panel.add(baslik);
        panel.add(adLabel);
        panel.add(adField);
        panel.add(soyadLabel);
        panel.add(soyadField);
        panel.add(telefonLabel);
        panel.add(telefonField);
        panel.add(kaydetButon);

        add(panel);

        kaydetButon.addActionListener(e -> {

            String ad =
                    adField.getText();

            String soyad =
                    soyadField.getText();

            String telefon =
                    telefonField.getText();

            Musteri yeniMusteri =
                    new Musteri(
                            ad,
                            soyad,
                            telefon
                    );

            Veritabani.musteriler.add(
                    yeniMusteri
            );

            JOptionPane.showMessageDialog(
                    null,
                    "Müşteri Başarıyla Kaydedildi!"
            );

        });

        setVisible(true);

    }

}

