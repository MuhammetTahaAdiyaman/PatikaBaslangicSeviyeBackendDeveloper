import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //scanner sınıfını dahil edelim.
        Scanner input = new Scanner(System.in);

        int sayi;
        int total = 0;

//        do{
//            System.out.println("Lütfen bir sayi giriniz: ");
//            sayi = input.nextInt();
//            if(sayi%2==1){
//                total += sayi;
//            }
//
//        }while(sayi>0);

        do{
            System.out.println("Lütfen bir sayi giriniz: ");
            sayi = input.nextInt();
            if((sayi%2==0)&&(sayi%4==0)){
                total += sayi;
            }
        }while(sayi%2!=1);
        System.out.println("Toplam: "+total);
    }
}