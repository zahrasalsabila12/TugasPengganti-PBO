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
            System.out.print("Mata kuliah            : "); 
            String matkul = baca.readLine();
            if (matkul.isEmpty() == false) {
                break;
            }else{
                System.out.println("================================================================");
                System.out.println("Inputan tidak boleh kosong. Mohon coba kembali");
                System.out.println("================================================================");
            }
        }
        double nilaiKehadiran = 0;
        while (true){
            System.out.print("Jumlah kehadiran [1-8] : ");
            int kehadiran = Integer.parseInt(baca.readLine());
            try{
                if (kehadiran >= 0 && kehadiran <=8){
                    if (kehadiran == 0 && kehadiran < 3){
                        nilaiKehadiran = 0;
                    }else if(kehadiran >= 3 && kehadiran <= 4){
                        nilaiKehadiran = 60;
                    }else if(kehadiran > 4 && kehadiran < 7){
                        nilaiKehadiran = 80;
                    }else if (kehadiran >= 7 && kehadiran == 8){
                        nilaiKehadiran = 100;
                    }
                    break;
                }else{
                    System.out.println("================================================================");
                    System.out.println("Inputan tidak valid. Mohon inputkan jumlah kehadiran dari 1-8");
                    System.out.println("================================================================");
                }
            }catch(NumberFormatException e){
                System.out.println("================================================================");
                System.out.println(" Inputan harus di isi dengan angka, mohon coba kembali!");
                System.out.println("================================================================");
            }  
        }
        double nilaiUTS = 0;
        while (true){
            System.out.print("Nilai UTS              : ");
            nilaiUTS = Double.parseDouble(baca.readLine());
            try{
                if (nilaiUTS >= 0 && nilaiUTS <= 100){
                    break;
                }else{
                    System.out.println("================================================================");
                    System.out.println("Inputan tidak valid. Mohon inputkan angka mulai dari 0-100");
                    System.out.println("================================================================");
                }
            }catch (NumberFormatException e){
                System.out.println("================================================================");
                System.out.println(" Inputan harus di isi dengan angka, mohon coba kembali!");
                System.out.println("================================================================");
            }
        }
        double nilaiUAS = 0;
        while (true){
            System.out.print("Nilai UAS              : ");
            nilaiUAS = Double.parseDouble(baca.readLine());
            try{
                if (nilaiUAS >= 0 && nilaiUAS <= 100){
                    break;
                }else{
                    System.out.println("================================================================");
                    System.out.println("Inputan tidak valid. Mohon inputkan angka mulai dari 0-100");
                    System.out.println("================================================================");
                }
            }catch (NumberFormatException e){
                System.out.println("================================================================");
                System.out.println(" Inputan harus di isi dengan angka, mohon coba kembali!");
                System.out.println("================================================================");
            }
        }
        double nilaiAkhir = (nilaiKehadiran * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.5) ;
        String grade = null;
        if(nilaiAkhir  < 50){
            grade = "E";
        }else if(nilaiAkhir >= 50 && nilaiAkhir <= 59){
            grade = "D";
        }else if(nilaiAkhir >= 60 && nilaiAkhir <= 69){
            grade = "C";
        }else if(nilaiAkhir >= 70 && nilaiAkhir <= 84){
            grade = "B";
        }else if(nilaiAkhir >= 85 && nilaiAkhir <=100){
            grade = "A";
        }
        System.out.println("================================================================");
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Grade       : " + grade);
        System.out.println("================================================================\n");
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
                        System.out.println("================================================================");
                        break;
                }
            } catch (NumberFormatException e) {
                // TODO: handle exception
                System.out.println("================================================================");
                System.out.println(" Inputan harus di isi dengan angka, mohon coba kembali!");
                System.out.println("================================================================");
            }
        }
    } 
}
