
        package com.faturalama;

import javax.swing.*;
import java.awt.*;

public class LoginEkrani extends JFrame {

    JTextField tcField;
    JPasswordField sifreField;

    JButton girisButon;
    JButton kayitOlButon;
    JButton sifremiUnuttumButon;

    public LoginEkrani() {

        setTitle("Telefon Faturalama Sistemi");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(28, 35, 49));
        panel.setLayout(null);

        JLabel baslik =
                new JLabel("Telefon Faturalama Sistemi");

        baslik.setBounds(55, 35, 400, 40);
        baslik.setForeground(Color.WHITE);
        baslik.setFont(
                new Font("Arial",
                        Font.BOLD,
                        26)
        );

        JLabel tcLabel =
                new JLabel("TC Kimlik No");

        tcLabel.setBounds(70, 110, 200, 25);
        tcLabel.setForeground(Color.WHITE);

        tcField = new JTextField();
        tcField.setBounds(70, 135, 340, 38);

        JLabel sifreLabel =
                new JLabel("Şifre");

        sifreLabel.setBounds(70, 190, 200, 25);
        sifreLabel.setForeground(Color.WHITE);

        sifreField =
                new JPasswordField();

        sifreField.setBounds(
                70,
                215,
                340,
                38
        );

        girisButon =
                new JButton("Giriş Yap");

        girisButon.setBounds(
                70,
                280,
                340,
                42
        );

        girisButon.setBackground(
                new Color(46, 204, 113)
        );

        girisButon.setForeground(
                Color.WHITE
        );

        kayitOlButon =
                new JButton("Kayıt Ol");

        kayitOlButon.setBounds(
                70,
                340,
                165,
                40
        );

        kayitOlButon.setBackground(
                new Color(52, 152, 219)
        );

        kayitOlButon.setForeground(
                Color.WHITE
        );

        sifremiUnuttumButon =
                new JButton("Şifremi Unuttum");

        sifremiUnuttumButon.setBounds(
                245,
                340,
                165,
                40
        );

        sifremiUnuttumButon.setBackground(
                new Color(231, 76, 60)
        );

        sifremiUnuttumButon.setForeground(
                Color.WHITE
        );

        panel.add(baslik);
        panel.add(tcLabel);
        panel.add(tcField);
        panel.add(sifreLabel);
        panel.add(sifreField);
        panel.add(girisButon);
        panel.add(kayitOlButon);
        panel.add(sifremiUnuttumButon);

        add(panel);

        girisButon.addActionListener(e -> {

            String tc =
                    tcField.getText();

            String sifre =
                    new String(
                            sifreField.getPassword()
                    );

            boolean girisBasarili =
                    false;

            for (Hesap h :
                    Veritabani.hesaplar) {

                if (h.tc.equals(tc)
                        &&
                        h.sifre.equals(sifre)) {

                    girisBasarili = true;
                    break;

                }

            }

            if (girisBasarili) {

                dispose();
                new AnaMenu();

            } else {

                JOptionPane.showMessageDialog(
                        null,
                        "TC veya Şifre Hatalı!"
                );

            }

        });

        kayitOlButon.addActionListener(e -> {

            new KayitOlEkrani();

        });

        sifremiUnuttumButon.addActionListener(e -> {

            String tc =
                    JOptionPane.showInputDialog(
                            "TC Giriniz"
                    );

            for (Hesap h :
                    Veritabani.hesaplar) {

                if (h.tc.equals(tc)) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Şifreniz: "
                                    + h.sifre
                    );

                    return;

                }

            }

            JOptionPane.showMessageDialog(
                    null,
                    "Kullanıcı Bulunamadı"
            );

        });

        setVisible(true);

    }

    public static void main(String[] args) {

        new LoginEkrani();

    }

}

