import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Degiskenleri tanimladik.
        double a, b, c, u, cevre, alan;

        // Scanner i tanimladik.
        Scanner input = new Scanner(System.in);

        // Kullanicidan dik kenarlarin uzunluklarini alip ilgili degiskenlere atadik.
        System.out.print("Merhabalar.\nDik ucgende dik kenarlarin ilkinin uzunlugunu gir:");
        a = input.nextInt();

        System.out.print("Dik ucgende dik kenarlarin ikincisinin uzunlugunu gir:");
        b= input.nextInt();

        // Hipotenus uzunlugunu hesapladik.
        c  = Math.sqrt(a*a + b*b);

        // Hipotenus bilgisini kullanici ile paylastik.
        System.out.print("Kenarlari uzunluklari verilen ucgenin hipotenusunun uzunlugu: " + c);

        // Ucgenin cevre ve alani ile alakali gerekli matematiksel islemleri gerceklestirdik.
        u = (a + b + c)/2;
        cevre = 2*u;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        // Son olarak ucgenin alan ve cevresi ile alakali bilgiyi kullanici ile paylastik.
        System.out.print("\nMevcut ucgenimizin cevresi: " + cevre + "\nMevcut ucgenimizin alani: " + alan);
    }
}