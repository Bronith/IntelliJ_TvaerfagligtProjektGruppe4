package application.controller;

import application.models.produktion.Fad;
import application.models.produktion.FadType;
import application.models.produktion.Flaske;
import application.models.produktion.decorator.Destillat;
import storage.Storage;

import java.util.Date;

public class Controller {
    public Fad opretFad(Date påfyldningsdato, String fadNr, FadType fadType, int fadStørrelse, int literPåfyldt, String signatur, Destillat destillat) {
        Fad fad = new Fad(påfyldningsdato, fadNr, fadType, fadStørrelse, literPåfyldt, signatur, destillat);
        Storage.addFad(fad);
        return fad;
    }

    public Flaske opretFlaske(String navn, String nummer, String producent, String producentHistorik, String salgsHistorie) {
        Flaske flaske = new Flaske(navn, nummer, producent, producentHistorik, salgsHistorie);
        Storage.addFlaske(flaske);
        return flaske;
    }


}
