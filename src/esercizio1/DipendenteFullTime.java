package esercizio1;


import enums.tipoDipendente;

public class DipendenteFullTime extends Dipendente {
    private boolean IsFullTime;

    public DipendenteFullTime(int _matricola, int _stipendio, tipoDipendente _dipartimento, boolean _isFullTime) {
        super(_matricola, _stipendio, _dipartimento);
        this.IsFullTime = true;
    }

    @Override
    public String toString() {
        return "DipendenteFullTime{" +
                "IsFullTime=" + IsFullTime +
                "} " + super.toString();
    }

    @Override
    public String calculateSalary() {
        return "lo stipendio annuale per un dipendente Full Time è: " + getStipendio() + "€";

    }


}
