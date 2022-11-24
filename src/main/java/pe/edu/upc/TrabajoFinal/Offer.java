package pe.edu.upc.TrabajoFinal;

import jdk.jfr.Description;

public class Offer {
    private final int OfferID;
    private String Description;
    private double DiscountRate;
    private boolean OfferStatus;
    public Offer(String description, double discountRate){
        this.OfferID = (int)(Math.random()*1000+1);
        this.Description = description;
        this.DiscountRate = discountRate;
        this.OfferStatus = false;
    }
    public int GetOfferID(){ return OfferID; }
    public String GetOfferDescription(){ return Description; }
    public void SetOfferDescription(String description){ this.Description = description; }
    public double GetDiscountRate(){ return DiscountRate; }
    public void SetDiscountRate(double discountRate){ this.DiscountRate = discountRate; }
    public boolean GetOfferStatus(){ return OfferStatus; }
    public void PublishOffer(){ OfferStatus = true; }
    public void TakeOffOffer(){ OfferStatus = false; }
}
