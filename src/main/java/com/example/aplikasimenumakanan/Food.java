package com.example.aplikasimenumakanan;

import android.os.Parcel;
import android.os.Parcelable;

public class Food implements Parcelable {
    private String nama;
    private String detail;
    private int gambar;
    private String harga;

    public Food() {

    }

    protected Food(Parcel in) {
        nama = in.readString();
        detail = in.readString();
        gambar = in.readInt();
        harga = in.readString();
    }

    public static final Creator<Food> CREATOR = new Creator<Food>() {
        @Override
        public Food createFromParcel(Parcel in) {
            return new Food(in);
        }

        @Override
        public Food[] newArray(int size) {
            return new Food[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(detail);
        parcel.writeInt(gambar);
        parcel.writeString(harga);
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
