import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) throws Exception {
        final double PI = 3.14;
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura (cm): ");
        double h = s.nextDouble();
        System.out.print("Introduzca el radio (cm): ");
        double r = s.nextDouble();
        double v = (1.0/3.0) * PI * r * r * h;
        System.out.println("El volumen del cono es de " + v + " cm³");
        s.close();
    }
}
