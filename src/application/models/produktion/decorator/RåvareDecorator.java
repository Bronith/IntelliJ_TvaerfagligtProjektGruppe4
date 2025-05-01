package application.models.produktion.decorator;


public abstract class RåvareDecorator extends Destillat {
    Destillat destillat;

    protected RåvareDecorator(Destillat destillat) {
        this.destillat = destillat;

//        public abstract String getBeskrivelse;
    }

}
