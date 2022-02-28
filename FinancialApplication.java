import java.util.Scanner;
public class FinancialApplication{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    double interestConstant = (1 + 0.00417);
    System.out.print("Enter the monthly saving amount: ");
    double monthlySavings = input.nextDouble();

    double firstMonth = 100.0 * interestConstant;
    double secondMonth = (100.0 + firstMonth) * interestConstant;
    double thirdMonth = (100.0 + secondMonth) * interestConstant;
    double fourthMonth = (100.0 + thirdMonth) * interestConstant;
    double fifthMonth = (100.0 + fourthMonth) * interestConstant;
    double sixthMonth = (100.0 + fifthMonth) * interestConstant;

    System.out.printf("After the sixth month, the account value is:  $%.2f%n",sixthMonth);
    }
}

