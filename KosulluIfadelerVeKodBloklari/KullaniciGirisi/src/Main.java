import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //scanner nesnesini oluşturalım
        Scanner input = new Scanner(System.in);
        String userName, password, newPassword,cvp;

        System.out.print("Kullanici Adiniz: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if(userName.equals("taha42") && password.equals("1234.")){
            System.out.println("Giriş Başarılı");
        }else{
            System.out.println("Giriş Başarısız");
            System.out.println("Şifrenizi Sıfırlamak ister misiniz ? ");
            cvp = input.nextLine();
            if(cvp.equals("e") || cvp.equals("E")){
                System.out.println("Yeni oluşturulan şifre eski şifre ile aynı olmamalıdır.");
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = input.nextLine();
                if(newPassword.equals("1234.")){
                    System.out.println("Şifre Oluşturulamadı");
                }else{
                    System.out.println("Şifre Oluşturuldu");
                }
            }
        }

    }
}