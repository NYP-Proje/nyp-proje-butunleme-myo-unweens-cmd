package com.faturalama;

public class Musteri extends Kullanici {

    public String telefonNo;

    public Musteri(String ad, String soyad, String telefonNo) {
        super(ad, soyad);
        this.telefonNo = telefonNo;
    }

    public void bilgileriGoster() {

        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Telefon No: " + telefonNo);

    }
}