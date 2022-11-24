package pe.edu.upc.TrabajoFinal;

import java.util.Objects;

public class Buyer {
    //fields
    private final int BuyerID;
    private String FirstName;
    private String LastName;
    private int DNI;
    private String Email;
    private int PhoneNumber;
    private String Password;
    private Ubication BuyerUbication;
    private PaymentMethod BuyerPaymentMethod;
    private Order order;
    private Complain BuyerComplain;
    private FavouriteList BuyerFavouriteList;
    private ShopList BuyerShopList;
    public Buyer(String firstname, String lastname, int dni, String email, int phonenumber, String password){
        this.BuyerID = (int)(Math.random()*1000+1);
        this.FirstName = firstname;
        this.LastName = lastname;
        this.DNI = dni;
        this.Email = email;
        this.PhoneNumber = phonenumber;
        this.Password = password;
    }
    public void Login(String email, String password){
        if(Objects.equals(this.Email, email)) System.out.println("Su login ha sido exitoso!");
        if(Objects.equals(this.Password, password)) System.out.println("Su login no ha procedido, revise los datos ingresados");;
    };
    public void SetBuyerUbication(String address, String city){
        BuyerUbication = new Ubication(address, city);
    }
    public void SetBuyerPaymentMethod(String kind, long accountNumber, String firstname, String lastname, int month, int year, int cvv){
        BuyerPaymentMethod = new PaymentMethod(kind, accountNumber, firstname, lastname, month, year, cvv);
    }
    public int GetBuyerID(){ return BuyerID; }
    public String GetBuyerFirstName(){ return FirstName; }
    public String GetBuyerLastName(){ return LastName; }
    public void PrintBuyerUbication(){
        System.out.println("Buyer : " + FirstName + " " + LastName + "\n");
        BuyerUbication.PrintUbication();
    }
}

