import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //scanner sınıfını dahil edelim
        Scanner input = new Scanner(System.in);

        //değişkenleri tanımlayalım
        double armut,elma,domates,muz,patlican;
        double armutcvp,elmacvp,domatescvp,muzcvp,patlicancvp;
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican = 5.0;

        System.out.print("Armut kaç kilo? ");
        armutcvp = input.nextDouble() * armut;

        System.out.print("Elma kaç kilo? ");
        elmacvp = input.nextDouble() * elma;

        System.out.print("Domates kaç kilo? ");
        domatescvp = input.nextDouble() * domates;

        System.out.print("Muz kaç kilo? ");
        muzcvp = input.nextDouble() * muz;

        System.out.print("Patlican kaç kilo? ");
        patlicancvp = input.nextDouble() * patlican;

        double toplam = armutcvp+elmacvp+domatescvp+muzcvp+patlicancvp;
        System.out.println("Toplam Tutar: "+toplam);
    }
}