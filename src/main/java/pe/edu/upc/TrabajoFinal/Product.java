package pe.edu.upc.TrabajoFinal;

public class Product {
    private final int ProductID;
    private String Name;
    private String Description;
    private int Stock;
    private String Brand;
    private double Price;
    private Category ProductCategory;
    private Business ProductBusiness;
    private Offer ProductOffer;
    private Promo ProductPromo;
    public Product(String name, String description, int stock, String brand, double price, Category category, Business business){
        this.ProductID = (int)(Math.random()*1000+1);
        this.Name = name;
        this.Description = description;
        this.Stock = stock;
        this.Brand = brand;
        this.Price = price;
        this.ProductCategory = category;
        this.ProductBusiness = business;
    }
    public int GetProductID(){ return ProductID; }
    public String GetProductName(){ return Name; }
    public String GetProductDescription(){ return Description; }
    public int GetProductStock(){ return Stock; }
    public void SetProductStock(int stock){ this.Stock = stock; }
    public String GetProductBrand(){ return Brand; }
    public double GetProductPrice(){ return Price; }
    public void SetProductPrice(double price){ this.Price = price; }
    public Category GetProductCategory(){ return ProductCategory; }
    public void SetProductCategory(String name, String description){ ProductCategory = new Category(name, description);}
    public Business GetProductBusiness(){ return ProductBusiness; }
    public void PrintProductData(){
        System.out.println("Product N " + ProductID + "\n");
        System.out.println("Name: " + Name + "\n");
        System.out.println("Description: " + Description + "\n");
        System.out.println("Stock: " + Stock + "\n");
        System.out.println("Brand: " + Brand + "\n");
        System.out.println("Price: " + Price + "\n");
        System.out.println("Category: " + ProductCategory + "\n");
        System.out.println("Business: " + ProductBusiness + "\n");
    }
}
