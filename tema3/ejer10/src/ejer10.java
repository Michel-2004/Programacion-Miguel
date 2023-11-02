import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca el número de Mb: ");
        double mb = s.nextDouble();
        System.out.println(mb + "Mb son " + (mb * 1024) + "Kb.");
        s.close();
    }
}
