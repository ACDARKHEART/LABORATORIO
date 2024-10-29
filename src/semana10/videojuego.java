package semana10;

public class videojuego extends Producto {

    protected String distribuidor;

    public videojuego(String titulo, int año, int stock, double precioVenta, String distribuidor) {
        super(titulo, año, stock, precioVenta);
        this.distribuidor = distribuidor;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    @Override
    public void comprar(int cantidad) {
        stock -= cantidad;
        System.out.println("Stock actualizado del videojuego: " + stock);
    }

    @Override
    public void vender(int cantidad) {
        if (stock >= cantidad) {
            stock -= cantidad;
            System.out.println("Stock actualizado del videojuego: " + stock);
        } else {
            System.out.println("No hay suficiente stock para vender.");
        }
    }

    @Override
    public String toString() {
        return "Pelicula{"+
                "Titulo: "+getTitulo() +"\n"+
                "Año: "+getAño() + "\n"+
                "Stock: "+getStock() + "\n"+
                "Precio: S/."+getPrecioVenta()+ "\n"+
                "Distribuidor: "+distribuidor+
                "}";
    }
}
