package Sabrina07239_Entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Date;

public abstract class Sabrina07239_AbstractPelanggan {
    protected String Sabrina07239_id,Sabrina07239_nama,Sabrina07239_alamat,Sabrina07239_noIdentitas,Sabrina07239_notelp,Sabrina07239_harga;
    protected Date Sabrina07239_Tanggal_Sewa,Sabrina07239_Tanggal_pengembalian;
    
public Sabrina07239_AbstractPelanggan(String Sabrina07239_id,String Sabrina07239_nama,
    String Sabrina07239_alamat, String Sabrina07239_noIdentitas,String Sabrina07239_notelp,String Sabrina07239_harga,
        Date Sabrina07239_Tanggal_Sewa,Date Sabrina07239_Tanggal_pengembalian){
    this.Sabrina07239_id=Sabrina07239_id;
    this.Sabrina07239_nama=Sabrina07239_nama;
    this.Sabrina07239_alamat=Sabrina07239_alamat;
    this.Sabrina07239_noIdentitas=Sabrina07239_noIdentitas;
    this.Sabrina07239_harga=Sabrina07239_harga;
    this.Sabrina07239_Tanggal_Sewa=Sabrina07239_Tanggal_Sewa;
    
}
 public Sabrina07239_AbstractPelanggan (){ 
    }  
 public abstract String getSabrina07239_id();
 
    public void setSabrina07239_id(String Sabrina07239_id) {
        this.Sabrina07239_id = Sabrina07239_id;
    }

    public String getSabrina07239_nama() {
        return Sabrina07239_nama;
    }
    public void setSabrina07239_nama(String Sabrina07239_nama) {
        this.Sabrina07239_nama = Sabrina07239_nama;
    }
    public String getSabrina07239_alamat() {
        return Sabrina07239_alamat;
    }
    public void setSabrina07239_alamat(String Sabrina07239_alamat) {
        this.Sabrina07239_alamat = Sabrina07239_alamat;
    }
    public String getSabrina07239_noIdentitas() {
        return Sabrina07239_noIdentitas;
    }
    public void setSabrina07239_noIdentitas(String Sabrina07239_noIdentitas) {
        this.Sabrina07239_noIdentitas = Sabrina07239_noIdentitas;
    }
    public String getSabrina07239_notelp() {
        return Sabrina07239_notelp;
    }
    public void setSabrina07239_notelp(String Sabrina07239_notelp) {
        this.Sabrina07239_notelp = Sabrina07239_notelp;
    }  

    public String getSabrina07239_harga() {
        return Sabrina07239_harga;
    }

    public Date getSabrina07239_Tanggal_Sewa() {
        return Sabrina07239_Tanggal_Sewa;
    }

    public Date getSabrina07239_Tanggal_pengembalian() {
        return Sabrina07239_Tanggal_pengembalian;
    }

    public void setSabrina07239_harga(String Sabrina07239_harga) {
        this.Sabrina07239_harga = Sabrina07239_harga;
    }

    public void setSabrina07239_Tanggal_Sewa(Date Sabrina07239_Tanggal_Sewa) {
        this.Sabrina07239_Tanggal_Sewa = Sabrina07239_Tanggal_Sewa;
    }

    public void setSabrina07239_Tanggal_pengembalian(Date Sabrina07239_Tanggal_pengembalian) {
        this.Sabrina07239_Tanggal_pengembalian = Sabrina07239_Tanggal_pengembalian;
    }
    
}
