package maps;

import java.util.Map;
import java.util.Scanner;

public class HashMap {

    static int id =1000;
    static Map<Integer, Employee> employeesMap = new java.util.HashMap<>();
    static Map<Integer, String> employeesMap2 = new java.util.HashMap<>();

    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {


        isciEkle();
        System.out.println(employeesMap);
        isciEkle();
        System.out.println(employeesMap);
        isciSil();

        //isciSil();
    //  employeesMap.put(1001, new Employee(1001, "ali", "can"));
    //  employeesMap.put(1002, new Employee(1002, "veli", "can"));
    //  employeesMap.put(1003, new Employee(1003, "ali", "bak"));


    //  System.out.println(employeesMap.entrySet());
    //  System.out.println(employeesMap.get(1001));
    //  System.out.println(employeesMap);
    }

    private static void isciSil() {
        System.out.println("silecegin iscinin ismini gir");
        String isim = scan.next();
           }

    public static void isciEkle() {
        System.out.print("isminizi girin: ");
        String isim = scan.next();
        scan.nextLine();//dummy
        System.out.print("Sehrinizi girin: ");
        String sehir = scan.next();
        employeesMap.put(id, new Employee(isim,sehir));
        id++;
    }
}
