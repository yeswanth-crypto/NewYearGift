package newyeargift;

public class Sweets extends Gift{
    public Sweets(String gift_id,String gift_name,double weight){
        super(gift_id,gift_name,weight);
    }
    private String typeofsweet;
    public static void main(String[] args){
        Sweets name1=new Sweets(""," ",25.0);
        Sweets name2=new Sweets(""," ",25.0);
        Sweets name3=new Sweets(""," ",25.0);
    }
}