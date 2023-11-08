import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        int resultado = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("introduce el numero del cual quieres ver la tabla de multiplicar: ");
        numero = s.nextInt();
        for (int i = 0; i <=10; i++) {
            resultado = numero * i;
            System.out.println(numero + " * "+ i +" = "+resultado);
        }
        s.close();
    }
}
