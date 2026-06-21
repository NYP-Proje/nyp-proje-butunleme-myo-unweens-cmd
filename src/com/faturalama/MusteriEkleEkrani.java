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
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        panel.add(new JLabel("Ad:"));
        adField = new JTextField();
        panel.add(adField);

        panel.add(new JLabel("Soyad:"));
        soyadField = new JTextField();
        panel.add(soyadField);

        panel.add(new JLabel("Telefon:"));
        telefonField = new JTextField();
        panel.add(telefonField);

        kaydetButon = new JButton("Kaydet");
        panel.add(new JLabel(""));
        panel.add(kaydetButon);

        add(panel);

        kaydetButon.addActionListener(e -> {

            String ad = adField.getText();
            String soyad = soyadField.getText();
            String telefon = telefonField.getText();

            Musteri yeniMusteri =
                    new Musteri(ad, soyad, telefon);

            Veritabani.musteriler.add(yeniMusteri);

            JOptionPane.showMessageDialog(
                    null,
                    "Müşteri Kaydedildi!\n\n" +
                            ad + " " + soyad +
                            "\nTelefon: " + telefon
            );

        });

        setVisible(true);
    }
}