import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) throws Exception {
        int combinacion = 2023;
        Scanner s = new Scanner(System.in);
        int nIntentos = 4;
        int numero = 0;
        System.out.println("introduce la clave de la caja fuerte");
        numero = s.nextInt();

        for (int i = 0; i <= nIntentos; i++) {
            if (numero == combinacion) {
                System.out.println("la caja esta abierta");
                i = 4;
            } else {
                System.out.println("combinacion erronea introduce otra");
                numero = s.nextInt();
            }
        }
        s.close();
    }
}
