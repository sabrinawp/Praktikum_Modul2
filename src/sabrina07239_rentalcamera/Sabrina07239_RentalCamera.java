package sabrina07239_rentalcamera;
import Sabrina07239_Entity.*;
import Sabrina07239_Model.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Sabrina07239_RentalCamera {
    private static Sabrina07239_AnggotaModel anggotaModel = new Sabrina07239_AnggotaModel();
    private static Scanner input = new Scanner (System.in);
    private static Sabrina07239_PelangganModel pelangganModel = new Sabrina07239_PelangganModel();
    private static Sabrina07239_DaftarPelangganModel daftarPelangganmodel = new Sabrina07239_DaftarPelangganModel();
    private static int pilCamera;
    static int cekpelanggan;
    static int cekanggota;
    
  public static void main(String[] args){
        int loop=0;
        dataanggota();
        do{
           int pilih = 0;
           System.out.print("Selamat Datang Di Data Rental !!" +
                            "\n 1. Login" +
                            "\n 2. Daftar Pelanggan" +
                            "\n 0. Stop" +
                            "\n Masukkan Pilihan Anda : ");
                        pilih = input.nextInt();
                        if(pilih == 1){
                            int pilLogin = 0;
            System.out.print("1. Login Anggota" + "\n2. Login pelanggan" + "\n Pilih : ");
                pilLogin = input.nextInt();
                if(pilLogin == 1){
                    loginAnggota();
                }else{
                    login();
                }
            }else if(pilih == 2){
                register();
            }else if(pilih == 3){
                anggotaModel.view();
            }else if (pilih == 4){
            }else{
                break;
            }
        }while (loop != 1);
    }
    static void dataanggota(){
        String Sabrina07239_id[] = {"01","02","03"};
        String Sabrina07239_nama [] = {"astrid","sabrina","alex"};
        String Sabrina07239_alamat [] = {"mojokerto" , "mojokerto" , "sidoarjo"};
        String Sabrina07239_noIdentitas [] = {"01","02","03"};
        String Sabrina07239_notelp [] = {"01","02","03"};
              for(int i=0;i<Sabrina07239_id.length;i++){
                anggotaModel.insertAslab(new Sabrina07239_AnggotaEntity(Sabrina07239_id[i],Sabrina07239_nama[i],Sabrina07239_alamat[i],
                        Sabrina07239_noIdentitas[i],Sabrina07239_notelp[i]));
            }
    }
    static void register(){
        System.out.print("Input ID = ");
        String Sabrina07239_id = input.next();
        System.out.print("Input nama = ");
        String Sabrina07239_nama = input.next();
        System.out.print("Input Alamat = ");
        String Sabrina07239_alamat = input.next();
        System.out.print("Input no Identitas = ");
        String Sabrina07239_noIdentitas =  input.next();
        System.out.print("Input no Telepon = ");
        String Sabrina07239_notelp =  input.next();
        System.out.print("Input harga = ");
        String Sabrina07239_harga =  input.next();
        System.out.print("Input Tgl sewa (dd/mm/yyyy) = ");
        Date Sabrina07239_Tanggal_Sewa = new Date(input.next());
        System.out.print("Input Tgl sewa (dd/mm/yyyy) = ");
        Date Sabrina07239_Tanggal_pengembalian = new Date(input.next());
        pelangganModel.insert(new Sabrina07239_PelangganEntity(Sabrina07239_id,Sabrina07239_nama,Sabrina07239_alamat,Sabrina07239_noIdentitas,Sabrina07239_notelp,Sabrina07239_harga,
        Sabrina07239_Tanggal_Sewa,Sabrina07239_Tanggal_pengembalian));
    }
    static void login(){
        System.out.print("ID : ");
        String Sabrina07239_id = input.next();
        System.out.print("Nama : ");
        String Sabrina07239_nama = input.next();
        cekpelanggan = pelangganModel.cekData(Sabrina07239_id, Sabrina07239_nama);
        System.out.println("Selamat datang "+pelangganModel.getpelangganEntityArrayList(cekpelanggan)
        .getSabrina07239_nama());
        int cekpraktikum = daftarPelangganmodel.cekData(Sabrina07239_id, Sabrina07239_nama);
        if (cekpraktikum == -1){
            System.out.println("Data Anda belum terisi lengkap");
                daftarcamera();
        }else if(cekpraktikum == -2){
            System.out.println("Data Anda belum terisi lengkap");
                daftarcamera();
        }else{
        System.out.println("Nama = "+daftarPelangganmodel.showDaftarprak(cekpelanggan).getPelanggan().getSabrina07239_nama());
        System.out.println("id = "+daftarPelangganmodel.showDaftarprak(cekpelanggan).getPelanggan().getSabrina07239_id());
        System.out.println("No identitas = "+daftarPelangganmodel.showDaftarprak(cekpelanggan).getPelanggan().getSabrina07239_alamat());
        System.out.println("camera = "+Sabrina07239_CameraEntity.merk[daftarPelangganmodel.
                showDaftarprak(cekpelanggan).getIndexCamera()]);
        System.out.println("Tgl sewa           : "+new SimpleDateFormat(" dd - MM - yyyy").format(daftarPelangganmodel.showDaftarprak(cekpelanggan).getPelanggan().getSabrina07239_Tanggal_Sewa()));
        System.out.println("Harga = "+daftarPelangganmodel.showDaftarprak(cekpelanggan).getPelanggan().getSabrina07239_harga());
        System.out.println("isVerified = "+daftarPelangganmodel.showDaftarprak(cekpelanggan).isVerified());
        }
    }
    static void daftarcamera(){
        System.out.print("Pilih Camera = \n");
        for(int i=0;i<Sabrina07239_CameraEntity.merk.length;i++){
        System.out.println(i+". "+Sabrina07239_CameraEntity.merk[i]);
        }
        System.out.print("Pilih Camera = ");
            pilCamera = input.nextInt();
        daftarPelangganmodel.insertDataDaftarprak(new Sabrina07239_DaftarPelangganEntity(pilCamera,
                pelangganModel.getpelangganEntityArrayList(cekpelanggan),false));
    }
    static void loginAnggota(){
        System.out.print("id : ");
        String Sabrina07239_id = input.next();
        System.out.print("nama: ");
        String Sabrina07239_nama = input.next();
        cekanggota = anggotaModel.cekData(Sabrina07239_id, Sabrina07239_nama);
        System.out.println("Selamat Datang "+anggotaModel.showDataAslab(cekanggota).getSabrina07239_nama());
        pelangganModel.view();
        updateIsverified();
    }
    static void updateIsverified(){
        System.out.print("id pelanggan = ");
        String npm = input.next();
        int index = daftarPelangganmodel.cekData(npm, null);
        daftarPelangganmodel.updateIsVerified(index, new Sabrina07239_DaftarPelangganEntity(pilCamera,
        pelangganModel.getpelangganEntityArrayList(index),true));
    }
}
