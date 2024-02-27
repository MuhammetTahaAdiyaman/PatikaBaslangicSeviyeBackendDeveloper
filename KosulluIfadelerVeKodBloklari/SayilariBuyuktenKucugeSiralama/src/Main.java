import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //scanner nesnesini entegre edelim
        Scanner input = new Scanner(System.in);

        //3 tane sayi tanımlayalım ve kullanıcıdan sırayla alalım.
        int a,b,c;

        System.out.print("Lütfen birinci sayiyi giriniz: ");
        a = input.nextInt();

        System.out.print("Lütfen ikinci sayiyi giriniz: ");
        b = input.nextInt();

        System.out.print("Lütfen üçüncü sayiyi giriniz: ");
        c = input.nextInt();

        if((a>b)&&(a>c)){
            if((b>c)){
                System.out.println("a>b>c");
            }else{
                System.out.println("a>c>b");
            }
        }else if((b>a)&&(b>c)){
            if(a>c){
                System.out.println("b>a>c");
            }else{
                System.out.println("b>c>a");
            }
        }else if((c>a)&&(c>b)){
            if(a>b){
                System.out.println("c>a>b");
            }else{
                System.out.println("c>b>a");
            }
        }
    }
}