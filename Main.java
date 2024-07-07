import Mypackage.*;
import java.util.Scanner;

 class Info{

   String name = new String();
   int age;
   String Gender = new String();
   String id =new String();
   String idno =new String();
   String vaccine =new String(); 
   String address =new String();
   int doseNo;

}
 class Detail extends Info {
   Scanner ip = new Scanner(System.in);
   Detail(){}
  void setInfo(String sId,String sVc,String sAdd)
   {
       id=sId;
       vaccine= sVc;
       address=sAdd;
   }
    void GetInfo()
    {
      
       System.out.print("Enter Name :");
         name = ip.nextLine();
      System.out.print("Enter Age :");
       age = ip.nextInt();
       ip.nextLine();
       System.out.print("Enter Gender :");
      Gender=ip.nextLine();
      System.out.print("Enter Dose no :");
      doseNo = ip.nextInt();
    }
    void DisplayCertificate()
    {
      System.out.println("\n    ================================================================================================================================================\n");
   System.out.println("                                                         Certificate for COVID-19 Vaccination");
   System.out.println("\n    ===================================================================================================================================================\n");
    System.out.println("\t\tBeneficiary Details ");
    //System.out.println("____________________________________________________________________________________________________________________________________________________");
   System.out.println();
    System.out.println("\t\tBeneficiary Name \t\t\t"+name);
    System.out.println("\t\tAge \t\t\t\t\t"+age);
    System.out.println("\t\tGender \t\t\t\t\t"+Gender);
    System.out.println("\t\tID Verified \t\t\t\t"+id);
    System.out.println();
    System.out.println("\t\tVaccination Details");
  //  System.out.println("_____________________________________________________________________________________________________________________________________________________");
   System.out.println();
    System.out.println("\t\tVaccine Name \t\t\t\t"+vaccine);
    System.out.println("\t\tDose Number\t\t\t\t"+doseNo+"/2");
    System.out.println("\t\tVaccination at \t\t\t"+address);
    System.out.println("\n    ===================================================================================================================================================\n");

    }
}
public class Main {
 public static void main(String[] args) {
  
   Scanner sc= new Scanner(System.in);
   
   Otp objofOtp = new Otp();
   Detail objOfDetail = new Detail();
   ProofId objProofId = new ProofId();
   String proofid = new String();
   String vac = new String();
   String add= new String();
   Vaccine objofVaccine = new Vaccine();
   Address objofAddress = new Address();


   System.out.println("\n    ==================================================================================================================================\n");
   System.out.println("                                                         WELCOME TO COVID VACCINATION SYSTEM");
   System.out.println("\n    ==================================================================================================================================\n");
   
   label: while (true) {
      System.out.println("\n");
   System.out.println("Choose Option :- \n1.Register\n2.For Exit");
            System.out.print("Enter Your Choice :- ");
           int n=sc.nextInt();
        if(n==1)
        {
            if(objofOtp.otpreturn())
            {
               System.out.println("\n");
               objOfDetail.GetInfo();
             
               System.out.println("\n");
               proofid =objProofId.all_Proof();
            
               System.out.println("\n");
             vac = objofVaccine.all_vaccine();
          
             System.out.println("\n");
             add = objofAddress.print_all();
           
             System.out.println("\n");
            
             System.out.println("Select one :\n1.View certificate\n2.exit\n");
             int c = sc.nextInt();
               
             if(c==1)
               {
                  objOfDetail.setInfo(proofid, vac, add);
                  objOfDetail.DisplayCertificate();
               }
              
             else continue label;
            }
            
        }
        else break label;
   }
 }
}