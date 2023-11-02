import java.util.Scanner;

public class ejer9 {

  public static void main(String[] args) throws Exception {
    double a , b, c;
    Scanner s = new Scanner(System.in);
    System.out.println("introduzca los valores.");
    System.out.print("a = ");
    a = s.nextDouble();
    System.out.print("b = ");
    b = s.nextDouble();
    System.out.print("c = ");
    c = s.nextDouble();
    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("La ecuación tiene infinitas soluciones.");
    }
    if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("La ecuación no tiene solución.");
    }
    if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b / a));
    }
    if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("x1 = x2 = " + (-c / b));
    }
    if ((a != 0) && (b != 0) && (c != 0)) {
      double discriminante = b * b - (4 * a * c);
      if (discriminante < 0) {
        System.out.println("La ecuación no tiene soluciones reales");
      } else {
        System.out.println("x1 = " + (-b + Math.sqrt(discriminante)) / (2 * a));
        System.out.println("x2 = " + (-b - Math.sqrt(discriminante)) / (2 * a));
      }
    }
    s.close();
  }
}
