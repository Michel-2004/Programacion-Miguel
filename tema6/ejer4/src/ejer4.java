public class ejer4 {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        for (int i = 1; i <= 20; i++) {
            numero = (int)(Math.random()*10)+1;
            System.out.print(numero+ " ");
        }
    }
}
