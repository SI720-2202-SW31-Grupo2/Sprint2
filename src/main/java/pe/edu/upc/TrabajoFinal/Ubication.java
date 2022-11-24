package pe.edu.upc.TrabajoFinal;

public class Ubication {
    private int UbicationID;
    private String Address;
    private String City;
    public Ubication(String address, String city){
        this.UbicationID = (int)(Math.random()*1000+1);
        this.Address = address;
        this.City = city;
    }
    public void PrintUbication(){
        System.out.println("Address: " + Address + "\n");
        System.out.println("City: " + City + "\n");
    }
    public void SetAddress(String address){ this.Address = address; }
    public void SetCity(String city){ this.City = city; }
    public String GetAddress(){ return Address; }
    public String GetCity(){ return City; }
}
