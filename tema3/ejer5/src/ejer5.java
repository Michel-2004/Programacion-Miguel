import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) throws Exception {
        int base;
        int altura;
        double area;
        Scanner s = new Scanner(System.in);
        System.out.print(" introduzca la base:  ");
        base = s.nextInt();
        System.out.print(" introduzca la altura:  ");
        altura = s.nextInt();
        area = base * altura;
        System.out.println( "el area es " + area);
        s.close();
    }
}
