import java.util.*;
class Nodes{
    int data;
    Nodes address;

}

public class SLL_Insert_Pos{
    static Scanner s=new Scanner(System.in);
    public static void main(String args[]){
        Nodes head=null,tail=null;


        while(true) {
			Nodes n=new Nodes();
			System.out.print("Enter the data: ");
			n.data=s.nextInt();

			if(head==null) {
				head=n;
				tail=n;
			}
			else {
				tail.address=n;
				tail=n;
			}

			System.out.println("\n\t\t To create another node: \n1)Yes\n2)No");
            System.out.print("\nEnter the input: ");
			int ch=s.nextInt();
			if(ch!=1) {
				break;
			}
		}
        System.out.println();
        Nodes temp=head;
        int count=0;
        while(temp!=null){
            count++;
            System.out.print(temp.data+" -> ");
            temp=temp.address;
        }
        System.out.print("null");

        //Insert at pos
        System.out.println("count: "+count);

        System.out.print("\nEnter the position: ");

        int pos=s.nextInt();

        if(pos>=1 && pos<=count+1){
            if(pos==1){
                System.out.println("Insert at beg");
            }
            else if(pos==count+1){
                System.out.println("\n Insert at the end");
            }
            else{
                Nodes n=new Nodes();
                System.out.print("\nEnter the data: ");
                n.data=s.nextInt();

                int i=1;
                temp=head;

                while(i<pos-1){
                    temp=temp.address;
                    i++;
                }
                
                n.address=temp.address;
                temp.address=n;

                System.out.println("After inserting node at pos");
				temp=head;
				while(temp!=null) {
					System.out.print(temp.data+" ");
					temp=temp.address;
				}

            }
        


        }else{
            System.out.println("\t\t.......................Invalid position............................");
        }
    
        }





        


    }
