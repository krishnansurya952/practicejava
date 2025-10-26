package Mock;
import java.util.*;


class Node{
    Node left;
    int data;
    Node right;
}

public class task3 {

    
    static Scanner s=new Scanner(System.in);
    public static Node create(int data){
        Node n=new Node();
        n.data=data;
        return n;
    }
    public static Node insert(Node root,int ele){
        if(root==null){
            return create(ele);
        }
        if(ele>root.data){
            root.right=insert(root.right,ele);
        }else{
            root.left=insert(root.left,ele);
        }
        return root;
    }
    public static void inOrder(Node root){
//        System.out.println("\n\t\tInOrder");
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String args[]){
        System.out.print("\n\t\tEnter the data: ");
        int data=s.nextInt();
        Node root=create(data);

        while(true){
            System.out.print("\n\t\tto create a another Node:\n1.Yes\n2.No ");
                int ch=s.nextInt();
                if(ch==1){
                    System.out.println("Enter the data: ");
                    int ele=s.nextInt();

                    insert(root,ele);
                }else{
                    break;
                }
            }
            System.out.println("\n\t\tInOrder: ");
            inOrder(root);
        }
    
    

}
