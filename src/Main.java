/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int row,col;
        System.out.println("Mayin Tarlasina Hosgeldiniz!");
        System.out.println("Lutfen oynamak istediginiz boyutlari giriniz :");
        System.out.print("Satir Sayisi :");
        row=scan.nextInt();
        System.out.print("Sutun Sayisi :");
        col=scan.nextInt();
        MineSweeper mayin=new MineSweeper(row,col);
        mayin.run();


    }
}
*/







/*
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aliem

public class Main {

    /**
     * @param args the command line arguments

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz :");
        int satir = scn.nextInt();
        System.out.print("Sütun sayısını giriniz :");
        int sutun = scn.nextInt();

        int[][] dizi1 = new int[satir][sutun];
        String[][] dizi2 = new String[satir][sutun];

        System.out.println("------------------------");
        for (int i = 0; i < satir; i++) {
            System.out.println("");
            for (int j = 0; j < sutun; j++) {
                dizi2[i][j]="*";
                System.out.print("*");
                System.out.print(" ");
            }
        }
        //zorluk katsayÄ±sÄ± belirledim
        System.out.println("");
        System.out.println("Lütfen 20 ile 80 arasında olacak Şekilde oyunun zorluk derecesini girin :");
        int zorluk = scn.nextInt();
        int seviye = 0;

        if ((zorluk >= 20) && (zorluk <= 80)) {
            seviye = (satir * sutun * zorluk) / 100;
        } else {
            System.out.println("Lütfen belirtilen aralıkta girin..");
        }

        //Ã¶nce tÃ¼m indislere 0 verdim
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                dizi1[i][j] = 0;
            }
        }
        //sonra seviyeye gÃ¶re mayÄ±nlarÄ± yerleÅŸtirdim
        int rast1, rast2;
        while (seviye > 0) {
            rast1 = rnd.nextInt(satir);
            rast2 = rnd.nextInt(sutun);
            if (dizi1[rast1][rast2] == 0) {
                dizi1[rast1][rast2] = 1;
                seviye--;
            }

        }

        System.out.println("");
        System.out.println("MAYINLAR YERLEŞTİRİLDİ");

        for (int i = 0; i < satir; i++) {
            System.out.println("");
            for (int j = 0; j < sutun; j++) {
                System.out.print(dizi1[i][j]);
                System.out.print(" ");
            }
        }
        //buradan sonrasÄ± oyun baÅŸlangÄ±cÄ±
        System.out.println("");
        System.out.println("OYUN BAŞLASIN");

        int puan=0;
        do {
            System.out.println("");
            System.out.print("Lütfen oyunun satır değerini girin :");
            int tut1= scn.nextInt();
            System.out.print("Lütfen oyunun sütun değerini girin :");
            int tut2=scn.nextInt();

            if (dizi1[tut1][tut2]==0) {
                dizi2[tut1][tut2]="0";
                puan+=10;
            }
            else{
                break;
            }

            for (int i = 0; i < satir; i++) {
                System.out.println("");
                for (int j = 0; j < sutun; j++) {
                    System.out.print(dizi2[i][j]);
                    System.out.print(" ");
                }
            }
        } while (true);
        System.out.println("OYUN BİTTİ..!");
        System.out.println("TOPLAM PUANINIZ :" + puan);
        for (int i = 0; i < satir; i++) {
            System.out.println("");
            for (int j = 0; j < sutun; j++) {
                System.out.print(dizi1[i][j]);
                System.out.print(" ");
            }
        }


    }

}
*/



import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.math.*;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Harita Koordinantlari !");
        System.out.print("x :");
        int rowNumber = scan.nextInt();
        System.out.print("y :");
        int colNumber = scan.nextInt();

        MineSweeper mineSweeper=new MineSweeper(rowNumber,colNumber);
        mineSweeper.hazirla();

    }
}

