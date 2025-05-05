package application.models.lager;


import java.util.ArrayList;
import java.util.List;

public class Reol {
    private String reolNr;
    List<Hylde> hylder;

    public Reol(String reolNr) {
        this.reolNr = reolNr;
        this.hylder = new ArrayList<>();
    }

    public boolean tilføjHylde(Hylde hylde) {
        if (hylder.size() < 3) {
            this.hylder.add(hylde);
            return true;
        }
        return false;
    }

    public String getReolNr() {
        return reolNr;
    }

    public List<Hylde> getHylder() {
        return hylder;
    }
}
