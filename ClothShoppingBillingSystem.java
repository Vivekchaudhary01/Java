//? Project: Cloth Shopping Billing System
// Description: Design an application to generate shopping bills 
// based on items purchased and provide discount as per below 
// shopping price: 
// Price>=10,000 ➔40% discount 
// 9999₹- 6000₹ ➔30% discount 
// 5999₹- 3000₹ ➔18% discount 
// 2999₹- 1₹    ➔8% discount 
// Features: 
// Display a Console Menu to enter the price of item until user 
// wants to add the item and its price. 
// Use a loop to allow users to add multiple items to the bill. 
// Calculate the total bill and display the total and discounted 
// price when the user exits. 


import java.util.Scanner;

public class ClothShoppingBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Cloth Shopping Billing System!");
        float price,total=0,discount=0,itemcount=0;
        System.out.println("Please enter the Price of Items one by one: ");
        do{
            price=sc.nextInt();
            total+=price;
            itemcount++;
        }while(price>0);
        
        if(total>=10000)    
            discount+=0.4;
        if(total>5999&&total<10000)
            discount+=0.3;
        if(total>2999&&total<6000)
            discount+=0.18;
        if(total>0&&total<3000)
            discount+=0.08;
        System.out.println("Your Total Price is : "+total);
        System.out.println("You got Discount of "+ (discount*100)+"%");
        System.out.println("Total Amount after Applying Discount is : " +(total*discount)+" for "+(int)itemcount+" items.");
    }  
}
