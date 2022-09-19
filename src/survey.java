
import java.sql.SQLOutput;
import java.util.Scanner;

public class survey{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome. Thank you for taking the survey");
        int counter = 0;
        counter++;
        System.out.println("What is your name?");
        String name = scan.nextLine();
        counter++;
        System.out.println("How much do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;
        System.out.println("How much do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;
        System.out.println("How much food do you want?");
        int foodAmount = scan.nextInt();
        counter++;
        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;
        System.out.println("Thank you " + name + " for answering all " + counter + " questions");
        System.out.println("Your fast food expenses are " + (foodPrice*foodAmount));
        System.out.println("Your coffee expenses are " + (coffeeAmount*coffeePrice));
    }
}