public class ejer6 {
    public static void main(String[] args) throws Exception {
        double baseImponible = 22.75;
        System.out.printf("Base imponible %8.2f\n", baseImponible);
        System.out.printf("IVA %8.2f\n", (baseImponible * 0.21));
        System.out.printf("________________________\n");
        System.out.printf("Total %8.2f\n", (baseImponible * 1.21));
    }
}
