package com.faturalama;

public class Fatura {

    double tutar;

    public Fatura(double tutar) {

        this.tutar = tutar;

    }

    public void faturaYazdir() {

        System.out.println("Aylik Fatura Tutari: " + tutar + " TL");

    }
}