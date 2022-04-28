package Hospital_project;

public class HastaneDeneme {

    private static Hastane hastane = new Hastane();


    public static void main(String[] args) {

        String hastaDurumu = "Kalp hastaliklari";
        String unvan = doktorUnvan(hastaDurumu);


        hastane.setDoktor(doktorBul(unvan));

        System.out.println("Doktor ismi: " + hastane.getDoktor().getIsim());
        System.out.println("Doktor soy isim: " + hastane.getDoktor().getSoyIsim());
        System.out.println("Doktor unvani: " + hastane.getDoktor().getUnvan());
        System.out.println();

        String durumlar = "Bas agrisi";


        hastane.setHasta(hastaBul(durumlar));
        System.out.println("hasta ismi: " + hastane.getHasta().getIsim());
        System.out.println("hasta soy isim: " + hastane.getHasta().getSoyIsim());
        System.out.println("hasta ID: " + hastane.getHasta().getHastaID());


    }


    public static String doktorUnvan(String aktuelDurum) {

        if (aktuelDurum.equals("Allerji")) {
            return hastane.unvanlar[0];
        } else if (aktuelDurum.equals("Bas agrisi")) {
            return hastane.unvanlar[1];
        } else if (aktuelDurum.equals("Diabet")) {
            return hastane.unvanlar[2];
        } else if (aktuelDurum.equals("Soguk alginligi")) {
            return hastane.unvanlar[3];
        } else if (aktuelDurum.equals("Migren")) {
            return hastane.unvanlar[4];
        } else if (aktuelDurum.equals("Kalp hastaliklari")) {
            return hastane.unvanlar[5];
        }

        return "yanlis durum";

    }

    public static Doktor doktorBul(String unvan) {

        Doktor doktor = new Doktor();

        for (int i = 0; i < hastane.unvanlar.length; i++) {

            if (unvan.equals(hastane.unvanlar[i])) {
                doktor.setIsim(hastane.doctorIsimleri[i]);
                doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
                doktor.setUnvan(unvan);
            }


        }

        return doktor;


    }

    public static Hasta hastaBul(String durumlar) {
        Hasta hasta = new Hasta();
        for (int i = 0; i < hastane.durumlar.length; i++) {
            if (durumlar.equals(hastane.durumlar[i])) {
                hasta.setIsim(hastane.hastaIsimleri[i]);
                hasta.setSoyIsim(hastane.hastaSoyIsimleri[i]);
                hasta.setHastaDurumu(hastane.durumlar);

            }
        }
        return hasta;
    }
}