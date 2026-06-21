
        package com.faturalama;

import javax.swing.*;

public class MusteriSilEkrani extends JFrame {

    public MusteriSilEkrani() {

        String telefon = JOptionPane.showInputDialog(
                "Silinecek müşterinin telefon numarasını giriniz:"
        );

        boolean bulundu = false;

        for (int i = 0; i < Veritabani.musteriler.size(); i++) {

            if (Veritabani.musteriler.get(i).telefonNo.equals(telefon)) {

                Veritabani.musteriler.remove(i);

                JOptionPane.showMessageDialog(
                        null,
                        "Müşteri silindi."
                );

                bulundu = true;
                break;
            }

        }

        if (!bulundu) {

            JOptionPane.showMessageDialog(
                    null,
                    "Müşteri bulunamadı."
            );

        }

        dispose();
    }
}

