import java.util.InputMismatchException;
import java.util.Scanner;

public class RekapNilai {
    public double nilai;
    public String nama, Matkul;
    public String tabelNilai[][] = new String[4][3];

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMatkul() {
        return Matkul;
    }

    public void setMatkul(String matkul) {
        Matkul = matkul;
    }
}

class DataNilai{
    RekapNilai rp = new RekapNilai();
    Scanner sc = new Scanner(System.in);
    boolean loop = true;
    int maks = 0, i,j,k;
    void isi(){
        i=0;
        while(loop){
            try{
                if(maks < rp.tabelNilai.length){
                    j=0;
                    System.out.println("Masukkan Nama : ");
                    rp.setNama(sc.next());
                    rp.tabelNilai[i][j]=rp.getNama();
                    j++;
                    System.out.println("Masukkan Matkul : ");
                    rp.setMatkul(sc.next());
                    rp.tabelNilai[i][j]=rp.getMatkul();
                    j++;
                    System.out.println("Masukkan Nilai : ");
                    rp.setNilai(sc.nextDouble());
                    rp.tabelNilai[i][j]=Double.toString(rp.getNilai());
                    i++;
                    System.out.println("Array sisa : "+(rp.tabelNilai.length-i));
                    System.out.println("Mau Lanjut (1/0) : ");
                    int input = sc.nextInt();
                    if(input==0){
                        break;
                    }
                }else{
                    loop = false;
                }
            }catch(ArrayIndexOutOfBoundsException f) {
                System.out.println("Exception : Array Penuh" );
                break;
            }catch (InputMismatchException e){
                System.out.println("Exception : Salah Input");
                sc.next();
            }

        }
        System.out.println("Looping selesai");
    }
    public void tampil(){
        int i,j;
        for(i = 0;i<rp.tabelNilai.length;i++){
            for (j=0;j<rp.tabelNilai[0].length;j++){
                System.out.print(rp.tabelNilai[i][j]+"\t\t\t");
            }
            System.out.println("");
        }
    }
    public String DataNilai;
    public static void main(String[] args) {
        DataNilai dd = new DataNilai();
        dd.isi();
        dd.tampil();
    }

}
