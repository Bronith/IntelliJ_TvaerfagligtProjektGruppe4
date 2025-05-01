package application.models.produktion.decorator;

public class Vand extends RåvareDecorator {

    public Vand(Destillat destillat){
        super(destillat);
    }

    public String getBeskrivelse() {
        return destillat.getBeskrivelse() + ", Vand";
    }
}
