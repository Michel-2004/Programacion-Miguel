import java.util.Scanner;

public class ejer12 {
    public static void main(String[] args) throws Exception {
        int puntos = 0;
        String respuesta;
        Scanner s = new Scanner(System.in);

        System.out.println("Cuestionario");

        System.out.println("1 Cual ha sido la asignatura mas dificil");
        System.out.println("a) programacion b) lenguaje c) sistemas");
        respuesta = s.nextLine();

        if (respuesta.equals("a")) {
            puntos++;
        }

        System.out.println("2 Cual ha sido la asignatura mas facil");
        System.out.println("a) Fol b) base c) entornos");
        respuesta = s.nextLine();
        if (respuesta.equals("a")) {
            puntos++;
        }

        System.out.println("3 Asignatura a la que mas hora le has dedicado");
        System.out.println("a) entronos b) programacion c) sistemas");
        respuesta = s.nextLine();

        if (respuesta.equals("b")) {
            puntos++;
        }

        System.out.println("4 Asignatura a la que menos hora le has dedicado");
        System.out.println("a) entronos b) lenguaje c) fol");
       respuesta = s.nextLine();
        if (respuesta.equals("c")) {
            puntos++;
        }

        System.out.println("5 Pregunta de lenguaje : Que extension suelen tener las paginas web?");
        System.out.println("a) HMTL b) Java c) Php");
       respuesta = s.nextLine();

        if (respuesta.equals("a")) {
            puntos++;
        }

        System.out.println("6 Pregunta de sistemas : Que es un NAS?");
        System.out.println("a)  Network Attached Storage b) Network Assistant ");
       respuesta = s.nextLine();
        if (respuesta.equals("a")) {
            puntos++;
        }

        
        System.out.println("7 Pregunta de programacion : Que significa POO?");
        System.out.println("a) programacion orientada a observar b) programacion orientada a objetos");
        respuesta = s.nextLine();
        if (respuesta.equals("b")) {
            puntos++;
        }

        System.out.println("8 Pregunta de bases de datos  : Cual ha sido el gestos de bases que hemos utilizado?");
        System.out.println("a) SQLlite b) MariaDB c) MySQL");
        respuesta = s.nextLine();

        if (respuesta.equals("c")) {
            puntos++;
        }

        System.out.println("9 Pregunta de sistemas  : Que es una IP?");
        System.out.println("a) direccion fisica b) direcion de un dispositivo en internet");
        respuesta = s.nextLine();

        if (respuesta.equals("b")) {
            puntos++;
        }
        
        System.out.println("10 Pregunta final  : cuantas has suspendido");
        System.out.println("a) 0 b) 1 c) 2 d) mas de 2");
        respuesta = s.nextLine();

        if (respuesta.equals("a")) {
            puntos++;
        }
        
        System.out.println("Has ganado " + puntos + " puntos.");
        s.close();
    }
}