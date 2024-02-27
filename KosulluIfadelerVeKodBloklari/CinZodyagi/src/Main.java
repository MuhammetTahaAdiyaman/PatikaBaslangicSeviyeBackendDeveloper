import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //scanner nesnesini alalım
        Scanner input = new Scanner(System.in);

        //doğum tarihini kullanicidan alalım
        int dogumTarihi;

        System.out.println("Lütfen dogum tarihini giriniz:");
        dogumTarihi = input.nextInt();

        if(dogumTarihi%12 == 0){
            System.out.println("Maymun");
        }else if(dogumTarihi % 12 == 1){
            System.out.println("Horoz");
        }else if(dogumTarihi % 12 == 2){
            System.out.println("Köpek");
        }else if(dogumTarihi % 12 == 3){
            System.out.println("Domuz");
        }else if(dogumTarihi % 12 == 4){
            System.out.println("Fare");
        }else if(dogumTarihi % 12 == 5){
            System.out.println("Öküz");
        }else if(dogumTarihi % 12 == 6){
            System.out.println("Kaplan");
        }else if(dogumTarihi % 12 == 7){
            System.out.println("Tavşan");
        }else if(dogumTarihi % 12 == 8){
            System.out.println("Ejderha");
        }else if(dogumTarihi % 12 == 9){
            System.out.println("Yılan");
        }else if(dogumTarihi % 12 == 10){
            System.out.println("At");
        }else if(dogumTarihi % 12 == 11){
            System.out.println("Koyun");
        }
    }
}