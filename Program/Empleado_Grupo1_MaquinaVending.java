import java.util.*;
public class Empleado_Grupo1_MaquinaVending{

    //CONSTANTES
    public static final String USUARIO_CORRECTO = "Admin";
    public static final String CONTRASEÑA_CORRECTA = "Admin";

    /** 
     * Metodo principal del codigo. 
     * @param args Los argumentos del metodo main, los cuales en este caso no se ha establecido ninguno. 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] tipoProductos ={"1. Chuches", "2. Bebidas", "3. Cargadores", "4. Sobres"};

        String[][] nombreProducto ={
            {"Kit-Kat", "Jumpers", "Filipinos","Doritos", "vacio"}, 
            {"Agua", "Coca-Cola", "Kas Limon", "Cafe Frio","vacio"}, 
            {"Powerbank Celeste", "Cable Tipo C", "Cargador Iphone", "Powerbank magnetico","vacio"}, 
            {"Pokemon", "Magic", "Digimon", "Yu-Gi-Oh!","vacio"}};

        double[][] precioProducto ={
            {1.20, 1.20, 1.10, 1.50, 0.0}, 
            {1.00, 2.50, 2.50, 1.20, 0.0}, 
            {15.00, 3.00, 5.00, 20.00, 0.0}, 
            {3.99, 3.50, 3.50, 4.99, 0.0}};
        
        int [][] cantidadProducto={
            {10,10,10,10,0},
            {10,10,10,10,0},
            {10,10,10,10,0},
            {10,10,10,10,0},
        };

        String usuario = "";
        String contraseña = "";

        //Bucle para 
        do {
            mensajeBienvenida(scanner);
            boolean accesoCorrecto = inicioSesion(usuario, contraseña, scanner); 
            //if para comprobar si el acceso es correcto o no.       
            if (accesoCorrecto){
                menuAdministrador(tipoProductos, nombreProducto, precioProducto, cantidadProducto, scanner);
            }else{
            System.out.println("ACCESO DENEGADO! NO ESTA ACREDITADO PARA CONTINUAR. ");
            };
        } while (true); 

    }

    /**
     * Muestra un mensaje de bienvenida.
     * @param scanner Pide al usuario pulse la tecla correspondiente. 
     */
    public static void mensajeBienvenida(Scanner scanner){
        System.out.println();
        System.out.println("======================================");
        System.out.println("     Administración de la maquina.    ");
        System.out.println("======================================");
        System.out.println();
        System.out.print("Pulse [ENTER] para comenzar: ");
        scanner.nextLine();
    }

