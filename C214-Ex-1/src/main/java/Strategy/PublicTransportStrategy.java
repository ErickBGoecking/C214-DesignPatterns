package Strategy;

import Strategy.RotasMode.Onibus;

public class PublicTransportStrategy extends Navigator {

    public PublicTransportStrategy() {
        rota = new Onibus();
    }
}
