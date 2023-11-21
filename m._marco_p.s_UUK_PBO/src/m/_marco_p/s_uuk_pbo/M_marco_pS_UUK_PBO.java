package m._marco_p.s_uuk_pbo;

import java.util.Scanner;

public class M_marco_pS_UUK_PBO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nilai Pertama: ");
        int nilai1 = scanner.nextInt();      
        System.out.print("Masukkan Nilai Kedua: ");
        int nilai2 = scanner.nextInt();
        
        System.out.println("Pilih Operasi:");
        System.out.println("1.Pernambahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        
        System.out.print("Masukkan Pilihan (1/2/3/4):");
        int penjumlahanangka = scanner.nextInt();
        
        int hasil;
        
        switch (penjumlahanangka) {
            case 1:
                int nambah = 0;
                hasil = nilai1 + nilai2;
                System.out.println(+nilai1+ "+"  +nilai2+"="+hasil);
                System.out.print("Selamat Anda benar menjawab jawaban tersebut!!!");
                break;
            case 2:
                int kurang = 0;
                hasil = nilai1 - nilai2;
                System.out.println(+nilai1+ "-" +nilai2+"="+hasil);
                System.out.print("Selamat Anda benar menjawab jawaban tersebut!!!");
            case 3:
                int kali = 0;
                hasil = nilai1 * nilai2;
                System.out.println(+nilai1+ "*" +nilai2+"="+hasil);
                System.out.print("Selamat Anda benar menjawab jawaban tersebut!!!");
            case 4:
                int bagi = 0;
                hasil = nilai1 - nilai2;
                System.out.println(+nilai1+ ":" +nilai2+"="+hasil);
                System.out.print("Selamat Anda benar menjawab jawaban tersebut!!!");
                    

                
        }
    
    
    }
    
    
}
