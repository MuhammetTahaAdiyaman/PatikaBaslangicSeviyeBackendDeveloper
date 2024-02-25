import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int km;
        System.out.print("Lütfen km bilgisi giriniz:");
        km = input.nextInt();
        double kmBasi = 2.20;
        int acilisUcret = 10;
        double tutar;
        tutar = (km*kmBasi);
        tutar += acilisUcret;

        tutar = (tutar < 20 ) ? 20:tutar;

        System.out.println("Toplam Tutar: "+tutar);

    }
}