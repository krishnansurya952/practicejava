class student{
    String sname;
    double marks;
    public student(String sname,double marks){
        super();
        this.sname=sname;
        this.marks=marks;
    }
    public boolean equals(Object o){
        student s=(student)o;
        if(this.sname.equals(s.sname) && this.marks==s.marks){
            return true;
        }else{
            return false;
        }
    }

}

public class equal_to {
    public static void main(String args[]){
        student s1=new student("surya",63);
        student s2=new student("surya",63);

        
        System.out.println(s1.equals(s2));


    }
    
}
