package application.controller;

import application.models.produktion.Fad;
import application.models.produktion.decorator.Destillat;

public class Controller {
    public Fad opretFad(String navn, String nummer, String producent, String producentHistorik, String salgsHistorie, Destillat destillat) {
        Fad fad = new Fad(navn, nummer, producent, producentHistorik, salgsHistorie, destillat);

        return
    }
}
