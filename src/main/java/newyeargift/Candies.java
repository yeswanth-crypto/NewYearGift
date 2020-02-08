package newyeargift;

public class Candies extends Sweets{
    public Candies(String gift_id,String gift_name,double weight){
        super(gift_id,gift_name,weight);
    }
    public static void main(String[] args){
        Candies candy_1=new Candies("0001","Belgian Candy",30.0);
    }
}