import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculadora de propinas");
        System.out.println("Introduce la cantidad a pagar:");
        double cantidad = entrada.nextDouble();

        System.out.println("Introduce el % de propina");
        int porcentaje = entrada.nextInt();

//        if(porcentaje < 15){
//            System.out.println("El servicio no ha sido bueno");
//        }else{
//            System.out.println("El servicio ha sido bueno");
//        }

        if(porcentaje < 15){
            System.out.println("El servicio no ha sido bueno");
        }else if (porcentaje >= 15 && porcentaje < 30){
            System.out.println("El servicio ha sido bueno");
        }else{
            System.out.println("El servicio ha sido excelente");
        }
        double total = cantidad + (cantidad*porcentaje/100);
        System.out.printf("El total a pagar es %.2f euros",total);




    }
}
