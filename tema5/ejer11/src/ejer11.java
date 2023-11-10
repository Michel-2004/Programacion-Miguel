import java.util.Scanner;

public class ejer11 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int numero = 0;
        System.out.print("Introduce un numero: \n");
        numero = s.nextInt();
        int maxNUm = numero + 5;
        int cuadrado = numero * numero;
        int cubo = numero * numero * numero;
        for (int i = numero; i <= maxNUm; i++) {
           System.out.printf("numero: %d cuadrado: %d cubo: %d \n",numero,cuadrado,cubo);
            numero++;
            cuadrado = numero * numero;
            cubo = numero * numero * numero;
        }
        s.close();
    }
}
