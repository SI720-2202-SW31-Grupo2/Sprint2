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
}
