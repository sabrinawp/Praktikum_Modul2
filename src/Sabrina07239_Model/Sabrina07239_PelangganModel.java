package Sabrina07239_Model;
import Sabrina07239_Entity.Sabrina07239_PelangganEntity;
import java.util.ArrayList;
public class Sabrina07239_PelangganModel implements Sabrina07239_ModelInterfaces{
     private ArrayList<Sabrina07239_PelangganEntity> pelangganEntityArrayList;
     
     public Sabrina07239_PelangganModel(){
        pelangganEntityArrayList = new ArrayList<Sabrina07239_PelangganEntity>();
    }
public void insert(Sabrina07239_PelangganEntity pelangganEntity){
    pelangganEntityArrayList.add(pelangganEntity);  
}
 @Override
    public void view(){
        for(Sabrina07239_PelangganEntity pelangganEntity : pelangganEntityArrayList){
            System.out.println("===========================================");
            System.out.println(" ID : "+pelangganEntity.getSabrina07239_id()+"\n Nama : "
            +pelangganEntity.getSabrina07239_nama()+"\n Alamat : "+pelangganEntity.getSabrina07239_alamat()+
            "\n No Identitas: "+pelangganEntity.getSabrina07239_noIdentitas()+"\n No Telepon : "
            +pelangganEntity.getSabrina07239_notelp());
            System.out.println("===========================================");
        }
    }
    public int cekData(String Sabrina07239_id, String Sabrina07239_nama){
        int loop = 0;
        while (!pelangganEntityArrayList.get(loop).getSabrina07239_id().equals(Sabrina07239_id) && 
                !pelangganEntityArrayList.get(loop).getSabrina07239_nama().equals(Sabrina07239_nama)){
            loop++;
        }
        return loop;
    }
    public Sabrina07239_PelangganEntity getpelangganEntityArrayList(int index){
        return pelangganEntityArrayList.get(index);
    }
}

