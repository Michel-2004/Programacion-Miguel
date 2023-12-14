public class ejer5 {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        int menor = 199;
        int mayor = 100;
        int suma = 0;
        for (int i = 1; i <= 50; i++) {
            numero = (int)(Math.random()*100)+100;
            
            System.out.print(numero+ " ");
            if (numero < menor ) {
                menor = numero;
            }
            if (numero > mayor) {
                mayor = numero;
            } 
            suma += numero;
        }
        System.out.println(" ");
        System.out.println("minimo es: " + menor + " el mayor es: " + mayor + " y la suma total es: " + suma);
    }
}
