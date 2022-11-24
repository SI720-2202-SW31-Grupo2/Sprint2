package pe.edu.upc.TrabajoFinal;

public class Complain {
    private int ComplainID;
    private Business business;
    private String Description;
    private boolean ComplainState;
    public Complain(Business business, String description){
        this.business = business;
        this.Description = description;
        ComplainState = true;
    }
    public void SolveComplain(){ ComplainState = false; }
    public Business GetBusiness(){ return business; }
    public boolean GetComplainState(){ return ComplainState; }
    public void SetComplainState(boolean complainState){ this.ComplainState = ComplainState; }
    public void PrintComplain(){
        System.out.println("Complain N " + ComplainID + "\n");
        System.out.println("Business : " + business + "\n");
        System.out.println("Description of complain : " + Description + "\n");
        if(ComplainState) System.out.println("Complain state : Resolve\n");
        else System.out.println("Complain state : Not resolve\n");
    }
}
