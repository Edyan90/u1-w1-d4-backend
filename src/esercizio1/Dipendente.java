package esercizio1;

import Interface.Ingresso;
import enums.tipoDipendente;

public abstract class Dipendente implements Ingresso {
    private final int matricola;
    private final int stipendio;
    private tipoDipendente dipartimento;

    public Dipendente(int _matricola, int _stipendio, tipoDipendente _dipartimento) {
        this.matricola = _matricola;
        this.stipendio = _stipendio;
        this.dipartimento = _dipartimento;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", dipartimento=" + dipartimento
                ;
    }

    public int getMatricola() {
        return matricola;
    }

    public int getStipendio() {
        return stipendio;
    }

    public tipoDipendente getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(tipoDipendente dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract String calculateSalary();

    @Override
    public void checkIn() {
        System.out.println("tutti i dipendenti entrano alle 9 meno i volontari");
    }
}
