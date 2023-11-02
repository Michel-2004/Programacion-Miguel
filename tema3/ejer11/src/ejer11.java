import java.util.Scanner;

public class ejer11 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca el número de Kb: ");
        double kb = s.nextDouble();
        System.out.println(kb + "Kb son " + (kb / 1024) + "Mb.");
        s.close();
    }
}
