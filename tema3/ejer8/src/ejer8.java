import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) throws Exception {
        double horas;
        Scanner s = new Scanner(System.in);
        System.out.print(" introduzca el numero de horas diarias:  ");
        horas = s.nextDouble();
        
        double totalsemanal;
        totalsemanal = horas * 5;
        
        double total;
        total= totalsemanal * 12;
        
        System.out.println( "ha trabajado un total de " + totalsemanal + " horas a la semana");
        System.out.println( "el total es " + total);
        s.close();
    }
}
