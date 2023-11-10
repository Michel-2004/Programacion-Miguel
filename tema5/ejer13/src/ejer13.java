import java.util.Scanner;

public class ejer13 {

  public static void main(String[] args) throws Exception {
    System.out.println("Por favor, introduzca 10 números enteros: ");
    int negativos = 0;
    int positivos = 0;
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
      if (s.nextInt() < 0) {
        negativos++;
      } else {
        positivos++;
      }
    }
    System.out.println(
      "Ha introducido " + positivos + " positivos y " + negativos + " negativos"
    );
    s.close();
  }
}
