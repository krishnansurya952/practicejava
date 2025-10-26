class student1{
    int id;
    String name;
    
    public student1(int id,String name){
        super();
        this.id=id;
        this.name=name;
    }
    
    public String toString(){
        return "Id: "+id+",Name:"+name;
    }
}
    public class string_to{
        public static void main(String args[]){
            student1 s1=new student1(1,"Dinga");
            student1 s2=new student1(2,"manga");
            System.out.println(s1);
            System.out.println(s2);


    }
}
