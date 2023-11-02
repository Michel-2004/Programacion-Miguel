import java.util.Scanner;

public class ejer12 {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la nota del primer examen: ");
    double nota1 = s.nextDouble();
    System.out.print("¿Qué nota quieres sacar en el trimestre? ");
    double notaFinal = s.nextDouble();
    double nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;
    System.out.println("Para tener un " + notaFinal +" en el trimestre necesitas sacar un " + nota2 + " en el segundo examen.");
    s.close();
  }
}
