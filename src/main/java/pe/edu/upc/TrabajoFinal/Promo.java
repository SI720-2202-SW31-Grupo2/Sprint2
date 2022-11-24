package pe.edu.upc.TrabajoFinal;

public class Promo {
    private final int PromoID;
    private int FirstProductQuantity;
    private int SecondProductQuantity;
    private String Description;
    private int SecondProductID;
    private boolean Status;
    public Promo(String description, int secondProductID, int firstProductQuantity, int secondProductQuantity){
        this.PromoID = (int)(Math.random()*1000+1);
        this.Description = description;
        this.SecondProductID = secondProductID;
        this.FirstProductQuantity = firstProductQuantity;
        this.SecondProductQuantity = secondProductQuantity;
        this.Status = false;
    }
    public int GetPromoID(){ return PromoID; }
    public String GetDescription(){ return Description; }
    public void SetDescription(String description){ this.Description = description; }
    public int GetFirstProductQuantity(){ return FirstProductQuantity; }
    public void SetFirstProductQuantity(int firstProductQuantity){ this.FirstProductQuantity = firstProductQuantity; }
    public int GetSecondProductQuantity(){ return SecondProductQuantity; }
    public void SetSecondProductQuantity(int secondProductQuantity){ this.SecondProductQuantity = secondProductQuantity; }
    public int GetSecondProductID(){ return SecondProductID; }
    public void SetSecondProductID( int secondProductID){ this.SecondProductID = secondProductID; }
    public boolean GetPromoStatus(){ return Status; }
    public void PublishPromo(){ this.Status = true; }
    public void TakeOffPromo(){ this.Status = false;}
    public void PrintPromo(){
        System.out.println("Promo N " + PromoID + "\n");
        System.out.println("Description: " + Description + "\n");
        System.out.println("First product quantity " + FirstProductQuantity + "\n");
        System.out.println("Second product quantity " + SecondProductQuantity + "\n");
        if(Status) System.out.println("Promo status: Active\n");
        else System.out.println("Promo status: Inactive\n");
    }
}
