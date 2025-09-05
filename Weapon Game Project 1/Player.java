public class Player {
    public static void main(String[] args) {
        WeaponGame g=new WeaponGame();
        // Runtime Polymorphism
        // System.out.println("You Got: "+ g.selectWeapon());
        Weapon w=g.selectWeapon();
        System.out.println("==========================");
        w.use();
    }
}
