import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double pi = 3.14;
        double yariCap, alan, cevre;
        //scanner sınıfını dahil edelim
        Scanner input = new Scanner(System.in);

        //kullanicidan yaricap alalım
        System.out.print("Lütfen yaricapi giriniz:");
        yariCap = input.nextDouble();

        System.out.print("Daire diliminin merkez ölçüsünü giriniz: ");
        int a = input.nextInt();

        alan = pi*yariCap*yariCap;
        cevre = 2*pi*yariCap;

        System.out.println("Dairenin Alani: " + alan);
        System.out.println("Dairenin Çevresi: "+ cevre);

        double dilimAlan = (pi * (yariCap*yariCap) * a) / 360;
        System.out.println("Dairenin dilim alan: "+ dilimAlan);

    }
}