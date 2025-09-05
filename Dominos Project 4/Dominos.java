import java.util.Scanner;

public class Dominos {
    Dominos(){
        System.out.println("============ Give the Order =========================");
    }
    public food orderfood(){
        System.out.print(" Press 1=> Pizza /n 2=> Dessert /n 3=> Burger : ");
        Scanner sc=new Scanner(System.in);
        int choice1=sc.nextInt();
        switch (choice1) {
            case 1: System.out.println("1=> Italian 400/Rs 2=> Farmhouse 500/Rs 3=> Paneer 300/Rs");
                    int choice2=sc.nextInt();
                    switch (choice2) {
                        case 1: System.out.print("Enter Numbers of Italian Pizza: ");
                                int noOfPizza1=sc.nextInt();
                                int Total11=400*noOfPizza1;
                                System.out.println("Total amount of your Order is "+ Total11+" Rs.");
                                System.out.print("Enter the money: ");
                                int money11=sc.nextInt();
                                if(money11 == Total11){
                                    System.out.println("U can collect "+noOfPizza1+" Italian Pizza from Counter.");
                                    return new pizza();
                                }
                                else if(money11>Total11){
                                    System.out.println("U can collect "+noOfPizza1+" Italian Pizza and the remainng amount "+(money11-Total11)+" Rs from Counter");
                                    return new pizza();
                                }
                                else{
                                    System.out.println("Insuffient Amount entered ....!");
                                    return orderfood();
                                }
                        
                        case 2: System.out.print("Enter Numbers of FarmhousePizza: ");
                                int noOfPizza2=sc.nextInt();
                                int Total12=500*noOfPizza2;
                                System.out.println("Total amount of your Order is "+ Total12+" Rs.");
                                System.out.print("Enter the money: ");
                                int money12=sc.nextInt();
                                if(money12 == Total12){
                                    System.out.println("U can collect "+noOfPizza2+" Farmhouse Pizza from Counter.");
                                    return new pizza();
                                }
                                else if(money12>Total12){
                                    System.out.println("U can collect "+noOfPizza2+" Farmhouse Pizza and the remainng amount "+(money12-Total12)+" Rs from Counter");
                                    return new pizza();
                                }
                                else{
                                    System.out.println("Insuffient Amount entered ....!");
                                    return orderfood();
                                }  
                        case 3: System.out.print("Enter Numbers of Paneer Pizza: ");
                                int noOfPizza3=sc.nextInt();
                                int Total13=300*noOfPizza3;
                                System.out.println("Total amount of your Order is "+ Total13+" Rs.");
                                System.out.print("Enter the money: ");
                                int money13=sc.nextInt();
                                if(money13 == Total13){
                                    System.out.println("U can collect "+noOfPizza3+" Paneer Pizza from Counter.");
                                    return new pizza();
                                }
                                else if(money13>Total13){
                                    System.out.println("U can collect "+noOfPizza3+" Paneer Pizza and the remainng amount "+(money13-Total13)+" Rs from Counter");
                                    return new pizza();
                                }
                                else{
                                    System.out.println("Insuffient Amount entered ....!");
                                    return orderfood();
                                }       
                    
                        default:
                                System.out.println("Incorrect Choice...!");
                                return orderfood();
                    }
        

            case 2: System.out.println(" 1=> Ice-cream 70/Rs 2=> Cold Drink 50/Rs 3=> ChocoLava Cake 100/Rs");
                    int choice3=sc.nextInt();
                    switch (choice3) {
                        case 1: System.out.print("Enter Numbers of Ice Cream: ");
                                int noOfIcecream=sc.nextInt();
                                int Total21=70*noOfIcecream;
                                System.out.println("Total amount of your Order is "+ Total21+" Rs.");
                                System.out.print("Enter the money: ");
                                int money21=sc.nextInt();
                                if(money21 == Total21){
                                    System.out.println("U can collect "+noOfIcecream+" Ice-cream from Counter.");
                                    return new dessert();
                                }
                                else if(money21>Total21){
                                    System.out.println("U can collect "+noOfIcecream+" Ice-cream and the remainng amount "+(money21-Total21)+" Rs from Counter");
                                    return new dessert();
                                }
                                else{
                                    System.out.println("Insuffient Amount entered ....!");
                                    return orderfood();
                                }
                        
                        case 2: System.out.print("Enter Numbers of Cold Drink: ");
                                int noOfColddrink=sc.nextInt();
                                int Total22=50*noOfColddrink;
                                System.out.println("Total amount of your Order is "+ Total22+" Rs.");
                                System.out.print("Enter the money : ");
                                int money22=sc.nextInt();
                                if(money22 == Total22){
                                    System.out.println("U can collect "+noOfColddrink+" Cold Drink from Counter.");
                                    return new dessert();
                                }
                                else if(money22>Total22){
                                    System.out.println("U can collect "+noOfColddrink+" Cold Drink and the remainng amount "+(money22-Total22)+" Rs from Counter");
                                    return new dessert();
                                }
                                else{
                                    System.out.println("Insuffient Amount entered ....!");
                                    return orderfood();
                                }  
                        case 3: System.out.print("Enter Numbers of Cake : ");
                                int noOfCake=sc.nextInt();
                                int Total23=100*noOfCake;
                                System.out.println("Total amount of your Order is "+ Total23+" Rs.");
                                System.out.print("Enter the money : ");
                                int money23=sc.nextInt();
                                if(money23 == Total23){
                                    System.out.println("U can collect "+noOfCake+" Cake from Counter.");
                                    return new dessert();
                                }
                                else if(money23>Total23){
                                    System.out.println("U can collect "+noOfCake+" Cake and the remainng amount "+(money23-Total23)+" Rs from Counter");
                                    return new dessert();
                                }
                                else{
                                    System.out.println("Insuffient Amount entered ....!");
                                    return orderfood();
                                }       
                    
                        default:
                                System.out.println("Incorrect Choice...!");
                                return orderfood();
                    } 
                    
                    
            
            case 3: System.out.println("1=> Veg-Burger 75/Rs 2=> Classic-Paneer Burger 125/Rs 3=> Pizza-Buger 150/Rs");
                    int choice4=sc.nextInt();
                    switch (choice4) {
                        case 1: System.out.print("Enter Numbers of Veg- Buger: ");
                                int noOfVegBurger=sc.nextInt();
                                int Total31=75*noOfVegBurger;
                                System.out.println("Total amount of your Order is "+ Total31+" Rs.");
                                System.out.print("Enter the money: ");
                                int money31=sc.nextInt();
                                if(money31 == Total31){
                                    System.out.println("U can collect "+noOfVegBurger+" Veg-Burger from Counter.");
                                    return new burger();
                                }
                                else if(money31>Total31){
                                    System.out.println("U can collect "+noOfVegBurger+" Veg-Burger and the remainng amount "+(money31-Total31)+" Rs from Counter");
                                    return new burger();
                                }
                                else{
                                    System.out.println("Insuffient Amount entered ....!");
                                    return orderfood();
                                }
                        
                        case 2: System.out.print("Enter Numbers of Classic-Paneer Burger: ");
                                int noOfPaneerBurger=sc.nextInt();
                                int Total32=125*noOfPaneerBurger;
                                System.out.println("Total amount of your Order is "+ Total32+" Rs.");
                                System.out.print("Enter the money: ");
                                int money32=sc.nextInt();
                                if(money32 == Total32){
                                    System.out.println("U can collect "+noOfPaneerBurger+" Classic-Paneer Burger from Counter.");
                                    return new burger();
                                }
                                else if(money32>Total32){
                                    System.out.println("U can collect "+noOfPaneerBurger+" Classic-Paneer Burger and the remainng amount "+(money32-Total32)+" Rs from Counter");
                                    return new burger();
                                }
                                else{
                                    System.out.println("Insuffient Amount entered ....!");
                                    return orderfood();
                                }  
                        case 3: System.out.print("Enter Numbers of Pizza-Burger: ");
                                int noOfPizzaBurger=sc.nextInt();
                                int Total33=150*noOfPizzaBurger;
                                System.out.println("Total amount of your Order is "+ Total33+" Rs.");
                                System.out.print("Enter the money: ");
                                int money33=sc.nextInt();
                                if(money33 == Total33){
                                    System.out.println("U can collect "+noOfPizzaBurger+" Pizza-Burger from Counter.");
                                    return new burger();
                                }
                                else if(money33>Total33){
                                    System.out.println("U can collect "+noOfPizzaBurger+" Pizza-Burger and the remainng amount "+(money33-Total33)+" Rs from Counter");
                                    return new burger();
                                }
                                else{
                                    System.out.println("Insuffient Amount entered ....!");
                                    return orderfood();
                                }       
                    
                        default:
                                System.out.println("Incorrect Choice...!");
                                return orderfood();
                    }  
            
            default:
                    System.out.println("Incorrect Choice...!");
                    return orderfood();
        }
    }
}
