import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int opcion = 0;
        int numero = (int)(Math.random()*100);
        System.out.print("Intoduce un numero: ");
        opcion = s.nextInt();

        for (int i = 0; i <=5 ; i++) {
         if (opcion == numero) {
            System.out.println("Felicidades has aceptado el numero");
            i = 5;
        } else {
            if (opcion > numero) {
                System.out.println("el numero es menor");
                System.out.println("Intoduce un numero: ");
                opcion = s.nextInt();
                i++;
                } else {
                System.out.println("el numero es mayor");
                System.out.print("Intoduce un numero: ");
                opcion = s.nextInt();
                i++;
                }            
            }
            if (i == 5) {
                System.out.println("el numero era " + numero);
            }   
        }
        s.close();
    }
}
