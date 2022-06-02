package Strategy.RotasMode;

import Strategy.RouterStrategy;

public class Uber implements RouterStrategy{

    @Override
    public String decideRota(String decide) {
        double vel = 80;
        double dist = 100;
        double tempo = dist/ vel;
        return String.valueOf(tempo);
    }
}
