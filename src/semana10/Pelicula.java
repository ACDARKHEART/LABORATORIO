package semana10;

public class Pelicula extends Producto {

    protected String director;
    protected String protagonista;
    protected int duracion;

    public Pelicula(String titulo, int año, int stock, double precioVenta, String director, int duracion, String protagonista) {
        super(titulo, año, stock, precioVenta);
        this.director = director;
        this.duracion = duracion;
        this.protagonista = protagonista;
    }

    @Override
    public void comprar(int cantidad) {
        
            stock += cantidad;
       

        System.out.println("Stock actualizado de la película: " + stock);
    }

    @Override
    public void vender(int cantidad) {
        if (stock >= cantidad) {
            stock -= cantidad;
            System.out.println("Stock actualizado de la película: " + stock);
        } else {
            System.out.println("No hay suficiente stock para vender.");
        }
    }

    @Override
    public String toString() {
        return "Pelicula{"
                + "Titulo: " + getTitulo() + "\n"
                + "Año: " + getAño() + "\n"
                + "Stock: " + getStock() + "\n"
                + "Precio: S/." + getPrecioVenta() + "\n"
                + "Duracion: " + duracion + "\n"
                + "Director: " + director + "\n"
                + "Protagonista: " + protagonista + "\n"
                + "}";
    }
}
