package com.faturalama;

import javax.swing.*;
import java.awt.*;

public class TarifeSecEkrani extends JFrame {

    public TarifeSecEkrani() {

        setTitle("Tarife Bilgileri");
        setSize(500, 300);
        setLocationRelativeTo(null);

        JTextArea alan = new JTextArea();

        alan.append("GENCLIK TARIFESI\n");
        alan.append("350 DK | 20 GB | 1000 SMS | 250 TL\n\n");

        alan.append("PREMIUM TARIFE\n");
        alan.append("1000 DK | 50 GB | 5000 SMS | 500 TL\n\n");

        alan.append("KURUMSAL TARIFE\n");
        alan.append("SINIRSIZ DK | 100 GB | SINIRSIZ SMS | 900 TL\n");

        add(new JScrollPane(alan));

        setVisible(true);
    }


}
