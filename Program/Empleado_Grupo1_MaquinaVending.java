import java.util.*;
public class Empleado_Grupo1_MaquinaVending{

    //CONSTANTES
    public final String USUARIO_CORRECTO = "Administrador";
    public final String CONTRASEÑA_CORRECTA = "Admin";

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] tipoProductos = {};
        String[] nombreProducto = {};
        double[] precioProducto = {};

        mensajeBienvenida();
        boolean accesoCorrecto = inicioSesion();
        //if para comprobar si el acceso es correcto o no.       
       if (accesoCorrecto){
           menuAdministrador();
           anadirNuevoProducto(tipoProductos, nombreProducto, precioProducto);
           modificarProducto(tipoProductos,nombreProducto, precioProducto);
           eliminarProducto(tipoProductos, nombreProducto, precioProducto);
        }else{
           //mostrar un mensaje de acceso denegado. 
        };

        mensajeFinal();
        scanner.close();

    }

    
    /**
     * Muestra un mensaje de bienvenida.
     */
    public static void mensajeBienvenida(){
            System.out.println("Bienvenido al menu de administración de la maquina.");
    }


    /**
     * Pide al usuario inciar sesion para poder acceder al menu de administrador.
     */
    public static boolean inicioSesion(){
        
    }


    /**
     * Muestra el menu de admistrador. 
     */
    public static void menuAdministrador(){

    }


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
     * @param tiposProductos Array que contiene los tipos de los productos.
     * @param nombreProducto Array que contiene los nombres de los productos
     * @param precioProducto Array que contiene los precios de los productos
     */
    public static void modificarProducto(String[] tipoProductos, String[] nombreProducto, double[] precioProducto){

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