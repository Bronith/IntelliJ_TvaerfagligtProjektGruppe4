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

    public Fad(Date påfyldningsDato, String fadNr, FadType fadType, int fadStørrelse, int literPåfyldt, String signatur) {
        this.påfyldningsdato = påfyldningsDato;
        this.fadNr = fadNr;
        this.fadType = fadType;
        this.fadStørrelse = fadStørrelse;
        this.literPåfyldt = literPåfyldt;
        this.signatur = signatur;
    }
}
