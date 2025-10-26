//Gernic Collection
import java.util.*;
class Students{
    int id;
    String name;
    long ph;
    Students(int id, String name,long ph){
        this.id=id;
        this.name=name;
        this.ph=ph;

    }
    @Override
    public String toString(){
        return "\nId: "+id+" Name: "+name+" ph: "+ph;
    }
}


public class Gernic {
    public static void main(String args[]){
        List<Students> s1=new ArrayList();
            s1.add(new Students(1,"surya",9344227220L));
            s1.add(new Students(2,"anjana",934422123L));
            s1.add(new Students(3,"Kokila",123227220L));
            System.out.println(s1);
            // Collection.sort(s1);
            


    }
    
}
