import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //scanner nesnesini entegre edelim
        Scanner input = new Scanner(System.in);
        double sicaklik;
        //kullanicidan hava sicakliğini alalım
        System.out.print("Lütfen hava sicaklığını giriniz");
        sicaklik = input.nextDouble();

        if(sicaklik < 5){
            System.out.println("Kayak Yapmaya Gidebilirsin");
        }else if(sicaklik > 5 && sicaklik < 15){
            System.out.println("Sinemaya gidebilirsin");
        }else if(sicaklik > 15 && sicaklik < 25){
            System.out.println("Piknik Yapabilirsin");
        }else{
            System.out.println("Yüzmeye gidebilirsin");
        }

    }
}