package school_Management;

import java.util.Scanner;

public class AnaMenu implements AnaMenuInterface{
    static Scanner scan = new Scanner(System.in);

    public static void giris() {
        AnaMenu object = new AnaMenu(); // diger methodlari cagirmak icin bu objeyi olusturduk

        System.out.println("okul yonetimi");
        System.out.println("lutfen seciminizi yapiniz");
        System.out.println("1ogrnci islemleri \n2Ogretlen islemleri \nQ-cikis");
        String secim = scan.next().toUpperCase();

        switch(secim){
            case "1":
                object.ogrenciIslemleri();
                break;
            case "2":
                object.ogretmenIslemleri();
                break;
            case "Q":
                object.cikis();
                break;
                default:
                    System.out.println("lutfen geceri bir secim yapiniz");
                    giris();
        }


    }

    @Override
    public void ogrenciIslemleri() {

        Islemler.islemlerMenu(1); // buraya 1 koymamizin sebebi secimde 1 secip ogrnciyi secmesi

    }

    @Override
    public void ogretmenIslemleri() {

    }

    @Override
    public void cikis() {

    }
}
