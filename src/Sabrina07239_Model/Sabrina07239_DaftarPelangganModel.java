package Sabrina07239_Model;
import Sabrina07239_Entity.Sabrina07239_DaftarPelangganEntity;
import Sabrina07239_Entity.Sabrina07239_CameraEntity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Sabrina07239_DaftarPelangganModel implements Sabrina07239_ModelInterfaces{
    private ArrayList<Sabrina07239_DaftarPelangganEntity> daftarpelangganArrayList;
    public Sabrina07239_DaftarPelangganModel(){
    daftarpelangganArrayList = new ArrayList<Sabrina07239_DaftarPelangganEntity>();
        }
    public void insertDataDaftarprak(Sabrina07239_DaftarPelangganEntity daftarpelanggan){
        daftarpelangganArrayList.add(daftarpelanggan);
    }
    public ArrayList<Sabrina07239_DaftarPelangganEntity> getdaftarpelangganArrayList(){
        return daftarpelangganArrayList;
    }
    @Override
    public void view(){
        for(Sabrina07239_DaftarPelangganEntity daftarpelanggan : daftarpelangganArrayList){
        System.out.println("===========================================");
        System.out.print("ID : "+daftarpelanggan.getPelanggan().getSabrina07239_id()+"\n Nama : "
        +daftarpelanggan.getPelanggan().getSabrina07239_nama()+"\n Alamat "+daftarpelanggan.getPelanggan().getSabrina07239_alamat()+
        "\n No Identitas "+daftarpelanggan.getPelanggan().getSabrina07239_noIdentitas()+
        "\n No Telepon "+daftarpelanggan.getPelanggan().getSabrina07239_notelp()+
        "\n Praktikum : "+Sabrina07239_CameraEntity.merk[daftarpelanggan.getIndexCamera()]+
        "\n harga "+daftarpelanggan.getPelanggan().getSabrina07239_harga()+
        "\n Tanggal Lahir : "+new SimpleDateFormat("dd-MM-yyyy").format(daftarpelanggan.getPelanggan().getSabrina07239_Tanggal_Sewa())+
         "\n Tanggal Lahir : "+new SimpleDateFormat("dd-MM-yyyy").format(daftarpelanggan.getPelanggan().getSabrina07239_Tanggal_pengembalian())+
        "\n IsVerified : ");
        if(daftarpelanggan.isVerified() == false){
        System.out.println("Belum Di Verifikasi Admin");
        }else{
        System.out.println("Telah Di Verifikasi");
            }
        System.out.println("===========================================");
        }
    }
    public int cekData(String Sabrina07239_id, String Sabrina07239_nama){
        int loop = 0;
        if(daftarpelangganArrayList.size() ==0){
            loop = -1;//data kosong
        }else{
            for(int i = 0; i <daftarpelangganArrayList.size(); i++){
            if(daftarpelangganArrayList.get(i).getPelanggan().getSabrina07239_id().equals(Sabrina07239_id)){
                loop = i;
                break;
            }else{
                loop = -2;
                }
            }
        }   return loop;
    }
    public Sabrina07239_DaftarPelangganEntity showDaftarprak(int index){
        return daftarpelangganArrayList.get(index);
    }
    public void updateIsVerified(int index,Sabrina07239_DaftarPelangganEntity daftarpelanggan){
    daftarpelangganArrayList.set(index, daftarpelanggan);
    }
}

