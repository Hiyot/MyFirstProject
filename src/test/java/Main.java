import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to currncy convert");

        int num = 0;
        try {
            Scanner scan = new Scanner(System.in);
            num = scan.nextInt();
            System.out.println("Please choose an option (1/2):");
            System.out.println("1.Dollar to Shekel");
            System.out.println("2.Shekel to Dollar");


            System.out.println(num);
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e){
            System.out.println("invalid choise please print again");
        }

        Coins coins = Coins.values()[num - 1];
        System.out.println(coins);
        if (coins == Coins.USD){

        }
        else if (coins == Coins.ILS){

        }



    }




}
