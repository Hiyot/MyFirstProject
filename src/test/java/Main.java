import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to currncy convert");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose an option 1/2: ");
        System.out.println("1.Dollar to Shekel");
        System.out.println("2.Shekel to Dollar");

        int num = scan.nextInt();
        System.out.println(num);


        Coins us = Coins.USD
        if (us == Coins.USD){
            System.out.println("Dollar selected");
        }
        Coins il = Coins.ILS;
        if (il == Coins.ILS){
            System.out.println("Shekel selected");
        }


    }




}
