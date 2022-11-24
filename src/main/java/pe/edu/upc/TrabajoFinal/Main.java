package pe.edu.upc.TrabajoFinal;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner capt = new Scanner(System.in);
        int opcion;
        String producto;
        //String correo;
        //String contrasena;
        //System.out.println("Bienvenido a Compralo ya!\n\n");
        //System.out.println("Ingresa tu correo\t: ");
        //correo = capt.nextLine();
        //System.out.println("\nIngresa tu contrasena\t: ");
        //contrasena = capt.nextLine();
        //System.out.println("\nUsuario correcto!");
        System.out.println("Menu principal\n");
        System.out.println("1. Buscar producto\n");
        System.out.println("2. Registrar metodo de pago\n");
        System.out.println("3. Ver lista de compras\n");
        System.out.println("4. Ir a pagar\n");
        System.out.println("5. Ir a mi cuenta\n");
        System.out.println("Elige una opcion\t:");
        opcion = capt.nextInt();
        Thread.sleep(5000);
        System.out.println("\nBuscar producto\n");
        System.out.println("Ingrese el nombre del producto que desea buscar: Leche 500 ml");
        producto = capt.nextLine();
        System.out.println("\nMejores resultados:\n");
        System.out.println("1. Leche Gloria Azul 500ml\n");
        System.out.println("2. Leche Gloria Roja 500ml\n");
        System.out.println("3. Leche Gloria Amarilla 500ml\n");
        System.out.println("4. Leche Laive Roja 500ml\n");
        System.out.println("5. Leche Bonlé Azul 500ml\n");
    }
}
