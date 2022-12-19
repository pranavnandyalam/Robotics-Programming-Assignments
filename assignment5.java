import java.util.Scanner;

public class assignment5 {
    public static void main(String args []) {
        int Amount, amount, amount2, originalAmount, newAmount, quarters, dimes, nickels, pennies;


        System.out.println("How much does your purchase cost: ¢");
        Scanner amnt = new Scanner(System.in);
            amount = amnt.nextInt();
        
        System.out.println("How much money are you giving in cents: ¢");
        Scanner amnt2 = new Scanner(System.in);
            amount2 = amnt2.nextInt();

        Amount = amount2-amount;    
        newAmount = amount2-amount;
        originalAmount = newAmount;
        quarters = newAmount / 25;
        newAmount = newAmount % 25;
        dimes = newAmount / 10;
        newAmount = newAmount % 10;
        nickels = newAmount / 5;
        newAmount = newAmount % 5;
        pennies = newAmount;

        if (Amount<0) {
            System.out.println("This is not enough money.");
        }
        else if(Amount==0) {
            System.out.println("No change");
        }
        else {
            System.out.println(originalAmount + " cents in coins can be given as:");
            System.out.println(quarters + " quarters");
            System.out.println(dimes + " dimes");
            System.out.println(nickels + " nickels and");
            System.out.println(pennies + " pennies");

        }
        
    }
}
