import java.util.Scanner;

public class ejer21 {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca los numeros");
    int numeroIntroducido;
    int numeroDeElementos = 0;
    int sumaImpares = 0;
    int numeroDeElementosImpares = 0;
    int maximoPar = 0;
    do {
      numeroIntroducido = s.nextInt();
      if (numeroIntroducido >= 0) {
        numeroDeElementos++;
        if ((numeroIntroducido % 2) == 1) { // número impar
          sumaImpares += numeroIntroducido;
          numeroDeElementosImpares++;
        } else { // número par
          if (numeroIntroducido > maximoPar) maximoPar = numeroIntroducido;
        }
      }
    } while (numeroIntroducido >= 0);
    System.out.println("Has introducido " + numeroDeElementos + " numeros");
    System.out.println(
      "La media de los impares es " + sumaImpares / numeroDeElementosImpares
    );
    System.out.println("El máximo de los pares es " + maximoPar);
    s.close();
  }
}
