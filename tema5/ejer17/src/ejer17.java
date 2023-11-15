import java.util.Scanner;

public class ejer17 {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        int suma = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        numero = s.nextInt();
        System.out.println();
        if (numero > 0) {
            for (int i = 0; i <= 100; i++) {
                suma = numero + i;
                System.out.print(suma + " ");
            }
        } else {
            System.out.println("el numero introducido es negativo");
        }
        s.close();
    }
}
