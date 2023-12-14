public class ejer1 {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        int suma = 0;
        for (int i = 1; i <= 3; i++) {
            numero = (int)(Math.random()*7) + 1;
            System.out.print(numero + " ");
            suma += numero;
        }
        System.out.println("la suma total de las tiradas es: "+ suma);
    }
}
