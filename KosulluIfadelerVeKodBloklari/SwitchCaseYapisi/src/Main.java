//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int day = 1;

        if(day==1){
            System.out.println("Bugün Pazartesi");
        }

        //bunu switch case ile yapalım.
        switch (day){
            case 1:
                System.out.println("Bugün Pazartesi");
                break;
            case 2:
                System.out.println("Bugün Salı");
                break;
            case 3:
                System.out.println("Bugün Çarşamba");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız");
                break;
        }
    }
}