import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //scanner sınıfını ekleyelim
        Scanner input = new Scanner(System.in);

        double mat,fizik,kimya,turkce,muzik,avarage,total=0;

        //kullanicidan notlari alalim.
        System.out.println("Matematik Notunuzu giriniz: ");
        mat = input.nextDouble();
        if(mat <= 100 && mat >= 0){
            total+=mat;
        }

        System.out.println("Fizik Notunuzu giriniz: ");
        fizik = input.nextDouble();
        if(fizik <= 100 && fizik >= 0){
            total+=fizik;
        }

        System.out.println("Kimya Notunuzu giriniz: ");
        kimya = input.nextDouble();
        if(kimya <= 100 && kimya >= 0){
            total+=kimya;
        }

        System.out.println("Türkçe Notunuzu giriniz: ");
        turkce = input.nextDouble();
        if(turkce <= 100 && turkce >= 0){
            total+=turkce;
        }

        System.out.println("Müzik Notunuzu giriniz: ");
        muzik = input.nextDouble();
        if(muzik <= 100 && muzik >= 0){
            total+=muzik;
        }

        avarage = total / 5;

        if(avarage <= 55){
            System.out.println("Sınıfta Kaldınız");
        }else{
            System.out.println("Tebrikler sınıfı geçtiniz");
        }


    }
}