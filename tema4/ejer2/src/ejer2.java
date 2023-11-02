import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int hora = 0;
        System.out.print("dime una hora del dia: ");
        hora = s.nextInt();
        if ((hora >=6)&&(hora <= 12)) {
            System.out.println("buenos dias ");
        } 
        if ((hora >=13)&&(hora <= 20)) {
            System.out.println("buenas tardes");
        }
         if ((hora <= 5)||(hora >=21)&&(hora <24)) {
            System.out.println("buenas noches");
        }
        
        else  {
            
        }
        s.close();
    }
}
