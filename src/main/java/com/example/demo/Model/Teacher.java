package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String ad;
    private String soyad;
    private String tarih;
    private String telno;

    // bu alttaki bir constructor doğru unuttum ya hatta generatedtan seçiyodumf dslfndfl evet
    public Teacher(){

    }

    public Teacher(long id, String ad, String soyad, String tarih, String telno) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
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
