package Sabrina07239_Entity;
import java.util.Date;
public class Sabrina07239_PelangganEntity extends Sabrina07239_AbstractPelanggan{
    
   public Sabrina07239_PelangganEntity(String Sabrina07239_id,String Sabrina07239_nama,
    String Sabrina07239_alamat, String Sabrina07239_noIdentitas,String Sabrina07239_notelp,String Sabrina07239_harga,
        Date Sabrina07239_Tanggal_Sewa,Date Sabrina07239_Tanggal_pengembalian) {
        super(Sabrina07239_id, Sabrina07239_nama,Sabrina07239_alamat, Sabrina07239_noIdentitas, Sabrina07239_notelp,Sabrina07239_harga,Sabrina07239_Tanggal_Sewa,Sabrina07239_Tanggal_pengembalian);
       
    } 
   @Override
    public String getSabrina07239_id() {
        return Sabrina07239_id;
    }
    }