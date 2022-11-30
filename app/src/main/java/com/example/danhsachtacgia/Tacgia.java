package com.example.danhsachtacgia;

public class Tacgia {
    String id,ten,mota;
    int hinhanh;
    float sosao;

    public Tacgia() {
    }

    public Tacgia(String id, String ten, String mota, int hinhanh, float sosao) {
        this.id = id;
        this.ten = ten;
        this.mota = mota;
        this.hinhanh = hinhanh;
        this.sosao = sosao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    public float getSosao() {
        return sosao;
    }

    public void setSosao(int sosao) {
        this.sosao = sosao;
    }
}
