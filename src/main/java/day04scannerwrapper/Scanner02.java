package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {
        //Kullanıcıdan adresini alınız ve ekrana yazdırınız
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi giriniz");
    //nextline() methodu kullanıcıdan cok kelimeli string almak icin kullanılır
        String adress = input.nextLine();

        System.out.println(adress);



    }
}
