import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) throws Exception {
        double nota1;
        double nota2;
        double nota3;
        double media;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la nota del primer examen: \n");
        nota1 = s.nextDouble();
        System.out.print("Introduzca la nota del segundo examen: \n");
        nota2 = s.nextDouble();
        System.out.print("Introduzca la nota del tercer examen: \n");
        nota3 = s.nextDouble();
        media = (nota1 + nota2 + nota3 ) / 3;
        System.out.println("La nota media es de " + media);
        s.close();
        if (media < 5) {
            System.out.println("La nota media es de insuficiente");
            }
        if((media >=5) && (media <=7) ){
            System.out.println("La nota media es de suficiente");
            }
        else {
            System.out.println("La nota media es de sobresalinete");
        }
    }
}