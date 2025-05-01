package application.models.produktion.decorator;

public class WhiskyDestilat extends Destillat {
    private String navn;
    private double alkoholProcent;

    public WhiskyDestilat(String navn, double alkoholProcent) {
        this.navn = navn;
        this.alkoholProcent = alkoholProcent;
        beskrivelse = "Whisky destilat";

    }

    public String getNavn() {
        return navn;
    }

    public double getAlkoholProcent() {
        return alkoholProcent;
    }
}
