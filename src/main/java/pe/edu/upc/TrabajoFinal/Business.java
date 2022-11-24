package pe.edu.upc.TrabajoFinal;

public class Business {
    //fields
    private final int BusinessID;
    private String Name;
    private long RUC;
    private boolean State;
    Ubication BusinessUbication;
    //constructor
    public Business(String name, long ruc, Ubication ubication){
        this.Name = name;
        this.RUC = ruc;
        this.BusinessUbication = ubication;
        this.BusinessID = (int)(Math.random()*1000+1);
        this.State = false;
    }
    //methods
    public void OpenBusiness(){ this.State = true; }
    public void CloseBusiness(){ this.State = false; }
    public int GetBusinessID(){ return BusinessID; }
    public String GetName(){ return Name; }
    public void SetName(String name){ this.Name = name;}
    public long GetRUC(){ return RUC; }
    public void SetRUC(long ruc){ this.RUC = ruc; }
    public boolean GetState(){ return State; }
    public Ubication GetUbication(){ return BusinessUbication; }
    public void RegisterBusinessUbication(String address, String city){
        BusinessUbication = new Ubication(address, city);
    }
    public void PrintBusinessData(){
        System.out.println("Business N " + BusinessID + "\n");
        System.out.println("Name: " + Name + "\n");
        System.out.println("RUC: " + RUC + "\n");
        if(State) System.out.println("State: Open\n");
        else System.out.println("State: Close\n");
        BusinessUbication.PrintUbication();
    }
}
