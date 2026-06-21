package com.faturalama;

import javax.swing.*;
import java.awt.*;

public class MusteriListeleEkrani extends JFrame {

    public MusteriListeleEkrani() {

        setTitle("Müşteri Listesi");
        setSize(500, 400);
        setLocationRelativeTo(null);

        JTextArea alan = new JTextArea();

        for (Musteri m : Veritabani.musteriler) {

            alan.append(
                    m.ad +
                            " " +
                            m.soyad +
                            " | " +
                            m.telefonNo +
                            "\n"
            );

        }

        add(new JScrollPane(alan));

        setVisible(true);
    }

}
