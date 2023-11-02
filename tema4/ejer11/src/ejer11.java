import java.util.Scanner;

public class ejer11 {

  public static void main(String[] args) throws Exception {
    int hora = 0;
    int minuto =0;
    int segundosTranscurridos = 0;
    int segundosMedianoche = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("primero introducirá la hora y luego los minutos.");
    System.out.print("hora: ");
    hora =s.nextInt() ;
    System.out.print("minuto: ");
    minuto = s.nextInt();
    segundosTranscurridos = (hora * 3600) + (minuto * 60);
    segundosMedianoche = (24 * 3600) - segundosTranscurridos;
    System.out.println(
      "Desde las " +
      hora +
      ":" +
      minuto +
      " hasta la medianoche faltan " +
      segundosMedianoche +
      " segundos."
    );
    s.close();
  }
}
