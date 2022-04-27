package Hospital_project;

public class HastaneRunner {

    private static Hastane hastane1 = new Hastane();

    public static void main(String[] args) {

        String hastaDurumu="Soguk alginligi";
        String unvan;

        unvan = doktorUnvan(hastaDurumu);
        hastane1.setDoktor(doktorBul(unvan));
        //hastane1.setHasta(hastabul(hastaDurumuBul()));


        System.out.println("doktor ismi :"+hastane1.getDoktor().getIsim());
        System.out.println("doktor soyisim :"+hastane1.getDoktor().getSoyIsim());
        System.out.println("doktor unvani : "+hastane1.getDoktor().getUnvan());
        System.out.println("Hasta ismi :"+hastane1.getHasta().getIsim());
        System.out.println("Hasta soyismi : "+hastane1.getHasta().getSoyIsim());
        System.out.println("Hasta ID'si: "+ hastane1.getHasta().getHastaID());

    }

    public HastaneRunner() {
    }


    public static String doktorUnvan(String aktuelDurum) { // Hastane Runner 1. method
        if (aktuelDurum.equalsIgnoreCase("Allerji")) {
            return hastane1.unvanlar[0]; //hocanin ornekte bu sekilde
        } else if (aktuelDurum.equalsIgnoreCase("Bas agrisi")) {
            return   hastane1.unvanlar[1];
        } else if (aktuelDurum.equalsIgnoreCase("Diabet")) {
            return   hastane1.unvanlar[2];
        } else if (aktuelDurum.equalsIgnoreCase("Soguk alginligi")) {
            return hastane1.unvanlar[3];
        } else if (aktuelDurum.equalsIgnoreCase("migren")) {
            return hastane1.unvanlar[4];
        } else if (aktuelDurum.equalsIgnoreCase("Kalp hastaliklari")) {
            return hastane1.unvanlar[5];
        } else return "Yanlis unvan";

    }


    public static Durum hastaDurumuBul(String aktuelDurum){  // Hastane Runner 3. method

        Durum hastaDurumu = new Durum();

        switch(aktuelDurum){
            case "Allerji":
            case "Bas agrisi":
            case "Diabet":
            case "Soguk alginligi":
                hastaDurumu.setAciliyet(false); // return hastaDurumu dedigi icin basina hastaDurumu yazdim sebebini bilmiyorum
                 break;
            case "Migren":
            case "Kalp hastaliklari":
                hastaDurumu.setAciliyet(true);
                break;
            default:
                System.out.println("Gecerli bir durum degil");

        }
        return hastaDurumu;
    }

    public static Doktor doktorBul(String unvan) {  // Hastane Runner 2. method

        Doktor doktor = new Doktor();

        for (int i = 0; i <hastane1.unvanlar.length; i++) {

            if (unvan.equals(hastane1.unvanlar[i])){
                doktor.setIsim(hastane1.doctorIsimleri[i]);
                doktor.setSoyIsim(hastane1.doctorSoyIsimleri[i]);
                doktor.setUnvan(unvan);
            }

        }
        return doktor;
    }

    public static Hasta hastabul(String actualCase){ // Hastane Runner 4. method

        Hasta hasta = new Hasta();

        for (int i = 0; i <hastane1.durumlar.length ; i++) {
            if (actualCase.equals(hastane1.durumlar[i])){
                hasta.setIsim(hastane1.hastaIsimleri[i]);
                hasta.setSoyIsim(hastane1.hastaSoyIsimleri[i]);
                hasta.setHastaID(hastane1.hastaIDleri[i]);
            }

        }
        return hasta;
    }
}
