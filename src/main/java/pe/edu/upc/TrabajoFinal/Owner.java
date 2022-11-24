package pe.edu.upc.TrabajoFinal;

import java.util.Objects;

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
        if(Objects.equals(this.Email, email)) System.out.println("Your login has been confirmed ");
        if(Objects.equals(this.Password, password)) System.out.println("Your login has not been confirmed ");
    };
    public int GetOwnerID(){ return OwnerID; }
    public void SetOwnerBusiness(String name, long ruc, Ubication ubication){
        business = new Business(name, ruc, ubication);
    }
    public Business GetOwnerBusiness(){ return this.business; }
    public void PrintOwnerData(){
        System.out.println("Owner N " + OwnerID + "\n");
        System.out.println("First name: " + FirstName + "\n");
        System.out.println("Last name " + LastName + "\n");
        System.out.println("DNI " + DNI + "\n");
        System.out.println("Email " + Email + "\n");
        System.out.println("Phone number " + PhoneNumber + "\n");
        business.PrintBusinessData();
    }
}
