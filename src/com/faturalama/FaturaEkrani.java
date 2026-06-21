package com.faturalama;

import javax.swing.*;
import java.awt.*;

public class FaturaEkrani extends JFrame {

```
    public FaturaEkrani() {

        setTitle("Fatura Bilgileri");
        setSize(500, 350);
        setLocationRelativeTo(null);

        JTextArea alan = new JTextArea();

        alan.append("========== FATURA ==========\n\n");

        alan.append("Tarife: Genclik Tarifesi\n");
        alan.append("Dakika: 350 DK\n");
        alan.append("Internet: 20 GB\n");
        alan.append("SMS: 1000\n\n");

        alan.append("Aylik Ucret: 250 TL\n\n");

        alan.append("Durum: Odenmedi");

        add(new JScrollPane(alan));

        setVisible(true);
    }
```

}
