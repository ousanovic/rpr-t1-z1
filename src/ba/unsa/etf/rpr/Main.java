package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    public static int sumaCifara(int a) {
        int suma = 0;
        while(a > 0) {
            suma += a % 10;
            a /= 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("Unesite n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Brojevi od 1 do " + n + " djeljivi sa sumom svojih cifara su:");
        for(int i = 1; i <= n; i++)
            if(i % Main.sumaCifara(i) == 0)
                System.out.print(i + " ");

    }
}
