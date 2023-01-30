package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String ad;
    private String soyad;
    private Float aylik;
    private Float kayittutar;
    private Integer taksitsayisi;
    private String tarih;
    private String telno;

    public Student(long id, String ad, String soyad, Float aylik, Float kayittutar, Integer taksitsayisi, String tarih, String telno) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.aylik = aylik;
        this.kayittutar = kayittutar;
        this.taksitsayisi = taksitsayisi;
        this.tarih = tarih;
        this.telno = telno;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Float getAylik() {
        return aylik;
    }

    public void setAylik(Float aylik) {
        this.aylik = aylik;
    }

    public Float getKayittutar() {
        return kayittutar;
    }

    public void setKayittutar(Float kayittutar) {
        this.kayittutar = kayittutar;
    }

    public Integer getTaksitsayisi() {
        return taksitsayisi;
    }

    public void setTaksitsayisi(Integer taksitsayisi) {
        this.taksitsayisi = taksitsayisi;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }
}