    /**
     * Pide al usuario inciar sesion para poder acceder al menu de administrador.
     * @param usuario El usuario que debe introducir.
     * @param contraseña La contraseña que se debe introducir. 
     * @param scanner Lugar donde se guardara la información introducida. 
     */
    public static boolean inicioSesion(String usuario, String contraseña, Scanner scanner ){
        System.out.println();
        System.out.println("Debera iniciar sesion para continuar.");
        System.out.println(); 
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
     * @param cantidadProducto Cantidad de stock del producto. 
     * @param scanner Lugar donde se guardara la información introducida. 
     */
    public static void menuAdministrador(String[] tipoProductos, String[][] nombreProducto, double[][] precioProducto,int[][] cantidadProducto,Scanner scanner){
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
        
        // A donde se dirigira en caso de elegir una opcion u otra. 
        switch (opcion){
            case 1:
                anadirNuevoProducto(tipoProductos, nombreProducto,  precioProducto, cantidadProducto, scanner);
                break; 
            case 2:
                modificarProducto(tipoProductos, nombreProducto,  precioProducto, cantidadProducto, scanner);
                break; 
            case 3: 
                eliminarProducto(tipoProductos, nombreProducto,  precioProducto, cantidadProducto, scanner);
                break; 
            case 4: 
                mensajeFinal();
                break;
            default:
                System.out.println("Opcion invalida. Por favor, vuelva a seleccionar una opcion valida.");
                menuAdministrador(tipoProductos, nombreProducto,  precioProducto, cantidadProducto, scanner);
                    
        }
    }


    /**
     * Permite añadir nuevos productos a la maquina
     * @param tiposProductos Array que contiene los tipos de los productos.
     * @param nombreProducto Array que contiene los nombres de los productos
     * @param precioProducto Array que contiene los precios de los productos
     * @param cantidadProducto Cantidad de stock del producto. 
     * @param scanner Lugar donde se guardara la información introducida. 
     */
    public static void anadirNuevoProducto(String[] tipoProductos, String[][] nombreProducto, double[][] precioProducto, int[][] cantidadProducto, Scanner scanner){
        System.out.println();
        scanner.nextLine(); //limpia el scanner.
        System.out.println("----AÑADIR UN NUEVO PRODUCTO----");
        System.out.println("Aqui se podra añadir un nuevo producto a la lista de los productos.");
        System.out.println();
        System.out.println("A continuación, se le mostara el listado de los tipos de porductos de los que disponemos.");
        
        mostrarTipos(tipoProductos);

        System.out.print("Introduzca el tipo del nuevo producto(del 1 al 4): ");
        int tipoIndex= scanner.nextInt();

        //para ajustar el indice a las posiciones del array.
        int añadir = tipoIndex - 1;
        scanner.nextLine();

        //Pedir los datos para el nuevo producto, junto a su precio.
        System.out.print("Introduzca el nombre del producto: ");
        String nombreAñadido= scanner.nextLine();

        System.out.print("Introduzca el precio: ");
        Double precioAñadido= scanner.nextDouble();
        scanner.nextLine();

        //Guardar el producto
        boolean guardado = false; 
        for (int i = 0; i < nombreProducto.length; i++){
            for (int j = 0; j< nombreProducto[i].length; j++){
                //Busca los espacios vaciosm, donde se guardara la informacion nueva.  
                if (nombreProducto[tipoIndex][j].equals("vacio") && precioProducto[tipoIndex][j]== 0.0 && cantidadProducto[tipoIndex][j]== 0){
                    nombreProducto[tipoIndex][j]= nombreAñadido;
                    precioProducto[tipoIndex][j]= precioAñadido;
                    cantidadProducto[tipoIndex][j]= 10; 
                    guardado = true;
                    break;
                }
            }
        }
        // Mostrara un mesaje dependiendo como se ha guardado.  
        if (guardado){
            System.out.println("Exito! Se ha introducido correctamente. ");
        }else{
            System.out.println("Error! No se ha introducido correctamente. ");
        }
        //Metodo para volver al menu. 
        vueltaMenu(tipoProductos, nombreProducto, precioProducto, cantidadProducto, scanner);;
    }

    /**
     * Permite modificar la informacion de un producto.
     * @param tiposProductos Array que contiene los tipos de los productos.
     * @param nombreProducto Array que contiene los nombres de los productos
     * @param precioProducto Array que contiene los precios de los productos
     * @param cantidadProducto Cantidad de stock del producto. 
     * @param scanner Lugar donde se guardara la información introducida.
     */
    public static void modificarProducto(String[] tipoProductos, String[][] nombreProducto, double[][] precioProducto, int[][] cantidadProducto, Scanner scanner){
        System.out.println();
        scanner.nextLine();
        System.out.println("----MODIFICAR UN PRODUCTO----");
        System.out.print("¿Que quieres producto modificar?: ");
        String productoBuscar= scanner.nextLine();
        
        // busca el producto 
        boolean encontrado= false; 
        for (int i = 0; i < nombreProducto.length; i++){
            for (int j = 0; j < nombreProducto[i].length; j++){
    
                // compara lo introducido por el usuario con el elemento del array. 
                // Evita los espacio vacios que puedan haber para evitar producir errores. 
                if(nombreProducto[i][j] != null && nombreProducto[i][j].equals(productoBuscar)){ 
                encontrado = true; 
                System.out.print("¿Que quieres  modificar?(Nombre/Precio/Cantidad): ");
                String modificacion= scanner.nextLine();

                    //Dependiendo de que se quiera modificar, preguntara cosas diferentes. 
                    if(modificacion.equals("Nombre")){
                        System.out.print("Introduce el nuevo nombre del producto: ");
                        nombreProducto[i][j]= scanner.nextLine();
                        System.out.print("Se ha modificado de manera exitosa!");

                    }else if (modificacion.equals("Precio")){
                        System.out.print("Introduce el nuevo precio del producto: ");
                        precioProducto[i][j]= scanner.nextDouble();
                        System.out.println("Se ha modificado de manera exitosa!");
                        scanner.nextLine();

                    }else if (modificacion.equals("Cantidad")){
                        System.out.print("Introduce la nueva cantidad del producto: ");
                        cantidadProducto[i][j]= scanner.nextInt();
                        System.out.println("Se ha modificado de manera exitosa!");
                        scanner.nextLine();
                    }else { 
                        System.out.println("Se ha introducido una opcion no valida!");
                    }
                }
                break; // para marcar que el bucle interno a finalizado. 
            }
            if(encontrado) break; // para marcar que el bucle externo a finalizado. 
        }

        //Si no se encuentra el producto
        if (!encontrado){
            System.out.println("No se ha encontrado en producto!");
        }
        //Metodo para volver al menu. 
        vueltaMenu(tipoProductos, nombreProducto, precioProducto, cantidadProducto, scanner);;
    }

    /**
     * Permite eliminar un producto.
     * @param tiposProductos Array que contiene los tipos de los productos.
     * @param nombreProducto Array que contiene los nombres de los productos
     * @param precioProducto Array que contiene los precios de los productos
     * @param cantidadProducto Cantidad de stock del producto. 
     * @param scanner Lugar donde se guardara la información introducida.
     */
    public static void eliminarProducto(String[] tipoProductos, String[][] nombreProducto, double[][] precioProducto,int[][] cantidadProducto, Scanner scanner ){
        System.out.println();
        scanner.nextLine();
        System.out.println("----ELIMINAR UN PRODUCTO----");
        System.out.print("¿Que producto quieres eliminar?: ");
        String productoEliminado = scanner.nextLine();
        // Busca el producto
        boolean guardado = false; 
        for (int i = 0; i < nombreProducto.length; i++){
            for (int j = 0; j< nombreProducto[i].length; j++){
                
                //Compara el producto introducido por el usuario y en caso de que haya espacios vacios, lo evita, evitando que se produzcan errores. 
                if(nombreProducto[i][j] != null && nombreProducto[i][j].equals(productoEliminado)){
                    nombreProducto[i][j]= null;
                    precioProducto[i][j]= 0.0;
                    cantidadProducto[i][j]= 0; 
                    guardado = true;
                    break;
                }
            }
        }

        if (guardado){
            System.out.println("Exito! El producto se ha eliminado correctamente. ");
        }else{
            System.out.println("Error! No se ha introducido correctamente. ");
        }
        //Metodo para volver al menu. 
        vueltaMenu(tipoProductos, nombreProducto, precioProducto, cantidadProducto, scanner);
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
     * @param cantidadProducto Cantidad de stock del producto. 
     * @param scanner Lugar donde se guardara la información introducida.
     */
    public static void vueltaMenu(String[] tipoProductos, String[][] nombreProducto, double[][] precioProducto, int [][]cantidadProducto,Scanner scanner){
        System.out.print("Pulse [ENTER] para volver al menu de administracion ");
        scanner.nextLine();
        menuAdministrador(tipoProductos, nombreProducto,  precioProducto, cantidadProducto, scanner);
    }

    /**
     * Muestra los tipos de los productos
     * @param tipoProductos Los tipos de los productos
     */
    public static void mostrarTipos(String[] tipoProductos){
        //Mostrar lo tipos.
         for (int i = 0; i < tipoProductos.length; i++){
            System.out.println(tipoProductos[i]);
        }
    }
}