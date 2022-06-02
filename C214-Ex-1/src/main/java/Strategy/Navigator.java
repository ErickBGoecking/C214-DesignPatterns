package Strategy;

public abstract class Navigator {

    //Composicao com instancia de Frete
    protected RouterStrategy rota;

    //Comportamento delegado
    public String decideRota(String decide) {
        return rota.decideRota(decide);
    }

    //Getter e Setter
    public void setRouterStrategy(RouterStrategy rota) {
        this.rota = rota;
    }

    public RouterStrategy getRouterStrategy() {
        return rota;
    }

}
