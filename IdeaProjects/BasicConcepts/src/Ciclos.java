import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuántos números quieres procesar?");
        int cantidad = entrada.nextInt();

        System.out.printf("Añade %d datos\n", cantidad);
        // Este es el ciclo for
//        for (int i=1; i<=cantidad; i++){
//            System.out.printf("Dato %d: ",i);
//            int numero = entrada.nextInt();
//            int resultado = numero * 2;
//            System.out.printf("Dato %d procesado: %d\n", i, resultado);
//        }

        // Este es el ciclo while

        int c= 1;
        while (c<=cantidad){

            System.out.printf("Dato %d: ",c);
            int numero = entrada.nextInt();
            int resultado = numero * 2;
            System.out.printf("Dato %d procesado: %d\n", c, resultado);
            c++;
        }
    }
}
