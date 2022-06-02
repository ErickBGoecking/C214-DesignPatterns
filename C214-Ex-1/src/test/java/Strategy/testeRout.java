package Strategy;

import Strategy.RotasMode.Onibus;
import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class testeRout {
    Navigator navegar;
    String uber;
    String carro;
    String onibus;

    @Test
    public void testeBike() {
        navegar = new WalkingStrategy();
        String decisao = navegar.decideRota(uber);
        assertEquals(decisao, String.valueOf(6.666666666666667));
    }

    @Test
    public void testeOnibus() {
        navegar = new PublicTransportStrategy();
        String decisao = navegar.decideRota(onibus);
        assertEquals(decisao, String.valueOf(1.6666666666666667));
    }
    @Test
    public void testeUber() {
        navegar = new RoadStrategy();
        String decisao = navegar.decideRota(carro);
        assertEquals(decisao, String.valueOf(1.25));
    }


}
