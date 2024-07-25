package esercizio1;

import enums.tipoDipendente;

public class DipendentePartTime extends Dipendente {
    int oreLavorate;

    public DipendentePartTime(int _matricola, int _stipendio, tipoDipendente _dipartimento, int _oreLavorate) {
        super(_matricola, _stipendio, _dipartimento);
        this.oreLavorate = _oreLavorate;
    }

    @Override
    public String toString() {
        return "DipendentePartTime{" +
                "oreLavorate=" + oreLavorate +
                "} " + super.toString();
    }

    @Override
    public String calculateSalary() {
        return "lo stipendio annuale per un dipendente Part-Time è: " + getStipendio() + "€";

    }


}
