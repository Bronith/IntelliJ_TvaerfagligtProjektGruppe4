package application.models.produktion;

import application.models.produktion.decorator.Destillat;

public class Fad {
    private String navn;
    private String nummer;
    private String producent;
    private String produktHistorik;
    private String salgsHisorie;
    private Destillat destillat;

    public Fad(String navn, String nummer, String producent, String produktHistorik, String salgsHisorie) {
        this.navn = navn;
        this.nummer = nummer;
        this.producent = producent;
        this.produktHistorik = produktHistorik;
        this.salgsHisorie = salgsHisorie;
    }


}
