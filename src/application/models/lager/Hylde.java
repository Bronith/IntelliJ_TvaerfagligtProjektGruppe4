package application.models.lager;

import java.util.ArrayList;

public class Hylde {
    private String hyldeNr;
    private ArrayList<Reol> reoler = new ArrayList<Reol>();

    public Hylde(String hyldeNr) {
        this.hyldeNr = hyldeNr;
    }
}
