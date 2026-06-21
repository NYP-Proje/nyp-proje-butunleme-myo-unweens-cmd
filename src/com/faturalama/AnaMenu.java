package com.faturalama;

import javax.swing.*;
import java.awt.*;

public class AnaMenu extends JFrame {

    public AnaMenu() {

        setTitle("Telefon Faturalama Sistemi");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));

        JButton musteriEkle = new JButton("Müşteri Ekle");
        musteriEkle.addActionListener(e -> {

            new MusteriEkleEkrani();

        });
        JButton musteriListele = new JButton("Müşteri Listele");
        musteriListele.addActionListener(e -> {

            new MusteriListeleEkrani();

        });
        JButton tarifeBilgileri = new JButton("Tarife Bilgileri");
        tarifeBilgileri.addActionListener(e -> {

            new TarifeSecEkrani();

        });
        JButton faturaGor = new JButton("Fatura Görüntüle");
        JButton cikis = new JButton("Çıkış");

        panel.add(musteriEkle);
        panel.add(musteriListele);
        panel.add(tarifeBilgileri);
        panel.add(faturaGor);
        panel.add(cikis);

        add(panel);

        cikis.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
}