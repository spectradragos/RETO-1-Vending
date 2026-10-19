import java.util.*;
public class Empleado{

    //CONSTANTES
    public final String USUARIO_CORRECTO = "Administrador";
    public final String CONTRASEÑA_CORRECTA = "123456";

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] tipoProductos ={};
        String[] nombreProducto ={};
        double[] precioProducto ={};

        mensajeBienvenida();
        inicioSesion();
        menuAdministrador();
        anadirNuevoProducto(tipoProductos, nombreProducto, precioProducto);
        modificarProducto(nombreProducto, precioProducto);
        eliminarProducto(tipoProductos, nombreProducto, precioProducto);
        mensajeFinal();

        scanner.close();

    }

    
    /**
     * Muestra un mensaje de bienvenida.
     */
    public static void mensajeBienvenida(){}


    /**
     * Pide al usuario inciar sesion para poder acceder al menu de administrador.
     */
    public static void inicioSesion(){}


    /**
     * Muestra el menu de admistrador. 
     */
    public static void menuAdministrador(){}


    /**
     * Permite añadir nuevos productos a la maquina
     * @param tiposProductos Array que contiene los tipos de los productos.
     * @param nombreProducto Array que contiene los nombres de los productos
     * @param precioProducto Array que contiene los precios de los productos
     */
    public static void anadirNuevoProducto(String[] tipoProductos, String[] nombreProducto, double[] precioProducto){

    }


    /**
     * Permite modificar la informacion de un producto.
     * @param nombreProducto Array que contiene los nombres de los productos
     * @param precioProducto Array que contiene los precios de los productos
     */
    public static void modificarProducto(String[] nombreProducto, double[] precioProducto){

    }

 
    /**
     * Permite eliminar un producto.
     * @param tiposProductos Array que contiene los tipos de los productos.
     * @param nombreProducto Array que contiene los nombres de los productos
     * @param precioProducto Array que contiene los precios de los productos
     */
    public static void eliminarProducto(String[] tipoProductos, String[] nombreProducto, double[] precioProducto){

    }

    /**
     * Muestra un mensaje final de despedida
     */
    public static void mensajeFinal(){
        
    }
    




}