import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Basamak Sayisini giriniz");
        int n = input.nextInt();

        for(int i=1; i<=n; i++){

            for(int k=1; k<=(n-i); k++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}