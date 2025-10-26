// ! Constructor Overloading

// A class having more than one constructor with the smae name but different formal arfuments then it is known as Constructor Overloading




package polymorphism;
class Book{
    int id;
    String title;
    Book(){
        System.err.println("\t\t Book constructor");

    }Book(int id){
        this.id=id;
    }Book(int id , String title){
        this.id=id;
        this.title=title;
    }
}

public class ConstructorOverloading {
    public static void main(String args[]){
        Book b1=new Book(1);
        System.out.println(b1.id+" " +b1.title );

        Book b2=new Book();
        System.out.println(b2.id+" "+b2.title );


        Book b3=new Book(2,"QSP");
        System.out.println(b3.id+" " +b3.title );


        
    }
    
}
