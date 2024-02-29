import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //scanner sınıfını ekleyelim
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        int n = input.nextInt();
        int toplam = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0) {
                toplam += i;
            }

        }
        toplam -= n;
        if(toplam == n){
            System.out.println("Mükemmel sayidir");
        }else{
            System.out.println("Mükemmel sayi değildir");
        }
    }
}