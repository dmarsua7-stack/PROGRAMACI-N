
public class Articulo {

    private String nombre;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;
    private int tiempoPreparacion; // minutos

    public Articulo(String nombre, String descripcion, int cantidad,
                    double precioUnitario, int tiempoPreparacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public double getSubtotal() {
        return cantidad * precioUnitario;
    }
} 