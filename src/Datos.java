import java.util.List;
import java.util.Arrays;

public class Datos {
    public static List<Plato> obtenerPlatos() {
        return Arrays.asList(
                new Plato("Paella", Plato.Tipo.ENTRADA, 200),
                new Plato("Gazpacho", Plato.Tipo.ENTRADA, 150),
                new Plato("Pasta", Plato.Tipo.ENTRADA, 300),
                new Plato("Ensalada César", Plato.Tipo.ENTRADA, 180),
                new Plato("Sopa de verduras", Plato.Tipo.ENTRADA, 120),
                new Plato("Filete de cerdo", Plato.Tipo.PRINCIPAL, 400),
                new Plato("Pollo asado", Plato.Tipo.PRINCIPAL, 280),
                new Plato("Bistec a lo pobre", Plato.Tipo.PRINCIPAL, 500),
                new Plato("Trucha", Plato.Tipo.PRINCIPAL, 160),
                new Plato("Bacalao", Plato.Tipo.PRINCIPAL, 300),
                new Plato("Salmón a la plancha", Plato.Tipo.PRINCIPAL, 350),
                new Plato("Lasaña", Plato.Tipo.PRINCIPAL, 450),
                new Plato("Flan", Plato.Tipo.POSTRE, 200),
                new Plato("Naranja", Plato.Tipo.POSTRE, 50),
                new Plato("Nueces", Plato.Tipo.POSTRE, 500),
                new Plato("Yogur", Plato.Tipo.POSTRE, 100),
                new Plato("Helado", Plato.Tipo.POSTRE, 250)
        );
    }
}
