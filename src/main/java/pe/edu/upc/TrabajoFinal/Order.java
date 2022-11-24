package pe.edu.upc.TrabajoFinal;

public class Order {
    private int OrderID;
    private String Status;
    private boolean OrderConfirmation;
    private boolean DeliveryConfirmation;
    private int DeliveryTime;
    private Cancellation OrderCancellation;
    private Voucher OrderVoucher;
    private Review OrderReview;
    public Order(String status, boolean deliveryConfirmation){
        this.OrderID = (int)(Math.random()*1000+1);
        this.Status = status;
        this.DeliveryConfirmation = deliveryConfirmation;
        this.OrderConfirmation = false;
        this.DeliveryTime = 0;
    }
    public int GetOrderID(){ return OrderID; }
    public String GetStatus(){ return Status; }
    public void SetStatus(String status){ this.Status = status; }
    public boolean GetOrderConfirmation(){ return OrderConfirmation; }
    public void SetOrderConfirmation(boolean orderConfirmation){ this.OrderConfirmation = orderConfirmation; }
    public boolean GetDeliveryConfirmation(){ return DeliveryConfirmation; }
    public int GetDeliveryTime(){ return DeliveryTime; }
    public void SetDeliveryTime(int time){ this.DeliveryTime = time; }
    public void SetOrderCancellation(int day, int month, int year, boolean refund, String reason){
        OrderCancellation = new Cancellation(day, month, year, refund, reason);
    }
    public Cancellation GetOrderCancellation(){ return OrderCancellation; }
    public void SetOrderVoucher(double amount, int day, int month, int year){
        OrderVoucher = new Voucher(amount, day, month, year);
    }
    public Voucher GetOrderVoucher(){ return OrderVoucher; }
    public void SetOrderReview(String comment, int punctuation){
        OrderReview = new Review(comment, punctuation);
    }
    public Review GetOrderReview(){ return OrderReview; }
    public void PrintOrder(){
        System.out.println("Order N " + OrderID + "\n");
        System.out.println("Status : " + Status + "\n");
        if(OrderConfirmation) System.out.println("Is the order confirmed?: Yes\n");
        else System.out.println("Is the order confirmed: No\n");
        if(DeliveryConfirmation) System.out.println("Is the order by delivery?: Yes\n");
        else System.out.println("Is the order by delivery?: No\n");
        System.out.println("Delivery time : " + DeliveryTime + "\n");
        OrderVoucher.PrintVoucher();
        OrderReview.PrintPunctuation();
    }
}
