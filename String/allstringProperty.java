import java.util.*;


//String property


public class allstringProperty {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        //!charAt()
        String s="Qspiders";
        System.out.println(s.charAt(7));
        System.out.println(s.charAt(3));

        //! trim() 
        // it will remove whitespace
        String s1="    Jspider Vadapalani       ";
        System.out.println(s1.trim());

        //!concat()
        // it will join two string together
        String s2="hello Surya";
        String s3=" Hi Arun";

        System.out.println(s2.concat(s3));

        //!contains()
        //it is used to check if a sequence of characters is present inside  a given string or not.
        String s4="hello";
        System.out.println(s4.contains("he"));
        System.out.println(s4.contains("ll"));
        System.out.println(s4.contains("hl"));

        //! equals()   --->   compare the string 
        String a1="surya";
        String a2="surya";
        System.out.println(a1.equals(a2));


        // ! equalsIgnoreCase()     ---> is use to compare the string  and passed String by ingnoring the case.
        System.out.println("equalsIgnoreCase:"+a1.equalsIgnoreCase("surya"));



        

        //? tocharArray() -->char[] -->converts String to char[]

        String s11="Java";
        String s12="javaScript";
        char []a20=s11.toCharArray();
        char []a21=s12.toCharArray();
        System.out.println(Arrays.toString(a20));
        System.out.println(Arrays.toString(a21));

        //? Integer.parseInt(String) --> int -->converts string into int

        String b1="10";
        String b2="20";
        int res1=Integer.parseInt(b1);
        int res2=Integer.parseInt(b2);
        System.out.println(res1+res2);

        //? split()

        String c1="I Love Biryani";
        // String c2="I Hate Biryani";
        String ans="";
        String ssp[]=c1.split(" ");
        System.out.println(c1);
        System.out.println(Arrays.toString(ssp));
        for(int i=0;i<ssp.length;i++){
            if(ssp[i].equals("Love")){// insteady of this we can use contains()
                ans=ans+"hate ";
            }else {
                ans=ans+ssp[i]+" ";
            }
        }

        System.out.println(ans);






    }
    
}
