public class Plato {
    public enum Tipo { ENTRADA, PRINCIPAL, POSTRE }

    private final String nombre;
    private final Tipo tipo;
    private final int calorias;

    public Plato(String nombre, Tipo tipo, int calorias) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.calorias = calorias;
    }

    public String getNombre() { return nombre; }
    public Tipo getTipo() { return tipo; }
    public int getCalorias() { return calorias; }

    @Override
    public String toString() {
        return nombre + " (" + calorias + " cal)";
    }
}
