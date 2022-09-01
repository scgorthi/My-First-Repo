
/**
 * Sniya Gorthi
 * 9/1/2022
 * 2.12 program project (chapter 1/2 labs)
 * Determine the monetary value of the coins that the user inputs
 * Who helped me:
 *
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class coins
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // initialize variables
        int quarters;
        int dimes;
        int nickles;
        int pennies;
        double totalquarters;
        double totaldimes;
        double totalnickles;
        double totalpennies;
        double totalmoney;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        //asks user for how many of each type of coin is in the jar
        System.out.println("How many quarters are in the jar?" );
        quarters = input.nextInt();
        
        System.out.println("How many dimes are in the jar?" );
        dimes = input.nextInt();
        
        System.out.println("How many nickles are in the jar?" );
        nickles = input.nextInt();
        
        System.out.println("How many pennies are in the jar?" );
        pennies = input.nextInt();
        
        // calculates the total value of each type of coin in the jar and then adds all four values 
        totalquarters = (0.25) * quarters;
        totaldimes = (0.10) * dimes;
        totalnickles = (0.05) * nickles;
        totalpennies = (0.01) * pennies;
        
        totalmoney = totalquarters + totaldimes + totalnickles + totalpennies;
        
        //print out total money in the jar
        System.out.println("Total money in the jar:"+money.format(totalmoney));
        
         
        
        
        
    }
}
