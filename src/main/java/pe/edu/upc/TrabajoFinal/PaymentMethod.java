package pe.edu.upc.TrabajoFinal;

public class PaymentMethod {
    //fields
    private int PaymentMethodID;
    private String Kind;
    private long AccountNumber;
    private String OwnerFirstName;
    private String OwnerLastName;
    private int ExpirationMonth;
    private int ExpirationYear;
    private int CVV;
    public PaymentMethod(String kind, long accountNumber, String firstname, String lastname, int month, int year, int cvv){
        this.PaymentMethodID= (int)(Math.random()*1000+1);
        this.Kind = kind;
        this.AccountNumber = accountNumber;
        this.OwnerFirstName = firstname;
        this.OwnerLastName = lastname;
        this.ExpirationMonth = month;
        this.ExpirationYear = year;
        this.CVV = cvv;
    }
}
