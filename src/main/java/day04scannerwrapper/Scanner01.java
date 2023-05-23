package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Ornek :Kullanıcıdan ilk ismin ve soyismini alıp ikisini ayni satırda ekrana yazdırınız
        //1. adım Scanner clastan bir obje olustur
        Scanner input = new Scanner(System.in);
        //2. adım : Kullanıcıya ne istedigimize dair mesaj veriniz
        System.out.println("Ilk isminizi giriniz");

        //next() methodu kullanıcıdan "tek kelimeli string" almak icin kullanilir
        //3. adım : Uygun methodu kullanarak kullanıcının verdiği datayı memeorye yerlestiriniz
        String firstName = input.next();
        System.out.println("Soy isminizi giriniz..");
        String lastName = input.next();

        System.out.println(firstName+" " +lastName);//ali can

    }
}
