import java.util.Scanner;

public class ejer25 {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un numero: ");
    int numeroIntroducido = s.nextInt();
    int numero = numeroIntroducido;
    int volteado = 0;
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while
    System.out.println(
      "Si le damos la vuelta al " +
      numeroIntroducido +
      " tenemos el " +
      volteado
    );
    s.close();
  }
}
