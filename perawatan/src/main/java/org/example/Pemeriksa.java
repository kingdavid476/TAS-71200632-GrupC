package org.example;

public class Pemeriksa {
    private int idPemeriksa;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Pemeriksa(int idPemeriksa,String nama, String spesialis, String ruangan) {
        this.idPemeriksa = idPemeriksa;
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pengunjung pengunjung, Daftar daftar) {
        if (!daftar.isStatusDaftar() || !daftar.isStatusScreening()) {
            System.out.println("Pasien ilegal");
        } else {
            pengunjung.setLevelPenyakit(pengunjung.getLevelPenyakit()-1);
            if (pengunjung.getLevelPenyakit() == 0) {
                pengunjung.setStatus(true);
                System.out.println("Pasien sudah sembuh");
            } else {
                System.out.println("Pasien masih sakit");
            }
        }
    }

    public void cekStatus(Pengunjung pengunjung) {
        pengunjung.isStatus();
    }

    public int getIdPemeriksa() {
        return idPemeriksa;
    }
}
