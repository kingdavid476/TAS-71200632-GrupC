package org.example;

import java.sql.*;
public class DAO {
    public Pemeriksa getPemeriksaByID(int idPemeriksa) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perawatan","root","");
        PreparedStatement stmt = con.prepareStatement("SELECT idPemeriksa FROM pemeriksa VALUE (?)");
        stmt.setInt(1, idPemeriksa);
        stmt.executeUpdate();
        return null;
    }

    public Perawat getPerawatByID(int idPerawat) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perawatan","root","");
        PreparedStatement stmt = con.prepareStatement("SELECT idPemeriksa FROM daftar VALUE (?)");
        stmt.setInt(1, idPerawat);
        stmt.executeUpdate();
        return null;
    }

    public Pendaftaran getPendaftaranByID(int idPendaftaran) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perawatan","root","");
        PreparedStatement stmt = con.prepareStatement("SELECT idPemeriksa FROM daftar VALUE (?)");
        stmt.setInt(1, idPendaftaran);
        int id = stmt.executeUpdate();
        return null;
    }

    public static void inputPengunjung(Pengunjung pengunjung) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perawatan","root","");
        PreparedStatement stmt = con.prepareStatement("INSERT INTO pengunjung VALUE (?,?,?,?)");
        stmt.setInt(1, pengunjung.getRm());
        stmt.setString(2, pengunjung.getNama());
        stmt.setInt(3, pengunjung.getUsia());
        stmt.setString(4, pengunjung.getAlamat());
        stmt.executeUpdate();
    }

    public static void inputDaftar(Daftar daftar) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perawatan","root","");
        PreparedStatement stmt = con.prepareStatement("INSERT INTO daftar VALUE (?,?,?,?)");
        stmt.setInt(1, daftar.getIdPemeriksaan());
        stmt.setInt(2, daftar.getPengunjung().getRm());
        stmt.setInt(3, daftar.getPemeriksa().getIdPemeriksa());
        stmt.setInt(4, daftar.getPerawat().getIdPerawat());
        stmt.executeUpdate();
    }
}
