package Sabrina07239_Model;
import Sabrina07239_Entity.Sabrina07239_AnggotaEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Sabrina07239_AnggotaModel implements Sabrina07239_ModelInterfaces {
    private  ArrayList <Sabrina07239_AnggotaEntity> anggotaEntityArrayList;
    
    public Sabrina07239_AnggotaModel(){
    anggotaEntityArrayList = new ArrayList<Sabrina07239_AnggotaEntity>();
    }
    public void insertAslab(Sabrina07239_AnggotaEntity anggota){
        anggotaEntityArrayList.add(anggota);
    }
     @Override
    public void view(){
        for (Sabrina07239_AnggotaEntity Astrid07221_AnggotaEntity : anggotaEntityArrayList){
        System.out.print(Astrid07221_AnggotaEntity.getSabrina07239_id());
        System.out.print(Astrid07221_AnggotaEntity.getSabrina07239_nama());
        System.out.print(Astrid07221_AnggotaEntity.getSabrina07239_alamat());
        System.out.print(Astrid07221_AnggotaEntity.getSabrina07239_noIdentitas());
        System.out.print(Astrid07221_AnggotaEntity.getSabrina07239_notelp());
        System.out.println();
        }
    }
    
    public int cekData(String Sabrina07239_id, String Sabrina07239_nama){
        int loop = 0;
        for(Sabrina07239_AnggotaEntity aslabEntity : anggotaEntityArrayList){
            if(aslabEntity.getSabrina07239_id().equals(Sabrina07239_id) && aslabEntity.getSabrina07239_nama().equals(Sabrina07239_nama)){
            break;
            }else{
                loop++;
            }
        }
        return loop;
   }
    public Sabrina07239_AnggotaEntity showDataAslab(int index){
        return anggotaEntityArrayList.get(index);
    }
}

