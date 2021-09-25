import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre?");
        String nombre = entrada.nextLine();
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("¿Cuál es tu edad?");
        int edad = entrada.nextInt();
        System.out.println("¿Cuál es tu número de teléfono?");
        int teléfono = entrada.nextInt();
        System.out.print("Tu nombre es "+nombre+" la edad que tienes es de "+edad+ " años"+" y tu número de teléfono es el "+teléfono);
    }
}
