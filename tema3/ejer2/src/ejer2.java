import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de euros que quiere convertir: ");
        double euros = s.nextDouble();
        int pesetas = (int) (euros * 166.386);
        System.out.print(euros + " euros son " + pesetas + " pesetas.");
        s.close();
    }
}
