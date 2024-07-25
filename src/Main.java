import Interface.Ingresso;
import enums.tipoDipendente;
import esercizio1.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Dipendente dipendente1 = new Dipendente(123, 15000, tipoDipendente.PRODUZIONE);
        // Dipendente dipendente2 = new Dipendente(124, 25000, tipoDipendente.VENDITE);
        //Dipendente dipendente3 = new Dipendente(125, 60000, tipoDipendente.AMMINISTRAZIONE);
        //Dipendente[] arrayDipendenti = {dipendente1, dipendente2, dipendente3};
        //for (int i = 0; i < arrayDipendenti.length; i++) {
        //  System.out.println(arrayDipendenti[i].getMatricola());
        // }

        DipendenteFullTime dipendente1 = new DipendenteFullTime(123, 28000, tipoDipendente.PRODUZIONE, true);
        DipendentePartTime dipendente2 = new DipendentePartTime(124, 8000, tipoDipendente.VENDITE, 20);
        Dirigente dipendente3 = new Dirigente(125, 60000, tipoDipendente.AMMINISTRAZIONE, true);
        Dipendente[] arrayDipendenti = {dipendente1, dipendente2, dipendente3};
        //for (int i = 0; i < arrayDipendenti.length; i++) {
        //    System.out.println(arrayDipendenti[i]);
        //    System.out.println(arrayDipendenti[i].calculateSalary());
        //}
        Volontario volontario1 = new Volontario("Arianna", 24, "veterinaria");
        Ingresso[] acn = {dipendente1, dipendente2, dipendente3, volontario1};
        for (int i = 0; i < acn.length; i++) {
            if (acn[i] instanceof Dipendente) {
                Dipendente dipendente = (Dipendente) acn[i];
                System.out.println(dipendente.getMatricola());
                dipendente.calculateSalary();
            }
            acn[i].checkIn();
        }

    }
}
