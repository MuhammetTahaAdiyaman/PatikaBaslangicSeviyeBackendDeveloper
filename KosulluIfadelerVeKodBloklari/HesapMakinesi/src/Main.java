import java.sql.SQLOutput;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //scanner nesnesini ekleyelim
        Scanner input = new Scanner(System.in);

        double sayi1,sayi2,sonuc;
        int islem;


        //kullanici bilgilendirme ekrani
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
        islem = input.nextInt();

        //kullanicidan iki sayi alalim
        System.out.print("Lütfen ilk sayiyi giriniz:");
        sayi1 = input.nextDouble();
        System.out.print("Lütfen ikinci sayiyi giriniz:");
        sayi2 = input.nextDouble();

        switch(islem){
            case 1:
                sonuc = sayi1+sayi2;
                System.out.println("İşlem sonucu: "+ sonuc);
                break;
            case 2:
                sonuc = sayi1-sayi2;
                System.out.println("İşlem sonucu: "+ sonuc);
                break;
            case 3:
                sonuc = sayi1*sayi2;
                System.out.println("İşlem sonucu: "+ sonuc);
                break;
            case 4:
                sonuc = sayi1/sayi2;
                System.out.println("İşlem sonucu: "+ sonuc);
                break;
            default:
                System.out.println("Lütfen 1-4 arasında işlem seçiniz");
                break;
        }

    }
}