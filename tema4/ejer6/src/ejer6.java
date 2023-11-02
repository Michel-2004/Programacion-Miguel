import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Double g = 9.81;
        Double h;
        double seg;
        System.out.print("introduzca la altura desde que cae un objeto: ");
        h = s.nextDouble();
        seg = Math.sqrt(2*h/g);
        System.out.printf("El objeto tarda %.2f segundos en caer", seg);
        s.close();
    }
}
