public class StrengerStornoAlgorithmus implements StornoAlgorithmus {
    @Override
    public double stornoBerechnen(Reise reise) {
        return reise.grundPreis * 0.50;
    }
}