package pe.edu.upc.TrabajoFinal;

public class Notification {
    private final int NotificationID;
    private Business BusinessNotification;
    private Buyer BuyerNotification;
    private String Message;
    private String SendBy;
    public Notification(String message, String sendby){
        this.NotificationID = (int)(Math.random()*100+1);
        this.Message = message;
        this.SendBy = sendby;
    }
    public void SendNotification(int tipo, Buyer buyer, Business business){
        if(tipo == 1) SendBuyer(buyer);
        if( tipo==2 ) SendBusiness((business));
    }
    public String GetMessage(){
        return Message;
    }
    public void SetMessage(String m){
        this.Message = m;
    }
    public String GetSendBy(){
        return SendBy;
    }
    public void SendBuyer(Buyer buyer){
        String firstname, lastname;
        BuyerNotification = buyer;
        firstname = BuyerNotification.GetBuyerFirstName();
        lastname = BuyerNotification.GetBuyerLastName();
        System.out.println("¡Hola " + firstname + " " + lastname + "\n");
        System.out.println("Tienes una nueva notificacion : \n");
        System.out.println("Enviada por : " + SendBy + "\n");
        System.out.println("Mensaje : " + Message + "\n");
    }
    public void SendBusiness(Business business){
        BusinessNotification = business;
        String name;
        name = BusinessNotification.GetName();
        System.out.println("¡Hola " + name + ", tienes una nueva notificacion\n");
        System.out.println("Enviada por : " + SendBy + "\n");
        System.out.println("Mensaje : " + Message + "\n");
    }
}
