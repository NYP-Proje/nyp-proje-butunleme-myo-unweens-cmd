
        package com.faturalama;

import javax.swing.*;
import java.awt.*;

public class FaturaEkrani extends JFrame {

    public FaturaEkrani() {

        setTitle("Fatura Bilgileri");
        setSize(600, 450);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(28, 35, 49));
        panel.setLayout(new BorderLayout());

        JLabel baslik =
                new JLabel(
                        "Fatura Bilgileri",
                        SwingConstants.CENTER
                );

        baslik.setForeground(Color.WHITE);
        baslik.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        24
                )
        );

        JTextArea alan =
                new JTextArea();

        alan.setEditable(false);

        alan.setBackground(
                new Color(44, 62, 80)
        );

        alan.setForeground(
                Color.WHITE
        );

        alan.setFont(
                new Font(
                        "Consolas",
                        Font.PLAIN,
                        16
                )
        );

        alan.append(
                "========== FATURA ==========\n\n"
        );

        alan.append(
                "Tarife : Genclik Tarifesi\n"
        );

        alan.append(
                "Dakika : 350 DK\n"
        );

        alan.append(
                "Internet : 20 GB\n"
        );

        alan.append(
                "SMS : 1000\n\n"
        );

        alan.append(
                "Aylik Ucret : 250 TL\n\n"
        );

        alan.append(
                "Fatura Durumu : Odenmedi\n"
        );

        alan.append(
                "\nSon Odeme Tarihi : 30.06.2026"
        );

        JScrollPane scroll =
                new JScrollPane(alan);

        panel.add(
                baslik,
                BorderLayout.NORTH
        );

        panel.add(
                scroll,
                BorderLayout.CENTER
        );

        add(panel);

        setVisible(true);

    }

}

