import java.util.Scanner;

public class VehicleGame {
    VehicleGame(){
        System.out.println("==============Game has Started===========");
    }
    public Vehicle selectVehicle(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Score");
        int score=sc.nextInt();
        if (score<=400) {
            System.out.println("You got Car ...!");
            Car c=new Car();
            return c;
        }
        else if (score<=800) {
            System.out.println("Press 1 ==> Car and 2 ==> Bus");
            int choice=sc.nextInt();
            switch (choice) {
                case 1: System.out.println("You got Car ...!");
                        Car c=new Car();
                        return c;

                case 2: System.out.println("You got Bus ...!");
                        Bus b=new Bus();
                        return b;
            
                default:  System.out.println("Invalid Choice ...!"); 
                          return selectVehicle(); 
            }
        }
        else{
            System.out.println("Press 1 ==> Car and 2 ==> Bus and 3 ==> Truck");
            int choice=sc.nextInt();
            switch (choice) {
                case 1: System.out.println("You got Car ...!");
                        Car c=new Car();
                        return c;

                case 2: System.out.println("You got Bus ...!");
                        Bus b=new Bus();
                        return b;
                
                case 3: System.out.println("You got Truck ...!");
                        Truck t=new Truck();
                        return t;
            
                default:  System.out.println("Invalid Choice ...!"); 
                          return selectVehicle(); 
            }
        }
        
    }
}
