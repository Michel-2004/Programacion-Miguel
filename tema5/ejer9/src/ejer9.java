import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int numero = 0;
        int cifras = 0;
        System.out.print("introduzca un numero con un maximo de 5 cifras: ");
        numero = s.nextInt();
        if (numero <= 99999) {
            for (int i = numero; i > 0; i= i /10) {
            cifras++;
        }
            System.out.println("El tamaño del numero es "+ cifras);
        } else {
            System.out.println("El tamaño del numero es mayor a 5 cifras");
        }
        
        
        s.close();
    }
}
