public class Cliente{

    //CONSTANTES
    public final double IVA = 0.21;

    /* VARIABLES
        Un array para los productos (se seleccionan mediante un numero) --> int[] producto
        Un array para definir que productos son --> String[] nombreProducto
        Un array para los precios con dos decimales --> Double[] precioProducto
        Un array para mostrar los tipos de productos --> String[] tiposProductos
        Una variable para el precio sin IVA --> precioNormal
        Una variable para el precio con IVA --> precioIVA
        Un contador que cuente las veces que se ha seleccionado
        un producto, para saber la cantidad --> contadorCantidadProducto 
        scanner para pedir la seleccion del tipo de producto y del producto en si. 
     */

    /* INFORMACION 
        Tipo 1: Bebidas                         
        Tipo 2: Comida                          
        Tipo 3: Powerbanks/cargadores           
        Tipo 4: Sobres de cartas coleccionables 

        calculo del precio total -->(precio base * 0,21) + precio base.
        (precio base * 0,21) --> para saber cuanto vale solo el IVA

    */
    
    public static void main(String[] args) { 
        //int[] tipoProductos = new int[4];
        //Double[] precioProductos = new Double[4];



    }

    /**
     * Muestra un mensaje de bienvenida al cliente.
     */
    public static void mensajeBienvenida(){
    }

    /**
     * Muestra el menu de tipos de productos.
     */  
    public static void menuTipos(){
    }

    /**
     * Muestra el menu de productos de un solo tipo. 
     */
    public static void menuProductos(){
    }

    /**
     * Pide al cliente que selecciones un producto
     * @return devuleve un numero entero. 
     */
    public static int seleccioProductos(){}


    /**
     * Calcula el precio total sin IVA
     */
    public static double calculoPrecio(){}



    /**
     * Calcula el precio final incluyendo el IVA
     * @return devuelve el resulatdo en numero con decimales
     */
    public static double calculoPrecioFinal(){}



    /**
     * Muestra un resumen de la compra. 
     */
    public static void mostrarResumenCompra(){} 


    /**
     * Pide al usuario que inserte el dinero. 
     * @return
     */
    public static double insertarDinero(){}


    /**
     * Calcula cuanto dinero tiene que devolver
     */
    public static double calcularVueltas(){}


    /**
     * Muestra un mensaje final de agradecimiento de compra
     */
    public static void mensajeFinal(){}


}