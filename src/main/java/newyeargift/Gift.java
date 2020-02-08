package newyeargift;
import java.util.*;
public class Gift{
    private String gift_id;
    private String gift_name;
    private double weight;
    public static void main(String[] args){
        ArrayList gift_list=new ArrayList();
        Gift example1=new Gift(" "," ",25.0);
        gift_list.add(example1);
    }
    public Gift(String gift_id,String gift_name,double weight){
        super();
        this.gift_id=gift_id;
        this.gift_name=gift_name;
        this.weight=weight;
    }
    public double totalweight(){
        double sum=0.0;
        return sum;
    }
    public ArrayList options(){
        ArrayList candies_list=new ArrayList();
        Scanner sc=new Scanner(System.in);
        return candies_list;
    }
    public String getGift_id(){
        return gift_id;
    }
    public void setGift_id(String gift_id){
        this.gift_id=gift_id;
    }
    public String getGift_name(){
        return gift_name;
    }
    public void setGift_name(String gift_name){
        this.gift_name=gift_name;
    }
    public double getWeight(){
    	return weight;
    }
    public void setWeight(double weight) {
    	this.weight=weight;
    }
}