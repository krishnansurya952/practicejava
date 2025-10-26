class Employee{
    int eid;
    String ename;
    double sal;

    public Employee(int eid,String ename,double sal){
        super();
        this.eid=eid;
        this.ename=ename;
        this.sal=sal;
    }
    // @Override
    public int hashCode(){
        return eid+ename.hashCode()+(int)sal;
    }
}






public class code_hash {
    public static void main(String args[]){
        Employee e1=new Employee(1,"Mahesh",50000);
        Employee e2=new Employee(2,"ramesh",10000);
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
    }
    

