import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //scanner sınıfını dahil edelim
        Scanner input = new Scanner(System.in);

        //değişkenleri girelim.
        double boy,kilo, vki;

        //kullanicidan verileri alalım
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        System.out.print("Lütfen boyunuzu giriniz: ");
        boy = input.nextDouble();

        vki = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz: "+vki);
    }
}