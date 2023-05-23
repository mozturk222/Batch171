package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        //Ornek : Kullanıcıdan alınan bir sayının tekmi çiftmi olduğunu konsola yazdırınız
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz...");
        int num = input.nextInt();

        //1. Yol
        if (num%2==0){
            System.out.println("Cift sayi...");

        }
        if(num%2!=0){
            System.out.println("Tek sayi");

            //2. Yol
            if (num%2==0){
                System.out.println("Citf sayi");

            }else{ //aksi halde
                System.out.println("Tek Sayi");

            }

        }
    }

}
