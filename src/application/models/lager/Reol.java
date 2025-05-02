package application.models.lager;

import java.util.ArrayList;

public class Reol {
    private String reolNr;
    private ArrayList<Hylde> hylder = new ArrayList<Hylde>();

    public Reol(String reolNr) {
        this.reolNr = reolNr;
    }

    public String getReolNr() {
        return reolNr;
    }
}
