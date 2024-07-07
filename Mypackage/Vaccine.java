package Mypackage;
import java.util.Scanner;
public class Vaccine {

    String []type = new String[7];
   public Vaccine()
    {
        type[0]="Covishield";
        type[1]="Covaxin";
        type[2]="Sputnik V";
        type[3]="ZyCoV-D";
        type[4]="Corbevax";
        type[5]="Covovax";
        type[6]="Gemcovac";
    }
    Scanner ip = new Scanner(System.in);
    public String all_vaccine() {
        
        int add;
        do {

            System.out.println("Select Vaccine : ");
            int i;
            for (i = 0; i < 7; i++) {
                System.out.println("enter " + (i + 1) + " " + type[i]);
            }
            System.out.print("Enter your choise :");
            add = ip.nextInt();  
        } while (add > 7);
        //ip.close();
        return type[add-1];
    }

}