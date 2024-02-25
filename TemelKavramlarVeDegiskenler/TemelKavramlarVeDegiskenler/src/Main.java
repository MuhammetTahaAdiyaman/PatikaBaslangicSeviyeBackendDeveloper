import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Tam Sayı Veri Tipleri*/
        byte vByte = 100; //8 bit - 127 - -128 değerleri arasındadır.
        short vShort = 32000; //16bit 32767 - -32768 değerleri arasındadır
        int vInt = 10000; //32bit
        long vlong = 100000; //64bit gereksiz hafızada yer kaplayabilir

        /*Ondalıklı Sayı Veri Tipleri*/
        float vFloat= 3.12f; //32bit uzunluğundadır
        double vDouble = 4.18; //64bit uzunluğundadır

        /*char ve boolean veri tipi*/
        char vChar = 'b'; //char tanımlanırken tek tırnak kullanmak zorundayız. 16bittir
        char vChar2 = 98; //b karakteri ascii tablosunda 98e eşit şimdi ikisini de ekrana bastırınca b yazacak


        boolean varMi = true; //boolean true yada false değerleri alabilir if koşullarında çokca kullanacağız.
        boolean yokMu = false;

        /*string(non-premitive) */
        //charlardan oluşan veri tipleri kümesiir
        String vStr = "Java101 Patikası"; //java da string tanımlamak için çift kullanmak zorundayız
        System.out.println(vStr);
    }
}