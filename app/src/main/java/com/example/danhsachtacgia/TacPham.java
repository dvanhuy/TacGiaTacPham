package com.example.danhsachtacgia;

import java.io.Serializable;

public class TacPham implements Serializable {
    String idtacgia,ten,noidung;
    float sosao;

    public TacPham() {
    }

    public TacPham(String idtacgia, String ten,String noidung, float sosao) {
        this.idtacgia = idtacgia;
        this.ten = ten;
        this.noidung = noidung;
        this.sosao = sosao;
    }

    public String getIdtacgia() {
        return idtacgia;
    }

    public void setIdtacgia(String idtacgia) {
        this.idtacgia = idtacgia;
    }

    public String getTen() {
        return ten;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getSosao() {
        return sosao;
    }

    public void setSosao(float sosao) {
        this.sosao = sosao;
    }
}
