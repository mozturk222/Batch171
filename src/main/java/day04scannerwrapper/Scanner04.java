package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Ornek : kullanıcıdan bir dikdortgenın iki kenar uzunlugunu aliniz
        // Alanını hesaplayınız ==> Kısa kenar * Uzun kenar
        // Cevresini hesaplayınız ==> 2 *Kisa kenar + 2 * Uzun Kenar

        Scanner input = new Scanner(System.in);
        System.out.println(" Dikdortgenin kısa kenar uzunlugunu giriniz..");
        double shortSide = input.nextDouble();

        System.out.println(" Dikdortgenin uzun kenar uzunlugunu giriniz..");
        double longSide = input.nextDouble();

        System.out.println("Alan = " +(shortSide*longSide));

        System.out.println("Cevre = " + (2*shortSide+2*longSide));






    }
}
