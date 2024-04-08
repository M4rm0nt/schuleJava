import java.util.Date;

public abstract class Reise {
    protected double grundPreis;
    protected Date reiseBeginn;
    protected StornoAlgorithmus stornoAlgorithmus;

    public Reise(Date reiseBeginn, double grundPreis) {
        this.reiseBeginn = reiseBeginn;
        this.grundPreis = grundPreis;
    }

    public abstract double preisBerechnen();

    public int tageBestimmen() {
        Date heute = new Date();
        long differenzInMillisekunden = reiseBeginn.getTime() - heute.getTime();
        return (int) (differenzInMillisekunden / (1000 * 60 * 60 * 24));
    }

    public void setStornoAlgorithmus(StornoAlgorithmus alg) {
        this.stornoAlgorithmus = alg;
    }

    public double executeStornoBerechnen() {
        if (this.stornoAlgorithmus == null) {
            throw new IllegalStateException("StornoAlgorithmus ist nicht gesetzt");
        }
        return stornoAlgorithmus.stornoBerechnen(this);
    }
}