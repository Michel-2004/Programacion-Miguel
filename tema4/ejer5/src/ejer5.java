import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca el valor de a: ");
        a = s.nextInt();
        System.out.print("Ahora introduzca el valor de b: ");
        b = s.nextInt();
        if (a == 0) {
            System.out.println("Esa ecuación no tiene solución real.");
        } else {
            System.out.println("x = " + (-b/a));
        }
        s.close();
    }
}
