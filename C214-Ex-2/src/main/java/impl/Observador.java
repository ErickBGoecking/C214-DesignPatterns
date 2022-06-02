package impl;

import interfaces.iObservador;

import java.util.Arrays;

public class Observador implements iObservador {

    private String frase;
    int id;

    public Observador(int id) {
        this.id = id;
    }

    @Override
    public void update(Observavel app) {

        System.out.println("Frase: " + app.getFrasess());
        System.out.println("Essa frase tem essas palavras: " + Arrays.toString(app.quebraPalavras()));
        System.out.println("Essa frase tem " + app.qntPalavras() + " palavras.\n");
    }
}
