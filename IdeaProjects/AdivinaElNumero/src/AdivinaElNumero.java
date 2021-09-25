import java.util.Scanner;

public class AdivinaElNumero {

    private Scanner entrada = new Scanner (System.in);
    private boolean juegoActivo = true;

    public void jugar(){

        String nombreJugador = obtenerNombreJugador();

        while (juegoActivo){
            int intentos = 0;
            int min = 0;
            int max = 10;

            int numeroJuego = obtenerNumeroAleatorio(min,max);
            //System.out.println(numeroJuego);
            System.out.printf("\n%s, he escogido un número entre %d y %d, adivínalo! \n",nombreJugador,min,max);
            int numeroJugador;
            do {

                numeroJugador = escogerNumero();
                mensaje(numeroJuego,numeroJugador);
                intentos++;
            }while (numeroJuego != numeroJugador);
            System.out.printf(" \nHas ganado!!! intentos %d",intentos);
            juegoActivo = jugarNuevamente();
        }
    }

    private int obtenerNumeroAleatorio (int min, int max){
        return (int) (Math.random() * ((max-min) +1));
    }

    private String obtenerNombreJugador(){
        System.out.println("Hola, ¿Cuál es tu nombre?");
        String nombreJugador = entrada.nextLine();
        System.out.printf("\nBienvenido %s, vamos a empezar!\n",nombreJugador);
        return nombreJugador;
    }

    private int escogerNumero(){
        System.out.println("\nEscoge un número:\n");
        return entrada.nextInt();
    }

    private void mensaje (int numeroJuego, int numeroJugador){
        if (numeroJuego<numeroJugador){
            System.out.println("El número introducido es más alto que el escogido, inténtalo otra vez!");
        }else if (numeroJuego>numeroJugador){
            System.out.println("El número introducido es más bajo que el escogido, inténtalo otra vez!");
        }
    }

    public boolean jugarNuevamente() {
        System.out.println("\n¿Quieres volver a jugar?\n1. Sí \n2. No");
        int respuesta = entrada.nextInt();
        if (respuesta == 1) {
            System.out.println("Genial! Jueguemos otra vez");
            return true;
        } else {
            System.out.println("Fin del juego");
            return false;
        }
    }
}
