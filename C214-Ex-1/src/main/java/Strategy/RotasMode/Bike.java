package Strategy.RotasMode;

import Strategy.RouterStrategy;
import java.text.DecimalFormat;

public class Bike implements RouterStrategy {

    @Override
    public String decideRota(String decide) {
            double vel = 15;
            double dist = 100;
            double tempo = (dist/ vel);

            return String.valueOf(tempo);
    }
}
