package org.example;

public class Pengunjung {
    private int rm;
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit;
    private boolean status = false;

    public Pengunjung(int rm, String nama, int usia, String alamat, String penyakit) {
        setRm(rm);
        setNama(nama);
        setUsia(usia);
        setAlamat(alamat);
        setPenyakit(penyakit);
    }

    public Pengunjung(String nama, int usia, String alamat) {
        setNama(nama);
        setUsia(usia);
        setAlamat(alamat);
    }

    public int getRm() {
        return rm;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public int getLevelPenyakit() {
        return levelPenyakit;
    }

    public boolean isStatus() {
        return status;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public void setLevelPenyakit(int levelPenyakit) {
        this.levelPenyakit = levelPenyakit;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
