package application.models.produktion.decorator;

public class Gær extends RåvareDecorator {

    public Gær(Destillat destillat) {
        super(destillat);
    }

    public String getBeskrivelse() {
        return destillat.getBeskrivelse() + ", Gær";
    }
}
