import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("introduce un numero: ");
        int num1 = s.nextInt();
        System.out.print("introduce otro numero: ");
        int num2 = s.nextInt();
        int multiplicacion = num1 * num2;
        System.out.println("El resultado de multiplicar " + num1 + " * " + num2 + " = " + multiplicacion);
        s.close();
    }
}
