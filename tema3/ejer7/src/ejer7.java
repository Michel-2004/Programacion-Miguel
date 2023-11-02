import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) throws Exception {
        int base;
        Scanner s = new Scanner(System.in);
        System.out.print(" introduzca la base imponible:  ");
        base = s.nextInt();
        
        double totalcantidadIVA;
        totalcantidadIVA = (base * 21) / 100;
        
        double total;
        total= base + totalcantidadIVA;
        
        System.out.println( "el total es " + total);
        s.close();
    }
}
