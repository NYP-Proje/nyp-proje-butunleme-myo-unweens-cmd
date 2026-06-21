
        package com.faturalama;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String tc = "12345678901";
        String sifre = "admin123";

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║      TELEFON FATURALAMA SISTEMI      ║");
        System.out.println("╚══════════════════════════════════════╝");

        System.out.print("TC Kimlik No: ");
        String girilenTc = scanner.nextLine();

        System.out.print("Sifre: ");
        String girilenSifre = scanner.nextLine();

        if (!girilenTc.equals(tc) || !girilenSifre.equals(sifre)) {

            System.out.println("Giris basarisiz!");
            return;

        }

        System.out.println("\nGiris basarili!\n");

        ArrayList<Musteri> musteriler = new ArrayList<>();

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

        try {

            int secim;

            do {

                System.out.println();
                System.out.println("╔══════════════════════════════════════╗");
                System.out.println("║                MENU                  ║");
                System.out.println("╠══════════════════════════════════════╣");
                System.out.println("║ 1 - Musteri Ekle                     ║");
                System.out.println("║ 2 - Musteri Listele                  ║");
                System.out.println("║ 3 - Tarife Bilgileri                 ║");
                System.out.println("║ 4 - Fatura Goster                    ║");
                System.out.println("║ 0 - Cikis                            ║");
                System.out.println("╚══════════════════════════════════════╝");

                System.out.print("Seciminiz: ");
                secim = scanner.nextInt();

                switch (secim) {

                    case 1:

                        scanner.nextLine();

                        System.out.print("Musteri Adi: ");
                        String ad = scanner.nextLine();

                        System.out.print("Musteri Soyadi: ");
                        String soyad = scanner.nextLine();

                        System.out.print("Telefon Numarasi: ");
                        String telefonNo = scanner.nextLine();

                        Musteri yeniMusteri =
                                new Musteri(ad, soyad, telefonNo);

                        musteriler.add(yeniMusteri);

                        System.out.println("✓ Musteri basariyla eklendi.");

                        break;

                    case 2:

                        if (musteriler.isEmpty()) {

                            System.out.println("Kayitli musteri bulunamadi.");

                        } else {

                            System.out.println("\n--- MUSTERI LISTESI ---");

                            for (Musteri m : musteriler) {

                                System.out.println(
                                        m.ad + " " +
                                                m.soyad +
                                                " | " +
                                                m.telefonNo
                                );

                            }

                        }

                        break;

                    case 3:

                        tarife1.tarifeBilgisi();
                        break;

                    case 4:

                        fatura1.faturaYazdir();
                        break;

                    case 0:

                        System.out.println("Program sonlandirildi.");
                        break;

                    default:

                        System.out.println("Hatali secim yaptiniz.");

                }

            } while (secim != 0);

        }

        catch (Exception e) {

            System.out.println("Hatali veri girdiniz.");

        }

    }

}
