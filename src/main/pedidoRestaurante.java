public class Main {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido("Carlos");

        pedido1.agregarArticulo(new Articulo("Hamburguesa", 2, 8.50));
        pedido1.agregarArticulo(new Articulo("Refresco", 1, 2.50));
        pedido1.agregarArticulo(new Articulo("Patatas", 1, 3.00));

        pedido1.mostrarResumen();

        pedido1.cambiarEstado(EstadoPedido.LISTO_PARA_ENTREGAR);
        pedido1.cambiarEstado(EstadoPedido.ENTREGADO);

        pedido1.mostrarResumen();
    }
}