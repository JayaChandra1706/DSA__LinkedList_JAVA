import java.util.Scanner;
public class LinkedList {
	class Node{
        int data;
        Node link;
        Node(int data,Node link ){
            this.data=data;
            this.link=link;
        }
    }
 private Scanner scan=new Scanner(System.in);
 private Node first=null;
 public void insertfront(){
     System.out.print("Enter Element to Insert:");
     int ele=scan.nextInt();
     Node newnode=new Node(ele,null);
     System.out.println();
     if( first==null){
        first=newnode;
     }else{
        newnode.link=first;
        first=newnode;
     }
 }
 public void insertatn(){
    Node temp=first;
    System.out.print("Enter position to Insert:");
    int pos=scan.nextInt();
    System.out.println();
    System.out.print("Enter Element to Insert at "+pos+" :");
    int ele=scan.nextInt();
    Node newnode=new Node(ele, null);
    for(int i=1;i<=pos-2;i++){
          temp=temp.link;
    }
    newnode.link=temp.link;
    temp.link=newnode;
    System.out.println("Insertion of "+ele+" is Successful at "+pos);
 }
 public void insertrear(){
    Node temp;
    System.out.print("Enter the Element to Insert");
    int ele=scan.nextInt();
    System.out.println();
    Node newnode=new Node(ele, null);
    System.out.println();
    if(first==null){
        first=newnode;
    }else{
        temp=first;
        while(temp.link !=null){
            temp=temp.link;
        }
        temp.link=newnode;
    }
 }
 public void deletefront(){
   
    if(first==null){
        System.out.println("Deletion is not possible because LinkedList is Empty");
    }else if(first.link==null){
        System.out.println("Deleted Element is "+first.data);
        first=null;
    }else{
        System.out.println("Deleted Element is "+first.data);
        first=first.link;
    }
 }
 public void deleteatn(){
    Node temp;
    if(first==null){
        System.out.println("Deletion is not possible because there is No Elements to Delete");
    }else if(first.link==null){
        System.out.println("Deleted Element is "+first.data);
        first=null;
    }else{
        temp=first; 
        System.out.print("Enetr the Possition to Delete the Element:");
        int pos=scan.nextInt();
        for(int i=1;i<=pos-2;i++){
            temp=temp.link;
        }
        System.out.println("Deleted Element is "+temp.link.data);
        temp.link=temp.link.link;
        temp.link.link=null;
    }
 }
 public void deleterear(){
    Node temp;
    if(first==null){
        System.out.println("Deletion is not possible because LinkedList is Empty");
    }else if(first.link==null){
        System.out.println("Deleted Element is "+first.data);
        first=null;
    }else{
        temp=first;
        while(temp.link.link != null){
            temp=temp.link;
        }
        System.out.println("Deleted Element is "+temp.link.data);
        temp.link=null;
    }
 }
 public void replaceData(){
    Node temp;
    if(first==null){
        System.out.print("There is No Elements to Relace Data");
    }else if(first.link==null){
        System.out.print("Enter Element to Relace:");
        int ele=scan.nextInt();
        System.out.println();
        System.out.println(first.data +" is Replaced by "+ele);
        first.data=ele;
    }else{
        temp=first;
        System.out.print("Enter Postion which you want to Replace the Data:");
        int pos=scan.nextInt();
        System.out.println();
        System.out.print("Enter the Element to Replace at "+pos+" :");
        int ele=scan.nextInt();
        System.out.println();
        for(int i=1;i<=pos-1;i++){
            temp=temp.link;
        }
        System.out.println(temp.data+" is Successfully Replaced by "+ele);
        temp.data=ele;
    }    
 }
 public void display(){
    Node temp;
    if(first==null){
        System.out.println("There is No Elements to Display");
    }else if(first.link==null){
        System.out.print(first.data);
        System.out.println();
    }else{
        temp=first;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.link;
        }
        System.out.println();
    }
 }
}
