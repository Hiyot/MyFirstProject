public class CoinFactory {
    public Coin getCoin(String coinType) {
        if (coinType == null) {
            return null;
        }
        if (coinType.equalsIgnoreCase("USD")) {
            return new USD();
        }
        if (coinType.equalsIgnoreCase("ILS")) {
            return new ILS();
        }

        return null;
    }

    ILS ils = new ILS();
    USD usd = new USD();
}
