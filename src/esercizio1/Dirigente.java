package esercizio1;

import enums.tipoDipendente;

public class Dirigente extends Dipendente {
    boolean IsPMO;

    public Dirigente(int _matricola, int _stipendio, tipoDipendente _dipartimento, boolean _isPMO) {
        super(_matricola, _stipendio, _dipartimento);
        this.IsPMO = _isPMO;
    }

    @Override
    public String toString() {
        return "Dirigente{" +
                "IsPMO=" + IsPMO +
                "} " + super.toString();
    }

    @Override
    public String calculateSalary() {
        return "lo stipendio annuale di un dirigente presso ACN è: " + getStipendio() + "€";

    }
}
