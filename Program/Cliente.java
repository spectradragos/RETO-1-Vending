public class Cliente{

    //CONSTANTES
    public final int IVA = 21;

    /* VARIABLES
        Un array para los productos --> String[] productos
        Un array para los precios con dos decimales --> Double[] precio
        Un array para mostrar los tipos de productos --> String[] tiposProductos
        Una variable para el precio sin IVA --> precioNormal
        Una variable para el precio con IVA --> precioIVA
        Un contador que cuente las veces que se ha seleccionado
        un producto, para saber la cantidad --> contadorCantidadProducto 
        scanner para la seleccion del producto
     */

    /* INFORMACION 
        Tipo 1: Bebidas
        Tipo 2: Comida 
        Tipo 3: Powerbanks/cargadores
        Tipo 4: Sobres de cartas coleccionables
        
        Cantidad de productos (varia depende del tipo)
        5 por linea
        8 por columnas 
    */
    
    public static void main(String[] args) { 
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
    public static int seleccioProductos(){
    }


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
     * 
     */
    public static void devolucionVueltas(){}


    /**
     * Muestra un mensaje final de agradecimiento de compra
     */
    public static void mensajeFinal(){
    }


}