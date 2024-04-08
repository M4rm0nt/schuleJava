import java.util.Date;

public class StandardReise extends Reise {
    public StandardReise(Date reiseBeginn, double grundPreis) {
        super(reiseBeginn, grundPreis);
        this.setStornoAlgorithmus(new KulanterStornoAlgorithmus());
    }

    @Override
    public double preisBerechnen() {
        return grundPreis;
    }
}