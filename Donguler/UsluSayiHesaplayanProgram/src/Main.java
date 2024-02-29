import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //scanner nesnesini ekleyelim
        Scanner input = new Scanner(System.in);

        int n,k;
        int total = 1;

        System.out.println("Üssü alınacak sayi:");
        n = input.nextInt();

        System.out.println("Üs olacak sayi: ");
        k= input.nextInt();

        int i=1;
        while(i<=k){
            total *= n;
            i++;
        }

        System.out.println("Sonuc:"+total);
    }
}