package org.example;

public class Perawat {
    private int idPerawat;
    private String nama;

    public Perawat(int idPerawat,String nama) {
        this.idPerawat = idPerawat;
        this.nama = nama;
    }

    public void screening(Pengunjung pengunjung, Daftar daftar) {
        if (daftar.isStatusDaftar()) {
            daftar.setStatusScreening(true);
        } else {
            System.out.println("Anda harus mendaftar terlebih dahulu");
        }
    }

    public int getIdPerawat() {
        return idPerawat;
    }
}
