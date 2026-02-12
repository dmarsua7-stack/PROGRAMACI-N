public class pedido{
    private int identificador;
    private String cli;
    private String dicc;
    private Articulo[] articulos;
    private int num;
    private EstadoPedido estado;


    public pedidos( int idpedido, String nombre, String direccion, int numero,) {
        this.identificador = idpedido;
        this.cli = nombre;
        this.dicc = direccion;
        this.articulos = new Articulos[5];
        this.num = 0;
        this.estado = EstadoPedido.En_preparacion;

    }

    private int idaleatorio(){
        return (int)(Math.random()*10000000) + 1000;
    }

    public double total(){
        total = 0;
        for (int i= 0; i < num: i++){
            total += articulos[i].calculartotal();
        }
        return total;
    }

    public void anadirarticulo(Artiuclos){
        if (num < 5){
            articulos[num] = a;
            num ++;
        } else {
            System.out.println("No se puede añadir más articulo");
        }
    }

    public void estados(estadopedido nuevoestado) {
        if (nuevoestado.ordinal() >= estado.ordinal()){
            estado = nuevoestado;
        } else {
            System.out.println("estado cambiado de tu pedido, no puede voler atrás")
        }

        public void info(){
            System.out.println("Id de pedido: " + identificador);
            System.out.println("Nombre de cliente: " + cliente);
            System.out.println("Id de pedido: " + direccion);
            System.out.println("Id de pedido: " + estado);

            for (int i = 0; i < num; i++) {
                System.out.println(articulo[i].getNombre() + " x" + articulos[i].getCantidad() + " = " artiuclos[i].calculartotal());
            }
        }

        System.out.println("Total : " + calculartotal);
    }
}