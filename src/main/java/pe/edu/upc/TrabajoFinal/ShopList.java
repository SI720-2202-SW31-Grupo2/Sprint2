package pe.edu.upc.TrabajoFinal;
import java.util.Objects;
import java.util.Arrays;
public class ShopList {
    private int ShopListID;
    private Product [] ProductArray;
    public ShopList(){
        this.ShopListID = (int)(Math.random()*1000+1);
        ProductArray = new Product[5];
    }
    public void AddProduct(Product product, int i){
        ProductArray[i] = product;
    }
    public void PrintShopList(){
        for(int i = 0; i < 5; i++){
            System.out.println("Product N " + (i + 1) + ":\n");
            System.out.println(ProductArray[i].GetProductName() + "\n");
            System.out.println(ProductArray[i].GetProductBrand() + "\n");
            System.out.println(ProductArray[i].GetProductDescription() + "\n");
            System.out.println(ProductArray[i].GetProductPrice() + "\n");
        }
    }
    public double GetShopListPrice(){
        double suma = 0;
        for(int i = 0; i < 5; i++){
            suma = suma + ProductArray[i].GetProductPrice();
        }
        return suma;
    }
    public void DeleteProductOfShopList(int id){
        int item = 0;
        for(int i = 0; i < 5; i++){
            if(Objects.equals(ProductArray[i].GetProductID(), id)) item = i;
        }
    }
}
