import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to currncy convert");
        System.out.println("Please choose an option (1/2):");

        int num = 0;
        try {
            Scanner scan = new Scanner(System.in);
            num = scan.nextInt();
            System.out.println("1.Dollar to Shekel");
            System.out.println("2.Shekel to Dollar");


            System.out.println(num);
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e){
            System.out.println("invalid choise please print again");
        }finally {
        }

        while (num != 2 && num != 1){
            System.out.println("invalid Choice, please try again");
            Scanner scan2 = new Scanner(System.in);
            num = scan2.nextInt();
        }

        Coins coins = Coins.values()[num - 1];
        System.out.println(coins);
        if (coins == Coins.USD){

        }
        else if (coins == Coins.ILS){

        }

        System.out.println("please enter an amount to convert");

        double number = 0;

       try{ Scanner scan3 = new Scanner(System.in);
        number = scan3.nextDouble();}
       catch (ArrayIndexOutOfBoundsException | InputMismatchException e){
        }finally {
       }


       double[] myList={0.28, 3.52};

       for (double i = 0; i <myList.length; i++){
           if (i!=0.28 && i!=3.52);
           System.out.println();
       }

    }




}
