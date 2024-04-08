import java.util.Date;

public class PremiumReise extends Reise {
    public PremiumReise(Date reiseBeginn, double grundPreis) {
        super(reiseBeginn, grundPreis);
    }

    @Override
    public double preisBerechnen() {
        return grundPreis * 1.2;
    }
}