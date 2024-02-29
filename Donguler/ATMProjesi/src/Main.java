import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String userName,password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while(right > 0){
            System.out.println("Kullanici adinizi giriniz: ");
            userName = input.nextLine();

            System.out.println("Parolanız: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba Kodluyoruz bankasına hoşgeldiniz!");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap");
                    select = input.nextInt();
                    if(select==1){
                        System.out.println("Para Miktarı: ");
                        int price = input.nextInt();
                        balance += price;
                    }else if(select == 2){
                        System.out.println("Para Miktarı: ");
                        int price = input.nextInt();
                        if(price > balance){
                            System.out.println("Bakiye yetersiz");
                        }else{
                            balance -= price;
                        }
                    }else if(select == 3){
                        System.out.println("Bakiyeniz:"+balance);
                    }

                }while (select != 4);
                break;
                }else{
                right--;
                System.out.println("Hatalı kullanici adi veya şifre. Tekrar deneyiniz");
                if(right == 0){
                    System.out.println("Hesabınız bloke olmuştur lütfen bankanızla iletişime geçiniz");
                }else{
                    System.out.println("Kalan Hakkınız:" + right);
                }
            }
        }
    }
}