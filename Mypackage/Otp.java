package Mypackage;
import java.util.Random;
import java.util.Scanner;
public class Otp{
    int x, num;
    String mNo= new String();
    boolean t=false;
    Scanner s= new Scanner(System.in);
    Random rnd = new Random();
    public boolean otpreturn(){
       
       
       
        while(true){
            System.out.print("Enter Your Phone Number :- ");
            mNo=s.next();
            if(mNo.length()!=10){
                System.out.println("\t\"Enter 10 Digits Phone Number!..\"");
            }
            else break;
        }
        x = rnd.nextInt(999999);
        System.out.println("OTP IS : " + String.format("%06d", x)); 
        System.out.print("Enter OTP : ");
        num=s.nextInt();
        if(x == num)
        {
            System.out.println("\n\t\tvalid OTP");
            t=true;                
        }
        else
        {
            System.out.println("\n\t\tInvalid OTP\n");
            otpreturn();
        }
        // s.close();
        return t; 
    }
}