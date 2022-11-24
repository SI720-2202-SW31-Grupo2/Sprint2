package pe.edu.upc.TrabajoFinal;

public class Owner {
    private int OwnerID;
    private String FirstName;
    private String LastName;
    private int DNI;
    private String Email;
    private int PhoneNumber;
    private String Password;
    private Business business;
    public Owner(String firstName, String lastName, int dni, String email, int phoneNumber, String password){
        OwnerID= (int)(Math.random()*1000+1);
        this.FirstName = firstName;
        this.LastName = lastName;
        this.DNI = dni;
        this.Email=email;
        this.PhoneNumber = phoneNumber;
        this.Password = password;
    }
    public void Login(String email, String password){
        if(this.Email == email);
        if(this.Password == password);
    };
    public int GetOwnerID(){ return OwnerID; }
    public void SetOwnerBusiness(String name, long ruc, Ubication ubication){
        business = new Business(name, ruc, ubication);
    }
    public Business GetOwnerBusiness(){ return this.business; }

}
