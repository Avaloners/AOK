//Muzhaffar Ammar 
//235150200111033
//Teknik Informatika Kelas C


package tugas_acak;

import java.util.Scanner;
public class perubahanbilangan {
    public static void main(String[]args){
        
    Scanner input=new Scanner(System.in);
        System.out.println("Menu Konversi Bilangan");
        System.out.println("1. Biner ke Desimal");
        System.out.println("2. Desimal ke Biner");
        System.out.println("3. Biner ke Hexa");
        System.out.println("4. Hexa ke Biner");
        System.out.println("5. Desimal ke Hexa");
        System.out.println("6. Hexa ke Desimal");
        System.out.println("===========================");
        System.out.print("Masukan Pilihanmu = ");
        int pilihan=input.nextInt();
        System.out.println("===========================");
        
        switch (pilihan){
            case 1:
                System.out.print("Masukan bilangan biner = ");
                String biner = input.next();
                
                System.out.println();

                int desimal = Integer.parseInt(biner, 2);
                System.out.println("Hasil konversi biner ke desimal = " + desimal);
                break;
                
            case 2:
                System.out.print("Masukan bilangan desimal = ");
                int desimal2 = input.nextInt();
                
                System.out.println();

                String biner2 = Integer.toBinaryString(desimal2);
                System.out.println("Hasil konversi desimal ke biner = " + biner2);
                break;

            case 3:
                System.out.print("Masukan bilangan biner = ");
                String biner3 = input.next();
                
                System.out.println();

                String hexa = Integer.toHexString(Integer.parseInt(biner3, 2));
                System.out.println("Hasil konversi biner ke heksadesimal = " + hexa);
                break;
                
            case 4:
                System.out.print("Masukan bilangan heksadesimal = ");
                String hexa2 = input.next();
                
                System.out.println();

                String biner4 = Integer.toBinaryString(Integer.parseInt(hexa2, 16));
                System.out.println("Hasil konversi heksadesimal ke biner = " + biner4);
                break;
                
            case 5:
                System.out.print("Masukan bilangan desimal = ");
                int desimal3 = input.nextInt();
                
                System.out.println();

                String hexa3 = Integer.toHexString(desimal3);
                System.out.println("Hasil konversi desimal ke heksadesimal = " + hexa3);
                break;
                
            case 6:
                System.out.print("Masukan bilangan heksadesimal = ");
                String hexa4 = input.next();
                
                System.out.println();

                int desimal4 = Integer.parseInt(hexa4, 16);
                System.out.println("Hasil konversi heksadesimal ke desimal = " + desimal4);
                break;

            
            default:System.out.println("Pilihan Tidak Tersedia");
                
            
        }
    }
    
    
}
//source code
//https://ilmu-detil.blogspot.com/2016/11/program-java-konversi-biner-ke-hexadecimal.html
//https://codegym.cc/id/groups/posts/id.870.java-mengkonversi-biner-ke-desimal
//https://ilmu-detil.blogspot.com/2016/11/program-java-konversi-desimal-ke-biner.html