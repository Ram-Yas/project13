package school_Management;

import java.util.Scanner;

public class Islemler implements IslemlerMenuInterface {

    static Scanner scan = new Scanner(System.in);

    static int secim =0;


    public static void  islemlerMenu(int i) {
        secim=i;
        Islemler obj = new Islemler();
        System.out.println("Lutfen secim yapiniz");
        System.out.println("1ekleme\n2arama\n3listeleme\n4silme\nanamenu\nqcikis");
        int secim = scan.nextInt();

                switch(secim){
                    case 1:
                        obj.ekleme(); //static bir method'dan static olmayan bir method'a ulasmak icin obje olusturmek aorundayiz
                        islemlerMenu(secim);
                        break;
                    case 2:
                        obj.arama();
                        islemlerMenu(secim);
                        break;
                    case 3:
                        obj.listeleme();
                        islemlerMenu(secim);
                        break;
                    case 4:
                        obj.silme();
                        islemlerMenu(secim);
                        break;
                    case 5:
                        obj.anaMenu();
                        islemlerMenu(secim);
                        break;
                    case 6:
                        obj.cikis();
                        islemlerMenu(secim);
                        break;


                }


    }

    @Override
    public void ekleme() {



    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() {

    }

    @Override
    public void silme() {

    }

    @Override
    public void anaMenu() {

    }

    @Override
    public void cikis() {

    }
}
