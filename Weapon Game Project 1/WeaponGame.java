import java.util.Scanner;
public class WeaponGame {
    WeaponGame(){
        System.out.println("==============Game has Started===========");
    }
    public Weapon selectWeapon(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the score");
        int score=sc.nextInt();
        if(score<=400){
            System.out.println("You got Knife ...!");
            Knife k=new Knife();
            return k; 
        }
        else if(score<=800){
            System.out.println("Press 1 for ==> Knife and 2 for ==> Gun");
            int choice=sc.nextInt();
            switch (choice) {
                case 1: System.out.println("You got Knife ...!");
                        Knife k=new Knife();
                        return k;
                case 2: System.out.println("You got Gun ...!");
                        Gun g=new Gun();
                        return g; 
                default:
                        System.out.println("Invalid Option is Entered");
                        return selectWeapon();
            }
            
        }
        else{
            System.out.println("Press 1 for ==> Knife and 2 for ==> Gun and Press 3 for ==> Bomb");
            int choice=sc.nextInt();
            switch (choice) {
                case 1: System.out.println("You got Knife ...!");
                        Knife k=new Knife();
                        return k;
                case 2: System.out.println("You got Gun ...!");
                        Gun g=new Gun();
                        return g; 
                case 3: System.out.println("You got Bomb ...!");
                        Bomb b=new Bomb();
                        return b;
                default:
                        System.out.println("Invalid Option is Entered");
                        return selectWeapon();
            }   
        }
    }            
}
