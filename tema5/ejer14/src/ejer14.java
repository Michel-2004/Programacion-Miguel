import java.util.Scanner;

public class ejer14 {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la base: ");
    int base = s.nextInt();
    System.out.print("Introduzca el exponente: ");
    int exponente = s.nextInt();
    double potencia = 1;
    if (exponente == 0) {
      potencia = 1;
    }
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      potencia = 1 / potencia;
    }
    System.out.println(base + "^" + exponente + " = " + potencia);
    s.close();
  }
}
