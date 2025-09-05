// For the given CP and SP. Calculate %Loss.
// CP=120;
// SP=90;

public class q6 {
    public static void main(String[] args) {
        int CP = 120;
        int SP = 90;

        System.out.println("CP: " + CP);
        System.out.println("SP: " + SP);
        double loss = CP - SP;
        double lossPercentage = (loss / CP) * 100;
        System.out.println("Loss Percentage: " + lossPercentage + "%");
        System.out.println("---------------------------------");
    }
}
