package com.faturalama;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Musteri> musteriler = new ArrayList<>();

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║      TELEFON FATURALAMA SISTEMI      ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.println();

        try {

            System.out.print("Musteri Adi: ");
            String ad = scanner.nextLine();

            System.out.print("Musteri Soyadi: ");
            String soyad = scanner.nextLine();

            System.out.print("Telefon Numarasi: ");
            String telefonNo = scanner.nextLine();

            Musteri musteri1 =
                    new Musteri(ad, soyad, telefonNo);

            musteriler.add(musteri1);

            System.out.println();
            System.out.println("✓ Musteri basariyla kaydedildi.");
            System.out.println();

            Tarife tarife1 =
                    new Tarife(
                            "Genclik Tarifesi",
                            350,
                            20,
                            1000,
                            250
                    );

            Fatura fatura1 =
                    new Fatura(tarife1.aylikUcret);

            int secim;

            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║                MENU                  ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║ 1 - Musteri Bilgileri                ║");
            System.out.println("║ 2 - Tarife Bilgileri                 ║");
            System.out.println("║ 3 - Fatura Goster                    ║");
            System.out.println("║ 4 - Musteri Listesi                  ║");
            System.out.println("║ 0 - Cikis                            ║");
            System.out.println("╚══════════════════════════════════════╝");

            System.out.print("Seciminiz: ");
            secim = scanner.nextInt();

            if (secim == 1) {

                musteri1.bilgileriGoster();

            }

            else if (secim == 2) {

                tarife1.tarifeBilgisi();

            }

            else if (secim == 3) {

                fatura1.faturaYazdir();

            }

            else if (secim == 4) {

                for (Musteri m : musteriler) {

                    System.out.println(m.ad + " " + m.soyad);

                }

            }

            else {

                System.out.println("Hatali secim yaptiniz");

            }

        }

        catch (Exception e) {

            System.out.println("Hatali veri girdiniz");

        }

    }
}git --version