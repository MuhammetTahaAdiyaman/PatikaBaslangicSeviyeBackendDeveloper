import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        n = input.nextInt();

        for(int i=1; i<=n; i*=2){
            System.out.println(i);
        }
    }
}