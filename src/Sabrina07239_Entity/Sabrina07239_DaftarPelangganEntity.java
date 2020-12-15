package Sabrina07239_Entity;

public class Sabrina07239_DaftarPelangganEntity {
     private Sabrina07239_PelangganEntity pelanggan;
    private boolean isVerified;
    private int indexCamera;
    
    public Sabrina07239_DaftarPelangganEntity(int indexCamera,Sabrina07239_PelangganEntity pelanggan, boolean isVerified) { 
        this.indexCamera = indexCamera;
        this.pelanggan = pelanggan;
        this.isVerified = isVerified;
    }

    public Sabrina07239_PelangganEntity getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Sabrina07239_PelangganEntity pelanggan) {
        this.pelanggan = pelanggan;
    }
    public boolean isVerified() {
        return isVerified;
    }

    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public int getIndexCamera() {
        return indexCamera;
    }

    public void setIndexCamera(int indexCamera) {
        this.indexCamera = indexCamera;
    }
    
}
