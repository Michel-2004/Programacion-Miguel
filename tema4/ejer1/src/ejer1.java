import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String dia = "";
        System.out.print("Dime un dia de la semana: ");
        dia = s.nextLine();
        switch (dia) {
            case "lunes":
                System.out.println("el " + dia + " toca sistemas");
                break;
            case "martes":
                System.out.println("el " + dia + " toca programacion");
                break;
            case "miercoles":
                System.out.println("el " + dia + " toca fol");
                break;
            case "jueves":
                System.out.println("el " + dia + " toca entornos");
                break;
            case "viernes":
                System.out.println("el " + dia + " toca libre");
                break;
        
            default:
                break;
        }
    s.close();
    }
}
