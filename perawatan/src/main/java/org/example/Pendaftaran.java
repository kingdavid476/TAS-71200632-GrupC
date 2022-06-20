package org.example;

import java.sql.SQLException;
import java.util.Scanner;
public class Pendaftaran {
    private int idPendaftaran;
    private String nama;

    public Pendaftaran(int idPendaftaran,String nama) {
        this.idPendaftaran = idPendaftaran;
        this.nama = nama;
    }

    public void mengaturDaftar(Pengunjung pengunjung,Pemeriksa pemeriksa, Perawat perawat, Daftar daftar) throws SQLException {
        if (!pengunjung.isStatus()) {
            daftar.setPengunjung(pengunjung);
            daftar.setPemeriksa(pemeriksa);
            daftar.setPerawat(perawat);
            daftar.setStatusDaftar(true);

            DAO.inputDaftar(daftar);
        }
    }



    public Pengunjung registrasi() throws SQLException {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan rm baru : ");
        int rm = Integer.parseInt(in.nextLine());
        System.out.print("Masukkan nama anda : ");
        String nama = in.nextLine();
        System.out.print("Masukkan usia anda : ");
        int usia = Integer.parseInt(in.nextLine());
        System.out.print("Masukkan alamat anda : ");
        String alamat = in.nextLine();
        System.out.print("Masukkan penyakit anda : ");
        String penyakit = in.nextLine();

        Pengunjung pengunjung = new Pengunjung(rm,nama,usia,alamat,penyakit);
        DAO.inputPengunjung(pengunjung);
        return pengunjung;
    }

    public int getIdPendaftaran() {
        return idPendaftaran;
    }
}
