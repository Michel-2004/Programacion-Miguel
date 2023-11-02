import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) throws Exception {
        int base;
        int altura;
        Scanner s = new Scanner(System.in);
        System.out.print(" introduzca la base:  ");
        base = s.nextInt();
    
        System.out.print(" introduzca la altura:  ");
        altura = s.nextInt();
        
        double totalarea;
        totalarea = (base * altura) / 2;
        
        System.out.println( "el area es " + totalarea);
        s.close();
    }
}
