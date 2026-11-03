import java.util.*;

public class Cliente_Grupo1_MaquinaVending{

    //CONSTANTES
    public static final double IVA = 0.21;

    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        String[] tipoProductos ={"1. Chuches", "2. Bebidas", "3. Cargadores", "4. Sobres"};

        String[][] nombreProducto ={
            {"Haribo", "Kit-Kat", "Jumpers", "Donetes", "Filipinos","Doritos"}, 
            {"Agua", "Coca-Cola"}, 
            {"Powerbank", "Cable Tipo C"}, 
            {"Pokemon", "Magic"}};

        double[][] precioProducto ={
            {2.00, 1.20, 1.20, 1.00, 1.10, 1.50 }, 
            {1.00, 2.50}, 
            {}, 
            {}};

        
        //Bucle para volver a empezar desde cero , en el cual se reiniciara cuando pase al siguiente usuario.  
        do {
            int contadorSeleccion = 0; // para contar cuántos productos diferentes
            int contadorCantidadProducto = 0; // para saber cuántos del mismo producto
            double precioNormal = 0.0; //para almacenar el precio sin IVA
            double precioIVA = 0.0; // para el precio con iVA
            double dineroIngresado = 0.0;
            String opcionVuelta; 

        
            //Bucle para volver a seleccionar productos.
            mensajeBienvenida(); 
            do{
                menuTipos(tipoProductos, scanner);
                menuProductos(tipoProductos, nombreProducto, precioProducto,scanner);
                contadorSeleccion = seleccioProductos(tipoProductos,nombreProducto, contadorSeleccion, contadorCantidadProducto, scanner);
                opcionVuelta = vueltaMenu(scanner);  
            }while(opcionVuelta.equals("Si"));
            
            precioNormal = calculoPrecio(contadorSeleccion, contadorCantidadProducto, precioProducto);
            precioIVA = calculoPrecioFinal(precioNormal, IVA);
            mostrarResumenCompra(contadorSeleccion, precioNormal, precioIVA, IVA);
            dineroIngresado = insertarDinero(dineroIngresado, scanner);
            devolucionVueltas(precioIVA, dineroIngresado);
            mensajeFinal();

            scanner.close();
            }while(true);
    }


    /**
     * Muestra un mensaje de bienvenida al cliente.
     */
    public static void mensajeBienvenida(){
        System.out.println("=================================");
        System.out.println("   Bienvenido a Sestao-Vending   ");
        System.out.println("=================================");
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
    public static int seleccioProductos(String[] tipoProductos, String [][] nombreProducto, int contadorSeleccion, int contadorCantidadProducto, Scanner scanner){
        scanner.nextLine();
        //Seleccionar el producto 
        System.out.print("Seleccione un producto: ");
        String productoSeleccionado = scanner.nextLine();
       
        //Buscar el producto selecionado.
        boolean encontrado = false; 
        int filaEncontrada = -1;
        int columnaEncontrada = -1;
        contadorSeleccion = 0;
        contadorCantidadProducto = 0;  

        for (int i = 0; i < nombreProducto.length; i++) {
            for (int j = 0; j < nombreProducto[i].length; j++) {
                // Comparamos usando .equals()
                if (nombreProducto[i][j].equals(productoSeleccionado)) {
                    encontrado = true;
                    filaEncontrada = i;
                    columnaEncontrada = j;
                    contadorCantidadProducto++;
                    break; // Rompe el bucle interno
                }
            } if (encontrado) break; // Rompe el bucle externo
        }

        // Sumar al contador del producto
        if (encontrado) {
            System.out.println("El producto ha sido seleccionado correctamente.");
            contadorSeleccion = contadorCantidadProducto; 
        } else {
            System.out.println("Producto no encontrado.");
        }

        return contadorSeleccion;
        
    }

    

    /**
     * Calcula el precio total sin IVA
     * @param contadorSeleccion Cuenta cuantos productos diferentes 
     * @param contadorCantidadProducto Cuenta cuentas unidades del mismo producto se han seleccionado
     * @param precioProducto Un array con los precios de los productos
     * @return un double con el precio sin el IVA
     */
    public static double calculoPrecio(int contadorSeleccion, int contadorCantidadProducto, double[][] precioProducto){
        // Calcular el precio sin IVA
        double precioNormal = 20.0;

    
        return precioNormal;
    }

    /**
     * Calcula el precio final incluyendo el IVA
     * @param precioNormal El importe sin iVA
     * @return Un double con el precio con IVA
     */
    public static double calculoPrecioFinal(double precioNormal, double IVA){
        double precioIVA = precioNormal * (1 + IVA); 
        return precioIVA; 
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
        System.out.println("=================================");
        System.out.println("        RESUMEN DE COMPRA        ");
        System.out.println("=================================");
        System.out.println("  Articulos adquiridos: " + contadorSeleccion);
        System.out.println("              Subtotal: " + precioNormal);
        System.out.println("                   IVA: " + (IVA*100) + "%");
        System.out.println("---------------------------------");
        System.out.println("                 Total: " + precioIVA);

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
     * Muestra el cambio. 
     */
    public static void devolucionVueltas(double precioIVA, double dineroIngresado){
        if (dineroIngresado > precioIVA){
            double cambio = dineroIngresado-precioIVA;
            System.out.println("Su cambio: "+ cambio);
            System.out.println("~~ Desglose de monedas ~~");
            calcularVueltas(cambio);
        } else if (dineroIngresado == precioIVA){
            System.out.println("Importe exacto!. No hay cambios a devolver.");
        } else {
            // Hacer la cuenta de lo que falta y volver a pedir que ingrese el dinero. 

        }
    }

    /**
     * Muestra un mensaje final de agradecimiento de compra.
     */
    public static void mensajeFinal(){
        System.out.println("Muchas gracias por comprar en SESTAO-VENDING.");
        System.out.println("¡Hasta la proxima!");

    }

    

    /**
     *  Calcula el cambio a devolver. 
     * @param cambio Hace referencia al dinero que sobra. 
     */
    public static void calcularVueltas(double cambio){
        //Definir los billetes y las monedas
        int[] valoresMonetarios={20000, 10000, 5000, 2000, 1000, 200, 100, 50, 20, 10, 5, 2, 1}; 
        String[] denominacionMonetaria= {"Billete de 200","Billete de 100","Billete de 50","Billete de 20","Billete de 10","Billete de 5",
        "Moneda de 2","Moneda de 1","Moneda de 0.50","Moneda de 0.20","Moneda de 0.10","Moneda de 0.05","Moneda de 0.02","Moneda de 0.01"}; 

        //Convertir lo centimos a numero enteros. 
       
        int centimosRestantes = (int)Math.round(cambio*100); //Math.round redondea los numeros , ya se float o double, a numeros enteros. 

        //Desglose del cambio
        for (int i = 0; i < valoresMonetarios.length; i++){
            if (centimosRestantes >= valoresMonetarios[i]){
                int cantidad = centimosRestantes / valoresMonetarios[i]; // Unidades de billetes o monedas ya desglosadas
                centimosRestantes = centimosRestantes % valoresMonetarios[i]; // Unidades que aun falta por desglosar. 
                System.out.println(denominacionMonetaria[i]+": "+ cantidad);
            }
        }
    }

    /**
     * Pregunta al usuario si quiere volver a seleccionar productos o finalizar con la compra. 
     * @param scanner Respuesta del usuario. 
     * @return
     */
    public static String vueltaMenu(Scanner scanner){
        scanner.nextLine();
        System.out.print("¿Desea volver a seleccionar un producto?(Si/No): ");
        String opcionVuelta = scanner.nextLine();
        if (opcionVuelta.equals("Si")){
            System.out.println("Volviendo al menu de tipos...");
        }else{
            System.out.println("Se procedera a mostrar el resumen de compra. ");
        }
        return opcionVuelta;
    }
}