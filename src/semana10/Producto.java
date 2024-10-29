package semana10;

public abstract class Producto {

    protected String titulo;
    protected int año;
    protected int stock;
    protected double precioVenta;

    public Producto(String titulo, int año, int stock, double precioVenta) {
        this.titulo = titulo;
        this.año = año;
        this.stock = stock;
        this.año = año;
        this.precioVenta = precioVenta;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAño() {
        return año;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public abstract void comprar(int cantidad);
    public abstract void vender(int cantidad);

    

    @Override
    public String toString() {
        return "Título: " + titulo + ", Año: " + año + ", Stock: " + stock + ", Precio de venta: " + precioVenta;
    }
}
