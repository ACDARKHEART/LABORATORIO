package semana10;

import java.io.*;

public class Prueba {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Producto[] productos = new Producto[2];  // Solo 2 productos (1 Película y 1 Videojuego)
          
        // Creación de objetos Película
        System.out.println("Ingrese los datos de la Pelicula:");
        System.out.print("Titulo: ");
        String tituloPelicula = br.readLine();
        System.out.print("Año: ");
        int añoPelicula = Integer.parseInt(br.readLine());
        System.out.print("Stock: ");
        int stockPelicula = Integer.parseInt(br.readLine());
        System.out.print("Precio de venta: ");
        double precioPelicula = Double.parseDouble(br.readLine());
        System.out.print("Director: ");
        String director = br.readLine();
        System.out.print("Duracion (min): ");
        int duracion = Integer.parseInt(br.readLine());
        System.out.print("Protagonista: ");
        String protagonista = br.readLine();

        productos[0] = new Pelicula(tituloPelicula, añoPelicula, stockPelicula, precioPelicula, director, duracion, protagonista);
            
        // Creación de objetos Videojuego
        System.out.println("\nIngrese los datos del Videojuego:");
        System.out.print("Titulo: ");
        String tituloVideojuego = br.readLine();
        System.out.print("Año: ");
        int añoVideojuego = Integer.parseInt(br.readLine());
        System.out.print("Stock: ");
        int stockVideojuego = Integer.parseInt(br.readLine());
        System.out.print("Precio de venta: ");
        double precioVideojuego = Double.parseDouble(br.readLine());
        System.out.print("Distribuidor: ");
        String distribuidor = br.readLine();

        productos[1] = new videojuego(tituloVideojuego, añoVideojuego, stockVideojuego, precioVideojuego, distribuidor);
        
        // Mostrar la información de la Película y Videojuego
        mostrarProductos(productos);

        // Comprar Películas
        System.out.print("\nIngrese la cantidad de peliculas a comprar: ");
        int cantidadComprarPelicula = Integer.parseInt(br.readLine());
        productos[0].comprar(cantidadComprarPelicula);

        // Vender Videojuegos
        System.out.print("\nIngrese la cantidad de videojuegos a vender: ");
        int cantidadVenderVideojuego = Integer.parseInt(br.readLine());
        productos[1].vender(cantidadVenderVideojuego);

        // Modificar precio de la Película
        System.out.print("\nIngrese el nuevo precio de venta de la pelicula: ");
        double nuevoPrecioPelicula = Double.parseDouble(br.readLine());
        productos[0].setPrecioVenta(nuevoPrecioPelicula);
        System.out.println("Nuevo precio de venta de la pelicula: " + productos[0].getPrecioVenta());

        // Eliminar el Videojuego por título (simulación)
        System.out.print("\nIngrese el título del VideoJuego a eliminar: ");
        String tituloEliminar = br.readLine();
        if (tituloEliminar.equalsIgnoreCase(productos[1].getTitulo())) {
            productos[1] = null;  // Simulación de eliminar el objeto
            System.out.println("VideoJuego eliminado.");
        } else {
            System.out.println("VideoJuego no encontrado.");
        }
        
      mostrarProductos(productos);
    }
    public static void mostrarProductos(Producto[] productos) {
        System.out.println("\nInformación de los productos:");
        for (Producto producto : productos) {
            if (producto != null) {  // Verifica que el producto no sea null antes de imprimir
                System.out.println(producto.toString());
            }
        }
    }
    
    
}
