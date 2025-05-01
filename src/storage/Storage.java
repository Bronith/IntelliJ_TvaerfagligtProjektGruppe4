package storage;

import application.models.produktion.Fad;
import application.models.produktion.Flaske;
import application.models.produktion.decorator.Destillat;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Destillat> destillater = new ArrayList<Destillat>();
    private static ArrayList<Fad> fade = new ArrayList<Fad>();
    private static ArrayList<Flaske> flasker = new ArrayList<Flaske>();

    public static ArrayList<Destillat> getDestillater() {
        return new ArrayList<>(destillater);
    }

    public static ArrayList<Fad> getFade() {
        return new ArrayList<>(fade);
    }

    public static ArrayList<Flaske> getFlasker() {
        return new ArrayList<>(flasker);
    }

    public static void addDestillat(Destillat destillat) {
        destillater.add(destillat);
    }

    public static void addFad(Fad fad) {
        fade.add(fad);
    }

    public static void addFlaske(Flaske flaske) {
        flasker.add(flaske);
    }
}
