package pe.edu.upc.TrabajoFinal;

public class FavouriteList {
    private int FavouriteListID;
    private Product product;
    public FavouriteList(){
        this.FavouriteListID = (int)(Math.random()*1000+1);
    }
    public void AddProduct(Product product){
        this.product = product;
    }
    public void DeleteProduct(int productID){

    }
}
