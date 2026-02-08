import java.util.Scanner;
public class LaboratoryTest{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        while(true){
             System.out.println("=========Laboratory Diagnostic==========");
             System.out.println("1.Add Patient");
             System.out.println("2.Check Patients ");
             System.out.println("3.CLINICAL CHEMISTRY TEST");
             System.out.println("4.Exit");
             System.out.print("Enter your choice (1-4): ");
             int choice = input.nextInt();

             if (choice == 1){
                System.out.println("======Add Patient Menu=====");
                System.out.print("Input name: ");
                String name = input.nextLine();
                System.out.print("Input Sex: ");
                int sex = input.nextInt();

             }else if(choice == 2){
                System.out.println("=======Patient List Menu=======");
                System.out.println("1.Male");
                System.out.println("2.Female");
                System.out.println("3.All");
                System.out.println("4.Exit");
                System.out.print("Enter your choice(1-4)");
                int choice1 = input.nextInt();
             }else if(choice == 3){
                System.out.println("========CLINICAL CHEMISTRY TEST========");
                //Not yet sure change for later
                System.out.println("1.Fasting Blood Sugar (FBS)");
                System.out.println("2.Random Blood Sugar (RBS)");
                System.out.println("3.Total Cholesterol");
                System.out.println("4.HDL");
                System.out.println("5.LDL");
                System.out.println("6.Triglycerides");
                System.out.println("7.Creatinine");
                System.out.println("8.Uric Acid");
                System.out.println("9.Blood Urea Nitrogen (BUN)");
                System.out.println("10.AST / SGOT");
                System.out.println("11.ALT / SGPT");
                System.out.println("12.Sodium");
                System.out.println("13.Potassium");
                System.out.println("14.Chloride");
                System.out.println("15.Total Calcium");
                System.out.println("16.Ionized Calcium");
                System.out.println("17.Exit");
                System.out.print("Enter your choice(1-17):  ");
                int choice2 = input.nextInt();

             }else if(choice == 4){
                System.out.println("Exiting the Laboratory.....");
                break;
             }else
                System.out.println("Invalid Choice");


                 input.close();
            }


    }
}
