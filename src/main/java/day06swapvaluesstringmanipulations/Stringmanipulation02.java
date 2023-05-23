package day06swapvaluesstringmanipulations;

public class Stringmanipulation02 {
    public static void main(String[] args) {
        String s = "Learn Java earn money" ;
        //Ornek 1 : "s" String inin "money" ile bitip bitmedigini kontrol
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Ornek 2 : "s" String indeki money kelimesini dollar kelimesine ceviriniz
        String s1 = s.replace("money","dollar");
        System.out.println(s1);

        //Ornek 3: "s" Stringdeki "earn" kelimesini "win" kelimesine ceviriniz
        String sEr = s.replace("earn"," win");
        System.out.println(sEr);

        //Ornek 4 : "s" Strindeki tüm a harflerini yıldıza ceviriniz

        String s3 = s.replace("a","*");
        System.out.println(s3);

        //Ornek 5 : "s" Strindeki "n" harflerini "xxx" a ceviriniz
        String s4 = s.replace("n","xxx");
        System.out.println(s4);

        //Ornek 6 : "s" Stringindeki e harflerini siliniz
        String s5 = s.replace("e", "");
        System.out.println(s5);

        //Ornek 7 : "t" stringindeki tum


        /*
  ********** Regex ler ********

   1) Tum rakamlar               ==> [0-9]
   2) Tum kucuk harfler          ==> [a-z]
   3) Tum buyuk harfler          ==> [A-Z]
   4) Tum Kucuk ve buyuk harfler ==> [a-zA-Z]
   5) Tum harfler ve rakamlar    ==> [a-zA-Z0-9]
   6) Tum noktalama isaretleri   ==> \\p{Punct}
   7) Tum sesli Harfler          ==> [aeiouAEIOU]
   8) Tum x,q,w harfleri         ==> [xqw]


  ******* Olumsuz Regex ler ******

   9) Kucuk harflerden farkli tum characterler => [^a-z]
   10 Tum harflerden farkli tum characterler   =>[^a-zA-Z]
 */









    }
}
