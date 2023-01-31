package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String sinifadi;
    private String tarih;

    public Classroom() {
    }

    public Classroom(long id, String sinifadi, String tarih) {
        this.id = id;
        this.sinifadi = sinifadi;
        this.tarih = tarih;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSinifadi() {
        return sinifadi;
    }

    public void setSinifadi(String sinifadi) {
        this.sinifadi = sinifadi;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
}
