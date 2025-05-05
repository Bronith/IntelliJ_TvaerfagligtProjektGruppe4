package application.models.lager;

import java.util.ArrayList;
import java.util.List;

public class Lager {
    private String lokation;
    private List<Reol> reoler;

    public Lager(String lokation) {
        this.lokation = lokation;
        this.reoler = new ArrayList<>();
    }

    public void tilføjReol(Reol reol) {
        reoler.add(reol);
    }

    public List<Reol> getReoler() {
        return reoler;
    }

    public String getLokation() {
        return lokation;
    }

   public int getKapacitet() {
        int kapacitet = reoler.size();
        for (Reol reol : reoler) {
            kapacitet += reol.getHylder().size();
            for (Hylde hylde : reol.getHylder()) {
                kapacitet += hylde.getPladser().size();
            }
        }
        return kapacitet;
   }
}
