import java.util.Scanner;

public class ejer24 {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print(" introduzca la altura de la piramide:");
    int alturaIntroducida = s.nextInt();
    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida - 1;
    while (altura <= alturaIntroducida) {
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      System.out.println();
      altura++;
      espacios--;
    }
    s.close();
  }
}
