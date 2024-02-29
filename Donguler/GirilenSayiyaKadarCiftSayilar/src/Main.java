import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Scanner sınıfını dahil etelim.
        Scanner input = new Scanner(System.in);

        int k,count=0,toplam=0;
        System.out.println("Lütfen bir sayi giriniz:");
        k = input.nextInt();

//        for(int i=0; i<=k; i++){
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }
        for(int i=0; i<=k; i++){
            if((i%3==0) && (i%4==0)){
                toplam += i;
                count++;
            }
        }
        int ort = toplam / count;
        System.out.println("Ortalama: "+ort);


    }
}