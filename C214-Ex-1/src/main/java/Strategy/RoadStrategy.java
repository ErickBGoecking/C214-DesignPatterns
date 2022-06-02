package Strategy;

import Strategy.RotasMode.Bike;
import Strategy.RotasMode.Uber;

public class RoadStrategy extends Navigator{
    public RoadStrategy() {
        rota = new Uber();
    }
}

