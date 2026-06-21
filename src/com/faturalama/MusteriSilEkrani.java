
        package com.faturalama;

import javax.swing.*;
import java.awt.*;

public class MusteriSilEkrani extends JFrame {

    JTextField telefonField;
    JButton silButon;

    public MusteriSilEkrani() {

        setTitle("Müşteri Sil");
        setSize(500, 350);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(28, 35, 49));
        panel.setLayout(null);

        JLabel baslik =
                new JLabel("Müşteri Sil");

        baslik.setBounds(160, 30, 250, 35);
        baslik.setForeground(Color.WHITE);
        baslik.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        24
                )
        );

        JLabel telefonLabel =
                new JLabel(
                        "Telefon Numarası"
                );

        telefonLabel.setBounds(
                70,
                110,
                200,
                25
        );

        telefonLabel.setForeground(
                Color.WHITE
        );

        telefonField =
                new JTextField();

        telefonField.setBounds(
                70,
                140,
                340,
                40
        );

        silButon =
                new JButton(
                        "Müşteriyi Sil"
                );

        silButon.setBounds(
                70,
                220,
                340,
                45
        );

        silButon.setBackground(
                new Color(
                        231,
                        76,
                        60
                )
        );

        silButon.setForeground(
                Color.WHITE
        );

        panel.add(baslik);
        panel.add(telefonLabel);
        panel.add(telefonField);
        panel.add(silButon);

        add(panel);

        silButon.addActionListener(e -> {

            String telefon =
                    telefonField.getText();

            boolean bulundu =
                    false;

            for (int i = 0;
                 i < Veritabani.musteriler.size();
                 i++) {

                if (Veritabani.musteriler
                        .get(i)
                        .telefonNo
                        .equals(telefon)) {

                    Veritabani.musteriler
                            .remove(i);

                    bulundu = true;

                    JOptionPane.showMessageDialog(
                            null,
                            "Müşteri Silindi!"
                    );

                    break;

                }

            }

            if (!bulundu) {

                JOptionPane.showMessageDialog(
                        null,
                        "Müşteri Bulunamadı!"
                );

            }

        });

        setVisible(true);

    }

}
