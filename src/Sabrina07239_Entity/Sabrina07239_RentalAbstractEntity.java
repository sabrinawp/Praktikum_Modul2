package Sabrina07239_Entity;
import java.text.SimpleDateFormat;
import java.util.Date;
public abstract class Sabrina07239_RentalAbstractEntity {
    protected String Sabrina07239_id,Sabrina07239_nama,Sabrina07239_alamat,Sabrina07239_noIdentitas,Sabrina07239_notelp;
    
public Sabrina07239_RentalAbstractEntity(String Sabrina07239_id,String Sabrina07239_nama,
    String Sabrina07239_alamat, String Sabrina07239_noIdentitas,String Sabrina07239_notelp){
    this.Sabrina07239_id=Sabrina07239_id;
    this.Sabrina07239_nama=Sabrina07239_nama;
    this.Sabrina07239_alamat=Sabrina07239_alamat;
    this.Sabrina07239_noIdentitas=Sabrina07239_noIdentitas;
    
}
 public Sabrina07239_RentalAbstractEntity (){ 
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
    
}

