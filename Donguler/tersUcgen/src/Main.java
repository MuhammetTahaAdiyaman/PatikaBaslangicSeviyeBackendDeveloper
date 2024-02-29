import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basaamk sayisini giriniz: ");
        int n = input.nextInt();

        for (int i = n; i >= 0; i--) {

            for (int j = (2 * i - 2); j >= 0; j--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}