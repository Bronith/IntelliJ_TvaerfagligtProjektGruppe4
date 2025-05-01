package application.models.produktion.decorator;

public class UrøgetMalt extends RåvareDecorator {

    protected UrøgetMalt(Destillat destillat) {
        super(destillat);
    }
    public String getBeskrivelse() {
        return destillat.getBeskrivelse() + ", Urøget Malt";
    }
}
