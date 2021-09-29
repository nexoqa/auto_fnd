public class Variables {
    public static void main(String[] args) {

        int pizzas = 6;
        int personas = 3;
        int pizzasPorPersona = pizzas / personas;

        System.out.printf("Si hay %d pizzas y %d personas, a cada una le tocan %d pizzas\n", pizzas,personas,pizzasPorPersona);

        String coche = "Ferrari";
        double velocidad = 100.3;

        System.out.printf("El coche %s se desplaza a %f km/h\n", coche,velocidad);

        int precioLeche = 2;
        double precioJamon = 20.95;
        int precioHuevos = 1;

        double precioTotal = precioLeche+precioJamon+precioHuevos;

        System.out.printf("\nEl precio total de los productos es de: %f\n",precioTotal);

    }
}
