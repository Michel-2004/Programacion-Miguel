import java.util.Scanner;

public class ejer15 {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el numero base: ");
    int base = s.nextInt();
    System.out.print("Introduzca un numero exponente: ");
    int exponenteFinal = s.nextInt();
    int potencia;
    int exponente;
    for (int i = 1; i <= exponenteFinal; i++) {
      potencia = 1;
      exponente = i;
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
      System.out.println(base + "^" + i + " = " + potencia);
    }
    s.close();
  }
}
