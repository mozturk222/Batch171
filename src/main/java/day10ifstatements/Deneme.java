package day10ifstatements;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ürün m!ktarını sayı olarak g!r!n!z");
        int miktar = scan.nextInt();
        System.out.println("Ürün b!r!m f!yatını g!r!n!z");
        double fiyat = scan.nextDouble();
        double result = miktar>1000 ? fiyat*0.9*miktar : fiyat*miktar;
        System.out.println(result);
    }
}
