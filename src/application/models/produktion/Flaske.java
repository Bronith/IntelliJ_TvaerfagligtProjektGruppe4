package application.models.produktion;

public class Flaske {
    private String navn;
    private String nummer;
    private String producent;
    private String produktHistorik;
    private String salgsHisorie;

    public Flaske(String navn, String nummer, String producent, String produktHistorik, String salgsHisorie) {
        this.navn = navn;
        this.nummer = nummer;
        this.producent = producent;
        this.produktHistorik = produktHistorik;
        this.salgsHisorie = salgsHisorie;
    }
}
