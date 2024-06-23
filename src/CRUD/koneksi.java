/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement; //coding crud
import java.sql.ResultSet;

/**
 *
 * @author ilham
 */
public class koneksi {
    private String databaseName = "2210020064_ilham";
    private String username = "root";
    private String password = "";
    
    public static Connection koneksi;
    
    public koneksi(){
        try {
           String url= "jdbc:mysql://localhost/"+this.databaseName;
           Class.forName("com.mysql.jdbc.Driver");
           koneksi = DriverManager.getConnection(url,this.username,this.password);
           System.out.print("database terkoneksi");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void simpanrigester(String id_register, String password, String username){
        try {
            String sql = "INSERT INTO register (id_register, password, username) VALUES (?, ?, ?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id_register);
            perintah.setString(2, password);
            perintah.setString(3, username);
            perintah.executeUpdate();
            System.out.println("Data customer berhasil disimpan");
        } catch (Exception e) {
            System.out.println("Gagal menyimpan data customer: " + e.getMessage());
        }
    }
    
    public void simpancustomer(String id_customer, String id_register, String nama, String password, String tlp, String email, String alamat, String username){
        try {
            String sql = "INSERT INTO customer (id_customer, id_register, nama, password, tlp, email, alamat, username) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id_customer);
            perintah.setString(2, id_register);
            perintah.setString(3, nama);
            perintah.setString(4, password);
            perintah.setString(5, tlp);
            perintah.setString(6, email);
            perintah.setString(7, alamat);
            perintah.setString(8, username);
            perintah.executeUpdate();
            System.out.println("Data customer berhasil disimpan");
        } catch (Exception e) {
            System.out.println("Gagal menyimpan data customer: " + e.getMessage());
        }
    }
    
    public void ubahcustomer(String id_customer, String id_register, String nama, String password, String tlp, String email, String alamat, String username){
        try {
            String sql = "UPDATE customer SET username = ?, id_register = ?, nama = ?, password = ?, tlp = ?, email = ?, alamat = ? WHERE id_customer = ?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, username);
            perintah.setString(2, id_register);
            perintah.setString(3, nama);
            perintah.setString(4, password);
            perintah.setString(5, tlp);
            perintah.setString(6, email);
            perintah.setString(7, alamat);
            perintah.setString(8, id_customer);
            perintah.executeUpdate();
            System.out.println("Data customer berhasil diubah");
        } catch (Exception e) {
            System.out.println("Gagal diubah data customer: " + e.getMessage());
        }
    }
    
    public void hapuscustomer(String id_customer){
        try {
            String sql = "DELETE FROM customer WHERE id_customer = ?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id_customer);
            perintah.executeUpdate();
            System.out.println("Data customer berhasil dihapus");
        } catch (Exception e) {
            System.out.println("Gagal menghapus data customer: " + e.getMessage());
        }
    }
    
    
    public void simpanpesanan(String id_pesanan, String id_customer, String id_barang, String id_service, String tanggal, 
            String nama_service, String nama_barang, String nama, String ambil_barang, String tlp, String email,
            String alamat, String keterangan, String harga, String detail){
        try {
            String sql = "INSERT INTO pesanan () VALUES (?, ?, ?, ?, ?, ?, ?, ?,  ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id_pesanan);
            perintah.setString(2, id_customer);
            perintah.setString(3, id_barang);
            perintah.setString(4, id_service);
            perintah.setString(5, tanggal);
            perintah.setString(6, nama_service);
            perintah.setString(7, nama_barang);
            perintah.setString(8, nama);
            perintah.setString(9, ambil_barang);
            perintah.setString(10, tlp);
            perintah.setString(11, email);
            perintah.setString(12, alamat);
            perintah.setString(13, keterangan);
            perintah.setString(14, harga);
            perintah.setString(15, detail);
            perintah.executeUpdate();
            System.out.println("Data customer berhasil disimpan");
        } catch (Exception e) {
            System.out.println("Gagal menyimpan data customer: " + e.getMessage());
        }
    }
    
    public void ubahpesanan(String id_pesanan, String id_customer, String id_barang, String id_service, String tanggal, 
            String nama_service, String nama_barang, String nama, String ambil_barang, String tlp, String email,
            String alamat, String keterangan, String harga, String detail) {
        try {
            String sql = "UPDATE pesanan SET id_customer = ?, id_barang = ?, id_service = ?, tanggal = ?, nama_service = ?, nama_barang = ?, nama = ?, ambil_barang = ?, tlp = ?, email = ?, alamat = ?, keterangan = ?, harga = ?, detail = ? WHERE id_pesanan = ?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id_customer);
            perintah.setString(2, id_barang);
            perintah.setString(3, id_service);
            perintah.setString(4, tanggal);
            perintah.setString(5, nama_service);
            perintah.setString(6, nama_barang);
            perintah.setString(7, nama);
            perintah.setString(8, ambil_barang);
            perintah.setString(9, tlp);
            perintah.setString(10, email);
            perintah.setString(11, alamat);
            perintah.setString(12, keterangan);
            perintah.setString(13, harga);
            perintah.setString(14, detail);
            perintah.setString(15, id_pesanan);
            perintah.executeUpdate();
            System.out.println("Data pesanan berhasil diubah");
        } catch (Exception e) {
            System.out.println("Gagal mengubah data pesanan: " + e.getMessage());
        }
    }
    
    public void hapuspesanan(String id_pesanan) {
        try {
            String sql = "DELETE FROM pesanan WHERE id_pesanan = ?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id_pesanan);
            perintah.executeUpdate();
            System.out.println("Data pesanan berhasil dihapus");
        } catch (Exception e) {
            System.out.println("Gagal menghapus data pesanan: " + e.getMessage());
        }
    }

    public void simpanbarang(String id_barang, String nama_barang, String harga, String keterangan){
        try {
            String sql = "INSERT INTO barang (id_barang, nama_barang, harga, keterangan) VALUES (?, ?, ?, ?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id_barang);
            perintah.setString(2, nama_barang);
            perintah.setString(3, harga);
            perintah.setString(4, keterangan);
            perintah.executeUpdate();
            System.out.println("Data customer berhasil disimpan");
        } catch (Exception e) {
            System.out.println("Gagal menyimpan data customer: " + e.getMessage());
        }
    }
    
    public void ubahbarang(String id_barang, String nama_barang, String harga, String keterangan) {
        try {
            String sql = "UPDATE barang SET nama_barang = ?, harga = ?, keterangan = ? WHERE id_barang = ?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, nama_barang);
            perintah.setString(2, harga);
            perintah.setString(3, keterangan);
            perintah.setString(4, id_barang);
            perintah.executeUpdate();
            System.out.println("Data barang berhasil diubah");
        } catch (Exception e) {
            System.out.println("Gagal mengubah data barang: " + e.getMessage());
        }
    }
    
    public void hapusbarang(String id_barang) {
        try {
            String sql = "DELETE FROM barang WHERE id_barang = ?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id_barang);
            perintah.executeUpdate();
            System.out.println("Data barang berhasil dihapus");
        } catch (Exception e) {
            System.out.println("Gagal menghapus data barang: " + e.getMessage());
        }
    }

    public void simpanservice(String id_service, String nama_service, String harga, String keterangan){
        try {
            String sql = "INSERT INTO service (id_service, nama_service, harga, keterangan) VALUES (?, ?, ?, ?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id_service);
            perintah.setString(2, nama_service);
            perintah.setString(3, harga);
            perintah.setString(4, keterangan);
            perintah.executeUpdate();
            System.out.println("Data customer berhasil disimpan");
        } catch (Exception e) {
            System.out.println("Gagal menyimpan data customer: " + e.getMessage());
        }
    }
    
    public void ubahservice(String id_service, String nama_service, String harga, String keterangan) {
        try {
            String sql = "UPDATE service SET nama_service = ?, harga = ?, keterangan = ? WHERE id_service = ?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, nama_service);
            perintah.setString(2, harga);
            perintah.setString(3, keterangan);
            perintah.setString(4, id_service);
            perintah.executeUpdate();
        System.out.println("Data service berhasil diubah");
        } catch (Exception e) {
            System.out.println("Gagal mengubah data service: " + e.getMessage());
        }
    }

    public void hapusservice(String id_service) {
        try {
            String sql = "DELETE FROM service WHERE id_service = ?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id_service);
            perintah.executeUpdate();
            System.out.println("Data service berhasil dihapus");
        } catch (Exception e) {
            System.out.println("Gagal menghapus data service: " + e.getMessage());
        }
    }

    public void simpanlaporan(String id_laporan, String id_pesanan, String tanggal, String detail, String harga){
        try {
            String sql = "INSERT INTO laporan (id_laporan, id_pesanan, tanggal, detail, harga) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id_laporan);
            perintah.setString(2, id_pesanan);
            perintah.setString(3, tanggal);
            perintah.setString(4, detail);
            perintah.setString(5, harga);
            perintah.executeUpdate();
            System.out.println("Data customer berhasil disimpan");
        } catch (Exception e) {
            System.out.println("Gagal menyimpan data customer: " + e.getMessage());
        }
    }
    
    public void ubahlaporan(String id_laporan, String id_pesanan, String tanggal, String detail, String harga) {
        try {
            String sql = "UPDATE laporan SET id_pesanan = ?, tanggal = ?, detail = ?, harga = ? WHERE id_laporan = ?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id_pesanan);
            perintah.setString(2, tanggal);
            perintah.setString(3, detail);
            perintah.setString(4, harga);
            perintah.setString(5, id_laporan);
            perintah.executeUpdate();
            System.out.println("Data laporan berhasil diubah");
        } catch (Exception e) {
            System.out.println("Gagal mengubah data laporan: " + e.getMessage());
        }
    }

    public void hapuslaporan(String id_laporan) {
        try {
            String sql = "DELETE FROM laporan WHERE id_laporan = ?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id_laporan);
            perintah.executeUpdate();
            System.out.println("Data laporan berhasil dihapus");
        } catch (Exception e) {
            System.out.println("Gagal menghapus data laporan: " + e.getMessage());
        }
    }   
}