import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num1 = s.nextInt();
        System.out.print("Introduce otro numero: ");
        int num2 = s.nextInt();;
        int suma = num1 + num2;
        int resta = num1 - num2;
        int mult = num1 * num2;
        int div = num2 / num1;
        System.out.println("La suma de "+ num1 + " + "+ num2+" = "+ suma);
        System.out.println("La resta de "+ num1 + " - "+ num2 +" = "+ resta);
        System.out.println("La multiplicacion de "+ num1 + " * "+ num2+" = "+ mult);
        System.out.println("La division de "+ num2 + " / "+ num1+" = "+ div);
        s.close();
    }
}
