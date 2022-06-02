package Strategy;

import Strategy.RotasMode.Bike;

public class WalkingStrategy extends Navigator {
    public WalkingStrategy() {
        rota = new Bike();
    }
}
