import java.util.Scanner;

public class VendingMachine{
    VendingMachine(){
        System.out.println("==============Vending Machine has Stated=============");
    }
    public Beverages pressButton(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Choice:/n 1. Coffee ==> 200Rs/Cup /n 2. Juice ==> 100Rs/Cup /3 1. Wine ==> 500Rs/Cup");
        System.out.println("=====================================================");
        int Choice=sc.nextInt();
        switch (Choice) {
            case 1:
                    System.out.println("Enter the number of Cups: ");
                    int noofCups1=sc.nextInt();
                    int Total1=noofCups1*200;
                    System.out.println("Total Cost is: "+Total1+" Rs");
                    System.out.println("Enter the Money");
                    int Money1=sc.nextInt();
                    if (Money1 == Total1) {
                        System.out.println(" You can collect "+noofCups1+" of Coffee from Machine.");
                        Coffee c=new Coffee();
                        return c;
                    }
                    else if(Money1>Total1){
                        int differnce1=Money1-Total1;
                        System.out.println(" You can collect "+noofCups1+" of Coffee from Machine and the Remaining Amount"+differnce1+" Rs");
                        return new Coffee();
                    }
                    else{
                        System.out.println("Insufficient Amount Entered ...");
                        return pressButton();
                    }
            
            case 2:
                    System.out.println("Enter the number of Cups: ");
                    int noofCups2=sc.nextInt();
                    int Total2=noofCups2*100;
                    System.out.println("Total Cost is: "+Total2+" Rs");
                    System.out.println("Enter the Money");
                    int Money2=sc.nextInt();
                    if (Money2 == Total2) {
                        System.out.println(" You can collect "+noofCups2+" of Juice from Machine.");
                        return new Juice();
                    }
                    else if(Money2>Total2){
                        int differnce2=Money2-Total2;
                        System.out.println(" You can collect "+noofCups2+" of Juice from Machine and the Remaining Amount"+differnce2+" Rs");
                        return new Juice();
                    }
                    else{
                        System.out.println("Insufficient Amount Entered ...");
                        return pressButton();
                    }
            
            case 3:
                    System.out.println("Enter the number of Cups: ");
                    int noofCups3=sc.nextInt();
                    int Total3=noofCups3*100;
                    System.out.println("Total Cost is: "+Total3+" Rs");
                    System.out.println("Enter the Money");
                    int Money3=sc.nextInt();
                    if (Money3 == Total3) {
                        System.out.println(" You can collect "+noofCups3+" of Wine from Machine.");
                        return new Wine();
                    }
                    else if(Money3>Total3){
                        int differnce3=Money3-Total3;
                        System.out.println(" You can collect "+noofCups3+" of Wine from Machine and the Remaining Amount"+differnce3+" Rs");
                        return new Wine();
                    }
                    else{
                        System.out.println("Insufficient Amount Entered ...");
                        return pressButton();
                    }    

            default:
                        System.out.println("Incorrect Choice...!");
                        return pressButton();
        }
    }
}
