package Mypackage;
import java.util.Scanner;
public class ProofId {
    String []type = new String[7];
    public ProofId()
     {
         type[0]="Aadhaar Card";
         type[1]="Driving License";
         type[2]="PAN Card";
         type[3]="Passport";
         type[4]="Voter ID";
     }
     Scanner ip = new Scanner(System.in);
     public String all_Proof() {
         
         int add;
         do {
 
             System.out.println("Select Photo id Type : ");
             int i;
             for (i = 0; i < 5; i++) {
                 System.out.println("enter " + (i + 1) + " " + type[i]);
             }
             System.out.print("Enter your choice :");
             add = ip.nextInt(); 
             ip.nextLine(); 
         } while (add > 5);
        String s = new String();
         System.out.println("Enter Photo ID no. :");
         s = ip.nextLine();
         int x =0;
         while (x < s.length()-4) {
            s.replace( s.charAt(x), 'X');
            x++;
         }
        
          return type[add-1]+" # "+s;
     }
     
}