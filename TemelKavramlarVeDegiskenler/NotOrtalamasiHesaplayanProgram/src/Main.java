import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //değişkenleri oluştur
        int mat,fizik,kimya,tarih,turkce,muzik;

        //scanner sınıfını tanımla
        Scanner input = new Scanner(System.in);

        //kullanicidan değerleri al
        System.out.print("Matematik Notunuz:");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya = input.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih = input.nextInt();

        System.out.print("Turkce Notunuz:");
        turkce = input.nextInt();

        System.out.print("Muzik Notunuz:");
        muzik = input.nextInt();

        int toplam = (mat+fizik+kimya+tarih+turkce+muzik);
        double sonuc = toplam/6.0;
        System.out.println("Ortalamaniz: "+sonuc);
    }
}