package tugaspenggantipbo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TugasPengganti {
    static BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));

    static void nomorSatu()throws IOException{
        String kalimat = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis";
        String substrKalimat = kalimat.substring(0, 36);
        System.out.println(substrKalimat);
        System.out.println(substrKalimat.toLowerCase());
        System.out.println(substrKalimat.toUpperCase());
        String kata1 = "pemrograman";
        int i = kalimat.indexOf(kata1);
        if (i > 0){
            System.out.println(kalimat.substring(i, i + kata1.length()));
        }
        String kata2 = "tingkat tinggi dan dinamis";
        int x = kalimat.indexOf(kata2);
        if (x > 0){
            System.out.println(kalimat.substring(x, x + kata2.length()));
        }
    }
    
    static void nomorDua()throws IOException{
        System.out.println("================================================================");
        while (true) {
            try {
                System.out.print("Mata Kuliah      : "); 
                String matkul = baca.readLine();
                if (matkul.isEmpty() == false) {
                    break;
                }
            } catch (matkul.isEmpty() == true) {
                // TODO: handle exception
                System.out.println("================================================================");
                System.out.println("Inputan tidak boleh kosong. Mohon coba kembali");
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        while (true) {
            int pilihan = 0;
            System.out.println("""
================================================================
                        Menu Utama
================================================================
[1] Nomor 1
[2] Nomor 2
[3] Exit
================================================================ """);
            System.out.print("Masukkan pilihan Anda [1-2] : "); 
            try {
                pilihan = Integer.parseInt(baca.readLine());
                switch (pilihan) {
                    case 1:
                        nomorSatu();
                        break;
                    case 2:
                        nomorDua();
                        break;
                    case 3:
                        //keluar
                        System.out.println("================================================================");
                        System.out.println("                       Terima Kasih");
                        System.out.println("================================================================");
                        System.exit(0);
                    default:
                        System.out.println("================================================================");
                        System.out.println(" Inputan tidak ditemukan, mohon coba kembali!");
                        break;
                }
            } catch (NumberFormatException e) {
                // TODO: handle exception
                System.out.println("================================================================");
                System.out.println(" Inputan harus di isi dengan angka, mohon coba kembali!");
            }
        }
    } 
}
