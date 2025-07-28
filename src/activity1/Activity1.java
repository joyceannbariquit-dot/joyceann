
package activity1;
import java.util.Scanner;
public class Activity1 {


    public static void main(String[] args) {
       Scanner sc =new Scanner (System. in);
       
       String name;
       int subjects;
  
     
        System.out.println("Enter students name:");
        name = sc.nextLine();
        
        System.out.println("Enter number of subjects:");
        subjects = sc.nextInt();
        
        double total = 0;
        
        
        for (int i = 1; i <= subjects; i++){
        
            System.out.println("Enter grade for sub"+ i +":");
            
          double grade = sc.nextDouble();
          total+=grade;
        }
        double average = total/ subjects;
        
        System.out.printf("Average: %.2f\n",average);
        
        if (average >= 75){
            System.out.println("Remarks: PASSED");
        }else{
            System.out.println("Remarks: FAILED");
        }
        
         
      
      
    }
}
           

        
    
