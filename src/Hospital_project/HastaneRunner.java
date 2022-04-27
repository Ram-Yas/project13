package Hospital_project;

public class HastaneRunner {

    private static Hastane Hastane1 = new Hastane();

    public static void main(String[] args) {

        String hastaDurumu;
        String unvan;
        //unvan = doktorUnvan(aktuelDurum); burada hata olusuyor
    }

    public HastaneRunner() {
    }

    public static String doktorUnvan(String aktuelDurum) { // Hastane Runner 1. method
        if (aktuelDurum.equalsIgnoreCase("Allerji")) {
            return "Allergist";
            //return Hastane1.unvanlar[0]; hocanin ornekte bu sekilde
        } else if (aktuelDurum.equalsIgnoreCase("Bas agrisi")) {
            return "Norolog";
        } else if (aktuelDurum.equalsIgnoreCase("Diabet")) {
            return "Genel cerrah";
        } else if (aktuelDurum.equalsIgnoreCase("Soguk alginligi")) {
            return "Cocuk doktoru";
        } else if (aktuelDurum.equalsIgnoreCase("migren")) {
            return "Dahiliye";
        } else if (aktuelDurum.equalsIgnoreCase("Kalp hastaliklari")) {
            return "Kardiolog";
        } else return "Yanlis unvan";

    }

    public static Doktor doktorBul(String unvan) {  // Hastane Runner 2. method

        Doktor doktor = new Doktor();


        for (int i = 0; i <Hastane1.unvanlar.length; i++) {

            if (unvan.equals(Hastane1.unvanlar[i])){
                doktor.setIsim(Hastane1.doctorIsimleri[i]);
                doktor.setSoyIsim(Hastane1.doctorIsimleri[i]);
                doktor.setUnvan(unvan);
            }

        }
        return doktor;
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

    public static Hasta hastabul(String actualCase){ // Hastane Runner 4. method
        Hasta hasta = new Hasta();

       // for (int i = 0; i < ; i++) {

        //}


        return hasta;
    }
}
