package esercizio1;

import Interface.Ingresso;

public class Volontario implements Ingresso {
    String nome;
    int eta;
    String cv;

    public Volontario(String _nome, int _eta, String _cv) {
        this.nome = _nome;
        this.eta = _eta;
        this.cv = _cv;
    }

    @Override
    public void checkIn() {
        System.out.println("i volontari entrano alle 10");
    }
}
