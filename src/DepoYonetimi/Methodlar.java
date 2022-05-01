package DepoYonetimi;

import java.util.Scanner;

public class Methodlar {
    static Scanner scan = new Scanner(System.in);


    public static void girisPaneli() {
        System.out.println("Depo yonetim programi");
        System.out.println("urun tanimalamak icin 1'e");
        System.out.println("Urunlari listelemek icin 2'ye basiniz");
        System.out.println("Urun girisi yapmak icin 3'e basiniz");
        System.out.println("Urunu rafa koymak icin 4'e basiniz");
        System.out.println("Urun cikisi yapmak icin 5'e basinizi");
        System.out.println("cikis yapmak icin Q'ya basinizi");

        String secim = scan.nextLine();

        switch (secim) {
            case "1":
                urunTanimla();
                girisPaneli();
                break;
            case "2":
                urunlistele();
                girisPaneli();
                break;
            case "3":
                urunGirisi();
                girisPaneli();
                break;
            case "4":
                rafaKoy();
                girisPaneli();
                break;
            case "5":
                urunCıkısı();
                girisPaneli();
                break;
            case "Q":
                System.out.println("yine bekleriz");
            default:
                System.out.println("hatali giris yaptiniz");
                girisPaneli();

        }


    }

    private static void urunCıkısı() {
        urunlistele();
        System.out.println("cikis yapilan urunun ıd'sini giriniz");
        int alinanId = scan.nextInt();
        scan.nextLine();
        System.out.println("cikmak istediginiz miktari giriniz");
        double cikilacakMiktar = scan.nextDouble();
        scan.nextLine();
        for (Urun each : Urun.getUrunlistesi()
        ) {
            if (alinanId == each.getId()) {
                if (cikilacakMiktar > each.getMiktar()) {
                    System.out.println("o kadar urun yok");
                } else {
                    each.setMiktar(each.getMiktar() - cikilacakMiktar);
                    System.out.println(each.getUrunIsmi() + " urununden " + cikilacakMiktar +" " +each.getBirim()+" cıkarilmistir");
                    break;
                }
            }


        }

    }

    private static void rafaKoy() {
        urunlistele();
        System.out.println("rafa koyacaginiz urunun ıd'sini giriniz");
        int alinanId = scan.nextInt();
        scan.nextLine();
        System.out.println("koymak istediginiz rafi giriniz");
        String yerlestirilecekRaf = scan.nextLine();
        for (Urun each : Urun.getUrunlistesi()
        ) {
            if (alinanId == each.getId()) {
                each.setRaf(yerlestirilecekRaf);
                System.out.println(each.getUrunIsmi() + " urunu " + yerlestirilecekRaf + " eklenmistir");
                break;
            }


        }

    }

    private static void urunGirisi() {
        urunlistele();
        System.out.println("giris yapacaginiz urunun ıd'sini giriniz");
        int alinanId = scan.nextInt();
        scan.nextLine();
        System.out.println("eklemek istediginiz miktari giriniz");
        double eklenecekMiktar = scan.nextDouble();
        scan.nextLine();
        for (Urun each : Urun.getUrunlistesi()
        ) {
            if (alinanId == each.getId()) {
                each.setMiktar(eklenecekMiktar + each.getMiktar());
                System.out.println(each.getUrunIsmi() + " urunune " + eklenecekMiktar+" "+each.getBirim()+ " eklenmistir");
                break;
            }


        }

    }

    private static void urunlistele() {
        System.out.printf("%-6s%-12s%-15s%-8s%-7s%-7s\n", "ıd", "Urun Adı", "Ureticisi", "Miktari", "Birimi", "Rafi");
        for (Urun each : Urun.getUrunlistesi()
        ) {
            System.out.printf("%-6d%-12s%-15s%-8s%-7s%-7s\n", each.getId(), each.getUrunIsmi(), each.getUretici(),
                    each.getMiktar(), each.getBirim(), each.getRaf());

        }

    }

    private static void urunTanimla() {
        Urun yeniUrun = urunOlusturucu();
        Urun.urunListesineUrunEkle(yeniUrun);
        System.out.println(yeniUrun.getUrunIsmi() + " tanimlanmistir");
    }

    private static Urun urunOlusturucu() {
        System.out.println("Urunun  adini giriniz");
        String urunIsmi = scan.nextLine();
        System.out.println("Ureticisini giriniz");
        String uretici = scan.nextLine();
        System.out.println("Urun Birimini giriniz");
        String birim = scan.nextLine();

        Urun urngrs = new Urun(urunIsmi, uretici, birim);

        return urngrs;
    }


}
