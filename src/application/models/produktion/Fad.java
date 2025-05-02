package application.models.produktion;

import application.models.produktion.decorator.Destillat;

import java.util.Date;

public class Fad {
    private Date påfyldningsdato;
    private String fadNr;
    private FadType fadType;
    private int fadStørrelse;
    private int literPåfyldt;
    private String signatur;
    private Destillat destillat;

    public Fad(Date påfyldningsDato, String fadNr, FadType fadType, int fadStørrelse, int literPåfyldt, String signatur, Destillat destillat) {
        this.påfyldningsdato = påfyldningsDato;
        this.fadNr = fadNr;
        this.fadType = fadType;
        this.fadStørrelse = fadStørrelse;
        this.literPåfyldt = literPåfyldt;
        this.signatur = signatur;
        this.destillat = destillat;
    }

    public Date getPåfyldningsdato() {
        return påfyldningsdato;
    }

    public String getFadNr() {
        return fadNr;
    }

    public FadType getFadType() {
        return fadType;
    }

    public int getFadStørrelse() {
        return fadStørrelse;
    }

    public int getLiterPåfyldt() {
        return literPåfyldt;
    }

    public String getSignatur() {
        return signatur;
    }

    public Destillat getDestillat() {
        return destillat;
    }
}
