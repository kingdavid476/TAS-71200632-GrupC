package org.example;

public class Daftar {
    private int idPemeriksaan;
    private Pengunjung pengunjung;
    private Pemeriksa pemeriksa;
    private Perawat perawat;
    private Pendaftaran pendaftaran;
    private boolean statusDaftar = false;
    private boolean statusScreening = false;

    public Daftar() {
        this.pengunjung = pengunjung;
        this.pemeriksa = pemeriksa;
        this.perawat = perawat;
        this.pendaftaran = pendaftaran;
    }

    public boolean isStatusScreening() {
        return statusScreening;
    }

    public int getIdPemeriksaan() {
        return idPemeriksaan;
    }

    public Pengunjung getPengunjung() {
        return pengunjung;
    }

    public Pemeriksa getPemeriksa() {
        return pemeriksa;
    }

    public Perawat getPerawat() {
        return perawat;
    }

    public Pendaftaran getPendaftaran() {
        return pendaftaran;
    }

    public void setPengunjung(Pengunjung pengunjung) {
        this.pengunjung = pengunjung;
    }

    public void setPemeriksa(Pemeriksa pemeriksa) {
        this.pemeriksa = pemeriksa;
    }

    public void setPerawat(Perawat perawat) {
        this.perawat = perawat;
    }

    public void setStatusDaftar(boolean statusDaftar) {
        this.statusDaftar = statusDaftar;
    }

    public boolean isStatusDaftar() {
        return statusDaftar;
    }

    public void setStatusScreening(boolean statusScreening) {
        this.statusScreening = statusScreening;
    }
}
