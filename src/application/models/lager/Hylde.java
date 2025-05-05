package application.models.lager;

import java.util.ArrayList;
import java.util.List;

public class Hylde {
    private String hyldeNr;
    private List<Plads> pladser;

    public Hylde(String hyldeNr) {
        this.hyldeNr = hyldeNr;
        this.pladser = new ArrayList<>();
    }

    public boolean tilføjPlads(Plads plads) {
        if (pladser.size() < 2) {
            this.pladser.add(plads);
            return true;
        }
        return false;
    }

    public String getHyldeNr() {
        return hyldeNr;
    }

    public List<Plads> getPladser() {
        return pladser;
    }

}
