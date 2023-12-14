public class ejer2 {
    public static void main(String[] args) throws Exception {
        String mazo = "";
        String carta = "";

        int numeroMazo = (int)(Math.random()*4) + 1;

        switch (numeroMazo) {
            case 1:
                mazo = "Picas";
                break;

            case 2:
                mazo = "Corazones ";
                break;

            case 3:
                mazo = "Diamantes";
                break;
            
            case 4:
                mazo = "Treboles";
                break;
        
            default:
                break;
        }

         int numeroCarta = (int)(Math.random()*13)+1;

         switch (numeroCarta) {
            case 1:
                carta = "AS";
                break;
            case 11:
                carta = "J";
                break;
            case 12:
                carta = "Q";
                break;
            case 13:
                carta = "K";
                break;
         
            default: carta = String.valueOf(numeroCarta);
                break;
         }

         System.out.print(carta + " de " + mazo);
    }
}
