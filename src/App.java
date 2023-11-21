import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numbers1, numbers2, result= 0;
        char  choice ; 

           // input data
        System.out.print("Masukan Angka Pertama: ");
        numbers1 = input.nextInt();
        System.out.print("Masukan Angka Kedua: ");
        numbers2 = input.nextInt();
 
        
        System.out.println("Pilihalah sistem opersi yang ingin digunakan");
        System.out.println("-----------------------------");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Pembagian (/)");
        System.out.println("4. Perkalian (*)");
        System.out.println("5. Sisa Bagi (%)");
        System.out.println("-----------------------------");
        // Pilihan Operasi
        System.out.print("Masukan Operasi: ");
        choice =input.next().charAt(0);
 
 
     
        
        switch (choice)
        {
            case '+': result = numbers1 + numbers2; break;
            case '-' : result = numbers1 - numbers2; break;
            case '/' : result = numbers1 / numbers2; break;
            case '*' : result = numbers1 * numbers2; break;
            case '%' : result = numbers1 % numbers2; break;
            default : System.out.println("Salah Memasukan Pilihan Harap Baca Pilihan di Menu");
        }
        System.out.println("Hasil: " + result);
    }
}
