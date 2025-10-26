//! Method Overloading

//A class having more than one method with the same name but different formal arguments then it is known as Method Overloading.










package polymorphism;





//! 1. By changing the number of formal argument.
class Calci
{
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);

    }

}

//! 2. By changing the order of formal argument.

class Demo{
    public static void display(int a,boolean b){
        System.out.print("hello ");
    }
    public static void display(boolean a,int b){
        System.out.println("Thank you");
    }
}

//! 3. By changing the datatype of global argument
    class Movie{
        public static void print(int a,int b){
            System.out.println("KGF");
        }
        public static void print(String a,String b){
            System.out.println("LEO");
        }

    }





    //! Example
    class Insta{
        public static void login(String name,String pwd){
            System.out.println("Login Successfully 1");
        }
        public static void login(long Phno,int otp){
            System.out.println("login Successfully 2");
        }
        public static void login(String email, int pwd){
            System.out.println("Login Successfully 3");
        }
    }

public class methodOverloading {
    public static void main(String args[]){

        // Calci.add(10,20,30);
        // Calci.add(10,20);
        // Calci.add(10,20,30,40);//C.T.E

        // Demo.display(10,false);
        // Demo.display(false,20);

        // Movie.print("vijay","Trisha");
        // Movie.print(10,20);

        Insta.login("surya",1234);
        Insta.login("surya","surya");
        Insta.login(9344227220L,054621);

        //!method overloading in applicable for both static and non static method.



    }
    
}
