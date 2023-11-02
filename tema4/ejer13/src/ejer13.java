import java.util.Scanner;

public class ejer13 {
    public static void main(String[] args) throws Exception {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("introduce un numero: ");
        num1 = s.nextInt();
        System.out.print("introduce el segundo numero: ");
        num2 = s.nextInt();
        System.out.print("introduce el ultimo numero: ");
        num3 = s.nextInt();

        if (num1<num2) {
			if (num1<num3) {
				if (num2<num3) {
					System.out.println("El numero "+num1+" es menor que "+num2+" que es menor que  "+num3);
				} else {
					System.out.println("El numero "+num2+" es menor que "+num1+" que es menor que  "+num3);
				}
			} else {
				System.out.println("El numero "+num3+" es menor que "+num1+" y el numero "+num2);
			}
		} else {
			if (num2<num1) {
				if (num1<num3) {
					if (num2<num3) {
						System.out.println("El numero "+num2+" es menor que "+num1+" que es menor que  "+num3);
					} else {
						System.out.println("El numero "+num2+" es menor que "+num1+" que es menor que  "+num3);
					}
				} else {
					if (num3<num1) {
						if (num3<num2) {
							if (num2<num1) {
								System.out.println("El numero "+num3+" es menor que "+num2+" que es menor que  "+num1);
							} else {
								System.out.println("El numero "+num2+" es menor que "+num1+" que es menor que  "+num3);
							}
						} else {
							System.out.println(" error");
						}
					}
				}
			}
		}
        s.close();
	}
}