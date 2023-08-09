import java.util.Scanner;
public class LinkedListApp {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        LinkedList ll=new LinkedList();
          while(true){
              System.out.println("Enter 1 to Insert at FRONT");
              System.out.println("Enter 2 to Insert at CERTAIN POSITION");
              System.out.println("Enter 3 to Insert at REAR");
              System.out.println("Enter 4 to Delete at FRONT");
              System.out.println("Enetr 5 to Delete at CERTAIN POSITION");
              System.out.println("Enetr 6 to Delete at REAR");
              System.out.println("Enter 7 to Replace the DATA");
              System.out.println("Enter 8 to Display Elements");
              System.out.println("Enetr another any number to Exit");
              System.out.print("Enetr your choice:");
              int choice=scan.nextInt();
              System.out.println();
              switch(choice){
                  case 1:
                     ll.insertfront();
                     break;
                  case 2:
                     ll.insertatn();
                     break;   
                  case 3:
                     ll.insertrear();
                     break;
                  case 4:
                     ll.deletefront();
                     break;
                  case 5:
                     ll.deleteatn();
                     break;
                  case 6:
                     ll.deleterear();
                     break;
                  case 7:
                     ll.replaceData();
                     break;
                  case 8:
                     ll.display();
                     break;
                  default:
                     System.exit(0);               
              }
          }
     }
}
