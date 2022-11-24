package pe.edu.upc.TrabajoFinal;

public class Review {
    private int ReviewID;
    private String Comment;
    private int Punctuation;
    public Review(String comment, int punctuation){
        ReviewID = (int)(Math.random()*1000+1);
        this.Comment = comment;
        this.Punctuation = punctuation;
    }
    public int GetReviewID(){ return ReviewID; }
    public String GetComment(){ return Comment; }
    public void SetComment(String comment){ this.Comment = comment; }
    public int GetPunctuation(){ return Punctuation; }
    public void SetPunctuation(int punctuation){ this.Punctuation = punctuation; }
    public void PrintPunctuation(){
        System.out.println("Review N " + ReviewID + "\n");
        System.out.println("Comment: " + Comment + "\n");
        System.out.println("Punctuation: " + Punctuation + "\n");
    }
}
