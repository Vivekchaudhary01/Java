//? Project: Grade Calculator
// Description: Create a program that calculates grades for 
// students based on their scores. 
// Features: 
// Input scores for multiple subjects using a loop and provide 
// grades based on percentage. 
// Allow multiple student entries until the user chooses to exit. 
// Grading Example: 
// A: 90% and above 
// B: 89% - 75% 
// C: 74% - 60% 
// D: Below 60% 
// E: below 45% 

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Grade Calculator ....!");
        float marks=0,sum=0;
        int i=0,n;
        char ch;
        do{
            System.out.println("Enter the Number of Subjects: ");
            n=sc.nextInt();
            while(i<n){
                System.out.println("Enter the Marks of "+(i+1)+" Subject.");
                marks=sc.nextInt();
                sum+=marks;
                i++;
            }

            float percentage=sum/n;
            if(percentage>=90)    
                System.out.println("You got Grade A. ");
            else if(percentage<90&&percentage>74)
                    System.out.println("You got Grade B. ");
                else if(percentage<75&&percentage>59)
                        System.out.println("You got Grade C.");
                    else if(percentage<60&&percentage>44)
                            System.out.println("You got Grade D. ");
                        else if(percentage<45)
                                System.out.println("You got Grade E.");
         
            
            System.out.println("Do you want to Calculate Grade of Another Student (y/n)");
            ch=sc.next().charAt(0);    
        }while(ch=='y'|| ch=='Y');
    }    
}
