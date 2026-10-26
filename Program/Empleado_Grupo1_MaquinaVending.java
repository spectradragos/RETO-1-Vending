import java.util.*;
public class Empleado_Grupo1_MaquinaVending{

    //CONSTANTES
    public static final String USUARIO_CORRECTO = "Admin";
    public static final String CONTRASEÑA_CORRECTA = "Admin";

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] tipoProductos ={"Chuches", "Bebidas", "Cargadores", "Sobres"};
        String[] nombreProducto = {};
        double[] precioProducto = {};

        String usuario = "";
        String contraseña = "";


        mensajeBienvenida();
        boolean accesoCorrecto = inicioSesion(usuario, contraseña, scanner); 
        //if para comprobar si el acceso es correcto o no.       
        if (accesoCorrecto){
            menuAdministrador(tipoProductos, nombreProducto, precioProducto,scanner);
        }else{
           System.out.println("ACCESO DENEGADO! NO ESTA ACREDITADO PARA CONTINUAR. ");
        };
        scanner.close();

    }

    
    /**
     * Muestra un mensaje de bienvenida.
     */
    public static void mensajeBienvenida(){
            System.out.println("Bienvenido a la administración de la maquina. Debera iniciar sesion para poder continuar.");
            System.out.println();

    }


    /**
     * Pide al usuario inciar sesion para poder acceder al menu de administrador.
     * @param usuario El usuario que debe introducir.
     * @param contraseña La contraseña que se debe introducir. 
     * @param scanner Lugar donde se guardara la información introducida. 
     */
    public static boolean inicioSesion(String usuario, String contraseña, Scanner scanner ){
        System.out.println("----INICIO DE SESION----");
        System.out.print("Introduzca el usuario: ");
        String user = scanner.nextLine();
        System.out.print("Introduzca la contraseña: ");
        String password = scanner.nextLine();

        // Comprueba que lo intruducido es igual a lo establecido
        if (user.equals(USUARIO_CORRECTO) && password.equals(CONTRASEÑA_CORRECTA)){
            return true; 
        }else{
            return false;
        }
    }


    /**
     * Muestra el menu de admistrador. 
     * @param tiposProductos Array que contiene los tipos de los productos.
     * @param nombreProducto Array que contiene los nombres de los productos.
     * @param precioProducto Array que contiene los precios de los productos.
     */
    public static void menuAdministrador(String[] tipoProductos, String[] nombreProducto, double[] precioProducto,Scanner scanner){
        System.out.println();
        System.out.println("BIENVENIDO AL SISTEMA! Aqui podra administrar el sistema de la maquina expendedora. A continuación, se le mostrara el menu con las diferentes opciones.");
        System.out.println();
        System.out.println("----MENU DE ADMINISTRACION----");
        System.out.println("1. Añadir un nuevo producto.");
        System.out.println("2. Modificar un producto.");
        System.out.println("3. Eliminar un producto.");
        System.out.println("4. Salir. ");
        System.out.print("Selecciona una opcion del 1 al 4: ");
        int opcion = scanner.nextInt(); 

        switch (opcion){
            case 1:
                anadirNuevoProducto(tipoProductos, nombreProducto, precioProducto, scanner);
                break; 
            case 2:
                modificarProducto(tipoProductos,nombreProducto,precioProducto, scanner);
                break; 
            case 3: 
                eliminarProducto(tipoProductos, nombreProducto, precioProducto, scanner);
                break; 
            case 4: 
                mensajeFinal();
                mensajeBienvenida();
        }
    }


    /**
     * Permite añadir nuevos productos a la maquina
     * @param tiposProductos Array que contiene los tipos de los productos.
     * @param nombreProducto Array que contiene los nombres de los productos
     * @param precioProducto Array que contiene los precios de los productos
     */
    public static void anadirNuevoProducto(String[] tipoProductos, String[] nombreProducto, double[] precioProducto, Scanner scanner){
        System.out.println("----AÑADIR UN NUEVO PRODUCTO----");
        System.out.println("Introduzca el tipo del producto: ");
        System.out.println("Introduzca el nombre del producto: ");
        System.out.println("Introduzca el precio: ");


    }


    /**
     * Permite modificar la informacion de un producto.
     * @param tiposProductos Array que contiene los tipos de los productos.
     * @param nombreProducto Array que contiene los nombres de los productos
     * @param precioProducto Array que contiene los precios de los productos
     */
    public static void modificarProducto(String[] tipoProductos, String[] nombreProducto, double[] precioProducto, Scanner scanner){
        System.out.println("----MODIFICAR UN PRODUCTO----");
        System.out.println("¿Que quieres modificar?");
    }


    /**
     * Permite eliminar un producto.
     * @param tiposProductos Array que contiene los tipos de los productos.
     * @param nombreProducto Array que contiene los nombres de los productos
     * @param precioProducto Array que contiene los precios de los productos
     */
    public static void eliminarProducto(String[] tipoProductos, String[] nombreProducto, double[] precioProducto, Scanner scanner ){
        System.out.println("----ELIMINAR UN PRODUCTO----");
         System.out.println("¿Que producto quieres eliminar?");
    }

    /**
     * Muestra un mensaje final de despedida
     */
    public static void mensajeFinal(){
        System.out.println("Muchas gracias por trabajar con nosotros!");

    }
}