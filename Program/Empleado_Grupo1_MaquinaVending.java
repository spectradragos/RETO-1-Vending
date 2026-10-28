import java.util.*;
public class Empleado_Grupo1_MaquinaVending{

    //CONSTANTES
    public static final String USUARIO_CORRECTO = "Admin";
    public static final String CONTRASEÑA_CORRECTA = "Admin";

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] tipoProductos ={"1. Chuches", "2. Bebidas", "3. Cargadores", "4. Sobres"};
        String[][] nombreProducto ={{"Haribo", "Kit-Kat", "Jumpers", "Donetes", "Filipinos","Doritos"}, {"Agua", "Coca-Cola"}, {"Powerbank", "Cable Tipo C"}, {"Pokemon", "Magic"}};
        double[][] precioProducto ={{2.00, 1.20, 1.20, 1.00, 1.10, 1.50 }, {1.00, 2.50}, {}, {}};

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
     * @param scanner Lugar donde se guardara la información introducida. 
     */
    public static void menuAdministrador(String[] tipoProductos, String[][] nombreProducto, double[][] precioProducto,Scanner scanner){
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
                break;
            default:
                System.out.println("Opcion invalida. Por favor, vuelva a seleccionar una opcion valida.");
                menuAdministrador(tipoProductos, nombreProducto, precioProducto, scanner);
                    
        }
    }


    /**
     * Permite añadir nuevos productos a la maquina
     * @param tiposProductos Array que contiene los tipos de los productos.
     * @param nombreProducto Array que contiene los nombres de los productos
     * @param precioProducto Array que contiene los precios de los productos
     * @param scanner Lugar donde se guardara la información introducida. 
     */
    public static void anadirNuevoProducto(String[] tipoProductos, String[][] nombreProducto, double[][] precioProducto, Scanner scanner){
        //primero algo sencillo. 
        System.out.println();
        scanner.nextLine(); //limpia el scanner.
        System.out.println("----AÑADIR UN NUEVO PRODUCTO----");
        System.out.print("Introduzca el tipo del producto: ");
        String tipoNuevo= scanner.nextLine();

        System.out.print("Introduzca el nombre del producto: ");
        String nombreNuevo= scanner.nextLine();

        System.out.print("Introduzca el precio: ");
        Double precioNuevo= scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Se ha introducido en el tipo " + tipoNuevo + " el producto " + nombreNuevo + " con el precio de " + precioNuevo + " euros.");
        System.out.println();

        //Metodo para volver al menu. 
        vueltaMenu(tipoProductos, nombreProducto, precioProducto, scanner);

    }

    /**
     * Permite modificar la informacion de un producto.
     * @param tiposProductos Array que contiene los tipos de los productos.
     * @param nombreProducto Array que contiene los nombres de los productos
     * @param precioProducto Array que contiene los precios de los productos
     * @param scanner Lugar donde se guardara la información introducida.
     */
    public static void modificarProducto(String[] tipoProductos, String[][] nombreProducto, double[][] precioProducto, Scanner scanner){
        System.out.println();
        scanner.nextLine();
        System.out.println("----MODIFICAR UN PRODUCTO----");
        System.out.print("¿Que quieres modificar?(Nombre/Precio)");
        String modificacion= scanner.nextLine();

        if(modificacion == "Nombre"){
            /* Preguntar de que tipo es el producto.
            El nombre del producto antiguo
            Preguntar el nombre nuevo
            Modificar el nombre
            */
            System.out.print("Introduce el nuevo nombre del producto: ");
            String nombreModificado = scanner.nextLine();
        }else if (modificacion == "Precio"){
            /*  El precio antiguo
                Preguntar el precio nuevo
                Modificar el precio
                */
            System.out.print("Introduce el nuevo precio del producto: ");
            double nombreModificado = scanner.nextDouble();
        }else {
            System.out.println("Se ha introducido una opcion no valida!");
        };

        //Metodo para volver al menu. 
        vueltaMenu(tipoProductos, nombreProducto, precioProducto, scanner);
    }

    /**
     * Permite eliminar un producto.
     * @param tiposProductos Array que contiene los tipos de los productos.
     * @param nombreProducto Array que contiene los nombres de los productos
     * @param precioProducto Array que contiene los precios de los productos
     * @param scanner Lugar donde se guardara la información introducida.
     */
    public static void eliminarProducto(String[] tipoProductos, String[][] nombreProducto, double[][] precioProducto, Scanner scanner ){
        System.out.println();
        scanner.nextLine();
        System.out.println("----ELIMINAR UN PRODUCTO----");
        System.out.print("¿Que producto quieres eliminar?");
        //codigo

        //Metodo para volver al menu. 
        vueltaMenu(tipoProductos, nombreProducto, precioProducto, scanner);
    }

    /**
     * Muestra un mensaje final de despedida
     */
    public static void mensajeFinal(){
        System.out.println("Muchas gracias por trabajar con nosotros!");

    }

    /**
     * Permite volver al menu de administración de la maquina. 
     * @param tiposProductos Array que contiene los tipos de los productos.
     * @param nombreProducto Array que contiene los nombres de los productos
     * @param precioProducto Array que contiene los precios de los productos
     * @param scanner Lugar donde se guardara la información introducida.
     */
    public static void vueltaMenu(String[] tipoProductos, String[][] nombreProducto, double[][] precioProducto, Scanner scanner){
        System.out.print("¿Quieres volver al menu?(Si/No) ");
        String vuelta = scanner.nextLine();
        switch (vuelta){
            case "Si":
                menuAdministrador(tipoProductos, nombreProducto, precioProducto, scanner);
            default:
                break;
        }
    }
}