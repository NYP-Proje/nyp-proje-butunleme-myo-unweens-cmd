
        package com.faturalama;

import javax.swing.*;
import java.awt.*;

public class AnaMenu extends JFrame {

    public AnaMenu() {

        setTitle("Telefon Faturalama Sistemi");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1, 10, 10));

        JButton musteriEkle = new JButton("Müşteri Ekle");
        JButton musteriListele = new JButton("Müşteri Listele");
        JButton musteriSil = new JButton("Müşteri Sil");
        JButton tarifeBilgileri = new JButton("Tarife Bilgileri");
        JButton faturaGor = new JButton("Fatura Görüntüle");
        JButton cikis = new JButton("Çıkış");

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
