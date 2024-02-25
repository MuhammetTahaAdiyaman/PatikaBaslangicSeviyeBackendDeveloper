import java.util.Scanner; //kullanicidan veri almak için bu sınıfı import etmemiz gerekiyor
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
       /* System.out.print("Lütfen a sayisini giriniz: ");
        a = input.nextInt();
        System.out.println(a);*/

//        System.out.print("Lütfen b sayısını giriniz:");
//        double b = input.nextDouble();
//        System.out.println(b);
        System.out.print("Lütfen bir değer giriniz");
        String c = input.nextLine();
        System.out.println(c);
    }
}