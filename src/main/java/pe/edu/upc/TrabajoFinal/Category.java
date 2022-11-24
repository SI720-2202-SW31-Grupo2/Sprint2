package pe.edu.upc.TrabajoFinal;

public class Category {
    //fields
    private final int CategoryID;
    private String Name;
    private String Description;
    //constructor
    public Category(String name, String description){
        this.Name = name;
        this.Description = description;
        this.CategoryID = (int)(Math.random()*100+1);
    }
    //methods
    public int GetCategoryID(){
        return CategoryID;
    }
    public String GetCategoryName(){
        return Name;
    }
    public void SetCategoryName(String name){
        this.Name = name;
    }
    public String GetCategoryDescription(){
        return Description;
    }
    public void SetCategoryDescription(String description){
        this.Description=description;
    }
    public void PrintCategory(){
        System.out.println("Category N " + CategoryID + "\n");
        System.out.println("Name : " + Name + "\n");
        System.out.println("Description : " + Description + "\n");
    }
}

