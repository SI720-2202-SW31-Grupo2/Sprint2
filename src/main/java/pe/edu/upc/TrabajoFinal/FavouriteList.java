package pe.edu.upc.TrabajoFinal;

import java.util.Objects;

public class FavouriteList {
    private int FavouriteListID;
    private Product [] ProductArray;
    public FavouriteList(){
        this.FavouriteListID = (int)(Math.random()*1000+1);
        ProductArray = new Product[5];
    }
    public void AddProduct(Product product, int i){
        ProductArray[i] = product;
    }
    public void PrintFavouriteList(){
        for(int i = 0; i < 5; i++){
            System.out.println("Product N " + (i + 1) + ":\n");
            System.out.println(ProductArray[i].GetProductName() + "\n");
            System.out.println(ProductArray[i].GetProductBrand() + "\n");
            System.out.println(ProductArray[i].GetProductDescription() + "\n");
            System.out.println(ProductArray[i].GetProductPrice() + "\n");
        }
    }
    public double GetFavouriteListPrice(){
        double suma = 0;
        for(int i = 0; i < 5; i++){
            suma = suma + ProductArray[i].GetProductPrice();
        }
        return suma;
    }
    public void DeleteProductOfFavouriteList(int id){
        int item = 0;
        for(int i = 0; i < 5; i++){
            if(Objects.equals(ProductArray[i].GetProductID(), id)) item = i;
        }
    }

}
