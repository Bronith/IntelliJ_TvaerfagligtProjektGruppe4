package application.models.produktion.decorator;

public class RøgetMalt extends RåvareDecorator{

    protected RøgetMalt(Destillat destillat) {
        super(destillat);
    }

    public String getBeskrivelse() {
        return destillat.getBeskrivelse() + ", Røget malt";
    }
}
