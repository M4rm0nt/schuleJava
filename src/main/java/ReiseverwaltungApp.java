import java.util.Date;

public class ReiseverwaltungApp {

    public static void main(String[] args) {
        Date reiseDatum = new Date();
        PremiumReise premiumReise = new PremiumReise(reiseDatum, 1000.0);

        premiumReise.setStornoAlgorithmus(new KulanterStornoAlgorithmus());
        double stornogebuehr = premiumReise.executeStornoBerechnen();
        System.out.println("Die Stornogebühr für die PremiumReise beträgt: " + stornogebuehr);
    }
}
