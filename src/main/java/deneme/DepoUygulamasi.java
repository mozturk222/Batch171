import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepoUygulamasi {
    static List<Urun> urunListesi = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("Depo Uygulaması");
            System.out.println("1- Ürün Tanımlama");
            System.out.println("2- Ürünleri Listeleme");
            System.out.println("3- Ürün Girişi");
            System.out.println("4- Ürünü Rafa Koyma");
            System.out.println("5- Ürün Çıkışı");
            System.out.println("0- Çıkış");
            System.out.print("Seçiminizi yapınız: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    urunTanimlama();
                    break;
                case 2:
                    urunListele();
                    break;
                case 3:
                    urunGirisi();
                    break;
                case 4:
                    urunuRafaKoy();
                    break;
                case 5:
                    urunCikisi();
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız!");
            }
        } while (secim != 0);
    }

    static void urunTanimlama() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ürün Tanımlama");
        System.out.print("Ürün İsmi: ");
        String urunIsmi = scanner.nextLine();
        System.out.print("Üretici: ");
        String uretici = scanner.nextLine();
        System.out.print("Birim: ");
        String birim = scanner.nextLine();

        int id = urunListesi.size() + 1;
        int miktar = 0;
        String raf = "-";

        Urun urun = new Urun(id, urunIsmi, uretici, miktar, birim, raf);
        urunListesi.add(urun);

        System.out.println("Ürün başarıyla tanımlandı.");
        System.out.println();
    }

    static void urunListele() {
        System.out.println("Ürünleri Listeleme");

        if (urunListesi.isEmpty()) {
            System.out.println("Depoda hiç ürün bulunmamaktadır.");
        } else {
            for (Urun urun : urunListesi) {
                System.out.println("ID: " + urun.getId());
                System.out.println("Ürün İsmi: " + urun.getUrunIsmi());
                System.out.println("Üretici: " + urun.getUretici());
                System.out.println("Miktar: " + urun.getMiktar());
                System.out.println("Birim: " + urun.getBirim());
                System.out.println("Raf: " + urun.getRaf());
                System.out.println("--------------------");
            }
        }

        System.out.println();
    }

    static void urunGirisi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ürün Girişi");
        System.out.print("Giriş yapmak istediğiniz ürünün ID numarasını giriniz: ");
        int urunId = scanner.nextInt();

        Urun urun = urunBul(urunId);
        if (urun != null) {
            System.out.print("Giriş miktarını giriniz: ");
            int girisMiktari = scanner.nextInt();

            int yeniMiktar = urun.getMiktar() + girisMiktari;
            urun.setMiktar(yeniMiktar);

            System.out.println("Ürün başarıyla depoya giriş yaptı.");
        } else {
            System.out.println("Belirtilen ID numarasına sahip bir ürün bulunamadı.");
        }

        System.out.println();
    }

    static void urunuRafaKoy() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ürünü Rafa Koyma");
        System.out.print("Rafa koymak istediğiniz ürünün ID numarasını giriniz: ");
        int urunId = scanner.nextInt();

        Urun urun = urunBul(urunId);
        if (urun != null) {
            System.out.print("Raf numarasını giriniz: ");
            String raf = scanner.next();

            urun.setRaf(raf);

            System.out.println("Ürün başarıyla rafa koyuldu.");
        } else {
            System.out.println("Belirtilen ID numarasına sahip bir ürün bulunamadı.");
        }

        System.out.println();
    }

    static void urunCikisi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ürün Çıkışı");
        System.out.print("Çıkış yapmak istediğiniz ürünün ID numarasını giriniz: ");
        int urunId = scanner.nextInt();

        Urun urun = urunBul(urunId);
        if (urun != null) {
            System.out.print("Çıkış miktarını giriniz: ");
            int cikisMiktari = scanner.nextInt();

            int yeniMiktar = urun.getMiktar() - cikisMiktari;
            if (yeniMiktar < 0) {
                System.out.println("Stokta yeterli miktarda ürün bulunmamaktadır.");
            } else {
                urun.setMiktar(yeniMiktar);
                System.out.println("Ürün başarıyla depodan çıkış yaptı.");
            }
        } else {
            System.out.println("Belirtilen ID numarasına sahip bir ürün bulunamadı.");
        }

        System.out.println();
    }

    static Urun urunBul(int urunId) {
        for (Urun urun : urunListesi) {
            if (urun.getId() == urunId) {
                return urun;
            }
        }
        return null;
    }
}

class Urun {
    private int id;
    private String urunIsmi;
    private String uretici;
    private int miktar;
    private String birim;
    private String raf;

    public Urun(int id, String urunIsmi, String uretici, int miktar, String birim, String raf) {
        this.id = id;
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }

    public int getId() {
        return id;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }
}