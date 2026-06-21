
        package com.faturalama;

import javax.swing.*;
import java.awt.*;

public class TarifeSecEkrani extends JFrame {

    public TarifeSecEkrani() {

        setTitle("Tarife Bilgileri");
        setSize(600, 450);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(28, 35, 49));
        panel.setLayout(new BorderLayout());

        JLabel baslik =
                new JLabel(
                        "Tarife Bilgileri",
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
                        "Arial",
                        Font.PLAIN,
                        16
                )
        );

        alan.append(
                "GENCLIK TARIFESI\n"
        );

        alan.append(
                "350 DK | 20 GB | 1000 SMS | 250 TL\n"
        );

        alan.append(
                "---------------------------------------\n\n"
        );

        alan.append(
                "PREMIUM TARIFE\n"
        );

        alan.append(
                "1000 DK | 50 GB | 5000 SMS | 500 TL\n"
        );

        alan.append(
                "---------------------------------------\n\n"
        );

        alan.append(
                "KURUMSAL TARIFE\n"
        );

        alan.append(
                "SINIRSIZ DK | 100 GB | SINIRSIZ SMS | 900 TL\n"
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
