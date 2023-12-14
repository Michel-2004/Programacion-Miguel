public class ejer3 {
    public static void main(String[] args) throws Exception {
        String mazo = "";
        String carta = "";

        int numeroMazo = (int)(Math.random()*4) + 1;

        switch (numeroMazo) {
            case 1:
                mazo = "Oros";
                break;

            case 2:
                mazo = "Copas";
                break;

            case 3:
                mazo = "Bastos";
                break;
            
            case 4:
                mazo = "Espadas";
                break;
        
            default:
                break;
        }

         int numeroCarta = (int)(Math.random()*10)+1;

         switch (numeroCarta) {
            case 1:
                carta = "AS";
                break;
            case 8:
                carta = "Sota";
                break;
            case 9:
                carta = "Caballo";
                break;
            case 10:
                carta = "Rey";
                break;
         
            default: carta = String.valueOf(numeroCarta);
                break;
         }

         System.out.print(carta + " de " + mazo);
    }
}