package com.faturalama;

import javax.swing.*;
import java.awt.*;

public class AnaMenu extends JFrame {

    public AnaMenu() {

        setTitle("Telefon Faturalama Sistemi v2.0");
        setSize(600, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(30, 30, 30));
        panel.setLayout(new GridLayout(8, 1, 15, 15));

        JLabel baslik =
                new JLabel(
                        "TELEFON FATURALAMA SISTEMI",
                        SwingConstants.CENTER
                );

        baslik.setForeground(Color.WHITE);
        baslik.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        22
                )
        );

        JLabel hosgeldin =
                new JLabel(
                        "Hos Geldiniz",
                        SwingConstants.CENTER
                );

        hosgeldin.setForeground(Color.LIGHT_GRAY);

        JButton musteriEkle =
                new JButton("Müşteri Ekle");

        JButton musteriListele =
                new JButton("Müşteri Listele");

        JButton musteriSil =
                new JButton("Müşteri Sil");

        JButton tarifeBilgileri =
                new JButton("Tarife Bilgileri");

        JButton faturaGor =
                new JButton("Fatura Görüntüle");

        JButton cikis =
                new JButton("Çıkış");

        Color renk =
                new Color(0, 120, 215);

        JButton[] butonlar = {
                musteriEkle,
                musteriListele,
                musteriSil,
                tarifeBilgileri,
                faturaGor,
                cikis
        };

        for (JButton b : butonlar) {

            b.setBackground(renk);
            b.setForeground(Color.WHITE);
            b.setFont(
                    new Font(
                            "Arial",
                            Font.BOLD,
                            16
                    )
            );

        }

        panel.add(baslik);
        panel.add(hosgeldin);
        panel.add(musteriEkle);
        panel.add(musteriListele);
        panel.add(musteriSil);
        panel.add(tarifeBilgileri);
        panel.add(faturaGor);
        panel.add(cikis);

        add(panel);

        musteriEkle.addActionListener(e ->
                new MusteriEkleEkrani());

        musteriListele.addActionListener(e ->
                new MusteriListeleEkrani());

        musteriSil.addActionListener(e ->
                new MusteriSilEkrani());

        tarifeBilgileri.addActionListener(e ->
                new TarifeSecEkrani());

        faturaGor.addActionListener(e ->
                new FaturaEkrani());

        cikis.addActionListener(e ->
                System.exit(0));

        setVisible(true);
    }
}