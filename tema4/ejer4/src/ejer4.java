import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int horas = 0;
        int horasextras = 0;
        int salario = 0;
        int salariosinhoras = 0;
        int salariototal = 0;
        System.out.print("introduzca las horas trabajadas: ");
        horas = s.nextInt();

        if (horas <=40) {
            salario = horas * 12;
            System.out.println("las horas trabajadas son " + horas +" tu salario es de "+ salario );
        } else {
            horasextras = horas - 40;
            salario = horasextras * 16;
            salariosinhoras = 40 * 12;
            salariototal= salariosinhoras + salario;
            System.out.println("las horas trabajadas son " + horas +" tu salario es de "+ salariototal );
        }
    s.close();
    }
}
