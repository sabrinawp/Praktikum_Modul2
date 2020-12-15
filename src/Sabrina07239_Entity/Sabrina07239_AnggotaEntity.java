package Sabrina07239_Entity;

import java.util.Date;
public class Sabrina07239_AnggotaEntity extends Sabrina07239_RentalAbstractEntity{

    
    private String rental_camera;
    public Sabrina07239_AnggotaEntity(String Sabrina07239_id,String Sabrina07239_nama,
    String Sabrina07239_alamat, String Sabrina07239_noIdentitas,String Sabrina07239_notelp){
        super(Sabrina07239_id, Sabrina07239_nama, Sabrina07239_alamat, Sabrina07239_noIdentitas, Sabrina07239_notelp); 
        this.rental_camera =rental_camera;
}
    @Override //menurunkan sifat ke objek lain
    public String getSabrina07239_id() {
        return Sabrina07239_id;
    }
    public String getrental_camera() {
        return rental_camera;
    }
   public void setrental_camera(String rental_camera) {
        this.rental_camera = rental_camera;
    } 
}

