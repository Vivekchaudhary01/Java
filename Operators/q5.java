// For the given CP and SP. Calculate %Profit.
// CP=120;
// SP=160;

public class q5 {
    public static void main(String[] args) {
        int CP = 120;
        int SP = 160;

        System.out.println("CP: " + CP);
        System.out.println("SP: " + SP);
        double profit = SP - CP;
        double profitPercentage = (profit / CP) * 100;
        System.out.println("Profit Percentage: " + profitPercentage + "%");
        System.out.println("---------------------------------");

    }
}
