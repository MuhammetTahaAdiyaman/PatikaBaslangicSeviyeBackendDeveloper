import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int km,yas,tip;
        double tutar,topTutar,indTutar=0,indYas,indGidisDonus;

        System.out.println("----------------------------");
        System.out.println("Uçak Bileti Fiyatı Hesaplama");
        System.out.println("----------------------------");
        System.out.print("Mesafe km olarak giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipi seç\n(1-Tek Yön, 2-Gidiş Dönüş): ");
        tip = input.nextInt();
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("Uçak Bileti Fiyatı : ");

        if((yas>0 && km >0)&&(tip == 1||tip == 2)){
            tutar = km*0.10;
            if(yas < 12){
                indYas = tutar * 0.50;
                indTutar = tutar - indYas;
                if(tip==2){
                    indGidisDonus = indTutar * 0.20;
                }else{
                    indGidisDonus = 0;
                }
                topTutar = (indTutar - indGidisDonus) * tip;
                System.out.println("Toplam tutar: "+topTutar );
            }else if(yas < 24){
                indYas = tutar * 0.10;
                indTutar = tutar - indYas;
                if(tip==2){
                    indGidisDonus = indTutar * 0.20;
                }else{
                    indGidisDonus = 0;
                }
                topTutar = (indTutar - indGidisDonus) * tip;
                System.out.println("Toplam tutar: "+topTutar );

            }else if(yas <65){
                if(tip==2){
                    indGidisDonus = indTutar * 0.20;
                }else{
                    indGidisDonus = 0;
                }
                topTutar = (indTutar - indGidisDonus) * tip;
                System.out.println("Toplam tutar: "+topTutar );

            }else{
                indYas = tutar * 0.30;
                indTutar = tutar - indYas;
                if(tip==2){
                    indGidisDonus = indTutar * 0.20;
                }else{
                    indGidisDonus = 0;
                }
                topTutar = (indTutar - indGidisDonus) * tip;
                System.out.println("Toplam tutar: "+topTutar );

            }
        }else{
            System.out.println("hatalı değer girdiniz");
        }

    }
}

