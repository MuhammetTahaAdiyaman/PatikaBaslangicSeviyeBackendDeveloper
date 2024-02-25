import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //scanner sınıfını ekleyelim
        Scanner input = new Scanner(System.in);

//        //değişkenlerimizi ayarlayalım
//        int a,b;
//        double c;
//
//        System.out.print("Lütfen birinci kenari giriniz:");
//        a = input.nextInt();
//
//        System.out.print("Lütfen ikinci kenari giriniz:");
//        b = input.nextInt();
//
//        c = Math.sqrt((a*a)+(b*b));
//        System.out.println("Hipotenüs: "+c);

        int a,b,c;
        double u, ucgenCevresi, ucgenAlan;
        System.out.print("Lütfen birinci kenari giriniz:");
        a = input.nextInt();

        System.out.print("Lütfen ikinci kenari giriniz:");
        b = input.nextInt();

        System.out.print("Lütfen üçüncü kenari giriniz:");
        c = input.nextInt();

        u = (a+b+c)/2;
        ucgenCevresi = 2*u;
        ucgenAlan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Ucgenin alani: "+ucgenAlan);
    }
}