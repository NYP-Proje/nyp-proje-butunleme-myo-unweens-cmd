package com.faturalama;

public class Tarife {

    String tarifeAdi;
    int dakika;
    int internet;
    int sms;
    double aylikUcret;

    public Tarife(String tarifeAdi, int dakika, int internet, int sms, double aylikUcret) {

        this.tarifeAdi = tarifeAdi;
        this.dakika = dakika;
        this.internet = internet;
        this.sms = sms;
        this.aylikUcret = aylikUcret;

    }

    public void tarifeBilgisi() {

        System.out.println("Tarife: " + tarifeAdi);
        System.out.println("Dakika: " + dakika);
        System.out.println("Internet: " + internet + " GB");
        System.out.println("SMS: " + sms);
        System.out.println("Aylik Ucret: " + aylikUcret + " TL");

    }
}