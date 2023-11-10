import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int numero=0;
        int media = 0;
        int suma = 0;
        int contador = -1;
        do {
            System.out.println("introduce un numero:");
            numero = s.nextInt();
            suma += numero;
            contador++;
        } while (numero > 0);
         media = suma / contador;
        System.out.printf("la media es %d",media);
        s.close();
    }
}
