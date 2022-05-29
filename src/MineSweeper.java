import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber, colNumber, size,denemeSayisi;
    String[][] map;
    String[][] board;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new String[rowNumber][colNumber];
        this.board = new String[rowNumber][colNumber];
        this.size = rowNumber * colNumber / 4;
        this.denemeSayisi=rowNumber*colNumber-size;

    }

    public void hazirla(){

        int success=0,temp=0;

        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                map[i][j]="-";
                board[i][j]="-";
            }
        }

        for(int i=0;i<size;i++){
            int x= rand.nextInt(rowNumber);
            int y=rand.nextInt(colNumber);
            if(map[x][y]!="*"){
                map[x][y]="*";
            }
            else i--;
        }
        System.out.println("Mayinlarin yeri");
        yazdir(map);
        System.out.println("============================");
        System.out.println("Mayin Tarlasi Oyununa Hosgeldiniz !");
        yazdir(board);
        int satir,sutun;

        do{
            temp++;
            System.out.print("Satir :");
            satir=scan.nextInt();
            System.out.print("Sutun :");
            sutun=scan.nextInt();
            if(satir>rowNumber ||satir<0 || sutun> colNumber|| sutun<0){
                System.out.println("Yanlış koordinantlara girdiniz!!!");
            }
            if(map[satir][sutun]=="*"){
                System.out.print("Game Over!!!");
                break;
            }
            if ((satir-1>=0) &&  (map[satir-1][sutun]=="*")) {
                success++;
            }
            if ((satir+1<rowNumber) && (map[satir+1][sutun]=="*") ){
                success++;
            }
            if ((satir+1<rowNumber) && (sutun-1>=0 ) && (map[satir+1][sutun-1]=="*")) {
                success++;
            }
            if((satir-1>=0) && (sutun-1>=0 )&&  (map[satir-1][sutun-1]=="*")) {
                success++;
            }
            if ((sutun-1>=0) && (map[satir][sutun-1]=="*")) {
                success++;
            }
            if ((sutun+1<colNumber) && (map[satir][sutun+1]=="*")) {
                success++;
            }
            if ((satir-1>=0) && (sutun+1<colNumber) && (map[satir-1][sutun+1]=="*")) {
                success++;
            }
            if((satir+1<rowNumber) && (sutun+1<colNumber) && (map[satir+1][sutun+1]=="*")){
                success++;
            }
            if(temp == denemeSayisi){
                System.out.println("Kazandiniz !! Hiç Bir Mayina Basmadiniz.");
                board[satir][sutun]=String.valueOf(success);
                for (String[] row : board) {
                    for (String col : row) {
                        System.out.print(col+" ");
                    }
                    System.out.println(" ");
                }

                break;
            }

                board[satir][sutun]=String.valueOf(success);
                for (String[] row : board) {
                    for (String col : row) {
                        System.out.print(col+" ");
                    }
                    System.out.println(" ");
                }
                success=0;

        }while (!(satir<0 ||satir+1>rowNumber || sutun<0 ||sutun+1>colNumber));

    }

    public String[][] yazdir(String[][] metin){
        for(int i=0;i<metin.length;i++){
            for(int j=0;j<metin[0].length;j++){
                System.out.print(metin[i][j]+" ");
            }
            System.out.println(" ");
        }
        return metin;
    }
}

