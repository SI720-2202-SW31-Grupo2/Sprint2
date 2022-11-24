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
    public void ShowInMap(){}
}
