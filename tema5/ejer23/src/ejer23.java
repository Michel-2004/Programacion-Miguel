import java.util.Scanner;

public class ejer23 {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce numeros");
    int numeroIntroducido;
    int suma = 0;
    int numeroDeElementos = 0;
    do {
      numeroIntroducido =s.nextInt() ;
      suma += numeroIntroducido;
      numeroDeElementos++;
    } while (suma <= 10000);
    System.out.println(
      "Ha introducido un total de " + numeroDeElementos + " numeros"
    );
    System.out.println("La suma total es " + suma);
    System.out.println("La media es " + suma / numeroDeElementos);
    s.close();
  }
}
