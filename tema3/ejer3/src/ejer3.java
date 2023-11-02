import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un numero de pesetas que quieras convertir a euros: ");
        int pesetas = s.nextInt();
        double euros = pesetas / 166.386;
        System.out.printf("%d pesetas son %.2f euros.\n", pesetas, euros);
        s.close();
    }
}
