import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Plato> platos = Datos.obtenerPlatos();
        MenuService servicio = new MenuService(platos);

        while (true) {
            System.out.println("\nBIENVENIDO A \"MI MEJOR COMIDA\"");
            System.out.println("--------------------------------------");
            System.out.println("1. Calcular calorías de un menú específico");
            System.out.println("2. Mostrar combinaciones bajas en calorías");
            System.out.println("3. Salir");
            System.out.print("\nSeleccione una opción (1-3): ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("\nIngrese entrada: ");
                    String entrada = scanner.nextLine();
                    System.out.print("Ingrese plato principal: ");
                    String principal = scanner.nextLine();
                    System.out.print("Ingrese postre: ");
                    String postre = scanner.nextLine();

                    int totalCalorias = servicio.calcularCaloriasTotales(entrada, principal, postre);

                    if (totalCalorias == 0) {
                        System.out.println("\nUno o más platos no son válidos. Intente nuevamente.");
                    } else {
                        System.out.println("\nTotal de calorías del menú: " + totalCalorias + " cal");
                    }
                    break;

                case "2":
                    System.out.print("\nIngrese el máximo de calorías deseado: ");
                    try {
                        int limite = Integer.parseInt(scanner.nextLine());
                        System.out.println("\n--- COMBINACIONES DISPONIBLES ---");
                        servicio.mostrarCombinacionesBajasEnCalorias(limite);
                    } catch (NumberFormatException e) {
                        System.out.println("Debe ingresar un número válido.");
                    }
                    break;

                case "3":
                    System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
