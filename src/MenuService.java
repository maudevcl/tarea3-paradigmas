import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MenuService {

    private final List<Plato> platos;

    public MenuService(List<Plato> platos) {
        this.platos = platos;
    }

    public int calcularCaloriasTotales(String entradaNombre, String principalNombre, String postreNombre) {
        return Stream.of(entradaNombre, principalNombre, postreNombre)
                .map(nombre -> platos.stream()
                        .filter(p -> p.getNombre().equalsIgnoreCase(nombre))
                        .findFirst()
                        .orElse(null))
                .mapToInt(plato -> plato != null ? plato.getCalorias() : 0)
                .sum();
    }

    public void mostrarCombinacionesBajasEnCalorias(int limite) {
        List<Plato> entradas = platos.stream().filter(p -> p.getTipo() == Plato.Tipo.ENTRADA).collect(Collectors.toList());
        List<Plato> principales = platos.stream().filter(p -> p.getTipo() == Plato.Tipo.PRINCIPAL).collect(Collectors.toList());
        List<Plato> postres = platos.stream().filter(p -> p.getTipo() == Plato.Tipo.POSTRE).collect(Collectors.toList());

        boolean encontrado = false;

        for (Plato entrada : entradas) {
            for (Plato principal : principales) {
                for (Plato postre : postres) {
                    int total = entrada.getCalorias() + principal.getCalorias() + postre.getCalorias();
                    if (total <= limite) {
                        encontrado = true;
                        System.out.println("* Entrada: " + entrada);
                        System.out.println("  Principal: " + principal);
                        System.out.println("  Postre: " + postre);
                        System.out.println("  TOTAL: " + total + " calorías\n");
                    }
                }
            }
        }

        if (!encontrado) {
            System.out.println("No hay combinaciones disponibles bajo ese límite.");
        }
    }
}
