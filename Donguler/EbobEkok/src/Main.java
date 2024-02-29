import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n1 sayisini giriniz: ");
        int n1 = input.nextInt();

        System.out.println("n2 sayisini giriniz: ");
        int n2 = input.nextInt();
        int ebob=1;
        for(int i=1; i<=n1;i++){
            if(n1%i==0 && n2%i==0){
                ebob = i;
            }
        }

        System.out.println("Ebob:"+ebob);

    }
}