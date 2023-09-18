public class Main {
    public static void main(String[] args) {
        int cardBalance = 5000;
        double initialInterest = 0.17;
        double firstInterest = cardBalance * initialInterest;
        double secondInterest = firstInterest * initialInterest + firstInterest;
        System.out.println("Your first monthly interest due is: " + Math.round(firstInterest) + ", and your second interest due is: " + Math.round(secondInterest));
    }
}