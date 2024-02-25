import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //scanner sınıfını oluşturalım
        Scanner input = new Scanner(System.in);

        //değişkenleri oluştur
        double para;
        double kdv=0;
        System.out.print("Lütfen para değerini giriniz: ");
        para = input.nextDouble();
        if(para < 1000){
            kdv = 0.18;
        }else{
            kdv = 0.08;
        }
        //else-if'i biz şu şekilde de turnery if kullanırsak eğer
        //kdv = (para < 1000) ? 0.18:0.08
        double kdvsizFiyat = para;
        double kdvOrani = para*kdv;
        double kdvliFiyat = para+kdvOrani;
        System.out.println("KDV'siz fiyat: "+kdvsizFiyat);
        System.out.println("KDV'li fiyat: "+kdvliFiyat);
        System.out.println("KDV orani:"+kdvOrani);

    }
}