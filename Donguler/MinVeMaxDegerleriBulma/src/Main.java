import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //scanner nesnesini dahil edelim
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç adet sayi gireceksiniz: ");
        int n=input.nextInt();

        int sayi;
        int enBuyuk=0;
        int enKucuk=0;

        for(int i=1; i<=n; i++){
            System.out.println(i+".Sayiyi girin:");
            sayi = input.nextInt();
            if (i == 1)
            {
                enBuyuk = sayi;
                enKucuk = sayi;
            }
            if (sayi > enBuyuk)
            {
                enBuyuk = sayi;
            }
            if (sayi < enKucuk)
            {
                enKucuk = sayi;
            }

        }

        System.out.println("---------------------");
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}