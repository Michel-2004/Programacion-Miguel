import java.util.Scanner;

public class ejer16 {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un numero y le dire si es primo: ");
    int numeroIntroducido = s.nextInt();
    boolean esPrimo = true;
    for (int i = 2; i < numeroIntroducido; i++) {
      if ((numeroIntroducido % i) == 0) {
        esPrimo = false;
      }
    }
    if (esPrimo) {
      System.out.println("El numero introducido es primo.");
    } else {
      System.out.println("El numero introducido no es primo.");
    }
    s.close();
  }
}
