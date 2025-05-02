package application.models.lager;

import java.util.ArrayList;

public class Lager {
    private String lokation;
    private int kapacitet;
    private ArrayList<Reol> reoler = new ArrayList<Reol>();

    public Lager(String lokation, int kapacitet) {
        this.lokation = lokation;
        this.kapacitet = kapacitet;
    }

    public String getLokation() {
        return lokation;
    }

    public int getKapacitet() {
        return kapacitet;
    }
}
