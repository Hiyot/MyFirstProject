public class Main {
    public static void main(String[] args) {

        USD first = new USD();
        System.out.println(first.getValue());

        ILS second = new ILS();
        System.out.println(second.getValue());


        CoinFactory coinFactory = new CoinFactory();
        Coin myUsd = new USD();
        Coin myIls = new ILS();
    }




}
