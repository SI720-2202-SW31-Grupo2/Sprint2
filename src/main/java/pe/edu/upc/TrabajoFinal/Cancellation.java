package pe.edu.upc.TrabajoFinal;

public class Cancellation {
    private final int CancellationID;
    private int Day;
    private int Month;
    private int Year;
    private boolean Refund;
    private String Reason;
    public Cancellation(int day, int month, int year, boolean refund, String reason){
        this.CancellationID = (int)(Math.random()*1000+1);
        this.Day = day;
        this.Month = month;
        this.Year = year;
        this.Reason = reason;
        this.Refund = refund;
    }
    public int GetCancellationID(){ return CancellationID; }
    public int GetCancellationDay(){ return Day; }
    public int GetCancellationMonth(){ return Month; }
    public int GetCancellationYear(){ return Year; }
    public boolean GetCancellationRefund(){ return Refund; }
    public String GetCancellationReason(){ return Reason; }
    public void SetCancellationRefund(boolean refund){ this.Refund = refund; }
    public void SetCancellationReason(String reason){ this.Reason = reason; }
    public void PrintCancellation(){
        System.out.println("Cancellation N " + CancellationID + "\n");
        System.out.println("Fecha : " + Day + " - " + Month + " - " + Year + "\n");
        System.out.println("Reason : " + Reason + "\n");
        if(Refund) System.out.println("Refund : Yes\n");
        else System.out.println("Refund : No\n");
    }
}

