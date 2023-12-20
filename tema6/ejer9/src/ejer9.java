public class ejer9 {

  public static void main(String[] args) throws Exception {
    int n = 0;
    int cuentaNumeros = 0;
    while (n != 24) {
      n = (int) (Math.random() * 51) * 2;
      System.out.print(n + " ");
      cuentaNumeros++;
    }
    System.out.println(" ");
    System.out.println("Se han generado " + cuentaNumeros + " números.");
  }
}
