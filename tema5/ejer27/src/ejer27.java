import java.util.Scanner;

public class ejer27 {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un numero: ");
    int numeroIntroducido = s.nextInt();
    int cuenta = 0;
    int suma = 0;
    for (int i = 1; i < numeroIntroducido; i++) {
      if ((i % 3) == 0) {
        System.out.print(i + " ");
        cuenta++;
        suma += i;
      }
    }
    System.out.println("desde el 1 hasta " + numeroIntroducido + " hay " + cuenta);
    System.out.println(" multiplos de 3 y suman " + suma);
    s.close();
  }
}
