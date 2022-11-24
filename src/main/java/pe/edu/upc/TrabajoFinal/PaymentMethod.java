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
    public void PrintPaymentMethod(){
        System.out.println("Payment method N " + PaymentMethodID + "\n");
        System.out.println("Kind: " + Kind + "\n");
        System.out.println("Account number " + AccountNumber + "\n");
        System.out.println("Owner first name " + OwnerFirstName + "\n");
        System.out.println("Owner last name " + OwnerLastName + "\n");
    }
    public void SetCVV(int cvv){
        this.CVV = cvv;
    }
    public void SetKind(String kind){
        this.Kind = kind;
    }
    public void SetAccountNumber( long accnum){
        this.AccountNumber = accnum;
    }
    public void SetOwnerFirstName(String firstname){
        this.OwnerFirstName = firstname;
    }
    public void SetOwnerLastName(String lastname){
        this.OwnerLastName = lastname;
    }
    public void SetExpirationMonth(int month){
        this.ExpirationMonth = month;
    }
    public void SetExpirationYear(int year){
        this.ExpirationYear = year;
    }
}
