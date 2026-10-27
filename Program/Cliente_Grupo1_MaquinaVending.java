import java.util.*;

public class Cliente_Grupo1_MaquinaVending{

    //CONSTANTES
    public final double IVA = 0.21;

    public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);

    String[] tipoProductos ={"1. Chuches", "2. Bebidas", "3. Cargadores", "4. Sobres"};
    String[][] nombreProducto ={{"Haribo", "Kit-Kat"}, {"Agua", "Coca-Cola"}, {"Powerbank", "Cable Tipo C"}, {"Pokemon", "Magic"}};
    double[] precioProducto ={};
    int[] producto={};

    int contadorSeleccion = 0; // para contar cuántos productos diferentes
    int contadorCantidadProducto = 0; // para saber cuántos del mismo producto
    double precioNormal = 0.0; //para almacenar el precio sin IVA
    double precioIVA = 0.0; // para el precio con iVA
    double dineroIngresado = 0.0;

    mensajeBienvenida();
    menuTipos(tipoProductos, scanner);
    menuProductos(tipoProductos, nombreProducto, precioProducto,scanner);
    seleccioProductos(producto, contadorSeleccion, contadorCantidadProducto, scanner);
    precioNormal = calculoPrecio(contadorSeleccion, contadorCantidadProducto, precioProducto);
    precioIVA = calculoPrecioFinal(precioNormal);
    mostrarResumenCompra(contadorSeleccion, precioNormal, precioIVA);
    dineroIngresado = insertarDinero();
    devolucionVueltas(precioIVA, dineroIngresado);
    mensajeFinal();

    scanner.close();

    }


    /**
     * Muestra un mensaje de bienvenida al cliente.
     */
    public static void mensajeBienvenida(){
        System.out.println("Bienvenido a Sestao-Vending.");
        System.out.println();

    }

    /**
     * Muestra el menú de tipos de productos.
     * @param tipoProductos Array que contiene los tipos de los productos.
     */  
    public static void menuTipos(String[] tipoProductos, Scanner scanner){
        System.out.println("----TIPOS DE PRODUCTOS----");
        for (int i = 0; i < tipoProductos.length; i++){
            System.out.println(tipoProductos[i]);
        }
        System.out.print("Seleccione un tipo de producto: ");
        int tipo = scanner.nextInt();

        

        
    }

    /**
     * Muestra el menú de productos de un solo tipo. 
     * @param tiposProductos Array que contiene los tipos de los productos.
     * @param nombreProducto Array que contiene los nombres de los productos
     * @param precioProducto Array que contiene los precios de los productos
     */
    public static void menuProductos(String[] tipoProductos, String[][] nombreProducto, double[] precioProducto,  Scanner scanner ){
        int tipo = scanner.nextInt();
        System.out.println("----PRODUCTOS----");
        switch (tipo){
            case 1:
                //mostrar productos del primer tipo
            case 2: 
                //mostrar productos del segundo tipo
            case 3:
                //mostrar productos del tercer tipo
            case 4: 
                //mostrar productos del cuarto tipo


        }
    }


        
    /**
     * Pide al cliente que selecciones un producto
     * @param producto Array con la posicion de los productos.
     * @param contadorSeleccion Cuenta cuantos productos diferentes 
     * @param contadorCantidadProducto Cuenta cuentas unidades del mismo producto se han seleccionado
     * @param scanner Pide al usuario que ingrese el numero del producto.
     * @return devuleve un número entero. 
     */
    public static int seleccioProductos(int[] producto, int contadorSeleccion, int contadorCantidadProducto, Scanner scanner){
        
        
        return 0;
    }

    /**
     * Calcula el precio total sin IVA
     * @param contadorSeleccion Cuenta cuantos productos diferentes 
     * @param contadorCantidadProducto Cuenta cuentas unidades del mismo producto se han seleccionado
     * @param precioProducto Un array con los precios de los productos
     * @return un double con el precio sin el IVA
     */
    public static double calculoPrecio(int contadorSeleccion, int contadorCantidadProducto, double[] precioProducto){
        return 0.0;
    }

    /**
     * Calcula el precio final incluyendo el IVA
     * @param precioNormal El importe sin iVA
     * @return Un double con el precio con IVA
     */
    public static double calculoPrecioFinal(double precioNomal){
        return 0.0; 
    }

    /**
     * Muestra un resumen de la compra. 
     * @param contadorSeleccion Cuenta cuantos productos diferentes
     * @param precioNormal El importe sin iVA
     * @param precioIVAl El importe total incluyendo el IVA
     */
    public static void mostrarResumenCompra(int contadorSeleccion, double precioNormal, double precioIVA){

    } 


    /**
    * Pide al usuario que inserte el dinero. 
    * @return Muestra un double con el dinero a ingresar.
    */
    public static double insertarDinero(){
        return 0.0;
    }

    /**
     * Calcula el cambio a devolver. 
     */
    public static void devolucionVueltas(double precioIVA, double dineroIngresado){

    }

    /**
     * Muestra un mensaje final de agradecimiento de compra.
     */
    public static void mensajeFinal(){
        System.out.println("Muchas gracias por su compra y hasta pronto!.");

    }

}