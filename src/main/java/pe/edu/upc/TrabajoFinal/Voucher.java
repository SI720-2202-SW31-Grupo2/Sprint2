package pe.edu.upc.TrabajoFinal;

public class Voucher {
    private final int VoucherID;
    private double Amount;
    private int Day;
    private int Month;
    private int Year;
    public Voucher(double amount, int day, int month, int year){
        this.VoucherID = (int)(Math.random()*1000+1);
        this.Amount = amount;
        this.Day = day;
        this.Month = month;
        this.Year = year;
    }
    public int GetVoucherID(){ return VoucherID; }
    public double GetAmount(){ return Amount; }
    public int GetDay(){ return Day; }
    public int GetMonth(){ return Month; }
    public int GetYear(){ return Year; }
    public void SetAmount( double amount){ this.Amount = amount; }
    public void SetDay(int day){ this.Day = day; }
    public void SetMonth( int month){ this.Month = month; }
    public void SetYear( int year){ this.Year = year; }
}
