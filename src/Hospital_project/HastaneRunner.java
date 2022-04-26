package Hospital_project;

public class HastaneRunner {

    private static Hastane Hastane1 = new Hastane();

    public static void main(String[] args) {

        String hastaDurumu;
        String unvan;
        //unvan = doktorUnvan(aktuelDurum); burada hata olusuyor
    }

    public static String doktorUnvan(String aktuelDurum) {
        if (aktuelDurum.equalsIgnoreCase("Allerji")) {
            return "Allergist";
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

    public static Doktor doktorBul(String unvan) {

        Doktor doktor = new Doktor();
        return null;
    }
}
