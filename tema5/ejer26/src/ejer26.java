import java.util.Scanner;

public class ejer26 {

  public static void main(String[] args) throws Exception {
    Scanner s =new Scanner(System.in);
    System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = s.nextInt() ;
    System.out.print("Introduzca un dígito: ");
    int digito = s.nextInt();
    System.out.print(
      "Contando de izquierda a derecha, el " +
      digito +
      " aparece dentro de " +
      numeroIntroducido +
      " en las siguientes posiciones: "
    );

    int numero = numeroIntroducido;
    int volteado = 0;
    int posicion = 1;
    if (numero == 0) {
    }
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    while (volteado > 0) {
      if ((volteado % 10) == digito) {
        System.out.print(posicion + " ");
      }
      volteado /= 10;

      posicion++;
    } 
    System.out.println();
    s.close();
  }
}
