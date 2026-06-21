
        package com.faturalama;

import javax.swing.*;
import java.awt.*;

public class AnaMenu extends JFrame {

    public AnaMenu() {

        setTitle("Telefon Faturalama Sistemi v1.0");
        setSize(550, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(220, 235, 255));
        panel.setLayout(new GridLayout(6, 1, 15, 15));

        JButton musteriEkle = new JButton("Müşteri Ekle");
        JButton musteriListele = new JButton("Müşteri Listele");
        JButton musteriSil = new JButton("Müşteri Sil");
        JButton tarifeBilgileri = new JButton("Tarife Bilgileri");
        JButton faturaGor = new JButton("Fatura Görüntüle");
        JButton cikis = new JButton("Çıkış");

        Font butonFont = new Font("Arial", Font.BOLD, 16);

        musteriEkle.setFont(butonFont);
        musteriListele.setFont(butonFont);
        musteriSil.setFont(butonFont);
        tarifeBilgileri.setFont(butonFont);
        faturaGor.setFont(butonFont);
        cikis.setFont(butonFont);

        panel.add(musteriEkle);
        panel.add(musteriListele);
        panel.add(musteriSil);
        panel.add(tarifeBilgileri);
        panel.add(faturaGor);
        panel.add(cikis);

        add(panel);

        musteriEkle.addActionListener(e -> {
            new MusteriEkleEkrani();
        });

        musteriListele.addActionListener(e -> {
            new MusteriListeleEkrani();
        });

        musteriSil.addActionListener(e -> {
            new MusteriSilEkrani();
        });

        tarifeBilgileri.addActionListener(e -> {
            new TarifeSecEkrani();
        });

        faturaGor.addActionListener(e -> {
            new FaturaEkrani();
        });

        cikis.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
}

