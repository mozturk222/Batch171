package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Kullanıcıdan iki sayı alıp 4 islem yapan ve islemlerin sonuclarını ekrana yazdıran kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        double firstNumber = input.nextDouble();
        double secondNumber =input.nextDouble();
        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);


    }
}
