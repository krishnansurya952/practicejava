import java.util.*;
class Laptop implements Comparable {
    int bno;
    String bname;
    double price;
    Laptop(int bno,String bname, double price){
        this.bno=bno;
        this.bname=bname;
        this.price=price;
    }
    public String toString(){
        return "\nbno: "+bno+" Brandname: "+bname+" price: "+price;
    }
    // public int compareTo(Object o){
    //     Laptop l=(Laptop)o;
    //     if(this.price==l.price){
    //         return 0;
    //     }else if(this.price>l.price){
    //         return 1;
    //     }else{
    //         return -1;
    //     }
    // }

    // sorting By using brand no
    public int compareTo(Object o1){
        Laptop l1=(Laptop)o1;
        if(this.bno==l1.bno){
            return 0;  
        }else if(this.bno>l1.bno){
            return 1;
        }else{
            return -1;
        }
    }
   

}

public class sorts  {
    public static void main(String args[]){
        List<Laptop> bag=new ArrayList();
        bag.add(new Laptop(3,"dell",32000));
        bag.add(new Laptop(1,"lenovo",48000));
        bag.add(new Laptop(2,"hp",42000));
        System.out.println(bag);
        Collections.sort(bag);
        System.out.println(bag);


    }
    
}
