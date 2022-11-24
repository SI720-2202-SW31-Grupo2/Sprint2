package pe.edu.upc.TrabajoFinal;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner capt = new Scanner(System.in);
        int opcion;
        Category Category1 = new Category("Lacteos","Dentro de esta categoría se encuentran...");
        Category Category2 = new Category("Aves","Dentro de esta categoría se encuentran...");
        Ubication Ubication1 = new Ubication("Av. La Paz 123", "Lima");
        Business Business1 = new Business("Bodega Carmencita", 99999999, Ubication1);
        Voucher Voucher1 = new Voucher(145.7,24,11,2022);
        Order Order1 = new Order("Confirmado",true);
        Buyer Buyer1 = new Buyer("Alejandro", "Ponce", 76942955, "alep.salinas@gmail,com",984721179, "AlejandroPonce");
        Product Product1 = new Product("Queso Cheedar", "Queso cheedar de 100 gr", 20, "Laive", 15.60, Category1, Business1);
        Product Product2 = new Product("Leche sin lactosa", "Leche sin lactosa de 500 mL", 35, "Gloria", 3.40, Category1, Business1);
        Product Product3 = new Product("Pechuga de pollo", "Pechuga de pollo limpia...", 10, "No-Brand", 11.60, Category2, Business1);
        Product Product4 = new Product("Alitas de pollo", "Alitas de pollo limpias...", 30, "No-Brand", 15.60, Category2, Business1);
        Product Product5 = new Product("Piernitas de pollo", "Piernitas de pollo limpias...", 20, "No-Brand", 19.60, Category2, Business1);
        ShopList ShopList1 = new ShopList();
        ShopList1.AddProduct(Product1, 0);
        ShopList1.AddProduct(Product2, 1);
        ShopList1.AddProduct(Product3, 2);
        ShopList1.AddProduct(Product4, 3);
        ShopList1.AddProduct(Product5, 4);
        System.out.println("MENU DE OPCIONES");
        System.out.println("================");
        System.out.println("1. Imprimir lista de compras");
        System.out.println("2. Imprimir orden");
        System.out.println("3. Imprimir voucher");
        System.out.println("================");
        System.out.println("Elije una opcion: ");
        opcion = capt.nextInt();
        switch (opcion) {
            case 1 -> ShopList1.PrintShopList();
            case 2 -> Order1.PrintOrder();
            case 3 -> Voucher1.PrintVoucher();
        }
    }
}
