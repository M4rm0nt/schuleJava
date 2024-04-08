public class KulanterStornoAlgorithmus implements StornoAlgorithmus {
    @Override
    public double stornoBerechnen(Reise reise) {
        if (reise instanceof StandardReise) {
            return reise.grundPreis * 0.25;
        } else if (reise instanceof PremiumReise) {
            return reise.grundPreis * 0.10;
        } else {
            return reise.grundPreis;
        }
    }
}