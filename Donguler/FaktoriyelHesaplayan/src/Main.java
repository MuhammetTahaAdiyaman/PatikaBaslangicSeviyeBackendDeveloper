import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //scanner sınıfını dahil edelim
        Scanner input = new Scanner(System.in);

        int faktoriyel, total=1;
        System.out.println("Lutfen sayi giriniz: ");
        faktoriyel = input.nextInt();

        for(int i=1; i<=faktoriyel; i++){
            total=total*i;
        }

        System.out.println("Sonuc: " + total);
    }
}