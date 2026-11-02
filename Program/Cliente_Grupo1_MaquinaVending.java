import java.util.*;

public class Cliente_Grupo1_MaquinaVending{//lol

    //CONSTANTES
    public static final double IVA = 0.21;

    public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);

    String[] tipoProductos ={"1. Chuches", "2. Bebidas", "3. Cargadores", "4. Sobres"};
    String[][] nombreProducto ={{"Haribo", "Kit-Kat", "Jumpers", "Donetes", "Filipinos","Doritos"}, {"Agua", "Coca-Cola"}, {"Powerbank", "Cable Tipo C"}, {"Pokemon", "Magic"}};
    double[][] precioProducto ={{2.00, 1.20, 1.20, 1.00, 1.10, 1.50 }, {1.00, 2.50}, {}, {}};
    //int[] producto={};

    int contadorSeleccion = 0; // para contar cuántos productos diferentes
    int contadorCantidadProducto = 0; // para saber cuántos del mismo producto
    double precioNormal = 0.0; //para almacenar el precio sin IVA
    double precioIVA = 0.0; // para el precio con iVA
    double dineroIngresado = 0.0;

    mensajeBienvenida();
    menuTipos(tipoProductos, scanner);
    menuProductos(tipoProductos, nombreProducto, precioProducto,scanner);
    seleccioProductos(tipoProductos, contadorSeleccion, contadorCantidadProducto, scanner);
    precioNormal = calculoPrecio(contadorSeleccion, contadorCantidadProducto, precioProducto);
    precioIVA = calculoPrecioFinal(precioNormal);
    mostrarResumenCompra(contadorSeleccion, precioNormal, precioIVA, IVA);
    dineroIngresado = insertarDinero(dineroIngresado, scanner);
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
        System.out.println("En esta lista le mostraremos las categorias de nuestros productos.");
        for (int i = 0; i < tipoProductos.length; i++){
            System.out.println(tipoProductos[i]);
        }
        System.out.print("Seleccione un tipo de producto: ");    
    }

    /**
     * Muestra el menú de productos de un solo tipo. 
     * @param tiposProductos Array que contiene los tipos de los productos.
     * @param nombreProducto Array que contiene los nombres de los productos
     * @param precioProducto Array que contiene los precios de los productos
     */
    public static void menuProductos(String[] tipoProductos, String[][] nombreProducto, double[][] precioProducto,  Scanner scanner ){
        int tipo = scanner.nextInt();
        System.out.println("----PRODUCTOS----");
        
        switch (tipo){
            case 1:
                //Mostrar los productos 
                for (int i = 0; i < nombreProducto[0].length; i ++){
                    System.out.print(nombreProducto[0][i]+" ");
                };
                System.out.println();
                //Mostrar los precios
                for (int i = 0; i < precioProducto[0].length; i ++){
                    System.out.print(precioProducto[0][i] +"     ");
                }
                break;

            case 2: 
                //Mostrar los productos
               for (int i = 0; i < nombreProducto[1].length; i ++){
                    System.out.print(nombreProducto[1][i]+" ");
                };
                System.out.println();
                //Mostrar los precios
                for (int i = 0; i < precioProducto[1].length; i ++){
                    System.out.print(precioProducto[1][i]+"     ");
                }
                break;

            case 3:
                //Mostrar los productos
                for (int i = 0; i < nombreProducto[2].length; i ++){
                    System.out.print(nombreProducto[2][i]+" ");
                }
                System.out.println();
                //Mostrar los precios
                for (int i = 0; i < precioProducto[2].length; i ++){
                    System.out.print(precioProducto[2][i]+"     ");
                }
                break;

            case 4: 
                //Mostrar los productos
                for (int i = 0; i < nombreProducto[3].length; i ++){
                    System.out.print(nombreProducto[3][i]+"     ");
                };
                System.out.println();
               //Mostrar losprecios 
                for (int i = 0; i < precioProducto[3].length; i ++){
                    System.out.print(precioProducto[3][i]+"     ");
                }
                break;
        }
        
        System.out.println();
        
    }
     
    /**
     * Pide al cliente que selecciones un producto
     * @param producto Array con la posicion de los productos.
     * @param contadorSeleccion Cuenta cuantos productos diferentes 
     * @param contadorCantidadProducto Cuenta cuentas unidades del mismo producto se han seleccionado
     * @param scanner Pide al usuario que ingrese el numero del producto.
     * @return devuleve un número entero. 
     */
    public static String seleccioProductos(String[] tipoProductos, int contadorSeleccion, int contadorCantidadProducto, Scanner scanner){
        scanner.nextLine();
        System.out.print("Seleccione un producto: ");
        String productoSeleccionado = scanner.nextLine();

        //Buscar el producto selecionado.
         
        
        // Sumar al contador del producto
        
        //que tendria que devolver 
        //vueltaMenu(tipoProductos, scanner);
        return productoSeleccionado;
        
    }
    

    /**
     * Calcula el precio total sin IVA
     * @param contadorSeleccion Cuenta cuantos productos diferentes 
     * @param contadorCantidadProducto Cuenta cuentas unidades del mismo producto se han seleccionado
     * @param precioProducto Un array con los precios de los productos
     * @return un double con el precio sin el IVA
     */
    public static double calculoPrecio(int contadorSeleccion, int contadorCantidadProducto, double[][] precioProducto){
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
     * @param IVA Constante del IVA
     */
    public static void mostrarResumenCompra(int contadorSeleccion, double precioNormal, double precioIVA, double IVA){
        System.out.println();
        System.out.println("-----RESUMEN DE COMPRA-----");
        System.out.println("Articulos adquiridos: " + contadorSeleccion);
        System.out.println("            Subtotal: " + precioNormal);
        System.out.println("                 IVA: " + IVA );
        System.out.println("------------------------------");
        System.out.println("               Total: " + precioIVA);

    } 


    /**
    * Pide al usuario que inserte el dinero. 
    * @return Muestra un double con el dinero a ingresar.
    */
    public static double insertarDinero(double dineroIngresado, Scanner scanner){
        System.out.println();
        System.out.print("Introduzca el dinero: ");
        double ingreso = scanner.nextDouble(); 
        return ingreso;
    }

    /**
     * Calcula el cambio a devolver. 
     */
    public static void devolucionVueltas(double precioIVA, double dineroIngresado){
        if (dineroIngresado > precioIVA){
            calcularVueltas();
        } else if (dineroIngresado == precioIVA){
            //continuar con el mensaje de despedida
        } else {
            // Hacer la cuenta de lo que falta y volver a pedir que ingrese el dinero. 

        }

        //Decir el cambio
        System.out.println("Recoja su cambio: ");

    }

    /**
     * Muestra un mensaje final de agradecimiento de compra.
     */
    public static void mensajeFinal(){
        System.out.println("Muchas gracias por comprar en SESTAO-VENDING.");
        System.out.println("¡Hasta la proxima!");

    }

    /*public static void vueltaMenu(String[] tipoProductos, Scanner scanner){
        scanner.nextLine();
        System.out.print("¿Desea selecionar algun producto más?(Si/No) ");
        String opcionVuelta = scanner.nextLine();
        
        switch (opcionVuelta) {
            case "Si":
                System.out.println("Volviendo al menu de tipos");
                menuTipos(tipoProductos, scanner); 
                break; 
            case "No":
                System.out.println("Se procedera a mostrar el resumen de compra");
                break;
            default:
                break;
        }
    }*/

    public static void calcularVueltas(){
        System.out.println();
        double cambio = 3.88;
        // 200 euros

        // 100 euros

        // 50 euros 

        // 20 euros 

        // 10 euros 

        // 5 euros

        // 2 euros
        if ((cambio / 2) >= 1) {
            int doseuro = (int) (cambio / 2);
            cambio = cambio - doseuro * 2;
            System.out.println(doseuro + "moneda(s) de 2€");
        }
        // 1 euro
        if ((cambio / 1) >= 1) {
            int uneuro = (int) (cambio / 1); 
            cambio = cambio - uneuro * 1;
            System.out.println(uneuro + "moneda(s) de 1€");
        }
        // 50 centimos
        if ((cambio / 0.5) >= 1) {
            int cincuetacts = (int) (cambio / 0.5);
            cambio = cambio - cincuetacts * 0.5;
            System.out.println(cincuetacts + "moneda(s) de 50cts");
        }
        // 20 centimos
        if ((cambio / 0.2) >= 1) {
            int veintects = (int) (cambio / 0.2);
            cambio = cambio - veintects * 0.2;
            System.out.println(veintects + "moneda(s) de 20cts");
        }
        // 10 centimos
        if ((cambio / 0.1) >= 1) {
            int diezcts = (int) (cambio / 0.1);
            cambio = cambio - diezcts * 0.1;
            System.out.println(diezcts + "moneda(s) de 10cts");
        }
        // 5 centimos
        if ((cambio / 0.05) >= 1) {
            int cincocts = (int) (cambio / 0.05);
            cambio = cambio - cincocts * 0.05;
            System.out.println(cincocts + "moneda(s) de 5cts");
        }
        // 2 centimos
        if ((cambio / 0.02) >= 1) {
            int doscts = (int) (cambio / 0.02);
            cambio = cambio - doscts * 0.02;
            System.out.println(doscts + "moneda(s) de 2cts");
        }
        // 1 centimo
        if ((cambio / 0.01) >= 1) {
            int uncts = (int) (cambio / 0.01);
            cambio = cambio - uncts * 0.01; // Corregido el uncts*2 del código original
            System.out.println(uncts + "moneda(s) de 1cts");
        }
    }
}