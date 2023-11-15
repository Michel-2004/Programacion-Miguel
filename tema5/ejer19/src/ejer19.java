import java.util.Scanner;

public class ejer19 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int altura = 0;
        int espacios = 0;
        int planta = 1;
        int longLinea = 1;
        String cararcter = "";
        System.out.print("introduce la altura de la piramide: \n");
        altura = s.nextInt();
        System.out.println("introduce el caracter que conforma la piramide: ");
        cararcter = s.next();
        espacios = altura -1;
        
        while (planta <= altura) {
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <=longLinea; i++) {
                System.out.print(cararcter);
            }
            System.out.println();
            planta++;
            espacios--;
            longLinea += 2;
        }
        s.close();
    }
}
