public class Receipt {
    public static void main(String[] args) {
        String name = "Stacy";
        int numApples = 12;
        int numPineapples = 2;
        int numBagRice = 2;
        int moneyAvailable = 40;

        double applePrice = 0.60;
        double pineapplePrice = 3.59;
        double poundRicePrice = 1.39 * 4.40925; // 2kg = 4.40925 lbs

        final double finalPrice = (numApples * applePrice) + (numPineapples * pineapplePrice) + (numBagRice * poundRicePrice);

        System.out.println("Customer Name:" + name);
        System.out.println("^^^^^^^^");
        System.out.println(numApples + " apples for $" + applePrice);
        System.out.println(numPineapples + " pineapples for $" + pineapplePrice);
        System.out.println(numBagRice + " bags of rice for $" + poundRicePrice + " a pound");
        System.out.println("Purchased: " + (numApples + numPineapples + numBagRice) + " for $" + finalPrice);
        System.out.println("^^^^^^^^");
        System.out.println("Cash given: $" + moneyAvailable);
        System.out.println("^^^^^^^^");
        System.out.println("Total Change: $" + (moneyAvailable - finalPrice));
        System.out.println("^^^^^^^^");
        System.out.println("Thank you for your continued patronage!");
    }
}
